﻿namespace Interfaces1
{
    internal class Program
    {
        static void Main1()
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


namespace Interfaces2
{
    internal class Program
    {
        static void Main2()
        {
            Class1 o = new Class1();
            o.Insert();
            o.Update();
            o.Open();
            //o.Close()

            (o as IDbFunctions).Delete();

            IFileFunctions oIFile;
            oIFile = o;
            //oIFile.Open();
            //oIFile.Close();
            oIFile.Delete();
        }
    }
    public interface IFileFunctions
    {
        void Open();
        void Close();
        void Delete();
    }


    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }
    public class Class1 : IDbFunctions, IFileFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        void IDbFunctions.Delete()
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

        //void IFileFunctions.Open()
        //{
        //    Console.WriteLine("Ifile.open from class1");
        //}

        //void IFileFunctions.Close()
        //{
        //    Console.WriteLine("Ifile.close from class1");
        //}

        void IFileFunctions.Delete()
        {
            Console.WriteLine("Ifile.delete from class1");
        }

        public void Open()
        {
            Console.WriteLine("Ifile.open from class1");
        }

        public void Close()
        {
            Console.WriteLine("Ifile.close from class1");
        }
    }
}

namespace Interfaces3
{
    internal class Program
    {
        static void Main1()
        {
            Class1 o = new Class1();
            Class2 o2 = new Class2();
           
            //method 2
            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Insert();

            oIDb = o2;
            oIDb.Insert();


            //method 3
            ((IDbFunctions)o).Insert();

            //method 4
            (o as IDbFunctions).Insert();
        }
        static void Main()
        {
            Class1 o1 = new Class1();
            Class2 o2 = new Class2();
            InsertMethod(o1);
            InsertMethod(o2);
            Console.ReadLine();
        }

        static void InsertMethod(IDbFunctions oIDb) //can receive an object of any class that implements IDbFunctions
        {
            oIDb.Insert();
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
    public class Class2 : IDbFunctions
    {
        public void Show()
        {
            Console.WriteLine("show from class1");
        }
        public void Delete()
        {
            Console.WriteLine("idb.delete from class2");
        }
        public void Insert()
        {
            Console.WriteLine("idb.Insert from class2");
        }
        public void Update()
        {
            Console.WriteLine("idb.update from class2");
        }
    }

}

//advantages of interfaces

//contract - class MUST implement all the interface methods
//similar code in entire project for all developers
//polymorphic code
//design patterns 
