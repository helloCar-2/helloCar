// $lib/auth/index.js

import jwt from 'jsonwebtoken';

export function verifyToken(token, secretKey) {
  try {
    // 토큰을 검증하고 해독하여 정보 반환
    const decoded = jwt.verify(token, secretKey);
    return decoded;
  } catch (error) {
    // 검증 실패 시 에러 처리
    console.error('Token verification failed:', error.message);
    return null;
  }
}