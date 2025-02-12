<!DOCTYPE html>
<html lang="en">
<head>
    <title>String Rotation</title>
</head>
<body>

    <h2 id="rotatedText">digiterati</h2>

    <script>
        let str = "digiterati";

        function rotateString() {
            str = str.charAt(str.length - 1) + str.slice(0, -1);
            document.getElementById("rotatedText").innerText = str;
        }

        setInterval(rotateString, 500);
    </script>

</body>
</html>
