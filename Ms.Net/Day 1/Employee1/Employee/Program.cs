using System.Xml.Linq;

namespace Employee
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Hello, World!");
            Employee o1 = new Employee(1, "Amol", 123465, 10);
            Employee o2 = new Employee(1, "Amol", 123465);
            Employee o3 = new Employee(1, "Amol");
            Employee o4 = new Employee(1);
            Employee o5 = new Employee();

    
            o1.Display();
            o2.Display();
            o3.Display();
            o4.Display();
            o5.Display();

        }

        public class Employee
        {
            private int _empNo; // Field
            public int EmpNo //Prperty
            {

                get
                {
                    return _empNo;

                }

                set
                {
                    if (value > 0) _empNo = value;
                }
            }

            private string _name;
            public string Name
            {
                get
                {
                    return _name;
                }
                set
                {
                    if (!string.IsNullOrWhiteSpace(value))

                        _name = value;
                    else
                        System.Console.WriteLine("Name should not be empty");
                }
            }

            private decimal _basic;
            public decimal Basic
            {
                get
                {
                    return _basic;
                }

                set
                {
                    if (value > 1000 && value < 2000000)
                        _basic = value;

                    else {
                        Console.WriteLine("Salary should be between 1000 to 2000000");
                    }
                }
            }

            private short _deptNo;
            public short DeptNo
            {
                set
                {
                    if (value > 0) _deptNo = value;
                }
                get
                {
                    return _deptNo;
                }
            }

            public Employee(int _empNo = 1, string _name = "Default", decimal _basic = 1001, short _deptNo = 10)
            {

                this.EmpNo = _empNo;  // this.Property = field
                this.Name = _name;
                this.Basic = _basic;
                this.DeptNo = _deptNo;

            }

            public decimal GetNetSalary() => Basic + Basic * 1.5m; // for showing it is a decimal number

            //public override string ToString()
            //{
            //    return  EmpNO.ToString(),  DeptNo.ToString();
            //}

            public void Display() => Console.WriteLine(EmpNo +" "+ Name + " " + Basic + " " + DeptNo);


        }
    }
}
