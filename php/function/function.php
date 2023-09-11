<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<?php 

    echo "Ejemplo de función"."<br />";

    include ("info_function.php");

    function giveInfo(){

        echo "Este es el mensaje del interior de la función"."<br />";
    }

    giveInfo();


?>


</body>
</html>