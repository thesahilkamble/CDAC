namespace Employee_3
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

        public abstract class Employee
        {
            private int _empNo=1; // Field
            public int EmpNo //Prperty
            {

                get
                {
                    return _empNo++;

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


            public abstract decimal Basic { get; set; }


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

            public Employee(string _name = "Default", short _deptNo = 10)
            {  // this.Property = field
                this.Name = _name;
                this.DeptNo = _deptNo;

            }

            public abstract decimal GetNetSalary(); // for showing it is a decimal number

            //public override string ToString()
            //{
            //    return  EmpNO.ToString(),  DeptNo.ToString();
            //}

            public void Display() => Console.WriteLine(EmpNo + " " + Name + " " + Basic + " " + DeptNo);


        }
    }
}
