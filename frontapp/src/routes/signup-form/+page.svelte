<script>
    let formData = {
        name: '',
        email: '',
        username: '',
        password: '',
        passwordConfirm: ''
    };

    //아이디
    let UsernameSuccessMessage = '';
    let UsernameErrorMessage = '';
    //이메일
    let emailSuccessMessage = '';
    let emailErrorMessage = '';
    //패스워드
    let passwordSuccessMessage = '';
    let passwordErrorMessage = '';
    //패스워드 확인
    let passwordConfirmErrorMessage = '';
    let passwordConfirmSuccessMessage = '';
    //인증 코드
    let successMessage = '';
    let errorMessage = '';


    let emailNum; // 인증 코드 담기


    //메일 전송
    async function emailButton() {
        try {
            const response = await fetch('http://localhost:8080/member/email', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({email: formData.email}),
            });

            if (response.ok) {
                const data = await response.json();
                if (data.resultCode === 'S-9') {
                    emailSuccessMessage = ''
                    emailErrorMessage = '이미 가입된 메일입니다';
                } else if (data.resultCode === 'S-10' && data.resultCode !== null) {

                    emailSuccessMessage = '메일 발송이 완료되었습니다';
                    emailErrorMessage = ''

                    const num = data.data.number
                    emailNum = num;
                    return formData.email;
                } else {
                    emailSuccessMessage = ''
                    emailErrorMessage = '메일이 존재하지 않습니다';
                    console.error('서버 응답 오류:', response.statusText);
                }
            }
        } catch (error) {
            emailErrorMessage = '이미 가입된 이메일 입니다';
            emailSuccessMessage = ''
            console.error('오류 발생:', error);
        }
    }

    //인증 코드 검사
    async function checkVerificationCode() {
        try {
            const userVerificationCode = document.getElementById('userVerificationCode').value;
            if (userVerificationCode === emailNum && userVerificationCode !== null) {
                successMessage = '인증이 완료되었습니다';
                errorMessage = '';
            } else {
                successMessage = '';
                errorMessage = '다시 입력해주세요';
            }
        } catch (error) {
            console.error('오류 발생:', error);
            alert("메일 작성")
        }
    }

    // 아이디 중복 확인
    async function checkUsernameDuplicate() {
        try {
            if (!formData.username.trim()) {
                UsernameSuccessMessage = '';
                UsernameErrorMessage = '아이디를 입력해주세요';
                return;
            }
            const response = await fetch('http://localhost:8080/api/v1/member/check-username', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({username: formData.username}),
            });

            if (response.ok) {
                const data = await response.json();

                if (data.resultCode === 'S-5') {
                    UsernameSuccessMessage = '사용 가능한 아이디입니다'
                    UsernameErrorMessage = ''
                    return formData.username;
                } else {
                    UsernameSuccessMessage = ''
                    UsernameErrorMessage = '이미 사용 중인 아이디입니다';
                }
            } else {
                console.error('서버 응답 오류:', response.statusText);
            }
        } catch (error) {
            console.error('오류 발생:', error);
        }
    }

    //비번 형식
    function validatePassword() {
        const passwordRegex = /^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\W)(?=\S+$).{8,16}$/;

        if (!passwordRegex.test(formData.password)) {
            passwordSuccessMessage = ''
            passwordErrorMessage = '비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용해야 합니다';
        } else {
            passwordErrorMessage = ''
            return formData.password;
        }
    }

    //비번 확인
    function confirmValidatePassword() {

        if (formData.password === formData.passwordConfirm) {
            passwordConfirmSuccessMessage = '비밀번호가 일치합니다'
            passwordConfirmErrorMessage = '';
        } else {
            passwordConfirmSuccessMessage = ''
            passwordConfirmErrorMessage = '비밀번호가 일치하지 않습니다';
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
                    window.location.href = '/auth/login';
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
                <label for="email" class="text-left block mb-2 text-sm font-medium text-gray-900">메일</label>
                <input type="email" id="email" bind:value={formData.email}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                       placeholder="user@user.com" required>
                <button type="button" id="sendBtn" name="sendBtn" on:click={emailButton}
                        class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
                    발송
                </button>
                <div class="flex justify-start">
                    {#if emailSuccessMessage}
                        <div class="text-green-500">
                            <p>{emailSuccessMessage}</p>
                        </div>
                    {/if}
                    {#if emailErrorMessage}
                        <div class="text-red-500">
                            <p>{emailErrorMessage}</p>
                        </div>
                    {/if}
                </div>
            </div>
        </div>
        <div class="relative w-full">
            <label for="checkVerificationCode"
                   class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">인증번호</label>
            <input type="text" id="userVerificationCode"
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="인증번호" required>
            <button type="button" on:click={checkVerificationCode}
                    class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
                확인
            </button>
            <div class="flex justify-start">
                {#if successMessage}
                    <div class="text-green-500">
                        <p>{successMessage}</p>
                    </div>
                {/if}
                {#if errorMessage}
                    <div class="text-red-500">
                        <p>{errorMessage}</p>
                    </div>
                {/if}
            </div>
        </div>
        <div class="relative w-full">
            <label for="username" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">아이디</label>
            <input type="text" id="username" bind:value={formData.username}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="아이디" required>
            <button type="button" id="checkUsernameDuplicate" name="checkUsernameDuplicate"
                    on:click={checkUsernameDuplicate}
                    class="mt-6 absolute top-1 end-0 p-2.5 text-sm font-medium text-white bg-[#f3651f] hover:bg-[#cc5012] rounded-e-lg border border-[#f3651f] hover:bg-[#cc5012]">
                중복 확인
            </button>
            <div class="flex justify-start">
                {#if UsernameSuccessMessage}
                    <div class="text-green-500">
                        <p>{UsernameSuccessMessage}</p>
                    </div>
                {/if}
                {#if UsernameErrorMessage}
                    <div class="text-red-500">
                        <p>{UsernameErrorMessage}</p>
                    </div>
                {/if}
            </div>
        </div>
        <div>
            <label for="password" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">비밀번호</label>
            <input type="password" id="password" bind:value={formData.password} on:input={validatePassword}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="패스워드" required>
        </div>
        <div class="flex justify-start">
            {#if passwordErrorMessage}
                <p style="color: red;">{passwordErrorMessage}</p>
            {/if}
            {#if passwordSuccessMessage}
                <p>{passwordSuccessMessage}</p>
            {/if}
        </div>
        <div>
            <label for="passwordConfirm" class="text-left block mt-10 mb-2 text-sm font-medium text-gray-900">비밀번호
                확인</label>
            <input type="password" id="passwordConfirm" name="passwordConfirm" bind:value={formData.passwordConfirm}
                   on:input={confirmValidatePassword}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg rounded border-gray-200 focus:ring-yellow-200 focus:border-red-500 block w-full p-2.5"
                   placeholder="패스워드 확인" required>
            <div class="flex justify-start">
                {#if passwordConfirmErrorMessage}
                    <p style="color: red;">{passwordConfirmErrorMessage}</p>
                {/if}
                {#if passwordConfirmSuccessMessage}
                    <p style="color: green;">{passwordConfirmSuccessMessage}</p>
                {/if}
            </div>
        </div>
        <button
                type="submit"
                class="w-full h-12 mt-10 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center"
        >
            <p class="font-bold mx-auto text-base">회원가입</p>
        </button>
    </form>
</div>
