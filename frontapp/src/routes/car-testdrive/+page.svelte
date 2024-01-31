<script>
    import '$lib/axiosEnterceptor/api.js';

    let isChecked = false;
    let isChecked2 = false;
    let modelChecked = false;


    function isAgreed() {
        isChecked = true;
    }

    function isAgreed2() {
        isChecked2 = true;
    }

    function buttonClick() {
        if (!isChecked && !isChecked2) {
            alert("필수 사항을 먼저 동의해주세요.");
        }
    }

	function getButtonAttributes() {
    if (isChecked && isChecked2) {
      return {
        'data-accordion-target': '#accordion-flush-body-1',
        'aria-expanded': 'false',
        'aria-controls': 'accordion-flush-body-2'
      };
    } else {
      return {};
    }
  }
</script>


<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
<span class="font-bold block text-center text-4xl text-gray-800 mb-10">시승 신청</span>
<div
        id="accordion-flush"
        data-accordion="collapse"
        class="w-5/6 mx-auto"
        data-active-classes="bg-white text-gray-900"
        data-inactive-classes="text-gray-500"
>
    <h2 id="accordion-flush-heading">
        <div
                class="items-center w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
        >
            <span>서비스 이용 동의</span>
            <div class="mt-4">
                <div class="flex items-center mb-2">
                    <input
                            id="link-checkbox"
                            type="checkbox"
                            value=""
                            disabled={isChecked}
                            data-modal-target="static-modal"
                            data-modal-toggle="static-modal"
                            class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                    />
                    <label for="link-checkbox" class="ms-2 text-sm font-medium text-gray-900"
                    >(필수) 시승차 및 서비스 이용에 따른 고지사항 및 이용약관 안내</label
                    >
                    <!-- Main modal -->
                    {#if !isChecked}
                        <div
                                id="static-modal"
                                data-modal-backdrop="static"
                                tabindex="-1"
                                aria-hidden="true"
                                class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"
                        >
                            <div class="relative p-4 w-full max-w-2xl max-h-full">
                                <!-- Modal content -->
                                <div class="relative bg-white rounded-lg shadow">
                                    <!-- Modal header -->
                                    <div class="flex items-center justify-between p-4 md:p-5 border-b rounded-t">
                                        <h3 class="text-xl font-semibold text-gray-900">
                                            (필수) 시승차 및 서비스 이용에 따른 고지사항 및 이용약관 안내
                                        </h3>
                                        <!--                                        <button-->
                                        <!--                                                type="button"-->
                                        <!--                                                class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center"-->
                                        <!--                                                data-modal-hide="static-modal"-->
                                        <!--                                        >-->
                                        <!--                                            <svg-->
                                        <!--                                                    class="w-3 h-3"-->
                                        <!--                                                    aria-hidden="true"-->
                                        <!--                                                    xmlns="http://www.w3.org/2000/svg"-->
                                        <!--                                                    fill="none"-->
                                        <!--                                                    viewBox="0 0 14 14"-->
                                        <!--                                            >-->
                                        <!--                                                <path-->
                                        <!--                                                        stroke="currentColor"-->
                                        <!--                                                        stroke-linecap="round"-->
                                        <!--                                                        stroke-linejoin="round"-->
                                        <!--                                                        stroke-width="2"-->
                                        <!--                                                        d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"-->
                                        <!--                                                />-->
                                        <!--                                            </svg>-->
                                        <!--                                            <span class="sr-only">Close modal</span>-->
                                        <!--                                        </button>-->
                                    </div>
                                    <!-- Modal body -->
                                    <div class="p-4 md:p-5 space-y-4">
                                        <p class="text-base leading-relaxed text-gray-500">
                                            1. 유의사항
                                            <br/>
                                            ①고객님의 시승차 운전이 불가하다고 판단 시 귀사 직원의 판단에 따라 즉시 시승이 중단/취소될
                                            수 있으며 향후 시승 이용이 제한될 수 있습니다.
                                            <br/>
                                            (음주, 심신미약, 운전미숙, 과속 및 난폭운전, 기상악화 등 안전상 위험하다고 판단되는
                                            경우)
                                            <br/>
                                            ②시승서비스 이용을 위해서는 시승 전 반드시 운전면허증을 제시해야 합니다.
                                            <br/>
                                            ③시승차는 보험 적용 기준에 따라 만 21세 이상만 운행 가능합니다.
                                            <br/>
                                            ④다음 시승 신청 고객님들을 위해 시승 신청시간을 준수해 주시기 바랍니다.
                                            <br/>
                                            신청 변동사항이 있을 경우 드라이빙라운지 혹은 담당 카마스터에게 사전 연락을 부탁드립니다.
                                            <br/>
                                            고객님과 연락이 두절되는 경우 시승 신청이 자동 취소될 수 있습니다.
                                            <br/>
                                            시승시간은 총 1시간 또는 1시간 30분입니다.
                                            <br/>
                                            (시승시간은 예약 시간대별로 상이하며 거점별 운영 상황에 따라 변경될 수 있습니다.)
                                            <br/>
                                            * long-time 시승 (총 2시간 30분)을 원하시는 경우 방문 희망 드라이빙라운지로 유선
                                            연락 주시길 바랍니다.
                                            <br/>
                                            해당 드라이빙라운지 예약 상황에 따라 희망하시는 차종의 시승 가능 여부를 안내드립니다.
                                            <br/>
                                            ⑤시승 고객님의 안전한 운행을 위해 동승 시승을 희망하시는 경우 카마스터가 동승합니다.
                                            <br/>
                                            ⑥계약 이력 또는 담당 카마스터가 있는 고객님이 동승 시승을 희망하시는 경우 담당 카마스터와
                                            동승 시승 가능 여부 확인 후 예약이 확정됩니다. 계약 이력이 있는 고객님은 담당 카마스터가
                                            동승이 불가능한 경우, 동승 시승 서비스 이용이 제한될 수 있습니다.
                                            <br/>
                                            ⑦시승서비스는 고객님께서 차량을 구매하기 전 관심 차종을 경험할 수 있는 기회를 드리고자
                                            제공되는 서비스입니다. 따라서 개인적 용도로 시승차를 이용하려는 경우 시승이 제한될
                                            수 있습니다. 많은 고객님께 시승서비스를 제공하기 위해 고객님 한 분당 연간 6회까지
                                            시승 신청이 가능합니다.
                                            <br/>
                                            2. 보험사항
                                            <br/>
                                            상기 차량은 대인배상(Ⅰ,Ⅱ), 대물배상, 자기 신체, 자기 차량, 무보험 등의 보험에 가입되어
                                            있으나, 보험 가액을 초과하는 부분 및 보험 미적용 부분 (운전자 연령 한정 운전 특약
                                            위반, 차량 사고 시 자차 부담금 최대 10만원 고객 부담) 등에 대해서는 본인이 스스로
                                            책임을 지는 동시에 귀사에 발생한 모든 손해를 배상할 것을 약속합니다.
                                            <br/>
                                            3. 금지사항
                                            <br/>
                                            본인은 귀사가 제공한 상기 차량을 상업적으로 이용하는 등 비정상적으로 운행하거나,
                                            본인 외 제3자에게 운행, 양도, 대여, 담보의 목적으로 제공하는 등의 행위를 일절 하지
                                            않을 것을 약속합니다. 또한 주행 보조 기능 (AEB 자동 긴급 제동 시스템, FCA 전방 충돌
                                            방지 보조 등) 작동을 위하여 위험한 운전을 시도하지 않으며, 항상 안전하게 운전할 것을
                                            약속합니다.
                                            <br/>
                                            4. 책임사항
                                            <br/>
                                            ①본인은 위 보험 사항 및 금지사항, 유의사항을 위반하여 발생한 모든 민·형사상 책임을
                                            부담합니다.
                                            <br/>
                                            ②본인은 약정된 차량 반납 일시까지 상기 차량을 지정된 반납 장소에 반납하지 않거나
                                            차량 반납 시 차량 상태가 변동된 경우, 이로 인해 발생한 모든 손해에 대한 배상 책임을
                                            부담합니다.
                                            <br/>
                                            ③본인은 교통법규 미준수로 인한 벌금, 과태료 및 시승 운행 시 발생한 도로교통비 등을
                                            부담합니다.
                                            <br/>
                                            위치정보 수집장치 부착 사실 고지
                                            <br/>
                                            시승차량에 장착된 블루링크 단말을 통해 시승서비스 이용 시간 동안 시승차량 및 고객님의
                                            위치정보가 수집됨을 알려드립니다.
                                        </p>
                                    </div>
                                    <!-- Modal footer -->
                                    <div class="flex items-center p-4 md:p-5 border-t border-gray-200 rounded-b">
                                        <button
                                                data-modal-hide="static-modal"
                                                type="button"
                                                on:click={isAgreed}
                                                class="text-white bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center"
                                        >
                                            동의
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    {/if}
                </div>
                <div class="flex items-center">
                    <input
                            id="link-checkbox1"
                            type="checkbox"
                            value=""
                            disabled={isChecked2}
                            data-modal-target="static-modal-2"
                            data-modal-toggle="static-modal-2"
                            class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                    />
                    <label for="link-checkbox1" class="ms-2 text-sm font-medium text-gray-900"
                    >(필수) 개인정보 수집 및 이용안내</label
                    >
                    <!-- Main modal -->
                    {#if !isChecked2}
                        <div
                                id="static-modal-2"
                                data-modal-backdrop="static"
                                tabindex="-1"
                                aria-hidden="true"
                                class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"
                        >
                            <div class="relative p-4 w-full max-w-2xl max-h-full">
                                <!-- Modal content -->
                                <div class="relative bg-white rounded-lg shadow">
                                    <!-- Modal header -->
                                    <div class="flex items-center justify-between p-4 md:p-5 border-b rounded-t">
                                        <h3 class="text-xl font-semibold text-gray-900">
                                            (필수) 개인정보 수집 및 이용안내
                                        </h3>
                                        <!--                                        <button-->
                                        <!--                                                type="button"-->
                                        <!--                                                class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center"-->
                                        <!--                                                data-modal-hide="static-modal-2"-->
                                        <!--                                        >-->
                                        <!--                                            <svg-->
                                        <!--                                                    class="w-3 h-3"-->
                                        <!--                                                    aria-hidden="true"-->
                                        <!--                                                    xmlns="http://www.w3.org/2000/svg"-->
                                        <!--                                                    fill="none"-->
                                        <!--                                                    viewBox="0 0 14 14"-->
                                        <!--                                            >-->
                                        <!--                                                <path-->
                                        <!--                                                        stroke="currentColor"-->
                                        <!--                                                        stroke-linecap="round"-->
                                        <!--                                                        stroke-linejoin="round"-->
                                        <!--                                                        stroke-width="2"-->
                                        <!--                                                        d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"-->
                                        <!--                                                />-->
                                        <!--                                            </svg>-->
                                        <!--                                            <span class="sr-only">Close modal</span>-->
                                        <!--                                        </button>-->
                                    </div>
                                    <!-- Modal body -->
                                    <div class="p-4 md:p-5 space-y-4">
                                        <p class="text-base leading-relaxed text-gray-500">
                                            •개인정보 수집 및 이용 목적
                                            <br/>
                                            - 시승서비스 제공, 시승차량 사고 발생 시 보험처리 등
                                            <br/>
                                            - 사고 대응, 시승차량 도난 방지 및 운행 관리, 고객 불만 등
                                            <br/>
                                            - 민원사항 처리, 분쟁 발생 시 대응, 소비자 의견 조사,고객 관리 서비스 제공
                                            <br/>
                                            - 교통법규 미준수로 인한 벌금, 과태료처리
                                            <br/>
                                            •개인정보의 수집 항목
                                            <br/>
                                            [필수 항목]
                                            <br/>
                                            - 고객 성명, 휴대전화 번호, 생년월일, 성별, 연계정보(CI), 주소(자택/직장), 시승정보(시승차종,
                                            차량번호, 시승일시), 시승차량 위치정보
                                            <br/>
                                            [선택 항목]
                                            <br/>
                                            - 자동차 운전경력, 보유차종 및 연식, 기타 시승 관련 요청사항
                                            <br/>
                                            •개인정보의 보유 및 이용기간
                                            <br/>
                                            - 시승일 기준 2년 (※ 단, 시승차량 위치정보는 수집일로부터 14일)
                                            <br/>
                                            고객님은 위의 개인정보 수집 이용에 대한 동의를 거부하실 수 있습니다.
                                            <br/>
                                            그러나, 동의 거부 시 시승서비스 이용이 불가합니다.
                                        </p>
                                    </div>
                                    <!-- Modal footer -->
                                    <div class="flex items-center p-4 md:p-5 border-t border-gray-200 rounded-b">
                                        <button
                                                data-modal-hide="static-modal-2"
                                                type="button"
                                                on:click={isAgreed2}
                                                class="text-white bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center"
                                        >
                                            동의
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    {/if}
                </div>
            </div>
        </div>
    </h2>
    <h2 id="accordion-flush-heading-1">
        <button
                type="button"
                class="flex items-center justify-between w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
                data-accordion-target="#accordion-flush-body-1"
                aria-expanded="false"
                aria-controls="accordion-flush-body-2"
                on:click={buttonClick}
        >
            <span>시승 모델</span>
            <div class="flex items-center">
                <span class="font-normal text-[#f3651f] mr-2 text-sm">모델을 선택해주세요.</span>
                <svg
                        data-accordion-icon
                        class="w-3 h-3 rotate-180 shrink-0"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 10 6"
                >
                    <path
                            stroke="currentColor"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M9 5 5 1 1 5"
                    />
                </svg>
            </div>
        </button>
    </h2>
    
        <div id="accordion-flush-body-1" class="hidden" aria-labelledby="accordion-flush-heading-1">
			{#if isChecked && isChecked2}
            <div class="flex items-center justify-center py-4 md:py-8 flex-wrap">
                <button
                        type="button"
                        class="text-blue-700 hover:text-white border border-blue-600 bg-white hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                >
                    전체 모델
                </button>
                <button
                        type="button"
                        class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                >
                    현대
                </button>
                <button
                        type="button"
                        class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                >
                    기아
                </button>
                <button
                        type="button"
                        class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                >
                    쉐보레
                </button>
                <button
                        type="button"
                        class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                >
                    kg모빌리티(쌍용)
                </button>
                <button
                        type="button"
                        class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                >
                    르노 코리아
                </button>
            </div>
            <div class="grid grid-cols-2 md:grid-cols-3 gap-4">
                <div class="max-w-sm bg-white border border-gray-200 rounded-lg shadow-md">
                    <img
                            class="h-auto max-w-full rounded-lg"
                            src="https://flowbite.s3.amazonaws.com/docs/gallery/square/image-1.jpg"
                            alt=""
                    />
                    <div class="p-5">
                        <div class="flex items-center">
                            <input
                                    id="link-checkbox"
                                    type="checkbox"
                                    value=""
                                    class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                            />
                            <label for="link-checkbox" class="ms-2 text-sm font-medium text-gray-900">
                                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900">차 이름</h5>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="max-w-sm bg-white border border-gray-200 rounded-lg shadow-md">
                    <img
                            class="h-auto max-w-full rounded-lg"
                            src="https://flowbite.s3.amazonaws.com/docs/gallery/square/image-1.jpg"
                            alt=""
                    />
                    <div class="p-5">
                        <div class="flex items-center">
                            <input
                                    id="link-checkbox"
                                    type="checkbox"
                                    value=""
                                    class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                            />
                            <label for="link-checkbox" class="ms-2 text-sm font-medium text-gray-900">
                                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900">차 이름</h5>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="max-w-sm bg-white border border-gray-200 rounded-lg shadow-md">
                    <img
                            class="h-auto max-w-full rounded-lg"
                            src="https://flowbite.s3.amazonaws.com/docs/gallery/square/image-1.jpg"
                            alt=""
                    />
                    <div class="p-5">
                        <div class="flex items-center">
                            <input
                                    id="link-checkbox"
                                    type="checkbox"
                                    value=""
                                    class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                            />
                            <label for="link-checkbox" class="ms-2 text-sm font-medium text-gray-900">
                                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900">차 이름</h5>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="max-w-sm bg-white border border-gray-200 rounded-lg shadow-md">
                    <img
                            class="h-auto max-w-full rounded-lg"
                            src="https://flowbite.s3.amazonaws.com/docs/gallery/square/image-1.jpg"
                            alt=""
                    />
                    <div class="p-5">
                        <div class="flex items-center">
                            <input
                                    id="link-checkbox"
                                    type="checkbox"
                                    value=""
                                    class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                            />
                            <label for="link-checkbox" class="ms-2 text-sm font-medium text-gray-900">
                                <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900">차 이름</h5>
                            </label>
                        </div>
                    </div>
                </div>
            </div>
			{/if}
        </div>
  
    <h2 id="accordion-flush-heading-2">
        <button
                type="button"
                class="flex items-center justify-between w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
                data-accordion-target="#accordion-flush-body-2"
                aria-expanded="false"
                aria-controls="accordion-flush-body-2"
        >
            <span>시승 장소</span>
            <div class="flex items-center">
                <span class="font-normal text-[#f3651f] mr-2 text-sm">시승 장소를 선택해주세요.</span>
                <svg
                        data-accordion-icon
                        class="w-3 h-3 rotate-180 shrink-0"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 10 6"
                >
                    <path
                            stroke="currentColor"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M9 5 5 1 1 5"
                    />
                </svg>
            </div>
        </button>
    </h2>
    <div id="accordion-flush-body-2" class="hidden" aria-labelledby="accordion-flush-heading-2">
        <!-- <div id="map" style="width: 500px; height: 400px;" class="mx-auto m-5"></div> -->
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3195.1911677500757!2d127.11627437634174!3d36.78996666827549!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ad81bc9b7e44d%3A0x56b88b1fed08d6a5!2z7ZiE64yA7J6Q64-Z7LCoIOyynOyViOyVhOyCsOyLnOyKueyEvO2EsA!5e0!3m2!1sko!2skr!4v1705913143831!5m2!1sko!2skr"
                width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                referrerpolicy="no-referrer-when-downgrade"></iframe>
    </div>
    <h2 id="accordion-flush-heading-3">
        <button
                type="button"
                class="flex items-center justify-between w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
                data-accordion-target="#accordion-flush-body-3"
                aria-expanded="false"
                aria-controls="accordion-flush-body-3"
        >
            <span>시승 일정</span>
            <div class="flex items-center">
                <span class="font-normal text-[#f3651f] mr-2 text-sm">시승 일정을 선택해주세요.</span>
                <svg
                        data-accordion-icon
                        class="w-3 h-3 rotate-180 shrink-0"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 10 6"
                >
                    <path
                            stroke="currentColor"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M9 5 5 1 1 5"
                    />
                </svg>
            </div>
        </button>
    </h2>
    <div id="accordion-flush-body-3" class="hidden" aria-labelledby="accordion-flush-heading-3">
        <div class="relative max-w-sm">
            <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                <svg
                        class="w-4 h-4 text-gray-500"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="currentColor"
                        viewBox="0 0 20 20"
                >
                    <path
                            d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z"
                    />
                </svg>
            </div>
            <input
                    datepicker
                    datepicker-autohide
                    type="text"
                    class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5 my-2.5"
                    placeholder="시승 일정을 선택해주세요."
            />
        </div>
    </div>
    <h2 id="accordion-flush-heading-6">
        <button
                type="button"
                class="flex items-center justify-between w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
                data-accordion-target="#accordion-flush-body-6"
                aria-expanded="false"
                aria-controls="accordion-flush-body-6"
        >
            <span>시승 시간</span>
            <div class="flex items-center">
                <span class="font-normal text-[#f3651f] mr-2 text-sm">시승 시간을 선택해주세요.</span>
                <svg
                        data-accordion-icon
                        class="w-3 h-3 rotate-180 shrink-0"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 10 6"
                >
                    <path
                            stroke="currentColor"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M9 5 5 1 1 5"
                    />
                </svg>
            </div>
        </button>
    </h2>
    <div id="accordion-flush-body-6" class="hidden flex" aria-labelledby="accordion-flush-heading-6">
        <button
                type="button"
                class="my-3 py-2.5 px-5 me-2 mb-2 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-full border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-200"
        >
            11:00
        </button>
        <button
                type="button"
                class="my-3 py-2.5 px-5 me-2 mb-2 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-full border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-200"
        >
            13:00
        </button>
        <button
                type="button"
                class="my-3 py-2.5 px-5 me-2 mb-2 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-full border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-200"
        >
            14:00
        </button>
        <button
                type="button"
                class="my-3 py-2.5 px-5 me-2 mb-2 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-full border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-200"
        >
            15:00
        </button>
    </div>
    <h2 id="accordion-flush-heading-4">
        <button
                type="button"
                class="flex items-center justify-between w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
                data-accordion-target="#accordion-flush-body-4"
                aria-expanded="false"
                aria-controls="accordion-flush-body-4"
        >
            <span>보유차종 및 연식</span>
            <div class="flex items-center">
                <span class="font-normal text-[#f3651f] mr-2 text-sm">보유차종과 연식을 적어주세요.</span>
                <svg
                        data-accordion-icon
                        class="w-3 h-3 rotate-180 shrink-0"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 10 6"
                >
                    <path
                            stroke="currentColor"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M9 5 5 1 1 5"
                    />
                </svg>
            </div>
        </button>
    </h2>
    <div id="accordion-flush-body-4" class="hidden" aria-labelledby="accordion-flush-heading-4">
        <div class="py-5 border-b border-gray-200 dark:border-gray-700">
            <form>
                <div class="w-full mb-4 border border-gray-200 rounded-lg bg-gray-50">
                    <div class="px-4 py-2 bg-white rounded-t-lg">
                        <label for="comment" class="sr-only">Your comment</label>
                        <textarea
                                id="comment"
                                rows="4"
                                class="w-full px-0 text-sm text-gray-900 bg-white border-0"
                                placeholder="보유 차종 및 연식을 기입해주세요."
                                required
                        ></textarea>
                    </div>
                    <div class="flex items-center justify-end px-3 py-2 border-t">
                        <button
                                type="submit"
                                class="inline-flex items-center py-2.5 px-4 text-xs font-medium text-center text-white bg-[#f3651f] rounded-lg focus:ring-4 focus:ring-blue-200"
                        >
                            저장
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <h2 id="accordion-flush-heading-5">
        <button
                type="button"
                class="flex items-center justify-between w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3"
                data-accordion-target="#accordion-flush-body-5"
                aria-expanded="false"
                aria-controls="accordion-flush-body-5"
        >
            <span>기타 시승 관련 요청사항</span>
            <div class="flex items-center">
				<span class="font-normal text-[#f3651f] mr-2 text-sm"
                >기타 시승 시 요청사항을 적어주세요.</span
                >
                <svg
                        data-accordion-icon
                        class="w-3 h-3 rotate-180 shrink-0"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 10 6"
                >
                    <path
                            stroke="currentColor"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                            stroke-width="2"
                            d="M9 5 5 1 1 5"
                    />
                </svg>
            </div>
        </button>
    </h2>
    <div id="accordion-flush-body-5" class="hidden" aria-labelledby="accordion-flush-heading-5">
        <div class="py-5 border-b border-gray-200 dark:border-gray-700">
            <form>
                <div class="w-full mb-4 border border-gray-200 rounded-lg bg-gray-50">
                    <div class="px-4 py-2 bg-white rounded-t-lg">
                        <label for="comment2" class="sr-only">Your comment</label>
                        <textarea
                                id="comment2"
                                rows="4"
                                class="w-full px-0 text-sm text-gray-900 bg-white border-0"
                                placeholder="시승 시 요청사항을 적어주세요."
                                required
                        ></textarea>
                    </div>
                    <div class="flex items-center justify-end px-3 py-2 border-t">
                        <button
                                type="submit"
                                class="inline-flex items-center py-2.5 px-4 text-xs font-medium text-center text-white bg-[#f3651f] rounded-lg focus:ring-4 focus:ring-blue-200"
                        >
                            저장
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div class="flex items-center justify-end px-3 py-2 my-3">
        <button
                type="submit"
                class="w-full items-center py-3 px-4 text-1xl font-bold text-center text-white bg-[#f3651f] rounded-lg focus:ring-4 focus:ring-blue-200">
            제출하기
        </button>
    </div>
</div>
