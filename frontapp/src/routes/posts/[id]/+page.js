export async function load({fetch, params}) {

    console.log(params)
    let res = await fetch(`https://dummyjson.com/products/${params.id}`)
    let result = await res.json();
    
    return result
}