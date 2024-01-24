<script>
    import { onMount } from 'svelte';

    // 이동할 페이지의 경로
    const nextPage = '/auth/login';

    onMount(() => {
        // 3초 후에 nextPage로 이동
        const delay = 3000; // 밀리초 단위로 지정
        setTimeout(() => {
            window.location.href = nextPage;
        }, delay);
    });
</script>

<div class="flex items-center justify-center h-screen bg-[#f3651f]">
    <section class="logo">
        <img src="../img/logo2.png" class="h-24 w-60 object-cover">
    </section>
</div>