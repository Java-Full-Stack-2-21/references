//1. declaration of variables
var num = 10; //number
var str = "10"; //string
var bool = false; //boolean
var nullData = null; //null
var undefinedData = ""; //undefined
var id = Symbol("id"); //symbol

var Person = {
    firstName: "Bob",
    lastName: "the Builder",
    toDos: ['eat', 'work', 'sleep'],
    //arrow function aka anonymous function
    sayHi: (fname) => {
        //string interpolation
        return `hello, ${fname}!`;
    },
    //symbols allow us to create hidden properties that no other part of our code can access
    [id]: 123
};

//2. display our variables using dom manipulation
//console.log(Person[id]);


//DOM = document object model
//tree-like structure of HTML elements that our browser can interact with
var numEx = document.getElementById('num-ex');
var boolEx = document.querySelector('#bool-ex');
var symEx = document.getElementById("sym-ex");

numEx.innerHTML = num;
symEx.innerHTML = Person[id];

//truthy or falsey
// 1, 2, hello, person = truthy
//false, 0, -0, "", null, undefined, NaN = falsey
if(bool){
    boolEx.innerHTML = "I'm a true value"
}else{
    boolEx.innerHTML = "I'm a false value"
}