using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_3
{
    internal class CEO : Program.Employee
    {
        public override decimal Basic { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }

        public override decimal GetNetSalary()
        {
            throw new NotImplementedException();
        }

        CEO(string name, short deptno, decimal basic) : base(name, deptno)
        { 
        }   
    }
}
