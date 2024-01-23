<script>
    export let data;
</script>

<ul>
    {#each data.products as product}
    <li>
        <img src="{product.thumbnail}" alt="">

        <a href="/post/{product.id}">
        {product.title}
        </a>


    </li>
    {/each}
</ul>