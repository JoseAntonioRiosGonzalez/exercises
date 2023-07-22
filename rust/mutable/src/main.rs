fn main() {
    let mut bar= 5; // "mut" indicates that the variable is mutable, which means that its value can change later in the program.

    println!("This is {}",bar); // The "println!" macro is used to print to the console. "{}" is a placeholder that indicates where the 
    //value of "x" should be printed
    bar= 7;

    println!("This is {}",bar); 


}
