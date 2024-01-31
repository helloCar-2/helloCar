import axios from "axios";

export const checkAccessToken = async () => {
    let permission = false;

// 로컬 스토리지에서 JWT 가져오기
    const storedToken = localStorage.getItem('accessToken');
    console.log(storedToken)
    if (storedToken) {
        console.log(77)
        // 서버로 JWT 전송 및 검증
        try {
            const response = await axios.post('http://localhost:8080/api/v1/verify-token', null, {
                headers: {
                    'Content-Type': 'application/json',
                    Authorization: `Bearer ${storedToken}`,
                }
            });

            if (response.status === 200) {
                // JWT가 유효한 경우 페이지 컨텐츠를 렌더링
                const userData = response.data;
                permission = true;

                console.log('사용자 정보:', userData);

                return userData.trim();

            } else {
                console.log('JWT 유효성 검증 실패:', errorResponse.data.message);
            }
        } catch (error) {
            console.log('errormessage :', error.message())
            // const newAccessToken = await refreshToken();

            // console.log('새로 발급된 Access Token:', newAccessToken);

            // return newAccessToken;
        }
    } else {
        console.log('JWT가 로컬 스토리지에 없습니다.');
        return permission;
    }
}