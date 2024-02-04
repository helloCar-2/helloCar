<script>
    import {AccordionItem, Accordion} from 'flowbite-svelte';
</script>


<div class="container mx-auto w-5/6">
    <img src="../img/logo1.png" class="h-20 w-60 object-cover mx-auto my-6 object-cover mt-12">
    <h5 class="text-4xl text-center my-8 font-bold">자주 묻는 질문</h5>
</div>

<Accordion class="m-6">
    <AccordionItem open>
        <span slot="header">1. 시승 관련 문의</span>
        <Accordion>
            <AccordionItem>
                <span slot="header">- 시승 중에 발생한 사고나 피해는 어떻게 처리되나요?</span>
                <p class="mb-2 text-gray-500 dark:text-gray-400">
                    즉시 보고: 시승 중에 사고가 발생하면 즉시 사고를 제공하는 업체나 해당 차량의 담당자에게 보고해야 합니다.
                    <br>사고 조사: 업체나 딜러쉽은 사고를 조사하여 사고의 원인과 범위를 확인합니다.
                    <br>보험 처리: 보험은 사고 발생 시 차량 및 피해자의 보호를 위해 필요한 조치입니다. 업체나 딜러쉽은 자사의 보험 정책에 따라 사고 처리를 진행합니다.
                    <br>책임 분담: 사고의 원인과 책임이 명확해지면 보통 해당 책임을 부담하는 당사자에게 보상을 제공합니다.
                    <br>보상 협의: 시승 차량을 운전하던 고객과 업체 또는 보험사 간에 보상에 대한 협의가 이루어집니다.
                    <br>법적 절차: 사고가 복잡한 경우 법적 절차가 필요할 수 있습니다. 이 경우 변호사나 법률 전문가의 도움을 받을 수 있습니다.</p>
            </AccordionItem>
            <AccordionItem>
                <span slot="header">- 시승 장소와 시간은 어떻게 정해지나요?</span>
                <p class="mb-2 text-gray-500 dark:text-gray-400">
                    저희 앱 홈에서 시승 신청 버튼을 누르면 시승 신청이 가능합니다.</p>
                <li><a href="/car-testdrive" rel="noreferrer" target="_blank"
                       class="text-blue-600 dark:text-blue-500 hover:underline">시승 신청하러 가기 ⇢</a></li>
            </AccordionItem>
        </Accordion>
    </AccordionItem>
    <AccordionItem>
        <span slot="header">2. 홈페이지 관련 문의</span>
        <Accordion>
            <AccordionItem>
                <span slot="header">- 홈페이지에서 제공하는 서비스는 무엇인가요?</span>
                <p class="mb-2 text-gray-500 dark:text-gray-400">
                    저희 홈페이지에서는 다양한 차량 정보와, 그와 관련한 시승 체험 또한 가능합니다.
                </p>
            </AccordionItem>
            <AccordionItem>
                <span slot="header">- 개인정보 보호 정책은 어떻게 되나요?</span>
                <p class="mb-2 text-gray-500 dark:text-gray-400">
                    저희 홈페이지는 개인정보 보호를 위해 관련 법규를 준수하며, 개인정보 처리 방침을 공개하여 이용자의 개인정보를 안전하게 보호합니다.</p>
            </AccordionItem>
        </Accordion>
    </AccordionItem>
    <AccordionItem>
        <span slot="header">📞 기타 문의</span>
        <p class="mb-2 text-gray-500 dark:text-gray-400">
            사장 초이몬: 010-3345-8561 <br>매니저 할아범: 010-8482-3383</p>
    </AccordionItem>
</Accordion>