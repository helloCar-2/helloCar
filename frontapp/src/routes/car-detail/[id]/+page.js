export async function load({fetch, params}) {

    let res = await fetch(`http://localhost:8080/api/v1/hellocar/${params.id}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    let result = await res.json();
    return result
}