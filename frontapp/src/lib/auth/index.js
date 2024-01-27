
export async function checkAuthAndConfigureFooter() {
  let showFooter = true;
  let permission = false;

  // 현재 페이지 경로를 확인하고 showFooter 값을 조절합니다.
  const currentPath = window.location.pathname;

  // '/car-start' 또는 '/auth/login' 페이지에서는 Footer를 숨깁니다.
  if (
      currentPath === '/car-start' ||
      currentPath === '/auth/login' ||
      currentPath === '/signup-form-email' ||
      currentPath === '/signup-form' ||
      currentPath === '/chat-qna' ||
      currentPath === '/password-search' ||
      currentPath === '/login-search'
  ) {
    showFooter = false;
  } else {
    showFooter = true;
  }
  // 로컬 스토리지에서 JWT 가져오기
  const storedToken = localStorage.getItem('accessToken');
  console.log(storedToken)
  if (storedToken) {
    // 서버로 JWT 전송 및 검증
    const response = await fetch('http://localhost:8080/api/verify-token', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        Authorization: `Bearer ${storedToken}`,
      },
    });

    if (response.ok) {
      // JWT가 유효한 경우 페이지 컨텐츠를 렌더링
      const userData = await response.text();
      permission = true;

      console.log('사용자 정보:', userData);

      const str = userData.split(":");
      return str[1].trim();

    } else {
      const newAccessToken = await refreshToken();

      // console.log('새로 발급된 Access Token:', newAccessToken);

      const errorResponse = await response.json();
      console.log('JWT 유효성 검증 실패:', errorResponse.message);

    }
  } else {
    console.log('JWT가 로컬 스토리지에 없습니다.');
    return permission;
  }
  return showFooter;
}

// refreshToken 함수 추가
const refreshToken = async () => {
  const storedRefreshToken = localStorage.getItem('refreshToken');

  if (!storedRefreshToken) {
    console.log('로컬 스토리지에 Refresh Token이 저장되어 있지 않습니다.');
    throw new Error('Refresh Token이 없어서 새로운 Access Token을 발급할 수 없습니다.');
  }

  try {
    const response = await fetch('http://localhost:8080/api/v1/member/refresh', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Authorization': `Bearer ${storedRefreshToken}`
      },
    });

    if (response.ok) {
      const data = await response.json();
      const newAccessToken = data.data.newAccessToken;


      // 새로운 Access Token으로 로컬 스토리지 업데이트
      localStorage.setItem('accessToken', newAccessToken);

      return newAccessToken;
    } else {
      console.error('서버 응답 오류:', response.statusText);
      throw new Error('Access Token 갱신 중 서버 응답 오류');
    }
  } catch (error) {
    console.error('오류 발생:', error);
    throw new Error('Access Token 갱신 중 오류 발생');
  }
};