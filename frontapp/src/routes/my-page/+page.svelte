<script>
	import { onMount } from 'svelte';

	let userData = {
		username: '', // 초기값 설정
		password: '', // 초기값 설정
		passwordconfirm: '',
		name: '', // 초기값 설정
		email: '', // 초기값 설정
	};

	onMount(async () => {
		try {
			const response = await fetch('http://localhost:8080/member/me', {
				method: 'GET',
				headers: {
					'Content-Type': 'application/json',
					// 여기에 인증 토큰 또는 필요한 헤더를 추가할 수 있습니다.
				},
			});

			if (response.ok) {
				userData = await response.json();
			} else {
				console.error('서버 응답 오류:', response.statusText);
			}
		} catch (error) {
			console.error('오류 발생:', error);
		}
	});
</script>


<div class="container mx-auto w-5/6">
	<img src="../img/logo1.png" class="h-20 w-60 object-cover mx-auto my-6 object-cover mt-12">
	<h5 class="text-4xl text-center my-8 font-bold">마이페이지</h5>
	<div>
		<div>
			<label for="id" class="flex mb-2 text-xl font-medium text-gray-900 ">아이디</label>
			<textarea id="id" rows="1"
					  class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
					  placeholder="Write your thoughts here..."></textarea>
		</div>
		<div>
			<label for="pw" class="flex mb-2 text-xl font-medium text-gray-900 ">비밀번호</label>
			<textarea id="pw" rows="1"
					  class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
					  placeholder="Write your thoughts here..."></textarea>
		</div>
		<div>
			<label for="pw_check" class="flex mb-2 text-xl font-medium text-gray-900 ">비밀번호 확인</label>
			<textarea id="pw_check" rows="1"
					  class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
					  placeholder="Write your thoughts here..."></textarea>
		</div>
		<div>
			<label for="name" class="flex mb-2 text-xl font-medium text-gray-900 ">성명</label>
			<textarea id="name" rows="1"
					  class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
					  placeholder="Write your thoughts here..."></textarea>
		</div>
		<div>
			<label class="flex mb-2 text-xl font-medium text-gray-900 ">이메일</label>
			<form>
				<label for="search"
					   class="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Search</label>
				<div class="relative">
					<input type="search" id="search"
						   class="block w-full p-4 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500"
						   placeholder="이메일을 입력해주세요." required>
					<button id="sendVerificationCodeButton"

							class="text-white absolute end-2.5 bottom-2.5 bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-4 py-2">
						인증번호 발송
					</button>
				</div>
			</form>



		</div>
		<div class="flex text-center mt-12">
			<button type="button"
					class="my-auto w-full justify-start focus:outline-none text-white bg-[#f3651f] hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 ">
				회원 정보 수정
			</button>
		</div>
		<div class="text-right">
			<a href="#" class=" mt-2 text-red-500 ml-auto underline hover:text-yellow-500">
				회원 탈퇴
			</a>
		</div>
	</div>
</div>

