<script>
    import '$lib/axiosEnterceptor/api.js';

    let formData = {
        img: '',
        carName: '',
        brand: '',
        maxPrice: '',
        minPrice: '',
        modelYear: '',
        vehicle: '',
        size: '',
        fuel: ''
    };

    const handleSubmit = async () => {
        console.log(formData)
        try {
            const response = await fetch('http://localhost:8080/api/v1/hellocar/create', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            });
            console.log('Response Status:', response.status);

            if (response.ok) {
                const data = await response.json();
                console.log(data)
                //성공
                if (data.resultCode === 'S-5') {
                    console.log('생성 성공!');
                    alert('차량이 등록되었습니다.');
                    window.location.href = '/car-list';
                } else {
                    const errorMessage = data.errorMessage;
                    console.error('생성 실패:', errorMessage);
                }
            } else {
                console.error('서버 응답 오류:', response.statusText);
                console.log(formData)
                alert('다시 입력 해주세요.ㅋㅋ');
            }
        } catch (error) {
            console.error('오류 발생:', error);
        }
    };
</script>
<div class="container w-100 my-3 mx-auto flex justify-center">
    <form enctype="multipart/form-data" on:submit|preventDefault={handleSubmit}>
        <div class="background_img">
            <img
                    src="/img/logo.png"
                    alt="로고"
                    class="text-center mt-12 mx-auto w-60 h-20 object-cover"
            />
            <h5 class="login mb-20 mt-10 text-4xl tracking-tight text-black text-center font-bold">
                차량 등록하기
            </h5>
        </div>
        <div>
            <div class="mx-auto">
                <label class="block mb-2 text-sm font-black text-gray-900" for="profileImgUrl">Upload
                    file</label>
                <input class="block w-96 text-sm text-gray-900 border border-gray-300 rounded-lg cursor-pointer bg-gray-50 focus:outline-none"
                       aria-describedby="file_input_help" name="img" id="img" type="file"
                       accept="image/jpeg, image/png, image/gif">
                <p class="mt-1 text-sm text-gray-500" id="img">SVG, PNG, JPG or GIF (MAX.
                    800x400px).</p>
            </div>
            <div class="mb-6 my-4">
                <label for="brand" class="block mb-2 text-sm font-black text-gray-900">브랜드</label>
                <input type="text" id="brand" bind:value={formData.brand}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="carName" class="block mb-2 text-sm font-black text-gray-900">차 이름</label>
                <input type="text" id="carName" bind:value={formData.carName}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="minPrice" class="block mb-2 text-sm font-black text-gray-900">최소 가격</label>
                <input type="number" id="minPrice" bind:value={formData.minPrice}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="maxPrice" class="block mb-2 text-sm font-black text-gray-900">최대 가격</label>
                <input type="number" id="maxPrice" bind:value={formData.maxPrice}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="vehicle" class="block mb-2 text-sm font-black text-gray-900">차 종류</label>
                <input type="text" id="vehicle"  bind:value={formData.vehicle}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="modelYear" class="block mb-2 text-sm font-black text-gray-900">유종</label>
                <input type="text" id="modelYear" bind:value={formData.fuel}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="fuel" class="block mb-2 text-sm font-black text-gray-900">연식</label>
                <input type="text" id="fuel"bind:value={formData.modelYear}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-2 my-4">
                <label for="size" class="block mb-2 text-sm font-black text-gray-900">사이즈</label>
                <input type="text" id="size" bind:value={formData.size}
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="flex justify-center">
                <button type="submit" class="w-full h-12 mt-6 text-white bg-[#f3651f] hover:bg-[#cc5012 ] text-sm py-6 flex items-center">
                    <p class="font-bold mx-auto text-base">차량 등록하기</p>
                </button>
            </div>
        </div>
    </form>
</div>