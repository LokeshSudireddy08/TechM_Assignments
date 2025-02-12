function daysUntilChristmas() {
    const today = new Date();
    const currentYear = today.getFullYear();
    const christmas = new Date(currentYear, 11, 25);
    if (today > christmas) {
        christmas.setFullYear(currentYear + 1);
    }
    const timeDifference = christmas - today;
    const daysLeft = Math.ceil(timeDifference / (1000 * 60 * 60 * 24));
    return daysLeft;
}
const daysLeft = daysUntilChristmas();
console.log(`Days left until Christmas: ${daysLeft}`);