/* 
    We use the fetch method in JavaScript to send http requests 


    There are 2 ways to send http requests in javascript
    AJAX (Asynchronous JavaScript and XML) (DEPRECATED)
        - what does asynchronous?
            - procedures can happen concurrently from one another
    fetch
        - Async Await syntax
        - .then() syntax

*/


function getPikachuAJAX(){
    let xhttp = new XMLHttpRequest();

    /*
        readystate = 0 : Nothing is initialized
        readystate = 1 : Connection has been established
        readystate = 2 : request has been received (on the server)
        readystate = 3 : processing the request (on the server)
        readystate = 4 : the request has completed and we have gotten back the response
    */

    xhttp.addEventListener("readystatechange", function(){
        if(this.readyState == 4 && this.status == 200){
            console.log(JSON.parse(this.responseText));
        }
    })


    xhttp.open("GET","https://pokeapi.co/api/v2/pokemon/pikachu", true);
    xhttp.send();
}



/* 
    Async await syntax
*/
async function getPikachu(){

    console.log("BEFORE FETCH");
    let response = await fetch("https://pokeapi.co/api/v2/pokemon/pikachu")

    //.json() converts our json string in the response body into a javascript object
    let responseBody = await response.json();

    console.log(responseBody)
    console.log("AFTER ")
}


function getPikachuDotThen(){
    console.log("BEFORE FETCH")
    fetch("https://pokeapi.co/api/v2/pokemon/pikachu")
    .then(response => {
        return response.json();
    })
    .then(responseBody => {
        console.log(responseBody);
    })

    console.log("AFTER FETCH")
}



//getPikachuAJAX()
//getPikachuDotThen();
getPikachu();