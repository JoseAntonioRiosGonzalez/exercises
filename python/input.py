""" STATEMENT: Create a Python program where the user will be asked to enter their first name and last name. 
Finally, the program will print a welcome message on the screen, along with their first name and last name."""


name= input("Please enter your name: ")
surname= input("Please enter your surname: ")

greeting_message= f"Welcome, {name} {surname}!"

print(greeting_message)