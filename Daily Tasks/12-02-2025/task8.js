let number = document.getElementById("number");

function clickme()
{
    number = parseInt(number.value);
    const random_Number = Math.floor(Math.random()*10 + 1);
    if(number == random_Number)
    {
        alert("Congratulations! You guessed the correct number");
        number.innerText = "";
    }
    else
    {
        alert(`Sorry! The number was ${random_Number}`);
        number.innerText = "";
    }
}