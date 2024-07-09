using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_3
{
    internal class GeneralManager : Manager
    {
        private decimal _basic;
        public override decimal Basic
        {
            get
            {
                return _basic;
            }

            set
            {
                if (value > 60000 && value < 100000) // 60k to 1 lakh GManger
                    _basic = value;

                else
                {
                    Console.WriteLine("General Manger salary should be between 60k to 1 lakh");
                }
            }
        }

        private string? _perks;

        public string? Perks { get; set; }


        public override decimal CalcNetSalary()
        {
            return Basic * 1.2m;
        }
        
        internal GeneralManager() { }
        internal GeneralManager(string name, short deptno, decimal basic, string designation, string perks) : base(name, deptno, basic, designation)
        {
            this.Perks = _perks;
        }
    }
}
