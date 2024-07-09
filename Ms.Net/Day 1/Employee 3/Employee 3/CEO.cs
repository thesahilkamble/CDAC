﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_3
{
    internal class CEO : Employee
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
                if (value > 100000 && value < 150000) // 1 lakh to 1.5 lakh ceo
                    _basic = value;

                else
                {
                    Console.WriteLine("CEO salary should be between 1 lakh to 1.5 lakh");
                }
            }
        }


        public override decimal GetNetSalary()
        {
            throw new NotImplementedException();
        }
        public override decimal CalcNetSalary()
        {
            return Basic * 1.5m;

        }
        internal CEO() { }
        internal CEO(string name, short deptno, decimal basic) : base(name, deptno)
        {
            this.Basic = basic;
        }
    }
}
