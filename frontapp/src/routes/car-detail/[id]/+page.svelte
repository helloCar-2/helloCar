<script>
    import api from "$lib/axiosEnterceptor/api.js";
    import {onMount} from 'svelte';


    import {Button} from 'flowbite-svelte';
    import {page} from '$app/stores';

    let data = [];

    let isFavorite = false;
    // console.log(data.data.isChecked)

    var carId = parseInt($page.url.pathname.split('/').pop(), 10);

    onMount(async () => {
        if (typeof window !== 'undefined') {
            const accessToken = localStorage.getItem('accessToken');

            let res = await fetch(`http://localhost:8080/api/v1/hellocar/${carId}`, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                    'Authorization': `Bearer ${accessToken}`
                }
            })

            let result = await res.json();
            isFavorite = result.data.ischecked
            data = result.data.helloCar
        }
    })

    function searchPage() {
        window.location.href = '/model-search';
    }


    // 찜
    async function toggleFavorite() {
        isFavorite = !isFavorite;

        if (typeof window !== 'undefined') {
            const accessToken = localStorage.getItem('accessToken');
            const username = api.post(`/wishList/${Number(data.id)}`, {
                // 요청 본문 데이터
            }, {
                headers: {
                    'Content-Type': 'application/json',
                    'Authorization': `Bearer ${accessToken}`,
                }
            })
                .catch(function (error) {
                    console.log('error :', error);
                });

            console.log(username)
        }

    }
    // const dataToSend = {
    //     carId: Number(data.id),
    //     isFavorite: isFavorite,
    //     // memberId: data.data.members.memberId
    // };
    // console.log(dataToSend)

    //
    // try {
    //     const response = await fetch(`http://localhost:8080/api/v1/member/like/${dataToSend.carId}`, {
    //         method: 'POST',
    //         headers: {
    //             'Content-Type': 'application/json',
    //         },
    //         body: JSON.stringify(dataToSend),
    //     });
    //
    //     if (response.ok) {
    //         const data = await response.json();
    //         //memberId 추출
    //         const memberId = data.data.member.id;
    //         console.log(memberId)
    //         if (data.resultCode === 'S-9') {
    //             const responseData = await response.json();
    //             console.log(responseData);
    //         } else {
    //             console.error('서버 응답 오류:', response.statusText);
    //         }
    //     }
    // } catch
    //     (error) {
    //     console.error('API 요청 실패:', error);
    //
    // }
</script>


<div class="w-10/12 m-auto">
    <div>
        <img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
    </div>
    <span class="font-bold block text-center text-4xl text-gray-800 mb-10"></span>

    <div class="flex mx-auto">
        <div class="p-4 flex-grow" style="min-width:100%; max-width: 100%;">
            <img src="/img/car3.png" class="mx-auto" alt="Apple Watch"/>
        </div>
    </div>
    <div class="mt-12">
        <div
                class="relative overflow-x-auto shadow-md sm:rounded-lg"
                style="min-width:100%; max-width: 100%;"
        >
            <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
                <thead class="text-xs text-gray-700 uppercase dark:text-gray-400">
                <tr>
                    <th scope="col" class="px-6 py-3 bg-gray-50"> 모델명</th>
                    <th scope="col" class="px-6 py-3"> {data.carname} </th>
                </tr>
                </thead>
                <tbody>
                <tr class="border-b border-gray-200 dark:border-gray-700">
                    <th
                            scope="row"
                            class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
                    >
                        브랜드
                    </th>
                    <td class="px-6 py-4"> {data.brand}</td>
                </tr>

                <tr class="border-b border-gray-200 dark:border-gray-700">
                    <th
                            scope="row"
                            class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
                    >
                        차종
                    </th>
                    <td class="px-6 py-4"> {data.vehicle}</td>
                </tr>

                <tr class="border-b border-gray-200 dark:border-gray-700">
                    <th
                            scope="row"
                            class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
                    >
                        차량 가격
                    </th>
                    <td class="px-6 py-4">
                        {data.minPrice} ~ {data.maxPrice} 만원
                    </td
                    >
                </tr>

                <tr class="border-b border-gray-200 dark:border-gray-700">
                    <th
                            scope="row"
                            class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
                    >
                        사이즈
                    </th>
                    <td class="px-6 py-4">
                        {data.size}
                    </td>
                </tr>

                <tr class="border-b border-gray-200 dark:border-gray-700">
                    <th
                            scope="row"
                            class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
                    >
                        유종
                    </th>
                    <td class="px-6 py-4">
                        {data.fuel}
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="w-full flex bottom-20 mx-auto mt-8 mb-6 justify-evenly">
            <div class="w-full flex bottom-20 mx-auto mt-8 mb-6 justify-evenly">
                <Button class="w-2/5" color="light" pill on:click={() => { searchPage(); }}>다른 모델 검색하기</Button>
                <!-- isFavorite 상태에 따라 아이콘 변경 -->
                <Button class="bg-[#f3651f] w-2/5" on:click={() => { toggleFavorite(); }} pill>
                    {#if isFavorite}
                        <!-- 찜한 상태일 때 -->
                        찜하기 완료
                        <svg class="ml-2 w-6 h-6 text-white" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                             fill="currentColor" viewBox="0 0 24 24">
                            <path d="m12.7 20.7 6.2-7.1c2.7-3 2.6-6.5.8-8.7A5 5 0 0 0 16 3c-1.3 0-2.7.4-4 1.4A6.3 6.3 0 0 0 8 3a5 5 0 0 0-3.7 1.9c-1.8 2.2-2 5.8.8 8.7l6.2 7a1 1 0 0 0 1.4 0Z"/>
                        </svg>
                    {:else}
                        <!-- 찜하지 않은 상태일 때 -->
                        찜하기
                        <svg class="ml-2 w-6 h-6 text-white" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                             fill="none" viewBox="0 0 24 24">
                            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                  d="M12 6C6.5 1 1 8 5.8 13l6.2 7 6.2-7C23 8 17.5 1 12 6Z"/>
                        </svg>
                    {/if}
                </Button>
            </div>
        </div>
    </div>
</div>
