namespace DefaultImplementationOfInterfaces1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 o = new Class1();
            //class has not implemented Select
            //with a def imp of interface, method 1 cant be used
            //o.Select(); //error

            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Select();  //def imp code will be called
        }
    }
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
        void Select()
        {
            Console.WriteLine("def imp of select");
        }
    }
    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("idb.delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("idb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("idb.update from class1");
        }
       
    }
}
namespace DefaultImplementationOfInterfaces2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            //class has implemented Select
            o.Select(); 

            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Select();  //class1 code will be called
        }
    }
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
        void Select()
        {
            Console.WriteLine("def imp of select");
        }
    }
    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("idb.delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("idb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("idb.update from class1");
        }
        public void Select()
        {
            Console.WriteLine("idb.select from class1");
        }
    }
}


namespace DefaultImplementationOfInterfaces3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            //class has explicitly implemented Select 
            //o.Select(); //method 1 will not work

            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Select();  //class1 code will be called
        }
    }
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
        void Select()
        {
            Console.WriteLine("def imp of select");
        }
    }
    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("idb.delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("idb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("idb.update from class1");
        }
        void IDbFunctions.Select()
        {
            Console.WriteLine("idb.select from class1");
        }
    }
}

