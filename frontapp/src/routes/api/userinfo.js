import axios from 'axios';

export async function post(req, res) {
  const { access_token } = req.body;

  try {
    const response = await axios({
      method: 'get',
      url: 'https://kapi.kakao.com/v2/user/me',
      headers: {
        'Authorization': `Bearer ${access_token}`,
      },
    });

    const userInfo = response.data;
    console.log(userInfo);
    // 사용자 정보를 클라이언트에게 전달
    res.end(JSON.stringify(userInfo));
    console.log(res);
  } catch (error) {
    console.error(error);
    res.end(JSON.stringify({ error: '사용자 정보를 받는데 실패했습니다.' }));
  }
}
