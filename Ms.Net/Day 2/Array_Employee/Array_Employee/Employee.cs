using System;

namespace Array_Employee
{
    public class Employee
    {
        private int _empNo; // Field
        public int EmpNo // Property
        {
            get { return _empNo; }
            set
            {
                if (value > 0)
                    _empNo = value;
            }
        }

        private string _name;
        public string Name
        {
            get { return _name; }
            set
            {
                if (!string.IsNullOrWhiteSpace(value))
                    _name = value;
                else
                    Console.WriteLine("Name should not be empty");
            }
        }

        private decimal _basic;
        public decimal Basic
        {
            get { return _basic; }
            set
            {
                if (value >= 1000 && value <= 2000000)
                    _basic = value;
                else
                    Console.WriteLine("Salary should be between 1000 to 2000000");
            }
        }

        private short _deptNo;
        public short DeptNo
        {
            get { return _deptNo; }
            set
            {
                if (value > 0)
                    _deptNo = value;
            }
        }

        public Employee(int empNo = 1, string name = "Default", decimal basic = 1001, short deptNo = 10)
        {
            EmpNo = empNo;
            Name = name;
            Basic = basic;
            DeptNo = deptNo;
        }

        public decimal GetNetSalary() => Basic + Basic * 1.5m;

        public void Display() => Console.WriteLine($"{EmpNo} {Name} {Basic} {DeptNo}");

        public override string ToString() => $"Id: {EmpNo}, Name: {Name}, Basic Salary: {Basic}, Department Number: {DeptNo}";
    }
}
