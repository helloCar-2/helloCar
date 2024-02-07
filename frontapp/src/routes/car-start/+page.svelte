<script>
    import { onMount } from 'svelte';
    import api from "$lib/axiosEnterceptor/api.js";

    // 이동할 페이지의 경로
    const nextPage = '/auth/login';

    if (typeof window !== 'undefined') {
        const accessToken = localStorage.getItem('accessToken');

        if(accessToken){


                // 3초 후에 nextPage로 이동
                const delay = 3000; // 밀리초 단위로 지정
                setTimeout(() => {
                    window.location.href = '/car-home'
                }, delay);

        } else {
                // 3초 후에 nextPage로 이동
                const delay = 3000; // 밀리초 단위로 지정
                setTimeout(() => {
                    window.location.href = nextPage;
                }, delay);
        }

        api.post('/verify-token', {
        }, {
            headers: {
                'Content-Type': 'application/json',
                'Authorization': `Bearer ${accessToken}`,
            }
        })
            .catch(function (error) {
                console.log('진짜냐 :',error);
            });
        }


</script>

<div class="flex items-center justify-center h-screen bg-[#f3651f]">
    <section class="logo">
        <img src="../img/logo2.png" class="h-24 w-60 object-cover">
    </section>
</div>