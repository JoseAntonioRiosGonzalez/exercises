// See https://aka.ms/new-console-template for more information
string greeting = "Hello";
string firstName= "Bob";
Console.WriteLine(greeting + " " + firstName + " ");

//the $ character identifies a string literal as an interpolated string
string message3 = $"{greeting}   {firstName}";//string interpolation. spaces between interpolation expressions are real spaces
Console.WriteLine(message3);


int version = 11;
string updateText= "Update to Windows";
string message4= $"{updateText} {version}";
Console.WriteLine(message4);


string projectName = "First-Project";
Console.WriteLine($@"C:\Output\{projectName}\Data");//with $ we refer to the variable "projectName". With @ dont need escape character to print "\"


