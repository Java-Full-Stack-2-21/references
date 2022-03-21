function changeBlue(){
    let parent = document.getElementById("parent-1");

    setTimeout(() => {
        console.log("starting change...");
        parent.classList.add("color-bluegradient");
    }, 3000);

    console.log("Changing to blue...")
}

function changeGreen(){
    let parent = document.getElementById("parent-2");

    setTimeout(() => {
        console.log("starting change...");
        parent.classList.add("color-greengradient");
    }, 3000);

    console.log("Changing to green...")
}