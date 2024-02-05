import axios from 'axios';

export async function post(req, res) {
  const { code } = req.body;
  
  try {
    const response = await axios({
      method: 'post',
      url: 'https://kauth.kakao.com/oauth/token',
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8',
      },
      data: {
        grant_type: 'authorization_code',
        client_id: '0db93a1c1e0a9813a3d10461ca9a40d2',
        redirect_uri: 'http://localhost:5173/oauth/callback/kakao',
        code,
      },
    });
    const { access_token } = response.data;
    // 액세스 토큰을 클라이언트에게 전달
    res.end(JSON.stringify({ access_token }));
  } catch (error) {
    console.error(error);
    res.end(JSON.stringify({ error: '액세스 토큰을 받는데 실패했습니다.' }));
  }
}
