const bucketLocation = "https://krc-s3-bucket.s3.us-east-2.amazonaws.com";

async function upload(e){
    e.preventDefault();

    let fileInputElem = document.getElementById("file");


    //whenever we send files, it needs to be in a form
    let formData = new FormData();
    formData.append("file", fileInputElem.files[0]);
    //console.log(fileInputElem.files[0]);


    let response = await fetch("http://localhost:9000/upload", {
        method: "POST",
        body: formData
    })

    let responseBody = await response.text();

    console.log(responseBody)

    let imgElem = document.createElement("img");
    imgElem.src = bucketLocation + responseBody;


    document.body.appendChild(imgElem);
}