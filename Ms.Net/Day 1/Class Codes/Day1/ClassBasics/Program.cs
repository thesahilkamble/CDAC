//global using System;
//using static System.Console;
//using System;

namespace ClassBasics
{
    internal class Program
    {
        static void Main1()
        {
            //WriteLine("");
            Console.WriteLine("Hello, World!");
            System.Console.WriteLine("hw");
        }
        static void Main()
        {
            Class1 o; //o is a reference of Class1
            o = new Class1(); //new Class1() is an object of type Class1
            o.Display();
            o.Display("a");


            //positional parameter
            Console.WriteLine(o.Add(10, 20, 30));
            Console.WriteLine(o.Add(10, 20));
            Console.WriteLine(o.Add(10));
            Console.WriteLine(o.Add());

            //named parameter
            Console.WriteLine(o.Add(a: 10, b: 20, c: 30));
            Console.WriteLine(o.Add(b: 20));
            Console.WriteLine(o.Add(c: 30));
            Console.WriteLine(o.Add(a: 10, c: 30));


        }

    }

    public class Class1 //:Object
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
        public void Display(string s)//function overloading
        {
            Console.WriteLine("Display" + s);
        }

        //public int Add(int a, int b)
        //{
        //    return a + b;
        //}
        //public int Add(int a, int b, int c)
        //{
        //    return a + b + c;
        //}

        //default values
        //default values have to be given from right to left
        public int Add(int a=0, int b=0, int c=0)
        {
            return a + b + c;
        }

        public void DoSomething()
        {
            int i = 100;
            DoSomething2();
            Console.WriteLine("Display");
            //local function
            //local function can access local variables defined in the outer function
            //local function -cannot have an access specifier
            //implicitly private 
            //only available in outer function
            void DoSomething2()
            {
                Console.WriteLine(i);
            }
            //static local function
            //local function cannot access local variables defined in the outer function
            static void DoSomething3()
            {
                //i++;
                //Console.WriteLine(i); //error
            }

        }
        
    }
}

namespace Payroll
{
    public class Employee { }
    public class Department { }
}
namespace n1
{
    namespace MyNamespace
    {
        public class Class1 { }

    }
}