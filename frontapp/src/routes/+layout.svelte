<script>
    import Footer from './footer/footer.svelte';
    import '../app.css';
    import {onMount} from 'svelte';
    import {checkAuthAndConfigureFooter} from '$lib/auth/index.js';

    let showFooter;
    let permission;

    onMount(async () => {
        // checkAuthAndConfigureFooter 함수를 한 번 호출하여 결과를 변수에 할당합니다.
        showFooter = await checkAuthAndConfigureFooter();
        permission = await checkAuthAndConfigureFooter();

        // 토큰이 유효하지 않다면 로그인 페이지로 이동
        if (!permission && window.location.pathname !== '/auth/login') {
            window.location.href = '/auth/login';
            alert("로그인을 먼저 진행해주세요.")
        }
    });
</script>

{#if showFooter}
    <div class="app mx-auto relative min-h-screen pb-20">
        <main>
            <slot/>
            <Footer/>
        </main>
    </div>
{:else}
    <div class="app mx-auto relative min-h-screen pb-20">
        <main>
            <slot/>
        </main>
    </div>
{/if}
