async function login(event){
    event.preventDefault();

    let usernameInputElem = document.getElementById("username");
    let passwordInputElem = document.getElementById("password");

    console.log(usernameInputElem.value, passwordInputElem.value)


    let response = await fetch("http://localhost:9000/login",{
        method: "POST",
        body: JSON.stringify({
            username: usernameInputElem.value,
            password: passwordInputElem.value
        })
    })

    let responseBody = await response.json();

    if(responseBody.success){
        if(responseBody.data.role == "MANAGER"){
            window.location = "./managerdashboard"
        }else{
            window.location = "./employeedashboard"
        }
    }
}