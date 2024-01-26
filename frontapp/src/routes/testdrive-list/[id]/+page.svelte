<script>
	export let data;
</script>

<div class="w-10/12 m-auto">
	<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6" />
	<span class="font-bold block text-center text-4xl text-gray-800 mb-10">시승 신청내역</span>

	<div class="flex mx-auto">
		<div class="p-4 flex-grow" style="min-width:100%; max-width: 100%;">
			<img src="/img/car3.png" class="mx-auto" alt="" />
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
						<th scope="col" class="px-6 py-3"> {data.data.testDrive.car.carname} </th>
					</tr>
				</thead>
				<tbody>
					<tr class="border-b border-gray-200 dark:border-gray-700">
						<th
							scope="row"
							class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
						>
							차량 가격
						</th>
						<td class="px-6 py-4">
							{data.data.testDrive.car.minPrice} ~ {data.data.testDrive.car.maxPrice} 만원</td
						>
					</tr>
					<tr class="border-b border-gray-200 dark:border-gray-700">
						<th
							scope="row"
							class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
						>
							시승 장소
						</th>
						<td class="flex items-center px-6 py-4">
							{data.data.testDrive.area.drivingLoungeName}

							<!-- Modal toggle -->
							<button
								data-modal-target="default-modal"
								data-modal-toggle="default-modal"
								class="text-align ml-auto block text-white bg-gray-400 hover:bg-gray-500 focus:ring-4 focus:outline-none focus:ring-gray-200 font-medium rounded-lg text-sm px-5 py-2.5 text-center"
								type="button"
							>
								지도로 보기
							</button>

							<!-- Main modal -->
							<div
								id="default-modal"
								tabindex="-1"
								aria-hidden="true"
								class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"
							>
								<div class="relative p-4 w-full max-w-2xl max-h-full">
									<!-- Modal content -->
									<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
										<!-- Modal header -->
										<div
											class="flex items-center justify-between p-4 md:p-5 border-b rounded-t dark:border-gray-600"
										>
											<h3 class="text-center text-xl font-semibold text-gray-900 dark:text-white">
												{data.data.testDrive.area.drivingLoungeName}
											</h3>
											<button
												type="button"
												class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
												data-modal-hide="default-modal"
											>
												<svg
													class="w-3 h-3"
													aria-hidden="true"
													xmlns="http://www.w3.org/2000/svg"
													fill="none"
													viewBox="0 0 14 14"
												>
													<path
														stroke="currentColor"
														stroke-linecap="round"
														stroke-linejoin="round"
														stroke-width="2"
														d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"
													/>
												</svg>
												<span class="sr-only">Close modal</span>
											</button>
										</div>
										<!-- Modal body -->
										<div class="p-4 md:p-5 space-y-4">
											<p class="text-base leading-relaxed text-gray-500 dark:text-gray-400">
												<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3195.1911677500757!2d127.11627437634174!3d36.78996666827549!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ad81bc9b7e44d%3A0x56b88b1fed08d6a5!2z7ZiE64yA7J6Q64-Z7LCoIOyynOyViOyVhOyCsOyLnOyKueyEvO2EsA!5e0!3m2!1sko!2skr!4v1705913143831!5m2!1sko!2skr" 
												width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
											</p>
										</div>
										<!-- Modal footer -->
										<div
											class="flex items-center p-4 md:p-5 border-t border-gray-200 rounded-b dark:border-gray-600"
										>
											<button
												data-modal-hide="default-modal"
												type="button"
												class="text-white bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center"
												>닫기</button
											>
										</div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr class="border-b border-gray-200 dark:border-gray-700">
						<th
							scope="row"
							class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
						>
							시승 일정
						</th>
						<td class="px-6 py-4"> {data.data.testDrive.date} / {data.data.testDrive.time} </td>
					</tr>
					<tr class="border-b border-gray-200 dark:border-gray-700">
						<th
							scope="row"
							class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap bg-gray-50 dark:text-white dark:bg-gray-800"
						>
							기타 요청사항
						</th>
						<td class="px-6 py-4"> {data.data.testDrive.request} </td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
