namespace LanguageFeatures
{
    internal class Program
    {
        static void Main1()
        {
            int a = 100;
            a = a.Add(10);
            a.Display();
            a.ExtMethodForBaseClass();

            string s = "aaa";
            s.Show();
            s.ExtMethodForBaseClass();
        }
        static void Main2()
        {
            int a = 100;
            //a = a.Add(10);
            a = ExtClass.Add(a, 10);

            //a.Display();
            ExtClass.Display(a);

            string s = "aaa";
            //s.Show();
            ExtClass.Show(s);   
        }
        static void Main()
        {
            ClsMaths oClsMaths = new ClsMaths();
            Console.WriteLine(oClsMaths.Add(10, 5));
            Console.WriteLine(oClsMaths.Multiply(10, 5));
            Console.WriteLine(oClsMaths.Subtract(10, 5));

        }
    }
    //create an extension method
    //step 1 : create a static method in a static class
    public static class ExtClass
    {
        public static int Add(this int a, int b)
        {
            return a + b;
        }
        //step 2 : the 1st parameter must the Type for which
        //you are writing the extension method, preceeded by the 'this' keyword
        public static void Display(this int i)
        {
            Console.WriteLine(i);
        }
        public static void Show(this string s)
        { 
            Console.WriteLine(s); 
        }
        //if you add an ext method for the base class,
        //it is also available for the derived class

        public static void ExtMethodForBaseClass(this object o)
        {
            Console.WriteLine(o);
        }

        //if you add an ext method for an interface,
        //it is also available for classes that implement that interface
        public static int Subtract(this IMathOperations oIMath, int a, int b)
        { 
            return a - b; 
        }
    }

    public interface IMathOperations
    {
        int Add(int a, int b);
        int Multiply(int a, int b);
    }

    public class ClsMaths : IMathOperations
    {
        public int Add(int a, int b)
        {
            return a + b;
        }
        public int Multiply(int a, int b)
        {
            return a * b;
        }
    }

}
