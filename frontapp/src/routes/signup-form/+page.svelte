<script>
    let formData = {
        name: '',
        userEmail: '',
        username: '',
        password: ''
    };

    async function verificationCode() {
        console.log("이메일 검증 완료!");

    }


    //메일 전송
    async function emailButton() {
        console.log("Number sent!");
        console.log();
        try {
            const response = await fetch('http://localhost:8080/member/email', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({email: formData.userEmail}),
            });

            if (response.ok) {
                const data = await response.json();

                if (data.resultCode === 'S-10') {
                    console.log('메일 전송 성공!', data);
                    alert("메일 전송이 완료 되었습니다.")
                } else {
                    const errorMessage = data.errorMessage;
                    console.error('Failed to send email:', errorMessage);
                }
            } else {
                console.error('서버 응답 오류:', response.statusText);
                alert('다시 입력 해주세요.');
            }
        } catch (error) {
            console.error('오류 발생:', error);
        }
    }


    //회원가입 폼 제출
    const handleSubmit = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/v1/member/create', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            });

            if (response.ok) {
                const data = await response.json();

                // 회원가입 성공한 경우
                if (data.resultCode === 'S-3') {
                    console.log('회원가입 성공!');
                    window.location.href = '/car-login';
                    alert('회원가입 되었습니다. 로그인 후 이용해 주세요.');
                } else {
                    // 회원가입 실패한 경우
                    const errorMessage = data.errorMessage;
                    console.error('회원가입 실패:', errorMessage);
                }
            } else {
                console.error('서버 응답 오류:', response.statusText);
                alert('다시 입력 해주세요.');
            }
        } catch (error) {
            console.error('오류 발생:', error);
        }
    };
</script>

<div class="container my-3 mx-auto p-4">
    <div class="background_img">
        <img src="/img/logo.png" alt="로고" class="text-center mt-24 mx-auto w-60 h-20 object-cover">
        <h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">회원가입</h5>
    </div>
    <form class="flex-col justify-center text-center" on:submit|preventDefault={handleSubmit}>
        <div>
            <label for="name" class="text-left block mb-2 text-sm font-medium text-gray-900">이름</label>
            <input type="text" id="name" bind:value={formData.name}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="성명" required>
        </div>
        <div class="flex pt-10">
            <div class="relative w-full">
                <label for="userEmail" class="text-left block mb-2 text-sm font-medium text-gray-900">메일</label>
                <input type="email" id="userEmail" bind:value={formData.userEmail}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                       placeholder="user@user.com" required>
                <button type="button" id="sendBtn" name="sendBtn" on:click={emailButton}
                        class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
                    발송
                </button>
            </div>
        </div>
        <div class="relative w-full">
            <label for="verificationCode" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">안증번호</label>
            <input type="text" id="verificationCode" on:click={verificationCode}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="인증번호" required>
            <button type="submit"
                    class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
                확인
            </button>
        </div>
        <div class="relative w-full">
            <label for="username" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">아이디</label>
            <input type="text" id="username" bind:value={formData.username}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="아이디" required>
            <button type="submit"
                    class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
                중복 확인
            </button>
        </div>
        <div>
            <label for="password" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">비밀번호</label>
            <input type="text" id="password" bind:value={formData.password}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="패스워드" required>
        </div>
        <div>
            <label for="password_confirm" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">비밀번호
                확인</label>
            <input type="text" id="password_confirm"
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="패스워드 확인" required>
        </div>
        <button
                type="submit"
                class="w-full h-12 mt-10 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center"
        >
            <p class="font-bold mx-auto text-base">회원가입</p>
        </button>
    </form>
</div>
