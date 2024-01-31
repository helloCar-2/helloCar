import axios from 'axios';

export const refreshToken = async () => {
    const storedRefreshToken = localStorage.getItem('refreshToken');

    if (!storedRefreshToken) {
        console.log('로컬 스토리지에 Refresh Token이 저장되어 있지 않습니다.');
        throw new Error('Refresh Token이 없어서 새로운 Access Token을 발급할 수 없습니다.');
    }

    try {
        const response = await axios.post('http://localhost:8080/api/v1/member/refresh', null, {
            headers: {
                'Content-Type': 'application/json',
                'Authorization': `Bearer ${storedRefreshToken}`,
            }
        });

        if (response.status === 200) {
            const data = response.data;
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
