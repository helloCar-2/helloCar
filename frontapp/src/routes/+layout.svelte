<script>
    import Footer from './footer/footer.svelte';
    import '../app.css';
    // import {onMount} from 'svelte';
    // import {checkAuthAndConfigureFooter} from '$lib/auth/index.js';

    // let showFooter;
    // let permission = false;
    //
    // async function fetchData() {
    //     try {
    //         permission = await checkAuthAndConfigureFooter();
    //         if (!permission && window.location.pathname !== '/auth/login' && window.location.pathname !== '/signup-form') {
    //             window.location.href = '/auth/login';
    //             alert("로그인을 먼저 진행해주세요.")
    //         }
    //     } catch (error) {
    //         console.error('데이터를 가져오는 동안 오류가 발생했습니다:', error);
    //         // 오류 처리를 추가할 수 있습니다.
    //     }
    // }
    //
    // fetchData();
</script>

<!--{#if showFooter}-->
    <div class="app mx-auto relative min-h-screen pb-20">
        <main>
            <slot/>
            <Footer/>
        </main>
    </div>
<!--{:else}-->
<!--    <div class="app mx-auto relative min-h-screen pb-20">-->
<!--        <main>-->
<!--            <slot/>-->
<!--        </main>-->
<!--    </div>-->
<!--{/if}-->
