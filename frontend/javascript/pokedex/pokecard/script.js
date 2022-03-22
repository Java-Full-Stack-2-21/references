let pokemon;

window.addEventListener("load", async function(){

    //get the first 150 pokemon (HTTP)
    let response = await fetch("https://pokeapi.co/api/v2/pokemon?limit=150");
    let responseBody = await response.json();
    let list = responseBody.results;

    //update list method populates the list to the screen
    updateList(list)


    //create a filter to find pokemon
    let pokeSearchInputElem = document.getElementById("poke-search");

    pokeSearchInputElem.addEventListener("keyup", function(){
        //an array of all the buttons
        updateList(list.filter(element => element.name.includes(pokeSearchInputElem.value)))
    })

})

function updateList(list){
    //remove whats currently in list
    let listContainerElem = document.getElementById("list-container")
    listContainerElem.innerHTML = "";

    //populate list container based on list passed
    list.forEach(element => {
        let listItemElem = document.createElement("div");
        listItemElem.className = "list-item";

        listItemElem.innerHTML = `<button class="display-btn" onclick="updateCard(event)">${element.name}</button>`

        listContainerElem.appendChild(listItemElem);
    })
}


async function updateCard(event){

    //get more information about the pokemon (HTTP)
    let pokeName = event.target.innerText;
    let response = await fetch("https://pokeapi.co/api/v2/pokemon/" + pokeName);
    let responseBody = await response.json();

    //change name based on response boday
    let pokeNameElem = document.getElementById("poke-name");
    pokeNameElem.innerHTML = "";
    pokeNameElem.innerText = responseBody.name;

    //add image
    let pokeImgElem = document.createElement("img");
    pokeImgElem.src = responseBody.sprites.front_default;

    //append image to parent element
    let imgContainerElem = document.getElementById("img-container");
    imgContainerElem.innerHTML = "";
    imgContainerElem.appendChild(pokeImgElem)


    //retrieve all the abilities
    let list = responseBody.abilities;

    let pokeAbilitiesElem = document.getElementById("poke-abilities")
    pokeAbilitiesElem.innerHTML = "";

    list.forEach(element => {
        let listItemElem = document.createElement("li");
        listItemElem.innerText = element.ability.name;

        pokeAbilitiesElem.appendChild(listItemElem);
    });
}