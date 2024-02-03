export async function load ({fetch, params}){
    let res = await fetch(`http://localhost:8080/api/v1/posts/${params.id}`);
    let result = await res.json();
    console.log(result);

    return result;

}