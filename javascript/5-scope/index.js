//variable scope in js
//1. global = accessible anywhere
//2. local = accessible inside of something
//  a. function = inside function
//  b. lexical = ES6 = variable outside of a function can be accessible inside of another function, even after declaration
//  c. block = within a set of curly braces

var name1 = "Bob";
let name2 = "Kevin"; //es6; lexical
const name3 = "Azhya"; //es6; constant - val doesn't change

//name3 = "Tom";
//console.log(name3);

function greetings(){
    var name2 = "Mike"; //function scope variable
    return `Hello, ${name2}`;
}

//hoisting
function eatLunch(){
    name4 = "Gregory";
    
    if(name4 === "Gregory"){
        var name4 = "Josh"; //this will be hoisted up to line 22
        return("Hi, Gregory");
    }else{
        return("Hey, Greg");
    }
}

//console.log(greetings());
//console.log(name2);
console.log(eatLunch());