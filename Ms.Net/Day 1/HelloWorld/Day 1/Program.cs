
// using System;
// global using System;

using System.ComponentModel;
using System.Runtime.InteropServices;

namespace Day_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
        }


            public string AddBinary(string a, string b)
            {

                return Convert.ToString((Convert.ToUInt64(a, 2) + Convert.ToUInt64(b, 2)), 2);




            }
    }


    }

    //public class Class1
    //{
    //    public int add(int a, int b)
    //    {
    //           return Int32.Parse("" +a + b) ;

             
    //    }
    //}
   
}

