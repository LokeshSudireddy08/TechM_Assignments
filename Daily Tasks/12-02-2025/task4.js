const readline = require('readline-sync');

let side1 = parseFloat(readline.question("Enter side 1: "));
let side2 = parseFloat(readline.question("Enter side 2: "));
let side3 = parseFloat(readline.question("Enter side 3: "));

function areaUsingHeron(a, b, c) {
    let s = (a + b + c) / 2;
    let area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return area.toFixed(2);
}

console.log(`Area of Triangle: ${areaUsingHeron(side1, side2, side3)}`);
