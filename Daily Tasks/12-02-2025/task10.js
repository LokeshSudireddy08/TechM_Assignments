let first=document.getElementById("first");
let second=document.getElementById("second");
function multiplication() {
    let num1=parseFloat(first.value);
    let num2=parseFloat(second.value);
    let result=num1*num2;
    document.getElementById("result").innerText=`${result}`;
}
function division() {
    let num1=parseFloat(first.value);
    let num2=parseFloat(second.value);
    if(num2==0) document.getElementById("result").innerText="number cannot be ZERO";
    else{
        let result=num1/num2;
        document.getElementById("result").innerText=`${result}`;
    }
}