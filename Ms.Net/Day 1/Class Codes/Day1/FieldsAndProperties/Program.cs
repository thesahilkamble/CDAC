namespace FieldsAndProperties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //int i;//local variable
            //Console.WriteLine(i);//error - unassigned

            Class1 o = new Class1();
            //o.i = 1000;
            //o.i = ++o.i + o.i++ - --o.i - o.i--;


            //o.SetI(1000);
            //Console.WriteLine(o.GetI());

            o.Prop1 = 1000;  //set
            Console.WriteLine(o.Prop1);  //get

            o.Prop4 = 1000;
            Console.WriteLine(o.Prop4);
        }
    }
    public class Class1
    {
        //private int i; //field
        //public void SetI(int VALUE)
        //{
        //    if(VALUE <100)
        //        i = VALUE;
        //    else
        //        Console.WriteLine("invalid value");
        //}
        //public int GetI() 
        //{ 
        //    return i; 
        //}
        private int prop1;

        //why properties- validation
        public int Prop1
        {
            set 
            { 
                if(value <100)
                    prop1 = value;
                else
                    Console.WriteLine("invalid value");
            }
            get 
            {
                return prop1;
            }
        }
        private string prop2;
        public string Prop2
        {
            set 
            { 
                prop2 = value;
            }
            get 
            { 
                return prop2;
            }  
        }
        public string Prop3;

        //automatic property //auto
        //no validations
        //compiler generates code for get and set
        //compiler generates private variable
        public int Prop4 { get; set; }

        //TO DO
        //READONLY PROPERTY
        //ONLY GET, NO SET

    }
}
