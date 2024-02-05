import dotenv from 'dotenv';
import adapter from '@sveltejs/adapter-auto';
import { vitePreprocess } from '@sveltejs/vite-plugin-svelte';

dotenv.config();

const config = {
  preprocess: [vitePreprocess({})],

  kit: {
    adapter: adapter(),
  },

  env: {
    SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_KAKAO_CLIENT_ID: "0db93a1c1e0a9813a3d10461ca9a40d2",
  },
};

export default config;
