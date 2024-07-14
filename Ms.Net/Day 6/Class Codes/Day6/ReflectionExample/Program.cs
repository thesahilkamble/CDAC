using System.Collections;
using System.Reflection;
namespace ReflectionExample
{
    internal class Program
    {
        //asm1 ---> asm2  ----> asm3 ----> asm4
        static void Main()
        {
            //Assembly assembly = Assembly.GetExecutingAssembly();
            //Assembly assembly2 = Assembly.GetCallingAssembly();
            //Assembly assembly3 = Assembly.GetEntryAssembly();
            //Assembly assembly4 = Assembly.GetAssembly(typeof(int));
            Assembly assembly = Assembly.LoadFile(@"D:\Trainings\ActsJuly2024\Day1\ClassBasics\bin\Debug\net8.0\ClassBasics.dll");
            //Console.WriteLine(assembly.FullName);
            Console.WriteLine(assembly.GetName().Name);
            Type[] arrTypes = assembly.GetTypes();
            foreach (Type t in arrTypes)
            {
                Console.WriteLine("   "+t.Name);
                MethodInfo[] arrMethods = t.GetMethods();
                foreach (MethodInfo m in arrMethods)
                {
                    Console.WriteLine("      " + m.Name);
                }
         
            }
        }
    }
}
/*
 AssemblyName
    Class1
	Method1
	    Parameter1
	    Parameter2
	    Parameter3
	Method2
	Method3
    Class2
    Class3

 */