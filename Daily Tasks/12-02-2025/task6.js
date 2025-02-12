
function checkleapyear() {
    let year=document.getElementById("year").value;
    year=parseInt(year);
    if((year%4==0 && year%100!=0) || (year%400==0)){
        document.getElementById("result").innerText=`${year} is a leap year`;
    }
    else document.getElementById("result").innerText=`${year} is not a leap year`;
}