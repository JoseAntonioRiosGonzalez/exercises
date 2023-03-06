using System;
namespace RockPaperScissors
{
	class RockPaperScissors
	{
		static void Main(string[] args)
		{
			String inputPlayer, inputCPU;
			int randomInt;
			int scorePlayer = 0;
			int scoreCPU = 0;

			Console.Write("Choose between ROCK, PAPER and SCISSORS:     ");
			inputPlayer = Console.ReadLine();
			inputPlayer = inputPlayer.ToUpper();//converts the value of the inputPlayer variable to uppercaseconverts the value of the inputPlayer variable to uppercase

            Random rnd = new Random();

			randomInt = rnd.Next(1, 4);//The Next() method belongs to the Random class and is used to generate random numbers

			switch (randomInt)
			{
				case 1:
					inputCPU = "ROCK";
					Console.WriteLine("Computer chose ROCK");
						if (inputPlayer == "ROCK")
					{
						Console.WriteLine("DRAW!!\n\n");
					}
						else if (inputPlayer == "PAPER")
                    {
                        Console.WriteLine("Player WINS!!\n\n");
						scorePlayer++;
                    }
						else if (inputPlayer == "SCISSORS")
                    {
                        Console.WriteLine("CPU WINS!!\n\n");
						scoreCPU++;
                    }
						break;

				case 2:
					inputCPU = "PAPER";
                    Console.WriteLine("Computer chose PAPER");
                    if (inputPlayer == "PAPER")
                    {
                        Console.WriteLine("DRAW!!\n\n");
                    }
                    else if (inputPlayer == "SCISSORS")
                    {
                        Console.WriteLine("Player WINS!!\n\n");
                        scorePlayer++;
                    }
                    else if (inputPlayer == "ROCK")
                    {
                        Console.WriteLine("CPU WINS!!\n\n");
                        scoreCPU++;
                    }
                    break;


   
				case 3:			
					inputCPU = "SCISSORS";
                    Console.WriteLine("Computer chose SCISSORS");
                    if (inputPlayer == "SCISSORS")
                    {
                        Console.Write("DRAW!!\n\n");
                    }
                    else if (inputPlayer == "ROCK")
                    {
                        Console.WriteLine("Player WINS!!\n\n");
                        scorePlayer++;
                    }
                    else if (inputPlayer == "PAPER")
                    {
                        Console.WriteLine("CPU WINS!!\n\n");
                        scoreCPU++;
                    }
                    break;
     
				default:
					Console.WriteLine("Invalid Entry!");
						break;
			}

		}
	}
}

