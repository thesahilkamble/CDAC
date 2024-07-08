using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Text;
using System.Threading.Tasks;


namespace Employee_3
{
    internal class Manager : Program.Employee
    {
        private string _designation;
        public string Designation
        {
            get { return _designation; }
            set { if (!string.IsNullOrWhiteSpace(value)) _designation = value;}
        }

        private decimal _basic;
        public override decimal Basic { get; set; }

        public override decimal GetNetSalary()
        {
            return Basic = Basic + Basic*1.25m;
        }

        Manager(string name, short deptno, decimal basic,string designation) : base(name,deptno)
            { 
            Basic = basic;
            Designation = designation;
        
        }
    }
}
