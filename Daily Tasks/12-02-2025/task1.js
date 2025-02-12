function displaydateandtime() {
    let now=new Date();
    let days=["sunday","monday","tuesday","wednesday","thursday","friday","saturday"];
    let day=days[now.getDay()];
    let hours=now.getHours();
    let minutes=now.getMinutes();
    let seconds=now.getSeconds();
    
    let ampm=hours>=12?"PM" : "AM";
    hours=hours%12;
    console.log(`Today is: ${day}.`);
    console.log(`Current Time is:${hours} ${ampm}:${minutes}:${seconds}`);
}

displaydateandtime();