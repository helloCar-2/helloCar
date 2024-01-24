<script>
    export let data;
</script>

<ul>
    {#each data.data.posts as post}
    <li>
        <!-- <img src="{product.thumbnail}" alt=""> -->

        <a href="/posts/{post.id}">
            {post.subject}
            {post.content}

        </a>


    </li>
    {/each}
</ul>