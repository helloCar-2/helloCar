import axios from 'axios';
import {refreshToken} from '$lib/responesToken/responseToken.js';

const api = axios.create({
    baseURL: "http://localhost:8080/api/v1/",
    timeout: 1000,
});

api.interceptors.request.use(
    async (config) => {

        if (typeof window !== 'undefined') {
            const accessToken = localStorage.getItem('accessToken');
            if (!accessToken && window.location.pathname !== '/auth/login' && window.location.pathname !== '/signup-form' && window.location.pathname !== '/car-start') {
                window.location.href = '/auth/login';
                alert("로그인을 먼저 진행해주세요.");
                return config;
            } else if (accessToken && window.location.pathname === '/auth/login'){
                window.location.href = '/car-home'
                return config;
            }
            // config = await axios.post('http://localhost:8080/api/v1/verify-token', null, {
        if (accessToken) {
            config.headers['Content-Type'] = 'application/json';
            config.headers['Authorization'] = `Bearer ${accessToken}`;
        }
            // });
        }
        return config;
    },
    (error) => {
        console.error('axios 요청 오류:', error);
        return Promise.reject(error);
    }
);

api.interceptors.response.use(
    async (response) => {
        if (response.status === 200) {
           response = response.data;

           return response;
        }
        if (response.status === 404) {
            console.log('404 페이지로 넘어가야 함!');
        }
        // 응답을 받았을 때 수행할 작업
        // 예: 응답 데이터 처리 등
        return response;
    },
    async (error) => {
        if (typeof window !== 'undefined') {
            if (error.response && error.response.status === 401 || error.response.status === 500) {
                const storedRefreshToken = await refreshToken();

                if (error.config) {
                    error.config.headers['Content-Type'] = 'application/json';
                    error.config.headers['Authorization'] = `Bearer ${storedRefreshToken}`;
                }
            }
        }
        // 응답 오류 처리
        return Promise.reject(error);
    }
);

export default api;