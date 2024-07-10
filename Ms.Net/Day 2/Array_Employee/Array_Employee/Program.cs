using System;

namespace Array_Employee
{
    internal class Program
    {
        private const int EXIT = 0;
        private const int ADD_EMPLOYEE = 1;
        private const int HIGHEST_SALARY = 2;
        private const int SEARCH_EMPLOYEE = 3;

        static void Main()
        {
            Employee[] employees = new Employee[10];
            int count = 0;

            int choice;

            while ((choice = MenuList()) != EXIT)
            {
                try
                {
                    switch (choice)
                    {
                        case ADD_EMPLOYEE:
                            AddEmployee(employees, ref count);
                            break;

                        case HIGHEST_SALARY:
                            Console.WriteLine(EmployeeWithHighestSalary(employees, count));
                            break;

                        case SEARCH_EMPLOYEE:
                            Console.WriteLine(SearchEmployees(employees, count));
                            break;

                        default:
                            Console.WriteLine("Invalid choice. Please try again.");
                            break;
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.ToString());
                }
            }
        }

        static int MenuList()
        {
            Console.WriteLine("0. EXIT");
            Console.WriteLine("1. Add Employee");
            Console.WriteLine("2. Employee with Highest Salary");
            Console.WriteLine("3. Search Employee by id");
            Console.Write("Enter Choice: ");
            return Convert.ToInt32(Console.ReadLine());
        }

        static void AddEmployee(Employee[] employees, ref int count)
        {
            if (count >= employees.Length)
            {
                Console.WriteLine("Employee array is full. Cannot add more employees.");
                return;
            }

            Console.Write("Enter Employee Id: ");
            int id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Employee Name: ");
            string name = Console.ReadLine();

            Console.Write("Enter Basic Salary : ");
            decimal basic = Convert.ToDecimal(Console.ReadLine());

            Console.Write("Enter Department Number : ");
            short deptno = Convert.ToInt16(Console.ReadLine());

            employees[count++] = new Employee(id, name, basic, deptno);
        }

        static Employee EmployeeWithHighestSalary(Employee[] employees, int count)
        {
            if (count < 1)
                throw new ArgumentException("Employee array is empty");

            decimal maxSalary = decimal.MinValue;
            int index = -1;
            for (int i = 0; i < count; i++)
            {
                if (employees[i].Basic > maxSalary)
                {
                    maxSalary = employees[i].Basic;
                    index = i;
                }
            }
            return employees[index];
        }

        static Employee SearchEmployees(Employee[] employees, int count)
        {
            if (count < 1)
                throw new ArgumentException("Employee array is empty");

            Console.Write("Enter Employee Id to search: ");
            int empId = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < count; i++)
            {
                if (employees[i].EmpNo == empId)
                {
                    return employees[i];
                }
            }
            throw new ArgumentException($"Employee with Id {empId} not found.");
        }
    }
}
