#include <iostream> // "iostream" is a C++ standard library that provides input and output of data to the console and files. The library includes the istream and ostream classes// 
//which handle input and output of data, respectively. It also includes the iostream class, which combines the functionality of both classes." //

int main(){
    std:: cout << "Hi World" << '\n'; //both '\n' and std::endl make the same, but std::endl cleans the buffer
    std:: cout << "How are you?" << std::endl;
    std:: cout << "Bye";

    return 0;
}