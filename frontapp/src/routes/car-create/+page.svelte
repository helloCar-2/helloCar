<script>
    import {create} from "svelte-check";

    export let data;
</script>
<div class="container w-100 my-3 mx-auto flex justify-center">
    <form enctype="multipart/form-data">
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
                <label class="block mb-2 text-sm font-black text-gray-900" for="files">Upload
                    file</label>
                <input class="block w-96 text-sm text-gray-900 border border-gray-300 rounded-lg cursor-pointer bg-gray-50 focus:outline-none"
                       aria-describedby="file_input_help" name="files" id="files" type="file"
                       accept="image/jpeg, image/png, image/gif">
                <p class="mt-1 text-sm text-gray-500" id="file_input_help">SVG, PNG, JPG or GIF (MAX.
                    800x400px).</p>
            </div>
            <div class="mb-6 my-4">
                <label for="brand" class="block mb-2 text-sm font-black text-gray-900">브랜드</label>
                <input type="text" id="brand"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="car-name" class="block mb-2 text-sm font-black text-gray-900">차 이름</label>
                <input type="text" id="car-name"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="min-price" class="block mb-2 text-sm font-black text-gray-900">최소 가격</label>
                <input type="number" id="min-price"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="max-price" class="block mb-2 text-sm font-black text-gray-900">최대 가격</label>
                <input type="number" id="max-price"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="kind" class="block mb-2 text-sm font-black text-gray-900">차 종류</label>
                <input type="text" id="kind"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="oil" class="block mb-2 text-sm font-black text-gray-900">유종</label>
                <input type="text" id="oil"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="year" class="block mb-2 text-sm font-black text-gray-900">연식</label>
                <input type="text" id="year"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-2 my-4">
                <label for="size" class="block mb-2 text-sm font-black text-gray-900">사이즈</label>
                <input type="text" id="size"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="flex justify-center">
                <button type="submit" class="w-full h-12 mt-6 text-white bg-[#f3651f] hover:bg-[#cc5012] text-sm py-6 flex items-center">
                    <p class="font-bold mx-auto text-base">차량 등록하기</p>
                </button>
            </div>
        </div>
    </form>
</div>