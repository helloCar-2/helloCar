<script>
	import Footer from './footer/footer.svelte';
	import '../app.css';
	import { onMount } from 'svelte';

	let showFooter = true;

	onMount(() => {
		// 현재 페이지 경로를 확인하고 showFooter 값을 조절합니다.
		const currentPath = window.location.pathname;

		// '/car-start' 또는 '/auth/login' 페이지에서는 Footer를 숨깁니다.
		if (currentPath === '/car-start' || currentPath === '/auth/login' || currentPath === '/signup-form-email'
				|| currentPath === '/signup-form' || currentPath === '/chat-qna' || currentPath === '/password-search'
				|| currentPath === '/login-search') {
			showFooter = false;
		} else {
			showFooter = true;
		}
	});
</script>

{#if showFooter}
	<div class="app mx-auto relative min-h-screen pb-20">
		<main>
			<slot />
			<Footer />
		</main>
	</div>
{:else}
	<div class="app mx-auto relative min-h-screen pb-20">
		<main>
			<slot />
		</main>
	</div>
{/if}
