<script>
	import { page } from '$app/stores';
	import { onMount } from 'svelte';

	// 현재 URL을 가져옵니다.
	var url = $page.url.search;
	let url2 = `http://localhost:8080/api/v1/hellocar/lists${url}`;

	// let returnValue;
    let helloCars = [];

	 onMount(async () => {
		try {
			const response = await fetch(url2, {
				method: 'GET',
				headers: {
					'Content-Type': 'application/json'
				}
			});

			if (response.ok) {
				const data = await response.json();
                helloCars = data.data.helloCars;
			} else {
				console.error('서버 응답 오류:', response.statusText);
			}
		} catch (error) {
			console.error('오류 발생:', error);
		}
	});


    function getCar(carnum){
        window.location.href = `/car-detail/`+carnum;
    }
</script>



<img src="../img/logo1.png" class="h-16 w-26 object-cover mx-auto my-6" />

<div class="w-10/12 mx-auto grid grid-cols-2 md:grid-cols-2 gap-4">
    {#each helloCars as helloCar}
        <button

            type="button"
            data-accordion-target="#accordion-flush-body-6"
            aria-expanded="false"
            aria-controls="accordion-flush-body-6"
            on:click={() => {
                getCar(helloCar.id);
            }}
        >
            <div class="max-w-sm bg-white border border-gray-200 rounded-lg shadow-md h-full">
                <div class="flex flex-col h-full">
                    <img class="h-auto my-auto max-w-full rounded-lg" src="../img/logo1.png" 
                    
                     alt="" />
                    <div class="mx-auto h-10 text-xl font-bold tracking-tight text-gray-900 flex">
                        <p class="mt-2">{helloCar.carname}</p>
                    </div>
                </div>
            </div>
        </button>
    {/each}
</div>