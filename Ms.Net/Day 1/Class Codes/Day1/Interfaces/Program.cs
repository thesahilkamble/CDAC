namespace Interfaces
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            //method 1
            o.Insert();
            o.Display();

            //method 2
            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Insert();

            //method 3
            ((IDbFunctions)o).Insert();

            //method 4
            (o as IDbFunctions).Insert();

        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }
    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("IDb.Delete from class1");
        }

        public void Insert()
        {
            Console.WriteLine("IDb.Insert from class1");
        }

        public void Update()
        {
            Console.WriteLine("IDb.update from class1");
        }
    }
}
