import {Quiz} from './quiz';
/* 
    What is node?
        - nodejs is a runtime environment
        - think of nodejs as equivelent to the JRE in java
        - It is used to run javascript programs outside of the browser

    What is npm?
        - node package manager
        - what npm is to javascript is what maven is to java
        - we can create a new npm project by typing "npm init -y"

    What is typescript?
        - it is a superset of javascript developed by Microsoft
        - ... anything you can do int javascript, you can do with typescript
            - but typescript has some extra features
        - typescript is transpiled to javascript and then it is ran.

    What is the difference between compiled and transpiled?
        - compiling is converting a high level language to a lower level language
        - transpiling is converting a high level language to another high level language

    Features of Typescript:
        - strongly typed
        - easier to debug due to compile time errors
        - Has a way to achieve OOP concepts in a user friendly way
            (we dont have to deal with the prototype object like in javascript)

*/


/* 
    What are the datatypes of typescript?
        - datatypes of js
            - number, string, boolean, symbol, null, undefined
        - additional with ts
            - void, enum, tuple, any
*/


//syntax for creating a variable in typescript
// let [VARIABLE_NAME] : [DATATYPE] = [VALUE];
let str : string = "hello typescript";

/* 
    Note: eventhough typescript gives us an error, it will STILL transpile int JS and as we know...
        JS doesnt care about changing datatypes. so the code will run

    However this is no excuse to ignore the red lines. the red lines offer us compile time safety
*/

let numVariable : number = 10;
let strVariable : string = "string variable";

// you can restrict a variable to multiple datatypes
let temp : number | string;
// let temp : any;
temp = 3;
temp = "three";

//how to declared arrays
let arr : Array<number> = [1,2,3,4];
let arr2 : number[] = [1,2,3,4,5];

//tuple is basically a fixed size and datatype array
let tup : [Array<string>, boolean, number];
tup = [["hey tup", "second string"], true, 5];

/* 
    An enum is a set of named constants
*/
enum carStates{OFF, IDLE, DRIVING, ACCELERATE}

console.log(carStates.DRIVING);
console.log(carStates.OFF);

//functions
function func(val1 : number, val2 : string) : number {
    return 2;
}

let func2 = (val1 : number, val2 : string) : string => {
    return "two";
}

let func3 = (val1 : number, val2 : string) : string => "two";



//interfaces

interface Criminal{
    name : string;

    //we cannot have a body here since it is an interface. a class would implement it
    method1(arg1 : string, arg2 : number);
}

//interfaces are fully abstract
interface User{
    id : number;
    firstname : string;
    lastname : string;
}

let user : User;

user = {
    id: 3,
    firstname: "Kevin",
    lastname: "Childs"
}


class Villain implements Criminal{
    name: string;

    //? makes passing of values to parameters optional
    constructor(test : number, name? : string){ 
        this.name = name;
    }

    method1(arg1: string, arg2: number) {
        throw new Error("Method not implemented.");
    }

    /* 
        Access Modifiers of Typescript
            - public: accessible anywhere (implicitly this)
            - protected: can be accessed within the class and subclasses
            - private: can be accessed within the class
    */
}

let vill : Villain = new Villain(3, "Kevin");

let vill2 : Villain = new Villain(3);


//abstract classes are partially abstract
abstract class Food{
    type : string;
    calories: number;

    abstract goBad();

    printFood(){
        console.log(this.type);
    }
}

class Pizza extends Food{

    constructor(type : string){
        super();

        this.type = type;
    }

    goBad() {
        console.log("green bubbles are forming... O_o")
    }
    
}

let zaahhh : Pizza = new Pizza("pepperoni pizza");

zaahhh.printFood();
zaahhh.goBad();


//encapsulation example

class Pet{

    //add an access modifier to the variable in your 
    //  constructor parameter list will declare a field in your project
    constructor(private _name : string){

    }

    get name() : string {
        return this._name;
    }

    set name(n : string){
        this._name = n;
    }
}

let dog : Pet = new Pet("Max");

dog.name = "Spike";
console.log(dog.name);


let q : Quiz = new Quiz();

q.questionNum = 3;
q.grade = 35;

console.log(q.grade);
