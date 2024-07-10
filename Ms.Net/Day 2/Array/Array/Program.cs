using System;

namespace Array
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("Hello, World!");

            int numberOfBatches = GetValidInput("How many batches to add? ", int.TryParse);
            int[][] arr = new int[numberOfBatches][];

            for (int i = 0; i < numberOfBatches; i++)
            {
                Console.WriteLine($"Batch {i + 1}:");
                int numberOfStudents = GetValidInput($"Enter number of students in Batch {i + 1} => ", int.TryParse);
                arr[i] = new int[numberOfStudents];

                for (int j = 0; j < numberOfStudents; j++)
                {
                    arr[i][j] = GetValidInput($"Enter marks for Student {j + 1} in Batch {i + 1} => ", int.TryParse);
                }
            }

            Console.WriteLine("Marks of Students");

            for (int i = 0; i < numberOfBatches; i++)
            {
                Console.WriteLine($"Batch {i + 1}");
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.WriteLine($"Student {j + 1} => Marks {arr[i][j]}");
                }
                Console.WriteLine();
            }
        }

        static int GetValidInput(string prompt, TryParseHandler<int> tryParseMethod)
        {
            while (true)
            {
                Console.Write(prompt);
                string? input = Console.ReadLine();
                if (tryParseMethod(input, out int result))
                {
                    return result;
                }
                else
                {
                    Console.WriteLine("Invalid input. Please enter a valid integer.");
                }
            }
        }

        delegate bool TryParseHandler<T>(string input, out T result);
    }
}