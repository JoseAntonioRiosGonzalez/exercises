/*Exercise
Write a JS program that counts the number of times a letter is repeated in a string*/

const countChars = (str,char) => 
    str.split('').filter(ch => ch === char);

const example= countChars('oximoron','o');
console.log(example);
console.log(example.length);    


