""" STATEMENT: Create a program that asks the user five questions about soccer and the user answers. The questions with their correct answers will have to be stored
in a dictionary beforehand.
Keep a counter to show the correct answers. Every time the user hits or misses, the score will be displayed."""

dict = {
    "question1": {
        "question": "Which team won the 2022 Football World Cup? ",
        "answer": "Argentina"
        },
    "question2": {
        "question": "What country is Thomas Gravesen from?",
        "answer": "Denmark"
    },
    "question3": {
        "question": "In what year did the Spanish Football team won the World Cup? ",
        "answer": "2010"
    },
    "question4": {
        "question": "How many Ballon d'Ors did Cristiano Ronaldo win? Tell me the anwers in figures: "     ,
        "answer": "5"
    },
    "question5": {
        "question": "In what year did Figo sign for Real Madrid? ",
        "answer": "2000"  
    },
}

score = 0

for key, value in dict.items():
    print(value['question'])
    answer = input("Answer: ")
    
    if answer.lower() == value['answer'].lower():
        print('Right! ')
        score+=1
        print("Your have " + str(score) + " point(s)")
    else:
        print("Mistaken!")
        print("The answer is: " + value['answer'])   
        print("Your have: " + str(score) + " point(s)") 

