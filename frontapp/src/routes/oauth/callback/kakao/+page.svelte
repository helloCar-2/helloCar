<script>
	import { onMount } from 'svelte';

	onMount(async () => {
		// URL에서 인증 코드(code) 추출
		const urlParams = new URLSearchParams(window.location.search);
		const code = urlParams.get('code');
		console.log(code);

		if (code) {
			// 인증 코드가 유효하면, 이를 서버에 전송
			const response = await fetch(`https://kauth.kakao.com/oauth/token`, {
				method: 'POST',
				headers: {
					'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
				},
				body: new URLSearchParams({
					grant_type: 'authorization_code',
					client_id: '0db93a1c1e0a9813a3d10461ca9a40d2',
					redirect_uri: 'http://localhost:5173/oauth/callback/kakao',
					code: code
				})
			});

			const data = await response.json();
			const access_token = data.access_token;

			// 액세스 토큰을 받았으므로, 이를 이용하여 필요한 작업 수행
			console.log('액세스 토큰:', access_token);
			localStorage.setItem('accessToken', access_token);

			const userInfoResponse = await fetch('https://kapi.kakao.com/v2/user/me', {
				method: 'GET',
				headers: {
					Authorization: `Bearer ${access_token}`
				}
			});
			if (userInfoResponse.ok) {
				const userInfo = await userInfoResponse.json();
				console.log(userInfo.id);
				console.log(userInfo.properties.nickname);

				let formData = {
					id: `${userInfo.id}`,
					nickname: `${userInfo.properties.nickname}`
				};

				const res = await fetch(`http://localhost:8080/api/v1/member/kakaologin`, {
					method: 'POST',
					headers: {
						'Content-Type': 'application/json'
					},
					body: JSON.stringify(formData)
				});

				if (res.ok) {
					const data = await res.json();
					const accesstoken = await data.data.accessToken;
					const refreshToken = await data.data.refreshToken;
					await localStorage.setItem('accessToken', accesstoken);
					await localStorage.setItem('refreshToken', refreshToken);
					const storedToken = await localStorage.getItem('accessToken');
					await console.log(storedToken);
                    window.location.href = '/car-home';
				}
			}
		}
	});
</script>
