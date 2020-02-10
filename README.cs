// practices
using System;

namespace Practices
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] letters = {"first","second","third"};
            int[] numbers = new int[3];
            for (int i=0;i<3;i++ )
            {
                Console.Write($"Enter the {letters[i]} number: ");
                int number = Convert.ToInt32(Console.ReadLine());
            }
            int a = (numbers[0]+numbers[1]) + numbers[2];
            int b = numbers[0] * numbers[1] + numbers[1] * numbers[2];
            Console.WriteLine($"Result of specified numbers {numbers[0]}, {numbers[1]}, {numbers[2]}" +
                $"(x + y)z is {a} and x * y + y * z is {b}");
        }
    }
}
