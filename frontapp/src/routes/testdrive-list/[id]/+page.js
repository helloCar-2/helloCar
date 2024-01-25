export async function load ({fetch, params}){
    let res = await fetch(`http://localhost:8080/testdrives/${params.id}`);
    let result = await res.json();
    console.log(result);

    return result;

}