var num1 = 5;
var num2 = "65";

//function keyword
function add(n1, n2){
    return parseInt(n1) + parseInt(n2);
}

//console.log(add(num1, num2));

//anon function
//doesn't not have a name but can be accessed via a variable
var multiply = function(n1, n2){
    return parseInt(n1) * parseInt(n2);
};

//console.log(multiply(num1, num2));

//arrow functions
var square = (n) => {
    return n * n;
};

//console.log(square(7));

//closure
//is a function that can have inner functions that can access the values/var of the outer function
function complexMath(n){
    var secretNumber = n;
    
    //callback function
    //funcs that can be invoked by another function
    function subtract(){
        return secretNumber - 18;
    }

    //here i am making my callback
    return subtract();
}

console.log(complexMath(2));
//== doesn't check types
//=== does check types
//console.log(num2 === 65);