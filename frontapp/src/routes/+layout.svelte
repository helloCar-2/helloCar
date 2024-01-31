<script>
    import Footer from './footer/footer.svelte';
    import '../app.css';

    let showFooter = false;
    async function fetchData() {
        try {
            if (window.location.pathname !== '/auth/login' && window.location.pathname !== '/signup-form' && window.location.pathname !== '/car-start' && window.location.pathname !== '/chat-qna') {
                showFooter = true;
            }
        } catch (error) {
            console.error('데이터를 가져오는 동안 오류가 발생했습니다:', error);
        }
    }
    //
    fetchData();
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
