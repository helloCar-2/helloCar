<script>
    import { onMount } from 'svelte';
    
    onMount(async () => {
      // URL에서 인증 코드(code) 추출
      const urlParams = new URLSearchParams(window.location.search);
      const code = urlParams.get('code');
      console.log(code)
      
      if (code) {
        // 인증 코드가 유효하면, 이를 서버에 전송
        const response = await fetch(`http://localhost:8080/api/v1/member/token`, {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify({code}),
        });
  
        console.log(response);

        if (response.ok) {
          const data = response.json();
          const access_token = data;
  
          // 액세스 토큰을 받았으므로, 이를 이용하여 필요한 작업 수행
          console.log('액세스 토큰:', access_token);
        } else {
          console.error('액세스 토큰을 받는데 실패했습니다.');
        }
      } else {
        // 인증 코드가 유효하지 않은 경우, 에러 처리
        console.error('인증 코드를 받지 못했습니다.');
      }
    });
  </script>
  