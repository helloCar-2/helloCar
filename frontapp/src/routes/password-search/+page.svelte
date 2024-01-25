<div class="container my-3 mx-auto p-4">
	<div class="background_img">
		<img src="/img/logo.png" alt="로고" class="text-center mt-24 mx-auto w-60 h-20 object-cover">
		<h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">비밀번호 찾기</h5>
	</div>
	<form class="flex-col text-center">
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

		<p id="helper-text-explanation" class="mt-2 text-sm text-gray-500">인증번호 6자리를 입력헤주세요</p>
	</form>
	<button data-modal-target="default-modal" data-modal-toggle="default-modal" class="w-full h-12 mt-6 p-8 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center" type="button">
		<p class="font-bold mx-auto text-base">비밀번호 찾기</p>
	</button>
</div>


<!-- Main modal -->
<div id="default-modal" tabindex="-1" aria-hidden="true" class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full">
	<div class="p-4 w-full">
		<!-- Modal content -->
		<div class="mx-auto w-72 bg-white rounded-lg shadow">
			<!-- Modal header -->
			<div class="flex items-center justify-center p-4 md:p-5 border-b rounded-t">
				<h3 class="text-xl font-semibold text-center text-gray-900">
					안내
				</h3>
			</div>
			<!-- Modal body -->
			<div class="p-4 md:p-3">
				<p class="text-base text-center leading-relaxed text-gray-500">
					<span>메일로 임시비밀번호가 발송되었습니다. 로그인 후 비밀번호를 변경해 주세요.</span>
				</p>
			</div>
			<!-- Modal footer -->
			<div class="flex justify-center items-center p-4 md:p-5 border-t border-gray-200 rounded-b">
				<button data-modal-hide="default-modal" type="button" class="text-white bg-[#f3651f] hover:bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center">
					확인</button>
			</div>
		</div>
	</div>
</div>