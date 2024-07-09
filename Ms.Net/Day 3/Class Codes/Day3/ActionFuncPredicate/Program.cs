namespace ActionFuncPredicate
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Action o1 = Display;
            o1();

            Action<string> o2 = Display;
            o2("aa");

            Action<string, bool, decimal> o3 = Display;
            o3("", true, 1.1M);
        }
        static void Main()
        {
            Func<string> o1 = GetTime;
            Console.WriteLine(o1());

            Func<int,int> o2 = MakeDouble;
            Console.WriteLine(o2(10));

         

            Func<int, int, int> o4 = Add;
            Console.WriteLine(o4(10,5));


            Func<int, bool> o3 = IsEven;
            Console.WriteLine(o3(10));

            Func<Employee, bool> o5 = IsBasicGreaterThan10000;
            Employee o = new Employee { EmpNo = 1, Basic = 50000 };
            Console.WriteLine(o5(o));

            Predicate<Employee> o7 = IsBasicGreaterThan10000;
            Console.WriteLine(o7(o));
            Predicate<int> o6 = IsEven;
            Console.WriteLine(o6(10));
        }

        static bool IsBasicGreaterThan10000(Employee emp)
        {
            return emp.Basic > 10000;
        }
        static bool IsEven(int a)
        {
            // return a % 2 == 0;
            if (a % 2 == 0)
                return true;
            else
                return false;
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Display(string s)
        {
            Console.WriteLine("Display" + s);
        }
        static void Display(string s, bool b, decimal d)
        {
            Console.WriteLine("Display" + s + b + d);
        }
       
        static string GetTime()
        {
            return DateTime.Now.ToLongTimeString();
        }
        static int MakeDouble(int a)
        {
            return a*2;
        }

        
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public decimal Basic { get; set; }

    }
}
