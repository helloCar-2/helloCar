<script>
	export let data;
	console.log(data.data.testDrives);
</script>


<div class="mx-auto" style="width: 83.333%;">
	<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6" />
	<span class="font-bold block text-center text-4xl text-gray-800 mb-10">시승 신청내역</span>

	<div class="flex justify-center shadow-md">
		<table class="w-full text-sm text-left text-gray-500">
			<thead class="text-xs text-gray-700 uppercase bg-gray-50">
				<tr>
					<th scope="col" class="px-10 py-3">
						<span class="sr-only"></span>
					</th>
					<th scope="col" class="px-6 py-3"> 차량이름 </th>
					<th scope="col" class="px-6 py-3"> 시승날짜 / 시승장 </th>
					<th scope="col" class="px-6 py-3"> 신청상태 </th>
				</tr>
			</thead>
			<tbody>
				{#each data.data.testDrives as testdrive}
					<tr class="bg-white border-b">
						<td class="p-4">
							<img
								src="/img/car3.png"
								class="w-16 md:w-32 max-w-full max-h-full"
								alt="Apple Watch"
							/>
						</td>
						<td class="px-6 py-4 font-semibold text-gray-900">
							<a href="/testdrive-list/{testdrive.id}">
								{testdrive.car.carname}
							</a>
						</td>
						<td class="px-6 py-4 font-semibold text-gray-900">
							{testdrive.date} / {testdrive.area.drivingLoungeName}
						</td>
						<td class="px-6 py-4 font-semibold text-gray-900"> 
							<p class="bg-blue-100 hover:bg-blue-200 text-blue-800 text-xs font-semibold me-2 px-2.5 py-0.5 rounded dark:bg-gray-700 dark:text-blue-400 border border-blue-400 inline-flex items-center justify-center">
								신청 완료</p>
  							</td>
					</tr>
				{/each}

			</tbody>
		</table>
	</div>
</div>
