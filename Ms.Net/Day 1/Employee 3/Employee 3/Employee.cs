using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_3
{
    public abstract class Employee
    {
        private static int counter = 1; // Field

        private int _empNo;
        public int EmpNo //Prperty
        {

            get
            {
                return _empNo;

            }

            set
            {
                _empNo = counter++;
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

        public abstract decimal CalcNetSalary();

        public abstract decimal GetNetSalary(); 

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

        internal Employee() { }
        internal Employee(string _name = "Default", short _deptNo = 10)
        {  // this.Property = field
            this.EmpNo = 0;
            this.Name = _name;
            this.DeptNo = _deptNo;

        }

        public void Display() => Console.WriteLine(EmpNo + " " + Name + " " + CalcNetSalary() + " " + DeptNo);

    }
}
