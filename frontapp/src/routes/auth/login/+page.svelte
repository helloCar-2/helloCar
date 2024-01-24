<script>
	let formData = {
		username: '',
		password: ''
	};

	const handleSubmit = async () => {
		try {
			const response = await fetch('http://localhost:8080/api/v1/member/login', {
				method: 'POST',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify(formData)
			});

			if (response.ok) {
				const data = await response.json();
				console.log('Response data:', data);
			} else {
				console.error('Failed to submit the form');
			}
		} catch (error) {
			console.error('Error:', error);
		}
	};
</script>

<div class="container my-3 mx-auto p-4">
	<div class="container my-3 mx-auto">
		<div class="background_img">
			<img
				src="/img/logo.png"
				alt="로고"
				class="text-center mt-12 mx-auto w-60 h-20 object-cover"
			/>
			<h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">
				로그인
			</h5>
		</div>

		<form on:submit|preventDefault={handleSubmit}>
			<label for="username">Username:</label>
			<input type="text" id="username" bind:value={formData.username} />

			<label for="password">Password:</label>
			<input type="password" id="password" bind:value={formData.password} />

			<button type="submit">Submit</button>
		</form>
	</div>
</div>
