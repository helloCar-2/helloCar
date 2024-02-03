<script>
    import '$lib/axiosEnterceptor/api.js';
    import {
        Checkbox,
        Modal,
        Button,
        AccordionItem,
        Accordion,
        Textarea,
        MultiSelect,
        Badge
    } from 'flowbite-svelte';
    import {createEventDispatcher, onMount} from 'svelte';
    import api from "$lib/axiosEnterceptor/api.js";


    let isChecked = false;
    let isChecked2 = false;
    let isOpen = false;
    let isOpen2 = false;

    function buttonClick(event) {
        if (!isChecked && !isChecked2) {
            alert("필수 사항을 먼저 동의해주세요.");
            event.preventDefault();
            event.stopPropagation();
        }
    }

    function handleClick(e) {
        console.log(isChecked)
        isOpen = true;
    }

    function handleClick2(e) {
        console.log(isChecked)
        isOpen2 = true;
    }

    function ischecked(e) {
        isChecked = true;
    }

    function ischecked2(e) {
        isChecked2 = true;
    }

    let formData = {
        brand: '',
        carName: '',
        area: '',
        testDriveDate: '',
        time: '',
        hasCarAndYear: '',
        testDriveQnA: '',
    };

    // 데이터를 백엔드로 보내는 구문

    function buttonClick2(event) {
        if (formData.brand === '' && formData.carName === '') {
            alert("차량을 먼저 선택해주세요.");
            event.preventDefault();
            event.stopPropagation();
        }
    }

    function buttonClick3(event) {
        if (formData.area === '') {
            alert("지역을 먼저 선택해주세요.");
            event.preventDefault();
            event.stopPropagation();
        }
    }

    function buttonClick4(event) {
        if (formData.testDriveDate === '') {
            alert("시승 시간을 먼저 선택해주세요.");
            event.preventDefault();
            event.stopPropagation();
        }
    }

    function summitButton(event) {
        if (formData.brand === '' || formData.carName === '' || formData.area === '' || formData.testDriveDate === '' || formData.time === '') {
            alert("시승 신청서가 전부 작성되지 않았습니다.");
            event.preventDefault();
            event.stopPropagation();
        } else {
            if (typeof window !== 'undefined') {
                const accessToken = localStorage.getItem('accessToken');
                console.log(accessToken)
                api.post('/testdrive/write', formData, {
                    headers: {
                        'Content-Type': 'application/json',
                        'Authorization': `Bearer ${accessToken}`,
                    }
                }).then(response => {
                    console.log(response.data); // 서버 응답 로그
                }).catch(error => {
                    console.error('Error:', error); // 에러 처리
                });
            }
            window.location.href = '/car-home'
            console.log(formData);
        }
    }

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
        {brand: 'KG모빌리티', value: {carName: '렉스턴 스포츠 칸', url: '../img/rexton_sport_khan.png'}
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
        console.log(formData.brand)
    }

    function carNameInsert(carName) {
        formData.carName = carName;
        console.log(formData.carName)
    }

    // 지역 선택 기능
    let selected = [];
    let areas = [
        {
            value: '강원도',
            name: '강원도', color: 'indigo'
        },
        {
            value: '경기도',
            name: '경기도', color: 'green'
        },
        {
            value: '충청남도',
            name: '충청남도', color: 'blue'
        },
        {
            value: '충청북도',
            name: '충청북도', color: 'red'
        },
        {
            value: '전라남도',
            name: '전라남도', color: 'yellow'
        },
        {
            value: '전라북도',
            name: '전라북도', color: 'purple'
        },
        {
            value: '경상남도',
            name: '경상남도', color: 'pink'
        },
        {
            value: '경상북도',
            name: '경상북도', color: 'primary'
        }
    ];

    let selectedAreas = [
        {
            key: '강원도',
            value: '강원도'
        },
        {
            key: '경기도',
            value: '경기도'
        },
        {
            key: '충청남도',
            value: '충청남도'
        },
        {
            key: '충청북도',
            value: '충청북도'
        },
        {
            key: '전라남도',
            value: '전라남도'
        },
        {
            key: '전라북도',
            value: '전라북도'
        },
        {
            key: '경상남도',
            value: '경상남도'
        },
        {
            key: '경상북도',
            value: '경상북도'
        }
    ];

    function areaInsert() {
        const selectedButton = areas.find(area => area.name == formData.area);
        if (selectedButton) {
            formData.area = selectedButton.value;
            console.log(selectedButton.value)
            selected.push(formData.area);
        }
    }

    // 날짜 입력 구문
    function handleDateChange(event) {
        formData.testDriveDate = event.target.value;
        console.log(formData.testDriveDate)
    }

    // 시간 입력 구문
    function handleButtonClick(event) {
        const selectedTime = event.target.textContent.trim();
        formData.time = selectedTime;
        console.log(formData.time)
    }

    // 보유차량 및 연식입력 구문
    // 이벤트 디스패처 생성
    const dispatch = createEventDispatcher();

    // 폼 제출 핸들러
    function handleSubmit(event) {
        event.preventDefault(); // 기본 제출 동작 방지

        // Textarea에서 입력된 값 가져오기
        const hasCarAndYearInput = event.target.querySelector('textarea');
        formData.hasCarAndYear = hasCarAndYearInput.value;

        // formData 객체를 부모 컴포넌트로 디스패치하여 전달
        dispatch('formData', formData);
        console.log(formData.hasCarAndYear)
    }

    // 시승 요청사항 및 기타 요청사항 구문
    function handleSubmit2(event) {
        event.preventDefault();

        const hasCarAndYearInput = event.target.querySelector('textarea');
        formData.testDriveQnA = hasCarAndYearInput.value;

        dispatch('formData', formData);
        console.log(formData.testDriveQnA)
    }
</script>

<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6"/>
<span class="font-bold block text-center text-4xl text-gray-800 mb-10">시승 신청</span>
<div
        class="w-5/6 mx-auto"
>
    <h2 id="accordion-flush-heading">
        <div
                class="items-center w-full py-5 font-medium rtl:text-right text-gray-500 border-b border-gray-200 gap-3">
            <span>서비스 이용 동의</span>
            <div class="mt-4">
                <div class="flex items-center mb-2">
                    <Checkbox
                            disabled={isChecked}
                            on:click={handleClick}
                            class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                    />
                    <label for="link-checkbox" class="ms-2 text-sm font-medium text-gray-900"
                    >(필수) 시승차 및 서비스 이용에 따른 고지사항 및 이용약관 안내</label>
                    <!-- Main modal -->
                    <Modal
                            title="(필수) 시승차 및 서비스 이용에 따른 고지사항 및 이용약관 안내"
                            bind:open={isOpen}
                            autoclose
                    >
                        <p>
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
                        <!-- Modal footer -->
                        <svelte:fragment slot="footer">
                            <Button
                                    on:click={ischecked}
                                    class="text-white bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center"
                            >
                                동의
                            </Button>
                        </svelte:fragment>
                    </Modal>
                </div>
                <div class="flex items-center">
                    <Checkbox
                            disabled={isChecked2}
                            on:click={handleClick2}
                            class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 focus:ring-2"
                    />
                    <label for="link-checkbox1" class="ms-2 text-sm font-medium text-gray-900"
                    >(필수) 개인정보 수집 및 이용안내</label
                    >
                    <!-- Main modal -->
                    <Modal
                            title="(필수) 개인정보 수집 및 이용안내"
                            bind:open={isOpen2}
                            autoclose
                    >
                        <p>
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
                        <!-- Modal footer -->
                        <svelte:fragment slot="footer">
                            <Button
                                    on:click={ischecked2}
                                    class="text-white bg-[#f3651f] focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center"
                            >
                                동의
                            </Button>
                        </svelte:fragment>
                    </Modal>
                </div>
            </div>
        </div>
    </h2>
    <!--  아코디언  -->
    <Accordion flush>
        <AccordionItem>
            <div slot="header" class="flex items-center justify-between w-full" on:click={buttonClick}>
                <span class="flex">시승 모델
                    {#if formData.carName != ''}
						<div class="ml-4 text-[#f3651f]">{formData.carName}</div>
					{/if}</span>
                <span class="font-normal text-[#f3651f] mr-2 text-sm">모델을 선택해주세요.</span>
            </div>
            {#if isChecked && isChecked2}
                <div class="flex items-center justify-center py-4 md:py-8 flex-wrap">
                    <button
                            on:click={() => {
										brandNameInsert(1);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        현대
                    </button>
                    <button
                            on:click={() => {
										brandNameInsert(2);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        기아
                    </button>
                    <button
                            on:click={() => {
										brandNameInsert(3);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        제네시스
                    </button>
                    <button
                            on:click={() => {
										brandNameInsert(4);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        쉐보레(GM대우)
                    </button>
                    <button
                            on:click={() => {
										brandNameInsert(5);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        르노 (삼성)
                    </button>
                    <button
                            on:click={() => {
										brandNameInsert(6);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        KG모빌리티 (쌍용)
                    </button>
                    <button
                            on:click={() => {
										brandNameInsert(7);
									}}
                            type="button"
                            class="text-gray-900 border border-white hover:border-gray-200 bg-white focus:ring-4 focus:outline-none focus:ring-gray-300 rounded-full text-base font-medium px-5 py-2.5 text-center me-3 mb-3"
                    >
                        기타 차량
                    </button>
                </div>
                <div class="grid grid-cols-2 md:grid-cols-2 gap-4">
                    {#each selectedCarNames as selectedCar}
                        <button
                                type="button"
                                data-accordion-target="#accordion-flush-body-6"
                                aria-expanded="false"
                                aria-controls="accordion-flush-body-6"
                                on:click={() => {
								carNameInsert(selectedCar.carName);
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
            {/if}
        </AccordionItem>
        <AccordionItem>
            <div slot="header" class="flex items-center justify-between w-full" on:click={buttonClick2}>
                <span class="flex">시승 지역
                    {#if formData.area != ''}
						<div class="ml-4 text-[#f3651f]">{formData.area}</div>
					{/if}</span>
                <span class="font-normal text-[#f3651f] mr-2 text-sm">시승 장소를 선택해주세요.</span>
            </div>
            <MultiSelect items={areas} bind:value={formData.area} let:item let:clear on:click={areaInsert()}>
                <Badge color={item.color} dismissable params={{ duration: 100 }} on:close={clear}>
                    {item.name}
                </Badge>
            </MultiSelect>
            <div>
                {#if formData.area == '강원도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d806892.0166182596!2d127.57097832953997!3d37.81529735169377!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x35637526a922f275%3A0x2836c8de409edf29!2z7ZiE64yA7J6Q64-Z7LCoIOybkOyjvOyLnOyKueyEvO2EsA!5e0!3m2!1sko!2skr!4v1706875278775!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '전라북도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3235.1753248989876!2d127.08577917636686!3d35.82017387254262!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x35703ba1038df5bb%3A0xe8d2c6026668962c!2z7ZiE64yAIOuTnOudvOydtOu5meudvOyatOyngCDsoITso7w!5e0!3m2!1sko!2skr!4v1706875439393!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '전라남도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d418250.3251370599!2d126.3995663161201!3d35.017200784481965!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x35718d8f50de8f93%3A0xacb1ae541922b58c!2z65Oc65287J2067mZ7KG0IOy2qeyepeygkA!5e0!3m2!1sko!2skr!4v1706875505186!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '경상북도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3224.8636747133396!2d129.37790227637618!3d36.072429072463656!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x356701bb7225ace9%3A0xe86523eab4fd84ce!2z7ZiE64yA7J6Q64-Z7LCo7Y-s7ZWt7Iuc7Iq57IS87YSw!5e0!3m2!1sko!2skr!4v1706875585263!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '경상남도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3259.896851733316!2d128.62547747634403!3d35.2090381727434!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x356f338a566b29ab%3A0xf40f0892ab10ca06!2z7ZiE64yA65Oc65287J2067mZ65287Jq07KeAIOywveybkA!5e0!3m2!1sko!2skr!4v1706875623778!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '충청북도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d102462.50619210991!2d127.36069302168686!3d36.62751027997906!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x356528842ed26603%3A0xe03c30d3f225f727!2z66e565Oc65287J2067iM7LKt7KO87Iuk64K07Jq07KCE7Jew7Iq17J6l!5e0!3m2!1sko!2skr!4v1706875678579!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '충청남도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3195.191346909455!2d127.1162743764037!3d36.78996237225019!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ad81bc9b7e44d%3A0x56b88b1fed08d6a5!2z7ZiE64yA7J6Q64-Z7LCoIOyynOyViOyVhOyCsOyLnOyKueyEvO2EsA!5e0!3m2!1sko!2skr!4v1706875718813!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
                {#if formData.area == '경기도'}
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d25384.545922729198!2d126.79957849781732!3d37.317211214644324!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357b6fdff2d9132d%3A0xc9bdec8ecaeefede!2z65Oc65287J2067mZ7KG0IOyViOyCsO2VnOuMgOyVnuyXreygkA!5e0!3m2!1sko!2skr!4v1706875840301!5m2!1sko!2skr"
                            width="100%" height="550" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"></iframe>
                {/if}
            </div>
        </AccordionItem>
        <AccordionItem>
            <div slot="header" class="flex items-center justify-between w-full" on:click={buttonClick3}>
                <span>시승 일정</span>
                <span class="font-normal text-[#f3651f] mr-2 text-sm">시승 일정을 선택해주세요.</span>
            </div>
            <div class="relative max-w-sm">
                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                    <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                         xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                        <path d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z"/>
                    </svg>
                </div>
                <input on:change={handleDateChange}
                       type="date"
                       class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
                       placeholder="Select date" style="cursor: pointer;">
            </div>
        </AccordionItem>
        <AccordionItem>
            <div slot="header" class="flex items-center justify-between w-full" on:click={buttonClick4}>
                <span>시승 시간</span>
                <span class="font-normal text-[#f3651f] mr-2 text-sm">시승 시간을 선택해주세요.</span>
            </div>
            <Button outline color="dark" on:click={handleButtonClick}>11 : 00</Button>
            <Button outline color="dark" on:click={handleButtonClick}>13 : 00</Button>
            <Button outline color="dark" on:click={handleButtonClick}>14 : 00</Button>
            <Button outline color="dark" on:click={handleButtonClick}>15 : 00</Button>
        </AccordionItem>
        <AccordionItem>
            <div slot="header" class="flex items-center justify-between w-full">
                <span>보유차종 및 연식</span>
                <span class="font-normal text-[#f3651f] mr-2 text-sm">보유차종과 연식을 적어주세요.</span>
            </div>
            <form on:submit={handleSubmit}>
  <Textarea class="mb-4" placeholder="보유 차종 및 연식을 기입해주세요.">
    <div slot="footer" class="flex items-center justify-between">
      <Button type="submit"
              class="inline-flex items-center py-2.5 px-4 text-xs font-medium text-center text-white bg-[#f3651f] rounded-lg focus:ring-4 focus:ring-blue-200">저장</Button>
    </div>
  </Textarea>
            </form>
        </AccordionItem>
        <AccordionItem>
            <div slot="header" class="flex items-center justify-between w-full">
                <span>기타 시승 관련 요청사항</span>
                <span class="font-normal text-[#f3651f] mr-2 text-sm">기타 시승 시 요청사항을 적어주세요.</span>
            </div>
            <form on:submit={handleSubmit2}>
            <Textarea class="mb-4" placeholder="시승 시 요청사항을 적어주세요.">
    <div slot="footer" class="flex items-center justify-between">
      <Button type="submit"
              class="inline-flex items-center py-2.5 px-4 text-xs font-medium text-center text-white bg-[#f3651f] rounded-lg focus:ring-4 focus:ring-blue-200">저장</Button>
    </div>
  </Textarea>
            </form>
        </AccordionItem>
    </Accordion>
    <!--  아코디언 끝  -->

    <div class="flex items-center justify-end px-3 py-2 my-3">
        <button on:click={summitButton}
                type="submit"
                class="w-full items-center py-3 px-4 text-1xl font-bold text-center text-white bg-[#f3651f] rounded-lg focus:ring-4 focus:ring-blue-200">
            제출하기
        </button>
    </div>
</div>
