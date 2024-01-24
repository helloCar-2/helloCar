<div class="container my-3 mx-auto p-4">
	<div class="background_img">
		<img src="/img/logo.png" alt="로고" class="text-center mt-24 mx-auto w-60 h-20 object-cover">
		<h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">회원가입</h5>
	</div>
	<form class="flex-col text-center">

		<div class="relative w-full">
			<label for="id" class="text-left block mb-2 text-sm font-medium text-gray-900">아이디</label>
			<input type="email" id="id"
				   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
				   placeholder="ID" required>
			<button type="submit"
					class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
				중복 확인
			</button>
		</div>
		<div>
			<label for="password" class="text-left block mt-12 mb-2 text-sm font-medium text-gray-900">비밀번호</label>
			<input type="text" id="password"
				   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
				   placeholder="패스워드" required>
		</div>
		<div>
			<label for="password_confirm" class="text-left block mt-6 mb-2 text-sm font-medium text-gray-900">비밀번호
				확인</label>
			<input type="text" id="password_confirm"
				   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
				   placeholder="패스워드 확인" required>
		</div>
	</form>
	<a href="/login">
		<div data-modal-target="default-modal" data-modal-toggle="default-modal"
				class="w-full h-12 mt-6 p-8 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center"
				>
			<p class="font-bold mx-auto text-base">가입 완료</p>
		</div>
	</a>
</div>

<!--&lt;!&ndash; Main modal &ndash;&gt;-->
<!--<div id="default-modal" tabindex="-1" aria-hidden="true" class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full">-->
<!--    <div class="p-4 w-full">-->
<!--        &lt;!&ndash; Modal content &ndash;&gt;-->
<!--        <div class="mx-auto w-72 bg-white rounded-lg shadow">-->
<!--            &lt;!&ndash; Modal header &ndash;&gt;-->
<!--            <div class="flex items-center justify-center p-4 md:p-5 border-b rounded-t">-->
<!--                <h3 class="text-xl font-semibold text-center text-gray-900">-->
<!--                    안내-->
<!--                </h3>-->
<!--            </div>-->
<!--            &lt;!&ndash; Modal body &ndash;&gt;-->
<!--            <div class="p-4 md:p-3">-->
<!--                <p class="text-base text-center leading-relaxed text-gray-500">-->
<!--                    <span>회원가입이 완료되었습니다! 로그인 후 이용바랍니다.</span>-->
<!--                </p>-->
<!--            </div>-->
<!--            &lt;!&ndash; Modal footer &ndash;&gt;-->
<!--            <div class="flex justify-center items-center p-4 md:p-5 border-t border-gray-200 rounded-b">-->
<!--                <button data-modal-hide="default-modal" type="button" class="text-white bg-[#f3651f] hover:bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center">-->
<!--                    확인</button>-->
<!--            </div>-->
<!--        </div>-->
<!--    </div>-->
<!--</div>-->