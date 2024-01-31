<script>
    import {AccordionItem, Accordion} from 'flowbite-svelte';
    import {Button} from 'flowbite-svelte';
    import {Label, Input} from 'flowbite-svelte';
    import {goto} from '$app/navigation';

    let formData = {
        carName: '',
        brand: '',
        maxPrice: '',
        minPrice: '',
        fuel: ''
    };

    // 제조사 클릭하면 formData.brand 에 값 넣어주는 함수임
    const buttons = [
        {id: 0, brand: ''},
        {id: 1, brand: '현대'},
        {id: 2, brand: '기아'},
        {id: 3, brand: '제네시스'},
        {id: 4, brand: '쉐보레'},
        {id: 5, brand: '르노'},
        {id: 6, brand: 'KG모빌리티'},
        {id: 7, brand: '기타'}
    ];

    const selectCarName = [
        // 현대
        {brand: '현대', value: {carName: '캐스퍼', url: '../img/casper.png'}},
        {brand: '현대', value: {carName: '아반떼', url: '../img/avante.png'}},
        {brand: '현대', value: {carName: '쏘나타', url: '../img/sonata.png'}},
        {brand: '현대', value: {carName: '그랜저', url: '../img/grandeur.png'}},
        {brand: '현대', value: {carName: '아이오닉6', url: '../img/ioniq6.png'}},
        {brand: '현대', value: {carName: '코나', url: '../img/kona.png'}},
        {brand: '현대', value: {carName: '투싼', url: '../img/tucson.png'}},
        {brand: '현대', value: {carName: '싼타페', url: '../img/santafe.png'}},
        {brand: '현대', value: {carName: '아이오닉5', url: '../img/ioniq5.png'}},
        {brand: '현대', value: {carName: '펠리세이드', url: '../img/palisade.png'}},
        {brand: '현대', value: {carName: '스타리아', url: '../img/staria.png'}},
        // 기아   { carName: '', url: '../img/.png' }
        {brand: '기아', value: {carName: '레이', url: '../img/ray.png'}},
        {brand: '기아', value: {carName: 'k3', url: '../img/k3.png'}},
        {brand: '기아', value: {carName: 'k5', url: '../img/k5.png'}},
        {brand: '기아', value: {carName: 'k8', url: '../img/k8.png'}},
        {brand: '기아', value: {carName: 'k9', url: '../img/k9.png'}},
        {brand: '기아', value: {carName: 'ev6', url: '../img/ev6.png'}},
        {brand: '기아', value: {carName: '셀토스', url: '../img/seltos.png'}},
        {brand: '기아', value: {carName: '스포티지', url: '../img/sportage.png'}},
        {brand: '기아', value: {carName: '쏘렌토', url: '../img/sorento.png'}},
        {brand: '기아', value: {carName: '모하비', url: '../img/mohave.png'}},
        {brand: '기아', value: {carName: '카니발', url: '../img/carnival.png'}},
        // 제네시스
        {brand: '제네시스', value: {carName: 'G70', url: '../img/G70.png'}},
        {brand: '제네시스', value: {carName: 'G80', url: '../img/G80.png'}},
        {brand: '제네시스', value: {carName: 'G90', url: '../img/G90.png'}},
        {brand: '제네시스', value: {carName: 'GV60', url: '../img/GV60.png'}},
        {brand: '제네시스', value: {carName: 'GV70', url: '../img/GV70.png'}},
        {brand: '제네시스', value: {carName: 'GV80', url: '../img/GV80.png'}},
        //쉐보레
        {brand: '쉐보레', value: {carName: '트레일블레이저', url: '../img/trailblazer.avif'}},
        {brand: '쉐보레', value: {carName: '이쿼녹스', url: '../img/equinox.avif'}},
        {brand: '쉐보레', value: {carName: '트래버스', url: '../img/traverse.avif'}},
        {brand: '쉐보레', value: {carName: '타호', url: '../img/tahoe.avif'}},
        {brand: '쉐보레', value: {carName: '트랙스 크로스오버', url: '../img/trax_crossover.avif'}},
        {brand: '쉐보레', value: {carName: '콜로라도', url: '../img/colorado.avif'}},
        //르노
        {brand: '르노', value: {carName: 'XM3', url: '../img/XM3.png'}},
        {brand: '르노', value: {carName: 'QM6', url: '../img/QM6.png'}},
        {brand: '르노', value: {carName: 'SM6', url: '../img/SM6.png'}},
        {brand: '르노', value: {carName: 'MASTER', url: '../img/MASTER.png'}},
        //KG모빌리티
        {brand: 'KG모빌리티', value: {carName: '토레스', url: '../img/torres.png'}},
        {brand: 'KG모빌리티', value: {carName: '티볼리', url: '../img/tivoli.png'}},
        {brand: 'KG모빌리티', value: {carName: '코란도', url: '../img/korando.png'}},
        {brand: 'KG모빌리티', value: {carName: '렉스턴', url: '../img/rexton.png'}},
        {brand: 'KG모빌리티', value: {carName: '렉스턴 스포츠', url: '../img/rexton_sport.png'}},
        {
            brand: 'KG모빌리티',
            value: {carName: '렉스턴 스포츠 칸', url: '../img/rexton_sport_khan.png'}
        }
    ];

    let selectedCarNames = [];

    function brandNameInsert(id) {
        const selectedButton = buttons.find((button) => button.id === id);
        if (selectedButton) {
            formData.brand = selectedButton.brand;
            selectedCarNames = selectCarName
                .filter((car) => car.brand === formData.brand)
                .map((car) => car.value);
        }
    }

    function carNameInsert(carName) {
        formData.carName = carName;
    }

    function feulInsert(feul) {
        formData.fuel = feul;
    }

    // const getList = async () => {
    export async function getList() {
        window.location.href =
            '/car-list?brand=' +
            formData.brand +
            '&carname=' +
            formData.carName +
            '&fuel=' +
            formData.fuel +
            '&minPrice=' +
            formData.minPrice +
            '&maxPrice=' +
            formData.maxPrice;
    }

    let accordion_open = [false, false, false, false];

    function accordion_close(num) {
        accordion_open[num] = true;
        accordion_open[num - 1] = false;
    }

    function formating() {
        (accordion_open = [true, false, false, false]),
            (selectedCarNames = []),
            (formData.carName = ''),
            (formData.brand = ''),
            (formData.maxPrice = ''),
            (formData.minPrice = ''),
            (formData.fuel = '');
    }

</script>

<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
<div class=" w-10/12 mx-auto">
    <form class=" items-center mb-6">
        <Accordion>
            <AccordionItem bind:open={accordion_open[0]}>
				<span slot="header" class="flex"
                >제조사
                    {#if formData.brand != ''}
						<div class="ml-4">{formData.brand}</div>
					{/if}
				</span>
                <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
                    <thead
                            class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400"
                    >
                    </thead>
                    <tbody class="">
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(1);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/hyundai.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">현대</p>
                            </button>
                        </th>
                    </tr>
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(2);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/kia.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">기아</p>
                            </button>
                        </th>
                    </tr>
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(3);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/genesis.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">제네시스</p>
                            </button>
                        </th>
                    </tr>
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(4);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/chevrolet.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">쉐보레(GM대우)</p>
                            </button>
                        </th>
                    </tr>
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(5);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/renault.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">르노 (삼성)</p>
                            </button>
                        </th>
                    </tr>
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(6);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/kg.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">KG모빌리티 (쌍용)</p>
                            </button>
                        </th>
                    </tr>
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <th
                                scope="row"
                                class="w-full font-medium text-gray-900 whitespace-nowrap dark:text-white"
                        >
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
										brandNameInsert(7);
										accordion_close(1);
									}}
                            >
                                <img
                                        class="my-auto rounded-t-lg"
                                        src="../img/extracar.png"
                                        alt=""
                                        style="width: 50px;"
                                />
                                <p class="my-auto ml-8 text-xl font-bold">기타 차량</p>
                            </button>
                        </th>
                    </tr>
                    </tbody>
                </table>
            </AccordionItem>
            <AccordionItem bind:open={accordion_open[1]}>
				<span slot="header" class="flex"
                >모델
                    {#if formData.carName != ''}
						<div class="ml-4">{formData.carName}</div>
					{/if}
				</span>
                <div class="grid grid-cols-2 md:grid-cols-2 gap-4">
                    {#each selectedCarNames as selectedCar}
                        <button
                                type="button"
                                data-accordion-target="#accordion-flush-body-6"
                                aria-expanded="false"
                                aria-controls="accordion-flush-body-6"
                                on:click={() => {
								carNameInsert(selectedCar.carName);
								accordion_close(2);
							}}
                        >
                            <div class="max-w-sm bg-white border border-gray-200 rounded-lg shadow-md h-full">
                                <div class="flex flex-col h-full">
                                    <img class="h-auto my-auto max-w-full rounded-lg" src={selectedCar.url} alt=""/>
                                    <div class="mx-auto h-10 text-xl font-bold tracking-tight text-gray-900">
                                        <p class="mt-2">{selectedCar.carName}</p>
                                    </div>
                                </div>
                            </div>
                        </button>
                    {/each}
                </div>
            </AccordionItem>
            <AccordionItem bind:open={accordion_open[2]}>
				<span slot="header" class="flex"
                >연료
                    {#if formData.fuel != ''}
						<div class="ml-4">{formData.fuel}</div>
					{/if}
				</span>
                <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
                    <thead
                            class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400"
                    >
                    </thead>
                    <tbody class="">
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <td>
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
									feulInsert('가솔린');
									accordion_close(3);
								}}>가솔린(휘발유)
                            </button>
                        </td>
                    </tr>
                    </tbody>
                    <tbody class="">
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <td>
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
									feulInsert('디젤');
									accordion_close(3);
								}}
                            >디젤(경유)
                            </button>
                        </td>
                    </tr>
                    </tbody>
                    <tbody class="">
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <td>
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
									feulInsert('LPG');
									accordion_close(3);
								}}
                            >LPG
                            </button>
                        </td>
                    </tr>
                    </tbody>
                    <tbody class="">
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <td>
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
									feulInsert('가솔린 하이브리드');
									accordion_close(3);
								}}
                            >가솔린 하이브리드
                            </button>
                        </td>
                    </tr>
                    </tbody>
                    <tbody class="">
                    <tr class="w-full bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                        <td>
                            <button
                                    type="button"
                                    class="flex w-full p-4 focus:outline-none text-black font-medium rounded-lg text-sm"
                                    on:click={() => {
									feulInsert('전기');
									accordion_close(3);
								}}
                            >전기
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </AccordionItem>
            <AccordionItem bind:open={accordion_open[3]}>
                <span slot="header">가격대</span>
                <div class="my-4 flex items-center justify-center">
                    <Input
                            id="large-input"
                            size="lg"
                            placeholder="최소 가격"
                            class="w-2/5"
                            bind:value={formData.minPrice}
                    />
                    <p class="ml-2 mr-2">만원 ~</p>
                    <Input
                            id="large-input"
                            size="lg"
                            placeholder="최대 가격"
                            class="w-2/5"
                            bind:value={formData.maxPrice}
                    />
                    <p class="ml-2">만원</p>
                </div>
            </AccordionItem>
        </Accordion>

        <div class="w-full flex bottom-20 mx-auto mt-8 justify-evenly">
            <Button
                    class="w-2/5"
                    color="light"
                    pill
                    on:click={() => {
					formating();
				}}>전체 초기화
            </Button
            >
            <Button
                    class="bg-[#f3651f] w-2/5"
                    on:click={() => {
					getList();
					// gotobutton();
					// navigateToOtherPage()
				}}
                    pill>검색
            </Button
            >
        </div>
    </form>
</div>
