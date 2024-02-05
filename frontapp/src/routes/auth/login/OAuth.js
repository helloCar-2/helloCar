const CLIENT_ID = "0db93a1c1e0a9813a3d10461ca9a40d2";
const REDIRECT_URI =  "http://localhost:5173/oauth/callback/kakao";

export const KAKAO_AUTH_URL = `https://kauth.kakao.com/oauth/authorize?client_id=${CLIENT_ID}&redirect_uri=${REDIRECT_URI}&response_type=code`;