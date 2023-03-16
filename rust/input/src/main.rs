use std::io;//to obtain user input and then print the result as output, we need to bring the io (input/output) library into scope. The io library comes from the standar library (which is known as std)//

fn main() {
    println!("Guess the number! ");
    println!("Please, input your guess! ");
/*The guess variable will be used to store the user's text input during program execution. Using the new() method on String returns a new empty String object, which is then assigned to the 
guess variable with the help of the = operator. The mut prefix indicates that the variable is mutable, which means that its value can change over time during the execution of the program.*/   
    let mut guess = String::new();
/*These lines of code in Rust read a line of input from the user using the stdin() function of the io module. The user input is stored in the guess variable, which is passed as a mutable
argument to the read_line() function. The read_line() function reads the input from the console and stores the entered characters in the guess variable.
The expect() method is used to handle any possible errors that may occur while reading user input. If the read_line() function returns an error, the message "Failed to read line" 
will be printed. If the function is successful, the program will continue to run normally.*/
    io::stdin()
        .read_line(&mut guess)
        .expect("Failed to read line");
/*The message consists of two parts: the format string "You guessed: {}" and the guess variable. The format string indicates that the value of the guess variable should be 
substituted in place of {}*/

    println!("You guessed: {}", guess);
}
