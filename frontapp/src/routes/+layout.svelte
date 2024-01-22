<script>
	import Footer from './footer/footer.svelte';
	import '../app.css';
	// import '../routes/hellocar/car_compare.svelte'
	
</script>

<div class="app">
	<a href="/compare"></a>
	<a href="/home"></a>
	<main>
		<slot />
		<Footer />
	</main>

</div>