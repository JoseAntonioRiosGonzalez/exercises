<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<?php 

    $name = "Andrew";

    function change_name(){

        global $name;// el uso de variables globales en php apenas se da. Hay otras formas de conseguir el mismo resultado

        $name = "Julius";
    }

    change_name();

    echo $name;


?>
    
</body>
</html>