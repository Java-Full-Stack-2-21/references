//argument 1: size of array
//argument 2: max value size
arr = generateRandNumbers(ARRAY_SIZE, MAX_VAL_IN_ARRAY);

// get max value in arr (I looked this up)
let max = Math.max(...arr); 

//this method will remove everything from the canvas element and generate the "bar graph" from the array
function draw(){
    let canvas = document.getElementById("canvas");
    canvas.innerHTML = "";

    console.log(canvas);
    //for each element in the array, create the div
    arr.forEach((height, index) => { 
        let rect = document.createElement("div");
        //the width will be the width of the screen divided by the quantity in array
        rect.style.width = (innerWidth / arr.length) + 'px';
        rect.style.height = ((innerHeight * height) / max) + 'px';
        rect.style.backgroundColor = `rgb(0,0,${55 + ((200 * height) / max)})`;
        rect.style.position = 'fixed';
        rect.style.bottom = '0px';
        //the position of each value from left to right should be the index of arr * width of rectangle
        rect.style.left = (index * (innerWidth/arr.length)) + 'px';
        rect.id = index;
        rect.innerText = height;
        
        canvas.appendChild(rect);
    });
}

function update(){
    
    //BUBBLE SORT
    //if number on left is larger than number on right, swap
    if(arr[arrIndex] > arr[arrIndex+1]){
        //swap positions in array
        let temp = arr[arrIndex];
        arr[arrIndex] = arr[arrIndex+1];
        arr[arrIndex+1] = temp;

        //increase swap count
        swapCount++;
        swapElem.innerText = swapCount;

        //since we swapped, we are assuming the array is not sorted
        sorted = false;
    }
}

function main(){
    interval = setInterval(function(){

        //this is keeping track of the array index
        //if array index is the length of the array, go back to index 0
        //if not, increment the index
        if(arrIndex >= arr.length){
            arrIndex = 0;
            sorted = true;
        }else{ arrIndex++; }


        update();
        draw();

        //if sorted, stop setInterval from looping
        if(arrIndex == arr.length - 1 && sorted) clearInterval(interval);

    }, SPEED)
}

main();


//generated this util function to generate randon numbers into the array
function generateRandNumbers(arrSize, maxVal){
    let array = [];
    for(let i = 0; i < arrSize; i++){
        array.push(Math.floor(Math.random() * maxVal));
    }
    return array;
}