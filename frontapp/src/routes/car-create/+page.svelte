<div class="container w-100 my-3 mx-auto flex justify-center">
    <form meod="post" enctype="multipart/form-data">
        <div>
            <div class="mx-auto">
                <label class="block mb-2 text-sm font-black text-gray-900 darktext-dark" for="files">Upload
                    file</label>
                <input class="block w-96 text-sm text-gray-900 border border-gray-300 rounded-lg cursor-pointer bg-gray-50 focusoutline-none"
                       aria-describedby="file_input_help" name="files" id="files" type="file"
                       accept="image/jpeg, image/png, image/gif">
                <p class="mt-1 text-sm text-gray-500 darktext-gray-700" id="file_input_help">SVG, PNG, JPG or GIF (MAX.
                    800x400px).</p>
            </div>
            <div class="mb-6 my-4">
                <label for="wineName" class="block mb-2 text-sm font-black text-gray-900">브랜드</label>
                <input type="text" id="brand"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="wineNameE" class="block mb-2 text-sm font-black text-gray-900">차 이름</label>
                <input type="text" id="car-name"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="country" class="block mb-2 text-sm font-black text-gray-900">최소 가격</label>
                <input type="number" id="min-price"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="price" class="block mb-2 text-sm font-black text-gray-900">최대 가격</label>
                <input type="number" id="max-price"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="list" class="block mb-2 text-sm font-black text-gray-900">차 종류</label>
                <input type="text" id="kind"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="kind" class="block mb-2 text-sm font-black text-gray-900">유종</label>
                <input type="text" id="oil"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="food" class="block mb-2 text-sm font-black text-gray-900">연식</label>
                <input type="text" id="year"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="mb-6 my-4">
                <label for="food1" class="block mb-2 text-sm font-black text-gray-900">사이즈</label>
                <input type="text" id="size"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focusring-blue-500 focusborder-blue-500 block w-96 p-2.5">
            </div>
            <div class="flex justify-end">
                <button class="mt-8 text-white bg-gray-800 hoverbg-gray-900 focusoutline-none focusring-4 focusring-gray-300 font-black rounded-lg text-sm px-5 py-2.5 me-2 mb-2 ml-20">
                    게시글 등록
                </button>
            </div>
        </div>
    </form>
</div>