//event = something that happens in the browser
//ex. onclick, onsubmit, onmouseover, onchange, etc.
//propagnation = in which events are going to be triggered
//select html elements
var parent1 = document.getElementById("parent-1");
var parent2 = document.getElementById("parent-2");
var child1 = document.getElementById("child-1");
var child2 = document.getElementById("child-2");

//manage a given event, we can eventlisteners
//bubbling = from child to parent
//ex. fish bubbles going up to the surface
parent1.addEventListener('click', () => {
    console.log("I am the PARENT");
})

child1.addEventListener('click', () => {
    console.log("I am the CHILD");
})

//capturing = from parent to child
//ex. mousetrap on a mouse eating cheese
parent2.addEventListener('click', () => {
    console.log("I am the PARENT");
}, true)

child2.addEventListener('click', () => {
    console.log("I am the CHILD");
}, true)

// function clickFunc(e){
    //to prevent bubblnig from happening
    //     e.stopPropagation();

    //to prevent default event behavior
    //     e.preventDefault();
// }