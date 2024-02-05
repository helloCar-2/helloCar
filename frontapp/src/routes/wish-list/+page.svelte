<script>
    import api from "$lib/axiosEnterceptor/api.js";
    import {
        Button,
        Checkbox, List,
        Table,
        TableBody,
        TableBodyCell,
        TableBodyRow,
        TableHead,
        TableHeadCell
    } from 'flowbite-svelte';

    let result = [];

    async function action() {
        if (typeof window !== 'undefined') {
            const accessToken = localStorage.getItem('accessToken');
            try {
                const res = await api.post(`/hellocar/wishLists`, {
                    // 요청 본문 데이터
                }, {
                    headers: {
                        'Content-Type': 'application/json',
                        'Authorization': `Bearer ${accessToken}`,
                    }
                });

                // car라는 항목에 isFavorite: false 속성을 추가
                result = res.data.helloCarList.map((car) => ({...car, isFavorite: true}));
            } catch (error) {
                console.log('error :', error);
            }
        }
    }
    action();

    async function toggleFavorite(carId) {
        console.log(carId);

        if (typeof window !== 'undefined') {
            const accessToken = localStorage.getItem('accessToken');

            try {
                const deleteResponse = await api.delete(`/hellocar/delete/${carId}`, {
                    headers: {
                        'Authorization': `Bearer ${accessToken}`,
                    },
                });
                if (deleteResponse) {
                    // console.log('삭제 성공',deleteResponse);
                    result = deleteResponse.data.helloCarList.map((car) => ({...car}));
                    console.log(result)
                } else {
                    console.error('삭제 실패:', result.resultMsg);
                }
            } catch (error) {
                console.error('삭제 요청 오류:', error);
            }
        }
    }
</script>
<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
<span class="font-bold block text-center text-4xl text-gray-800 mb-10">찜 목록</span>

<!--{#each result as res}-->
<!--    {res.id} / {res.carname} / {res.minPrice} / {res.maxPrice} <br/>-->
<!--{/each}-->
<Table>
    <TableHead>
        <TableHeadCell class="text-center">번호</TableHeadCell>
        <TableHeadCell class="text-center">차량 이미지</TableHeadCell>
        <TableHeadCell class="text-center">차량 이름</TableHeadCell>
        <TableHeadCell class="text-center">차량 가격</TableHeadCell>
        <TableHeadCell class="text-center">찜</TableHeadCell>
    </TableHead>
    <TableBody class="divide-y">
        {#each result as car ,index(car.id)}
            <TableBodyRow>
                <TableBodyCell class="text-center">{index + 1}
                </TableBodyCell>
                <TableBodyCell><img src="/img/car3.png" class="w-16 md:w-32 max-w-full max-h-full mx-auto" alt=""/>
                </TableBodyCell>
                <TableBodyCell class="text-center">{car.carname}</TableBodyCell>
                <TableBodyCell class="text-center">{car.minPrice} ~ {car.maxPrice} 만원</TableBodyCell>
                <TableBodyCell class="relative">
                    <Button class="w-full mx-auto" on:click={() => { toggleFavorite(car.id); }} pill>
                            <!-- 찜한 상태일 때 -->

                            <svg class=" w-6 h-6 text-red-600" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                                 fill="currentColor" viewBox="0 0 24 24">
                                <path d="m12.7 20.7 6.2-7.1c2.7-3 2.6-6.5.8-8.7A5 5 0 0 0 16 3c-1.3 0-2.7.4-4 1.4A6.3 6.3 0 0 0 8 3a5 5 0 0 0-3.7 1.9c-1.8 2.2-2 5.8.8 8.7l6.2 7a1 1 0 0 0 1.4 0Z"/>
                            </svg>

                    </Button>
                </TableBodyCell>
            </TableBodyRow>
        {/each}
    </TableBody>
</Table>

<!--<input type="checkbox" id="react-option" value="" class="hidden peer" required="">-->
<!--<label for="react-option"-->
<!--       class="inline-flex items-center justify-between w-full p-2 text-gray-500 bg-white border-2 border-gray-200 rounded-lg cursor-pointer peer-checked:border-orange-500 hover:text-gray-600 peer-checked:text-gray-600 hover:bg-gray-50">-->
<!--    <table class="w-full text-sm text-left text-gray-500">-->
<!--        <thead class="text-xs text-gray-700 uppercase bg-gray-50">-->
<!--        <tr>-->
<!--            <th scope="col" class="px-10 py-3">-->
<!--                <span class="sr-only"></span>-->
<!--            </th>-->
<!--            <th scope="col" class="px-6 py-3">선택</th>-->
<!--            <th scope="col" class="px-6 py-3">차량이름</th>-->
<!--            <th scope="col" class="px-6 py-3">차량 가격</th>-->
<!--            <th scope="col" class="px-6 py-3"></th>-->
<!--        </tr>-->
<!--        </thead>-->
<!--        <tbody>-->
<!--        <tr class="bg-white border-b">-->
<!--            <td class="p-4">-->
<!--                <Checkbox checked><img src="/img/car3.png" class="w-16 md:w-32 max-w-full max-h-full" alt=""/>-->
<!--                </Checkbox>-->
<!--            </td>-->
<!--            <td class="px-6 py-4 font-semibold text-gray-900 dark:text-white"></td>-->
<!--            <td class="px-6 py-4 font-semibold text-gray-900 dark:text-white"> 1200만원</td>-->
<!--            <td class="px-6 py-4">-->
<!--                <svg-->
<!--                        class="w-6 h-6 text-gray-800 text-red-500 mx-auto"-->
<!--                        aria-hidden="true"-->
<!--                        xmlns="http://www.w3.org/2000/svg"-->
<!--                        fill="currentColor"-->
<!--                        viewBox="0 0 20 18"-->
<!--                >-->
<!--                    <path-->
<!--                            d="M17.947 2.053a5.209 5.209 0 0 0-3.793-1.53A6.414 6.414 0 0 0 10 2.311 6.482 6.482 0 0 0 5.824.5a5.2 5.2 0 0 0-3.8 1.521c-1.915 1.916-2.315 5.392.625 8.333l7 7a.5.5 0 0 0 .708 0l7-7a6.6 6.6 0 0 0 2.123-4.508 5.179 5.179 0 0 0-1.533-3.793Z"-->
<!--                    />-->
<!--                </svg>-->
<!--            </td>-->
<!--        </tr>-->
<!--        </tbody>-->
<!--    </table>-->
<!--</label>-->