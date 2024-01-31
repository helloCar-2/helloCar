<script>

	import '../styles.css'
	import api from '$lib/axiosEnterceptor/api.js';

    let admin;

	if (typeof window !== 'undefined') {
		const accessToken = localStorage.getItem('accessToken');

		let username = api.post('/verify-token', {
			// 요청 본문 데이터
		}, {
			headers: {
				'Content-Type': 'application/json',
				'Authorization': `Bearer ${accessToken}`,
			}
		})
				.catch(function (error) {
					console.log('진짜냐 :',error);
				});

        const getData = () => {
            username.then((username) => {
                admin = username;
            });
        };
        getData();
	}
</script>
<div class="background_img object-fill opacity-70">
    <img
            src="img/car.png"
            alt="car_image"
            class="object-cover mx-auto w-full"
            style="height: 900px;"
    />
    <div class="absolute top-0 left-1/2 transform -translate-x-1/2 pt-4">
        <a href="/car-home"> <img src="img/logo2.png" alt="로고" class="w-26 h-16"/></a>
    </div>
</div>

{#if admin === "admin"}
    <a href="/hellocar">
        <div
                class="model_search absolute left-1/2 transform -translate-x-1/2 top-24 mt-6 p-6 bg-white bg-opacity-80 border border-gray-200 drop-shadow"
                style="width: 300px; height: 260px;"
        >
            <img src="img/car1.png" alt="car_image" class="object-cover w-60 h-24 mx-auto"/>

            <h5 class="mb-20 mt-8 text-4xl tracking-tight text-black-900 text-center">모델 등록하기</h5>
        </div>
    </a>
{:else}
    <a href="/model-search">
        <div
                class="model_search absolute left-1/2 transform -translate-x-1/2 top-24 mt-6 p-6 bg-white bg-opacity-80 border
        border-gray-200 drop-shadow"
                style="width: 300px; height: 260px;"
        >
            <img src="img/car1.png" alt="car_image" class="object-cover w-60 h-24 mx-auto"/>

            <h5 class="mb-20 mt-8 text-4xl tracking-tight text-black-900 text-center">모델 검색하기</h5>
        </div>
    </a>
{/if}
<a href="/car-testdrive">
    <div
            class="application absolute left-1/2 transform -translate-x-1/2 top-96 mt-8 p-6 bg-opacity-80 drop-shadow"
            style="width: 300px; height: 260px;"
    >
        <svg
                class="object-cover w-60 h-24 mx-auto text-white"
                aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 20 20"
        >
            <path
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M5 1v3m5-3v3m5-3v3M1 7h7m1.506 3.429 2.065 2.065M19 7h-2M2 3h16a1 1 0 0 1 1 1v14a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V4a1 1 0 0 1 1-1Zm6 13H6v-2l5.227-5.292a1.46 1.46 0 0 1 2.065 2.065L8 16Z"
            />
        </svg>
        <h5 class="mb-20 mt-8 text-4xl tracking-tight text-white text-center">시승 신청하기</h5>
    </div>
</a>
