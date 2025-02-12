let obj1 = document.getElementById("givenString");
let times = document.getElementById("rotate");   

function rotateString()
{
    let str = obj1.innerText;
    let n = parseInt(times.value);
    n = n%str.length;
    let ans = str.slice(n) + str.slice(0, n);
    obj1.innerText = ans;
}