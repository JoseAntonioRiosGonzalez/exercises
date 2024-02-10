string firstName = "Bob";
int widgetsSold = 7;
Console.WriteLine(firstName + " sold " + (widgetsSold + 7) + " widgets.");//with () create an overloaded operator

decimal decimalQuotient = 7.0m / 5;
Console.WriteLine($"Decimal quotient : {decimalQuotient}");

Console.WriteLine($"Modulus of 200 % 5 = {200 % 5}");
Console.WriteLine($"Modulus of 7 % 5 = {7 % 5}\n");

int value = 1;
value++;
Console.WriteLine("First: " + value);
Console.WriteLine($"Second: {value++}");//print value n then increases
Console.WriteLine("Third: " + value);
Console.WriteLine("Fourth: " + (++value) +"\n");//increases before printing

Console.WriteLine("Windows " + (7 + 4));//print Windows 11
Console.WriteLine("Windows " + (1 + 1));//print Windows 2
Console.WriteLine("Windows " + 1 + 1);//print Windows 11. Performs an implicit conversion
