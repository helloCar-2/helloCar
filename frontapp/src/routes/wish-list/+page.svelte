<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
<span class="font-bold block text-center text-4xl text-gray-800 mb-10">찜 목록</span>

<input type="checkbox" id="react-option" value="" class="hidden peer" required="">
<label for="react-option"
       class="inline-flex items-center justify-between w-full p-2 text-gray-500 bg-white border-2 border-gray-200 rounded-lg cursor-pointer peer-checked:border-orange-500 hover:text-gray-600 peer-checked:text-gray-600 hover:bg-gray-50">
    <table class="w-full text-sm text-left text-gray-500">
        <thead class="text-xs text-gray-700 uppercase bg-gray-50">
        <tr>
            <th scope="col" class="px-10 py-3">
                <span class="sr-only"></span>
            </th>
            <th scope="col" class="px-6 py-3"> 차량이름</th>
            <th scope="col" class="px-6 py-3"> 차량 가격</th>
            <th scope="col" class="px-6 py-3"></th>
        </tr>
        </thead>
        <tbody>
        <tr class="bg-white border-b">
            <td class="p-4">
                <img src="/img/car3.png" class="w-16 md:w-32 max-w-full max-h-full" alt="Apple Watch"/>
            </td>
            <td class="px-6 py-4 font-semibold text-gray-900 dark:text-white"> 제네시스 G80</td>
            <td class="px-6 py-4 font-semibold text-gray-900 dark:text-white"> 1200만원</td>
            <td class="px-6 py-4">
                <svg
                        class="w-6 h-6 text-gray-800 text-red-500 mx-auto"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="currentColor"
                        viewBox="0 0 20 18"
                >
                    <path
                            d="M17.947 2.053a5.209 5.209 0 0 0-3.793-1.53A6.414 6.414 0 0 0 10 2.311 6.482 6.482 0 0 0 5.824.5a5.2 5.2 0 0 0-3.8 1.521c-1.915 1.916-2.315 5.392.625 8.333l7 7a.5.5 0 0 0 .708 0l7-7a6.6 6.6 0 0 0 2.123-4.508 5.179 5.179 0 0 0-1.533-3.793Z"
                    />
                </svg>
            </td>
        </tr>
        </tbody>
    </table>
</label>