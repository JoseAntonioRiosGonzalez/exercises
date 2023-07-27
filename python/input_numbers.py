""" STATEMENT: Create a Python program where the user will be asked to enter the number of kilograms
they want to buy for our cat Garfield and our rabbit Snow. Finally, the program will print on the 
screen the total number of kilograms we will have to buy for our animals."""


cat_food=int(input("How much kilos do you want to buy for Garfield"))
rabbit_food=int(input("How much kilos do you want to buy for Snow?"))

total_food= cat_food+rabbit_food

print(f"The total number of kilos you will buy for your animals will be {total_food}")