namespace Day_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            class1 o = new class1();

            // Positional Params

            Console.WriteLine(o.add(2, 5));

            Console.WriteLine(o.add(5));

            // Named Params
            Console.WriteLine(o.add(a: 10, b: 5));

            Console.WriteLine(o.add(b: 5));



            //Console.WriteLine("Hello, World!");
        }
    }

    public class class1
    {

        private int a;
        private int b;

        public int add(int a = 0, int b = 0, int c = 0)
        {
            return a + b;
        }
    }
}
