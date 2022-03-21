var pokemon = ['pikachu', 'gastly', 'charmander', 'mewtwo', 'snorlax', 'porygon'];

//how to get element from array by braket notation
console.log(pokemon[0]);

//length = num of items in array
var root = document.querySelector("#example");


// for (let index = 0; index < pokemon.length; index++) {
//     //make new element
//     var target = document.createElement('h1');

//     //give element to target's innerHTML
//     target.innerHTML = pokemon[index];

//     //append element to root
//     root.append(target);
// }

pokemon.forEach((element)=> {
    //make new element
    var target = document.createElement('h1');

    //give element to target's innerHTML
    target.innerHTML = element;

    //append element to root
    root.append(target);
})