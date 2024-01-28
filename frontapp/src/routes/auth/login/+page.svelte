<script>

	let formData = {
		username: '',
		password: ''
	};

	const handleSubmit = async () => {
		try {
			const response = await fetch('http://localhost:8080/api/v1/member/login', {
				method: 'POST',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify(formData)
			});


            if (response.ok) {
                const data = await response.json();
                const accesstoken = await data.data.accessToken;
                const refreshToken = await data.data.refreshToken;

                console.log('토큰 값:', accesstoken);
                console.log('토큰 값:', refreshToken);

                // 로그인이 성공한 경우
                if (data.resultCode === 'S-1') {

                    localStorage.setItem('accessToken', accesstoken);
                    localStorage.setItem('refreshToken', refreshToken);

                    const storedToken = localStorage.getItem('accessToken');

                    if (storedToken) {
                        console.log('로컬 스토리지에서 가져온 토큰 값:', storedToken);
                        // 저장된 토큰이 있다면 해당 토큰을 사용하여 원하는 작업 수행
                    } else {
                        console.log('로컬 스토리지에 토큰이 저장되어 있지 않습니다.');
                        // 저장된 토큰이 없다면, 로그인이 필요한 처리 수행
                    }

                    console.log('로그인 성공!');

                    window.location.href = '/car-home';

                } else {
                    // 로그인이 실패한 경우
                    const errorMessage = data.errorMessage;
                    console.error('로그인 실패:', errorMessage);

                    alert('아이디 또는 비밀번호가 일치하지 않습니다.');
                }
            } else {
                console.error('서버 응답 오류:', response.statusText);
                alert('다시 입력 해주세요.');
            }
        } catch (error) {
            console.error('오류 발생:', error);
            alert('존재하지 않는 계정입니다.');
        }
    };


</script>

<div class="container my-3 mx-auto p-4">
	<div class="container my-3 mx-auto">
		<div class="background_img">
			<img
				src="/img/logo.png"
				alt="로고"
				class="text-center mt-12 mx-auto w-60 h-20 object-cover"
			/>
			<h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">
				로그인
			</h5>
		</div>

		<form class="flex-col text-center" on:submit|preventDefault={handleSubmit}>
			<div class="login_box">
				<!--			<label for="username"></label>-->
				<input
					class="bg-gray-50 text-sm rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 w-full p-2.5"
					placeholder="아이디 입력"
					type="text"
					id="username"
					bind:value={formData.username}
				/>
			</div>
			<div class="password_box pt-6">
				<!--			<label for="password"></label>-->
				<input
					class="bg-gray-50 text-sm rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
					placeholder="패스워드 입력"
					type="password"
					id="password"
					bind:value={formData.password}
				/>
			</div>

			<button
				type="submit"
				class="w-full h-12 mt-6 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center"
			>
				<p class="font-bold mx-auto text-base">로그인</p>
			</button>
		</form>
		<a
			href=""
			class="w-full h-12 mt-6 text-[#6d2720] bg-[#fff30c] hover:bg-[#d4d013]/90 text-sm py-3 flex justify-center"
		>
			<svg
				xmlns="http://www.w3.org/2000/svg"
				viewBox="0 0 48 48"
				height="24px"
				width="50px"
				class="mr-4 w-21 h-6 me-1"
			>
				<path
					fill="#263238"
					d="M24,4C12.402,4,3,11.611,3,21c0,5.99,3.836,11.245,9.618,14.273l-2.219,7.397	c-0.135,0.449,0.366,0.82,0.756,0.56l8.422-5.615C21.004,37.863,22.482,38,24,38c11.598,0,21-7.611,21-17S35.598,4,24,4z"
				></path>
				<path
					fill="#ffca28"
					d="M15,18H9c-0.552,0-1-0.448-1-1v0c0-0.552,0.448-1,1-1h6c0.552,0,1,0.448,1,1v0	C16,17.552,15.552,18,15,18z"
				></path>
				<path
					fill="#ffca28"
					d="M25,26v-9c0-0.552,0.448-1,1-1h0c0.552,0,1,0.448,1,1v9c0,0.552-0.448,1-1,1h0	C25.448,27,25,26.552,25,26z"
				></path>
				<path
					fill="#ffca28"
					d="M32,26v-9c0-0.552,0.448-1,1-1l0,0c0.552,0,1,0.448,1,1v9c0,0.552-0.448,1-1,1l0,0	C32.448,27,32,26.552,32,26z"
				></path>
				<path
					fill="#ffca28"
					d="M32.621,21.207l4.914-4.914c0.391-0.391,1.024-0.391,1.414,0v0c0.391,0.391,0.391,1.024,0,1.414	l-4.914,4.914c-0.391,0.391-1.024,0.391-1.414,0l0,0C32.231,22.231,32.231,21.598,32.621,21.207z"
				></path>
				<path
					fill="#ffca28"
					d="M36.078,20.665l3.708,4.717c0.341,0.434,0.266,1.063-0.168,1.404l0,0	c-0.434,0.341-1.063,0.266-1.404-0.168l-3.708-4.717c-0.341-0.434-0.266-1.063,0.168-1.404v0	C35.108,20.156,35.737,20.231,36.078,20.665z"
				></path>
				<path
					fill="#ffca28"
					d="M30,27h-4c-0.552,0-1-0.448-1-1v0c0-0.552,0.448-1,1-1h4c0.552,0,1,0.448,1,1v0	C31,26.552,30.552,27,30,27z"
				></path>
				<path
					fill="#ffca28"
					d="M23.933,25.642l-3.221-9c-0.145-0.379-0.497-0.611-0.878-0.629c-0.111-0.005-0.54-0.003-0.641-0.001 c-0.392,0.007-0.757,0.241-0.906,0.63l-3.221,9c-0.198,0.516,0.06,1.094,0.576,1.292s1.094-0.06,1.292-0.576L17.42,25h4.16	l0.486,1.358c0.198,0.516,0.776,0.773,1.292,0.576S24.131,26.157,23.933,25.642z M18.136,23l1.364-3.812L20.864,23H18.136z"
				></path>
				<path fill="#ffca28" d="M13,18h-2v8c0,0.552,0.448,1,1,1h0c0.552,0,1-0.448,1-1V18z"></path>
			</svg>
			<p class="font-bold py-0.5">카카오 로그인 하기</p>
		</a>
		<div class="flex justify-center mt-2 text-gray-500">
			<a href="/signup-form" class="px-2 underline hover:text-blue-500">
				<span>회원가입</span>
			</a>
			<span class="mx-1">|</span>
			<a href="/login-search" class="px-2 underline hover:text-blue-500">
				<span>ID 찾기</span>
			</a>
			<span class="mx-1">|</span>
			<a href="/password-search" class="px-2 underline hover:text-blue-500">
				<span>PW 찾기</span>
			</a>
		</div>
	</div>
</div>
