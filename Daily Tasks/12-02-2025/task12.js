function findLargestInteger() {
    let first = parseInt(document.getElementById("firstNumber").value);
    let second = parseInt(document.getElementById("secondNumber").value);

    let largest = first > second ? first : second;
    
    document.getElementById("result").innerText = `The largest integer is: ${largest}`;
}
