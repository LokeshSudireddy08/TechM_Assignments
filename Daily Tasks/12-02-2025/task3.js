function getCurrentDate() {
    let now = new Date();

    let day = now.getDate();
    let month = now.getMonth() + 1;
    let year = now.getFullYear();

    day = day < 10 ? "0" + day : day;
    month = month < 10 ? "0" + month : month;

    let format1 = `${month}-${day}-${year}`; 
    let format2 = `${month}/${day}/${year}`; 
    let format3 = `${day}-${month}-${year}`; 
    let format4 = `${day}/${month}/${year}`;

    console.log(`mm-dd-yyyy: ${format1}`);
    console.log(`mm/dd/yyyy: ${format2}`);
    console.log(`dd-mm-yyyy: ${format3}`);
    console.log(`dd/mm/yyyy: ${format4}`);
}
getCurrentDate();
