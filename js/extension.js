/*Exercise:
Write a Javascript program to get the extension of a html filename but only until the letter m included (excluding the last letter)*/

const getFileExtension = (str) => str.slice 
(  (str.lastIndexOf('.'))    ,str.lastIndexOf('m')+1);

console.log(getFileExtension('armohadalope.chrome'));
