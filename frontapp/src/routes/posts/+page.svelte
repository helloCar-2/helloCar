<script>
	export let data;
</script>

<div>게시글 목록</div>

<ul>
	{#each data.products as product}
		<li>
			<img src={product.thumbnail} width="100" height="100" alt="썸네일" />
			<a href="/posts/{product.id}">
				{product.title}
			</a>
		</li>
	{/each}
</ul>
