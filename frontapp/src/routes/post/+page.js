export async function load ({fetch}){
    let res = await fetch("https://dummyjson.com/products");
    let result = await res.json();
    console.log(result);

    return result;

}