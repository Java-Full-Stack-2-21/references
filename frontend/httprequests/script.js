


/* 
    We use the fetch method in JavaScript to send http requests 

*/
async function getPikachu(){

    let response = await fetch("https://pokeapi.co/api/v2/pokemon/pikachu", {
        method: "POST",
        //JSON.stringify converts our JavaScript Object to a json string
        body: JSON.stringify({

        })
    })

    //.json() converts our json string in the response body into a javascript object
    let responseBody = await response.json();

    console.log(responseBody)

}

getPikachu()