export async function load ({fetch, params}){
    let res = await fetch(`http://localhost:8080/hellocar/${params.id}`);
    let result = await res.json();
    return result;
}