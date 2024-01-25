export async function load ({fetch}){
    // let res = await fetch("https://local");
    let res = await fetch('http://localhost:8080/testdrives')
    let result = await res.json();
    console.log(result);

    return result;

}