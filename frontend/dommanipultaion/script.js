//READING ELEMENT
/* how do i retrieve an html element from the dom? */
let domFunElem = document.getElementById("dom-fun");


//UPDATING ELEMENT
domFunElem.innerHTML = "<h1>Hello World</h1>";
domFunElem.className = "name-created-from-js"


console.log(domFunElem);


//CREATION OF ELEMENT
/* How do I create an new element and put it on the page */
let newElem = document.createElement("div");
newElem.innerText = "New Element!!!!";


document.body.appendChild(newElem);




//DELETE
/* removing element */
newElem.remove();