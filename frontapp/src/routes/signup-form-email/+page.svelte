<div class="container my-3 mx-auto p-4">
	<div class="background_img">
		<img src="/img/logo.png" alt="로고" class="text-center mt-24 mx-auto w-60 h-20 object-cover">
		<h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">회원가입</h5>
	</div>
	<form class="flex-col justify-center text-center">
		<div>
			<label for="first_name" class="text-left block mb-2 text-sm font-medium text-gray-900">이름</label>
			<input type="text" id="first_name"
				   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
				   placeholder="성명" required>
		</div>
		<div class="flex pt-10">
			<div class="relative w-full">
				<label for="first_name" class="text-left block mb-2 text-sm font-medium text-gray-900">메일</label>
				<input type="email" id="search-dropdown"
					   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
					   placeholder="user@user.com" required>
				<button type="submit"
						class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
					발송
				</button>
			</div>
		</div>
		<label for="first_name" class="text-left block mt-4 mb-2 text-sm font-medium text-gray-900">인증번호</label>

	<a href="/signup-form">
		<div class="w-full h-12 mt-6 p-8 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center"
				>
			<p class="font-bold mx-auto text-base">NEXT →</p>
		</div>
	</a>
</div>
