<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<?php 

    function increase_rocket(){

        static $countdown = 0;

        $countdown++;

        echo $countdown."<br />";

    }

    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();
    increase_rocket();

?>
    
</body>
</html>