// export async function load({fetch, params}) {
//     console.log(77)
//
//     if (typeof window !== 'undefined') {
//         console.log(88)
//         const accessToken = localStorage.getItem('accessToken');
//         console.log(accessToken)
//
//         let res = await fetch(`http://localhost:8080/api/v1/hellocar/${params.id}`, {
//             method: 'GET',
//             headers: {
//                 'Content-Type': 'application/json',
//                 'Authorization': `Bearer ${accessToken}`
//             }
//         })
//
//         let result = await res.json();
//         console.log(result)
//         return result
//     }
// }