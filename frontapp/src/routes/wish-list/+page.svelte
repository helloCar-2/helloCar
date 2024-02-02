<script>

    import api from "$lib/axiosEnterceptor/api.js";

    import {
        Button,
        Checkbox,
        Table,
        TableBody,
        TableBodyCell,
        TableBodyRow,
        TableHead,
        TableHeadCell
    } from 'flowbite-svelte';

    let result = [];

    if (typeof window !== 'undefined') {
        const accessToken = localStorage.getItem('accessToken');
        const res = api.post(`/hellocar/wishLists`, {
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

console.log(res)
        const getData = () => {
            res.then((res) => {
                result = res.data.helloCarList;
                console.log(result)
            });
        };
        getData();


    }
</script>
<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
<span class="font-bold block text-center text-4xl text-gray-800 mb-10">찜 목록</span>

{#each result as res}
    {res.id} / {res.carname} / {res.minPrice} / {res.maxPrice} <br/>
{/each}
<Table>
    <TableHead>
        <TableHeadCell>선택</TableHeadCell>
        <TableHeadCell class="text-center">차량 이미지</TableHeadCell>
        <TableHeadCell class="text-center">차량 이름</TableHeadCell>
        <TableHeadCell class="text-center">차량 가격</TableHeadCell>
        <TableHeadCell class="text-center">찜</TableHeadCell>
    </TableHead>
    <TableBody class="divide-y">
        {#each result as res}
            <TableBodyRow>
                <TableBodyCell>
                    <Checkbox checked>
                    </Checkbox>
                </TableBodyCell>
                <TableBodyCell><img src="/img/car3.png" class="w-16 md:w-32 max-w-full max-h-full mx-auto" alt=""/>
                </TableBodyCell>
                <TableBodyCell class="text-center">{res.carname}</TableBodyCell>
                <TableBodyCell class="text-center">{res.minPrice} ~ {res.maxPrice} 만원</TableBodyCell>
                <TableBodyCell class="relative">
                    <Button class="mx-auto w-full " on:click={() => { toggleFavorite(); }} pill>
                        <svg
                                class="w-6 h-6 text-gray-800 text-red-500 mx-auto"
                                aria-hidden="true"
                                xmlns="http://www.w3.org/2000/svg"
                                fill="currentColor"
                                viewBox="0 0 20 18"
                        >
                            <path
                                    d="M17.947 2.053a5.209 5.209 0 0 0-3.793-1.53A6.414 6.414 0 0 0 10 2.311 6.482 6.482 0 0 0 5.824.5a5.2 5.2 0 0 0-3.8 1.521c-1.915 1.916-2.315 5.392.625 8.333l7 7a.5.5 0 0 0 .708 0l7-7a6.6 6.6 0 0 0 2.123-4.508 5.179 5.179 0 0 0-1.533-3.793Z"
                            />
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