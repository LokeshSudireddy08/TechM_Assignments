let num1 = document.getElementById("first");
let num2 = document.getElementById("second");
let num3 = document.getElementById("third");
function sortNumbers() {
    let first=parseInt(num1.value);
    let second=parseInt(num2.value);
    let third=parseInt(num3.value);
    let numbers = [first, second, third];
    numbers.sort(function(a, b) {
        return b - a;
    });
    alert("Sorted numbers: " + numbers.join(", "));
}
