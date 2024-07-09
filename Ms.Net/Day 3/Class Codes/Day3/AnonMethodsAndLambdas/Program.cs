namespace AnonMethodsAndLambdas1
{
    internal class Program
    {
        static void Main1()
        {
            int i = 100;
            Action o1 = delegate()
            {
                //anon method can access local variables declared in the calling code
                Console.WriteLine(++i);
                Console.WriteLine("anon method");
            };
            o1();

            Func<int,int,int> o2 = delegate(int a, int b)
            { 
                return a + b; 
            };
            Console.WriteLine(o2(10,5));

        }
       
    }
}

namespace AnonMethodsAndLambdas2
{
    internal class Program
    {
        static void Main()
        {
            Func<int, int> o1 = MakeDouble;
            Console.WriteLine(o1(10));

            Func<int, int> o2 = delegate(int a)
            {
                return a * 2;
            };
            Console.WriteLine(o2(10));

            //Func<int, int> o3 = (a) => a * 2;
            Func<int, int> o3 = a=> a * 2;
            Console.WriteLine(o3(10));

            Func<string> o4 = ()=> DateTime.Now.ToLongTimeString(); ;
            Console.WriteLine(o4());

            Func<int,int,int> o5 = (a,b)=> a + b;
            Console.WriteLine(o5(1,2));

            Func<int, bool> o6 = a => a % 2 == 0;
            Console.WriteLine(o6(100));

            Predicate<int> o7 = a =>
            {
                // return a % 2 == 0;
                if (a % 2 == 0)
                    return true;
                else
                    return false;
            };

            Predicate<Employee> o9 = obj => obj.Basic > 10000;
            Employee o = new Employee { EmpNo = 1, Basic = 50000 };
            Console.WriteLine(o9(o));

        }
        static int MakeDouble(int a)
        {
            return a * 2;
        }
        static bool IsBasicGreaterThan10000(Employee emp)
        {
            return emp.Basic > 10000;
        }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public decimal Basic { get; set; }

    }
}

