/*Exercise:
Write a JS program to extract the first half of a String of even length.*/

const firstHalf = (str) => str.slice(0, str.length /2);

console.log(firstHalf('temp'));
console.log(firstHalf('temple'));
console.log(firstHalf('temples'));
console.log(firstHalf('templeso'));
