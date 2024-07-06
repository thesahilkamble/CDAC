namespace ConstructorsAndObjectInitializers
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 o = new Class1();
            Console.WriteLine(o.i);
            Class1 o2 = new Class1(10);
            Console.WriteLine(o2.i);


        }
    }
    public class Class1
    {
        public int i;
        //public Class1()
        //{
        //    Console.WriteLine("no param cons called");
        //    i = 10;
        //}
        //public Class1(int i)
        //{
        //    Console.WriteLine("int cons called");
        //    this.i = i; //this is a reference to the current object
        //}
        public Class1(int i=0)
        {
            Console.WriteLine("cons called");
            this.i = i; //this is a reference to the current object
        }

    }
}


namespace ConstructorsAndObjectInitializers2
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 o = new Class1();
            o.P1 = 10;
            o.P2 = 20;
            o.P3 = 30;

            Class1 o2 = new Class1() { P1 = 10, P2 = 20, P3 = 30 };
            Class1 o3 = new Class1{ P1 = 10, P2 = 20, P3 = 30 };
            Console.WriteLine(o.P1);

        }
    }
    public class Class1
    {
        public int P1 { get; set; }
        public int P2 { get; set; }
        public int P3 { get; set; }

    }
}
