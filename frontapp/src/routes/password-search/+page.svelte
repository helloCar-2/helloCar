<script>
	import { Modal } from 'flowbite-svelte';
	import { Label, Input, Button, Card } from 'flowbite-svelte';

	let formData = {
		name: '',
		username: '',
		email: ''
	};

	let defaultModal = false;

	const idSearch = async () => {
		console.log(formData);
		try {
			const response = await fetch('http://localhost:8080/api/v1/member/pwSearch', {
				method: 'POST',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify(formData)
			});

			if (response.ok) {
				defaultModal = true;
			}
		} catch (error) {
			console.error('오류 발생:', error);
			alert('존재하지 않는 계정입니다.');
		}
	};
</script>

<div class="w-10/12 mx-auto">
	<div class="background_img">
		<a href="/auth/login">
			<img
				src="/img/logo.png"
				alt="로고"
				class="text-center mt-24 mx-auto w-60 h-20 object-cover"
			/>
		</a>
		<h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">
			비밀번호 찾기
		</h5>
	</div>
	<form on:submit|preventDefault={idSearch}>
		<div class="mb-6">
			<Label for="large-input" class="block mb-2">성명</Label>
			<Input id="large-input" size="lg" placeholder="성명" bind:value={formData.name} required />
		</div>
		<div class="mb-6">
			<Label for="large-input" class="block mb-2"></Label>
			<Input
				id="large-input"
				size="lg"
				placeholder="아이디"
				bind:value={formData.username}
				required
			/>
		</div>

		<div class="mb-6">
			<Label for="large-input" class="block mb-2">이메일</Label>
			<Input id="large-input" size="lg" placeholder="이메일" bind:value={formData.email} required />
		</div>

		<Button
			type="submit"
			class="w-full h-12 mt-16 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center"
		>
			<p class="font-bold mx-auto text-base">비밀번호 찾기</p>
		</Button>
	</form>
</div>

<Modal class="text-center" title="" bind:open={defaultModal} autoclose>
	<p class="font-bold text-2xl">비밀번호 찾기 결과</p>

	<div class="mx-auto mt-4 box-border border p-4">
		<div class="p-4">등록된 이메일로 임시 비밀번호를 발송했습니다.</div>
	</div>
	<svelte:fragment slot="footer">
		<Button class="mx-auto bg-[#f3651f]">확인</Button>
	</svelte:fragment>
</Modal>
