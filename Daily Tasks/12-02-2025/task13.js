let num1 = document.getElementById("first");
let num2 = document.getElementById("second");
let num3 = document.getElementById("third");
function findSign() {
    let first=parseInt(num1.value);
    let second=parseInt(num2.value);
    let third=parseInt(num3.value);
    let product = first * second * third;
    if (product > 0) {
        alert("The sign is +");
    } else if (product < 0) {
        alert("The sign is -");
    } else {
        alert("The product is zero");
    }
}
