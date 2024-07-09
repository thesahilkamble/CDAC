namespace Delegates1
{
    //step 1 : create a delegate class having the same signature as the function to call
    public delegate void Del1();
    //Object
    //Delegate
    //MulticastDelegate
    //Del1

    public delegate int AddDel(int a, int b);
    internal class Program
    {
        static void Main1()
        {
            //step 2 : create a delegate reference.
            //create a delegate object and pass the function name as a parameter
            Del1 objDel = new Del1(Display);

            //step 3 : call the func via the delegate reference
            objDel();

        }
        static void Main2()
        {
            Del1 objDel = Display;
            objDel();
        }
        static void Main3()
        {
            
            Del1 objDel = Display;
            objDel();
            objDel= Show;
            objDel();
        }
        static void Main4()
        {
            Del1 objDel = Display;
            objDel();

            Console.WriteLine();
            objDel += Show;
            objDel();

            Console.WriteLine();
            objDel += Display;
            objDel();

            Console.WriteLine();
            objDel -= Display;
            objDel();

            Console.WriteLine();
            objDel -= Show;
            objDel();

            //Console.WriteLine();
            //objDel -= Display;
            //objDel();

        }
        static void Main5()
        {
            AddDel objAdd = Add;
            Console.WriteLine(objAdd(10,5));
        }
        static void Main6()
        {
            Del1 o1 = Class1.Display;
            o1();
            Class1 objClass1 = new Class1();
            o1 = objClass1.Show;
            o1();
        }
        static void Main()
        {
            Del1 objDel= (Del1) Delegate.Combine(new Del1(Display), new Del1(Show), new Del1(Display));
            objDel();
            Console.WriteLine();
            //objDel = (Del1)Delegate.Remove(objDel, new Del1(Display));
            objDel = (Del1)Delegate.RemoveAll(objDel, new Del1(Display));
            objDel();

        }
        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Show()
        {
            Console.WriteLine("Show");
        }
        static int Add(int a, int b)
        {
            return a + b; 
        } 
    }

    public class Class1
    {
        public static void Display()
        {
            Console.WriteLine("class1 Display");
        }
        public void Show()
        {
            Console.WriteLine("class1 Show");
        }
    }
}
namespace Delegates2
{

    public delegate int AddDel(int a, int b);
    internal class Program
    {
       
        static void Main()
        {
            Console.WriteLine(CallMathOperation(Add,10,5));
            Console.WriteLine(CallMathOperation(Subtract,3,2));
        }
        static int CallMathOperation(AddDel objDel, int a, int b)  //objDel = Add
        {
            return objDel(a,b);
        }

        static int Add(int a, int b)
        {
            return a + b;
        }
        static int Subtract(int a, int b)
        {
            return a - b;
        }
    }

   
}
