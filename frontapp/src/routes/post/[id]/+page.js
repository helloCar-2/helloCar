export async function load ({fetch, params}){
    let res = await fetch(`https://dummyjson.com/products/${params.id}`);
    let result = await res.json();
    console.log(result);

    return result;

}