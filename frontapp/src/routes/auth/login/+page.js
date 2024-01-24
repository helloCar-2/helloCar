import { db } from '$lib/database';
import { verifyToken } from '$lib/auth';
import { succeed, fail, redirect } from '@sveltejs/kit';
import bcrypt from 'bcrypt';
import crypto from 'crypto';

export const load = async ({ locals }) => {
    // 토큰이 없으면 실패 처리 또는 다른 로직을 수행
    if (!locals.user) {
        return fail(401, { unauthorized: true });
    }

    // 토큰이 있다면 사용자 정보를 가져와 locals에 저장
    locals.userInfo = await db.user.findUnique({
        where: { id: locals.user.userId },
    });

    // 나머지 로직 수행 (예: 템플릿에 데이터 전달 등)
    return succeed();
};

// actions에서 register를 함수로 감싸주기
export const actions = {
    register: async ({ request }) => {
      const data = await request.formData();
      const username = data.get('username');
      const password = data.get('password');
  
      if (
        typeof username !== 'string' ||
        typeof password !== 'string' ||
        !username ||
        !password
      ) {
        return fail(400, { invalid: true });
      }
  
      const user = await db.user.findUnique({
        where: { username },
      });
  
      if (user) {
        return fail(400, { user: true });
      }
  
      await db.user.create({
        data: {
          username: username,
          passwordHash: await bcrypt.hash(password, 10),
          userAuthToken: crypto.randomUUID(),
        },
      });
  
      throw redirect(303, 'http://localhost:5173/car-home');
    }
  };
  
