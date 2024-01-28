<script>
    export let data
</script>
<div>
<div>게시글</div>
<h3>{data.id}</h3>
<h1>{data.title}</h1>
<img src="{data.thumbnail}" alt="">
<p>{data.description}</p>
</div>