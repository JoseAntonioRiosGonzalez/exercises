/*Exercise:
Write a JS programa to create a new string from a given string taking the first 3 characters and the last 3 characters of a string and adding
them together. The string length must be 3 or more, if not, the original is returned.
*/

const makeNewString = (str) => 
    str.length < 3 ? str : str.slice(0, 3) + str.slice(-3);

console.log(makeNewString('abc'));
console.log(makeNewString('abcdef'));
console.log(makeNewString('abc123abc123'));

console.log(makeNewString('ab'));


   