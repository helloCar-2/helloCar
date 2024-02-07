<script>
	import api from '$lib/axiosEnterceptor/api.js';

	let result = [];

	if (typeof window !== 'undefined') {
		const accessToken = localStorage.getItem('accessToken');
		console.log(accessToken);
		let res = api
			.get(
				'/testdrive',
				{
					// 요청 본문 데이터
				},
				{
					headers: {
						'Content-Type': 'application/json',
						Authorization: `Bearer ${accessToken}`
					}
				}
			)
			.catch(function (error) {
				console.log('진짜냐 :', error);
			});

		const getData = () => {
			res.then((res) => {
				result = res.data.testDrives;
				console.log(result);
			});
		};

		getData();
	}
</script>

<div class="">
	<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6" />
	<span class="font-bold block text-center text-4xl text-gray-800 mb-10">시승 신청내역</span>

	<div class="flex justify-center shadow-md">
		<table class="w-full text-sm text-left text-gray-500">
			<thead class="text-xs text-gray-700 uppercase bg-gray-50">
				<tr>
					<!-- <th scope="col" class="px-10 py-3">
						<span class="sr-only"></span>
					</th> -->
					<th scope="col" class="px-6 py-3 text-center"> 번호 </th>
					<th scope="col" class="px-6 py-3"> 사진 </th>
					<th scope="col" class="px-6 py-3"> 차량이름 </th>
					<th scope="col" class="px-6 py-3"> 시승날짜 / 시승장 </th>
					<th scope="col" class="px-6 py-3"> 신청상태 </th>
				</tr>
			</thead>
			<tbody>
				{#each result as testdrive, index (testdrive.id)}
					<tr class="bg-white border-b">
						<td class="text-center">
							{index + 1}
						</td>
						<td class="p-4">
							<img
								src="/img/car3.png"
								class="w-16 md:w-32 max-w-full max-h-full"
								alt="Apple Watch"
							/>
						</td>
						<td class="px-6 py-4 font-semibold text-gray-900">
							{testdrive.car}
						</td>
						<td class="px-6 py-4 font-semibold text-gray-900">
							{testdrive.testDriveDate} / {testdrive.area}
						</td>
						<td class="px-6 py-4 font-semibold text-gray-900"> 신청 완료 </td>
					</tr>
				{/each}
			</tbody>
		</table>
	</div>
</div>
