<script>
	export let data;

	import { Button } from 'flowbite-svelte';


    function searchPage(){
        window.location.href = '/model-search';
    }

</script>

<div class="w-10/12 m-auto">
	<div>
		<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6" />
	</div>
	<span class="font-bold block text-center text-4xl text-gray-800 mb-10"></span>

	<div class="flex mx-auto">
		<div class="p-4 flex-grow" style="min-width:100%; max-width: 100%;">
			<img src="/img/car3.png" class="mx-auto" alt="Apple Watch" />
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
						<th scope="col" class="px-6 py-3 bg-gray-50"> 모델명 </th>
						<th scope="col" class="px-6 py-3"> {data.data.helloCar.carname} </th>
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
						<td class="px-6 py-4"> {data.data.helloCar.brand}</td>
					</tr>

					<tr class="border-b border-gray-200 dark:border-gray-700">
						<th
							scope="row"
							class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
						>
							차종
						</th>
						<td class="px-6 py-4"> {data.data.helloCar.vehicle}</td>
					</tr>

					<tr class="border-b border-gray-200 dark:border-gray-700">
						<th
							scope="row"
							class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
						>
							차량 가격
						</th>
						<td class="px-6 py-4">
							{data.data.helloCar.minPrice} ~ {data.data.helloCar.maxPrice} 만원</td
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
							{data.data.helloCar.size}
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
							{data.data.helloCar.fuel}
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="w-full flex bottom-20 mx-auto mt-8 justify-evenly">
			<Button class="w-2/5" color="light" pill on:click={() => {
                searchPage();
            }}>다른 모델 검색하기</Button>
			<Button
				class="bg-[#f3651f] w-2/5"
				on:click={() => {
					// gotobutton();
				}}
				pill>찜하기  ♡</Button
			>
		</div>
	</div>
</div>
