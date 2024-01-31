<script>
    import api from '$lib/axiosEnterceptor/api.js';

    let userData = {
        username: '',
        password: '',
        passwordConfirm: '',
        name: '',
        email: ''
    };

    //패스워드
    let passwordSuccessMessage = '';
    let passwordErrorMessage = '';
    //패스워드 확인
    let passwordConfirmErrorMessage = '';
    let passwordConfirmSuccessMessage = '';
    //값 확인
    let error = null;
    let username = true;
    let name = true;
    let email = true;
    let sendemail = false;

    if (typeof window !== 'undefined') {
        const accessToken = localStorage.getItem('accessToken');
        const userDatas = api.get('/member/my-page', {
            // 요청 본문 데이터
        }, {
            headers: {
                'Content-Type': 'application/json',
                'Authorization': `Bearer ${accessToken}`,
            }
        })
            .catch(function (error) {
                console.log('진짜냐 :', error);
            });

        const getData = () => {
            userDatas.then((userDatas) => {
                const result = userDatas;

                userData.username = result.data.member.username;
                userData.name = result.data.member.name;
                userData.email = result.data.member.email;
            });
        };
        getData();
    }

    // 숨겨진 요소들 가져오기
    let updateConfirmDiv = false;

    function toggleHidden() {
        name = false;
        email = false;
        sendemail = true;
        updateConfirmDiv = true;
    }

    //비번 형식
    function validatePassword() {
        const passwordRegex = /^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\W)(?=\S+$).{8,16}$/;

        if (!passwordRegex.test(userData.password)) {
            passwordSuccessMessage = ''
            passwordErrorMessage = '비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용해야 합니다';
        } else {
            passwordErrorMessage = ''
            userData.password = userData.password;
        }
    }

    // 비밀번호 확인
    function confirmValidatePassword() {
        if (userData.password === userData.passwordConfirm) {
            passwordConfirmSuccessMessage = '비밀번호가 일치합니다'
            passwordConfirmErrorMessage = '';
        } else if (userData.password === '') {
            passwordConfirmSuccessMessage = ''
            passwordConfirmErrorMessage = '새로운 비밀번호를 입력해 주세요';
        } else {
            passwordConfirmSuccessMessage = ''
            userData.passwordConfirm = userData.passwordConfirm;
            passwordConfirmErrorMessage = '비밀번호가 일치하지 않습니다';
        }
    }

    //수정 제출
    const handleSubmit = async () => {
        if (userData.password == null || userData.passwordConfirm == null) {
            console.log('값 모두 입력해야함');
            alert('내용을 모두 입력해 주세요.')
            return;
        }
        try {
            const response = await fetch('http://localhost:8080/api/v1/member/modify', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(userData)
            });

            if (response.ok) {
                const data = await response.json();

                // 수정 성공한 경우
                if (data.resultCode === 'S-3') {
                    console.log('수정 성공!');
                    // 로컬 스토리지에 새로 발급된 토큰 저장
                    localStorage.setItem('accessToken', data.data.newAccessToken);
                    window.location.href = '/my-page';
                    alert('수정이 완료 되었습니다.');
                } else {
                    // 수정 실패한 경우
                    const errorMessage = data.errorMessage;
                    console.error('수정 실패:', errorMessage);
                }
            } else {
                const errorText = await response.text(); // 서버 응답 내용을 확인
                console.error('서버 응답 오류:', response.statusText, errorText);
            }
        } catch (error) {
            console.error('오류 발생:', error);
        }
    };

    function logout() {
        // 로컬 스토리지에서 토큰 삭제
        localStorage.removeItem('accessToken');
        window.location.href = '/auth/login';
    }

    // 회원 탈퇴
    const memberDelete = async () => {
        const confirmResult = window.confirm('정말로 탈퇴하시겠습니까?');
        if (confirmResult) {
            try {
                // 사용자 정보를 서버에서 받아오는 부분
                const accessToken = localStorage.getItem('accessToken');
                const response = await fetch('http://localhost:8080/api/v1/member/my-page', {
                    method: 'GET',
                    headers: {
                        'Content-Type': 'application/json',
                        'Authorization': `Bearer ${accessToken}`,
                    },
                });

                if (response.ok) {
                    const userData = await response.json();
                    console.log('userData:', userData);

                    // userData에서 memberId 추출
                    const memberId = userData.data.member.id;
                    console.log(memberId)

                    // 회원 탈퇴 요청 보내기
                    const deleteResponse = await fetch(`http://localhost:8080/api/v1/member/delete?memberId=${memberId}`, {
                        method: 'DELETE',
                        headers: {
                            'Content-Type': 'application/json',
                        },
                        body: JSON.stringify(userData),
                    });

                    if (deleteResponse.ok) {
                        const data = await deleteResponse.json();

                        // 탈퇴 성공한 경우
                        if (data.resultCode === 'S-4') {
                            // 로컬 스토리지에서 토큰 삭제
                            localStorage.removeItem('accessToken');
                            alert('탈퇴가 완료되었습니다.');
                            console.log('회원 탈퇴 성공!');

                            // 로그인 페이지로 이동
                            window.location.href = '/auth/login';
                        } else {
                            // 탈퇴 실패한 경우
                            const errorMessage = data.errorMessage;
                            console.error('탈퇴 실패:', errorMessage);
                        }
                    } else {
                        // 서버 응답 오류
                        const errorText = await deleteResponse.text();
                        console.error('서버 응답 오류:', deleteResponse.statusText, errorText);
                    }
                }
            } catch (error) {
                console.error('오류 발생:', error);
            }
        } else {
            // 사용자가 탈퇴 취소 눌렀을 경우
            console.log('탈퇴가 취소되었습니다.');
        }
    }
    if (typeof window !== 'undefined') {
        window.onload = function () {
            // 여기에 스크립트 코드 작성
            document.getElementById('deleteButton').addEventListener('click', memberDelete);
        };
    }
</script>

<div class="container mx-auto w-5/6">
    <img src="../img/logo1.png" class="h-20 w-60 object-cover mx-auto my-6 object-cover mt-12">
    <h5 class="text-4xl text-center my-8 font-bold">마이페이지</h5>
    <div>
        <div>
            <label for="username" class="flex mb-2 text-xl font-medium text-gray-900">아이디</label>
            <textarea id="username" name="username" rows="1"
                      bind:value={userData.username}
                      disabled={username}
                      class="flex p-4 w-full text-sm text-gray-900 bg-gray-200 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                      placeholder="아이디"></textarea>
        </div>
        <form on:submit|preventDefault={handleSubmit}>
            <div class:hidden={!updateConfirmDiv}>
                <label for="password" class="flex mb-2 mt-4 text-xl font-medium text-gray-900">새로운 비밀번호</label>
                <input type="password" id="password" rows="1" bind:value={userData.password} on:input={validatePassword}
                       class="flex p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                       placeholder="새로운 비밀번호">
            </div>
            <div class="flex justify-start">
                {#if passwordErrorMessage}
                    <p style="color: red;">{passwordErrorMessage}</p>
                {/if}
                {#if passwordSuccessMessage}
                    <p>{passwordSuccessMessage}</p>
                {/if}
            </div>
            <div class:hidden={!updateConfirmDiv}>
                <label for="passwordconfirm" class="flex mt-4 mb-2 text-xl font-medium text-gray-900 ">비밀번호 확인</label>
                <input type="password" id="passwordconfirm" rows="1" bind:value={userData.passwordConfirm}
                       on:input={confirmValidatePassword}
                       class="flex p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                       placeholder="비밀번호 확인">
            </div>
            <div class="flex justify-start">
                {#if passwordConfirmErrorMessage}
                    <p style="color: red;">{passwordConfirmErrorMessage}</p>
                {/if}
                {#if passwordConfirmSuccessMessage}
                    <p style="color: green;">{passwordConfirmSuccessMessage}</p>
                {/if}
            </div>
            <div>
                <label for="name" class="flex mt-4 mb-2 text-xl font-medium text-gray-900 ">성명</label>
                <textarea class:hidden={!updateConfirmDiv} id="name" rows="1" bind:value={userData.name}
                          class="flex mb-4 p-4 w-full bg-gray-50 text-sm text-gray-900 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                          placeholder="Write your thoughts here..."></textarea>
                <textarea class:hidden={updateConfirmDiv} id="name" rows="1" bind:value={userData.name}
                          disabled
                          class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-200 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                          placeholder="Write your thoughts here..."></textarea>
            </div>
            <div>
                <label class="flex mb-2 text-xl font-medium text-gray-900 ">이메일</label>
                <label for="email"
                       class="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Search</label>
                <div class="relative">
                    <input type="email" id="email" bind:value={userData.email}
                           class="bg-gray-200 block w-full p-4 text-sm text-gray-900 border border-gray-300 rounded-lg focus:ring-blue-500 focus:border-blue-500"
                           placeholder="이메일을 입력해주세요." disabled>
                </div>
            </div>
            <div class="flex text-center flex-col mt-12">
                <div class:hidden={updateConfirmDiv}>
                    <button type="button"
                            on:click={toggleHidden}
                            class="my-auto w-full justify-start focus:outline-none text-white bg-[#f3651f] hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 ">
                        회원 정보 수정
                    </button>
                </div>
                <div class:hidden={!updateConfirmDiv}>
                    <button type="submit"
                            class="my-auto w-full justify-start focus:outline-none text-white bg-[#f3651f] hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 ">
                        수정하기
                    </button>
                </div>
            </div>
        </form>
        <button type="button" on:click={logout}
                class="my-auto mt-4 w-full justify-start focus:outline-none text-white bg-[#f3651f] hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 ">
            로그아웃
        </button>
    </div>
    <div class="text-right mt-2">
        <button id="deleteButton" type="button" on:click={memberDelete}
                class="text-red-500 ml-auto underline hover:text-yellow-500">
            회원 탈퇴
        </button>
    </div>
</div>


