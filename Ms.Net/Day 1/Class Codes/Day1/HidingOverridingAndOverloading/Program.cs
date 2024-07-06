namespace HidingOverridingAndOverloading
{
    internal class Program
    {
        static void Main1()
        {
            DerivedClass obj = new DerivedClass();
            obj.Display1();
            obj.Display1("a");

            obj.Display2();
            obj.Display3();
        }
        static void Main()
        {
            BaseClass o;
            o = new BaseClass();
            o.Display2();  //non virtual, early bound, depend on how reference has been declared
            o.Display3();  //virtual, late bound, depend on which object it is pointing to

            Console.WriteLine();
            o = new DerivedClass();
            o.Display2();  //non virtual, early bound, depend on how reference has been declared
            o.Display3();  //virtual, late bound, depend on which object it is pointing to

            Console.WriteLine();
            o = new SubDerivedClass();
            o.Display2();  //non virtual, early bound, depend on how reference has been declared
            o.Display3();  //virtual, late bound, depend on which object it is pointing to
            
            Console.WriteLine();
            o = new SubSubDerivedClass();
            o.Display2();  //non virtual, early bound, depend on how reference has been declared
            o.Display3();  //virtual, late bound, depend on which object it is pointing to



        }
    }
    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("base display1");
        }
        public void Display2()
        {
            Console.WriteLine("base display2");
        }
        public virtual void Display3()
        {
            Console.WriteLine("base display3");
        }
    }
    public class DerivedClass : BaseClass
    {
        public void Display1(string s)
        {
            Console.WriteLine("derived display1" + s);
        }
        public new void Display2()
        {
            Console.WriteLine("derived display2");
        }
        public override void Display3()
        {
            Console.WriteLine("derived display3");
        }
    }
    public class SubDerivedClass : DerivedClass
    {
        public sealed override void Display3()
        {
            Console.WriteLine("subderived display3");
        }
    }
    public class SubSubDerivedClass : SubDerivedClass
    {

        public new void Display3()
        {
            Console.WriteLine("subsubderived display3");
        }
    }
}
