<script>
	export let data;
</script>

<div>
	<div>게시글 상세</div>

	<h3>{data.data.post.id}</h3>
	<h1>{data.data.post.subject}</h1>
	<h1>{data.data.post.content}</h1>

	<!-- <img src={data.thumbnail} /> -->
    <!-- <p>{data.description}</p> -->
</div>
