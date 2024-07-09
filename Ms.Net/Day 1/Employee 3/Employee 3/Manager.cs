using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Text;
using System.Threading.Tasks;


namespace Employee_3
{
    internal class Manager : Employee
    {
        private string _designation;
        public string Designation
        {
            get { return _designation; }
            set { if (!string.IsNullOrWhiteSpace(value)) _designation = value; }
        }

        private decimal _basic;
        public override decimal Basic
        {
            get
            {
                return _basic;
            }

            set
            {
                if (value > 50000 && value < 60000) // 50k to 60k manager
                    _basic = value;

                else
                {
                    Console.WriteLine("Manager salary should be between 50k to 60k");
                }
            }
        }

        public override decimal GetNetSalary()
        {
            return Basic = Basic + Basic * 1.25m;
        }

        public override decimal CalcNetSalary()
        {
            return Basic * 1.4m;
        }


        internal Manager() { }
        internal Manager(string name, short deptno, decimal basic, string designation) : base(name, deptno)
        {
            Basic = basic;
            Designation = designation;
        }
    }
}
