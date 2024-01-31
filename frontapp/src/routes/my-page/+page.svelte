<script>
    import '$lib/axiosEnterceptor/api.js';
    import api from '$lib/axiosEnterceptor/api.js';

    let userData = {
        username: '',
        password: '',
        passwordconfirm: '',
        name: '',
        email: '',
    };
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
    let passwordDiv = false;
    let passwordConfirmDiv = false;

    function toggleHidden() {
        name = false;
        email = false;
        sendemail = true;
        passwordDiv = true;
        passwordConfirmDiv = true;
    }

    function logout() {
        // 로컬 스토리지에서 토큰 삭제
        localStorage.removeItem('accessToken');
        window.location.href = '/auth/login';
    }
</script>

<div class="container mx-auto w-5/6">
    <img src="../img/logo1.png" class="h-20 w-60 object-cover mx-auto my-6 object-cover mt-12">
    <h5 class="text-4xl text-center my-8 font-bold">마이페이지</h5>
    <div>
        <div>
            <label for="username" class="flex mb-2 text-xl font-medium text-gray-900 ">아이디</label>
            <textarea id="username" name="username" rows="1"
                      bind:value={userData.username}
                      disabled={username}
                      class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                      placeholder="아이디"></textarea>
        </div>
        <div class:hidden={!passwordDiv}>
            <label for="password" class="flex mb-2 text-xl font-medium text-gray-900 ">비밀번호</label>
            <textarea id="password" rows="1" bind:value={userData.password}
                      class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                      placeholder="비밀번호를 확인해주세요."></textarea>
        </div>
        <div class:hidden={!passwordConfirmDiv}>
            <label for="passwordconfirm" class="flex mb-2 text-xl font-medium text-gray-900 ">비밀번호 확인</label>
            <textarea id="passwordconfirm" rows="1" bind:value={userData.passwordconfirm}
                      class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                      placeholder="비밀번호를 다시 확인해주세요."></textarea>
        </div>
        <div>
            <label for="name" class="flex mb-2 text-xl font-medium text-gray-900 ">성명</label>
            <textarea id="name" rows="1" bind:value={userData.name}
                      disabled={name}
                      class="flex mb-4 p-4 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                      placeholder="Write your thoughts here..."></textarea>
        </div>
        <div>
            <label class="flex mb-2 text-xl font-medium text-gray-900 ">이메일</label>
            <form>
                <label for="email"
                       class="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Search</label>
                <div class="relative">
                    <input type="email" id="email" bind:value={userData.email}
                           disabled={email}
                           class="block w-full p-4 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500"
                           placeholder="이메일을 입력해주세요." required>
                    <button id="sendVerificationCodeButton"
                            class:hidden={!sendemail}
                            class="text-white absolute end-2.5 bottom-2.5 bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-4 py-2">
                        인증번호 발송
                    </button>
                </div>
            </form>
        </div>
        <div class="flex text-center flex-col mt-12">
            <button type="button"
                    on:click={toggleHidden}
                    class="my-auto w-full justify-start focus:outline-none text-white bg-[#f3651f] hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 ">
                회원 정보 수정
            </button>
            <button type="button" on:click={logout}
                    class="my-auto mt-4 w-full justify-start focus:outline-none text-white bg-[#f3651f] hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 ">
                로그아웃
            </button>
        </div>
        <div class="text-right mt-2">
            <a href="#" class="text-red-500 ml-auto underline hover:text-yellow-500">
                회원 탈퇴
            </a>
        </div>
    </div>
</div>

