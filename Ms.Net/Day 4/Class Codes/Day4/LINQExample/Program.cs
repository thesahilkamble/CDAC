﻿using System.Diagnostics;

namespace LINQExample1
{
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vishal", Basic = 11000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }
        static void Main1()
        {
            AddRecs();
            //var returnvalue = from single_object in collection select some_object
            var emps = from emp in lstEmp select emp;
            //IEnumerable<Employee> emps = from emp in lstEmp select emp;

            foreach (var item in emps)
            {
                Console.WriteLine(item.Name);
            }
        }
        static void Main2()
        {
            AddRecs();
            //var returnvalue = from single_object in collection select some_object
            // var emps = from emp in lstEmp select emp.Name;
            var emps = from emp in lstEmp select emp.EmpNo;
            //IEnumerable<Employee> emps = from emp in lstEmp select emp;

            foreach (var item in emps)
            {
                Console.WriteLine(item);
            }
        }
        static void Main3()
        {
            AddRecs();
            //var returnvalue = from single_object in collection select some_object
            //var emps = from emp in lstEmp select (emp.EmpNo, emp.Name);
            var emps = from emp in lstEmp select new { emp.EmpNo, emp.Name };

            foreach (var item in emps)
            {
                Console.WriteLine(item.Name);
            }
        }

        static void Main4()
        {
            AddRecs();
            var emps = from emp in lstEmp
                       where emp.Basic > 10000
                       select emp;

            //var emps = from emp in lstEmp
            //           where emp.Basic > 10000 && emp.Basic < 12000
            //           select emp;

            //var emps = from emp in lstEmp
            //           where emp.Name.StartsWith("V")
            //           select emp;
            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }

            Console.ReadLine();

        }
        static void Main5()
        {
            AddRecs();


            //var emps = from emp in lstEmp
            //               //where emp.Basic > 10000
            //           orderby emp.Name
            //           select emp;
            //var emps = from emp in lstEmp
            //           orderby emp.Name descending
            //           select emp;

            var emps = from emp in lstEmp
                       orderby emp.DeptNo ascending, emp.Name descending
                       select emp;


            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }

            Console.ReadLine();

        }
        static void Main6()
        {
            AddRecs();


            var emps0 = from emp in lstEmp
                       join dept in lstDept
                             on emp.DeptNo equals dept.DeptNo
                       select emp;






            var emps = from emp in lstEmp
                       join dept in lstDept
                             on emp.DeptNo equals dept.DeptNo
                       select emp;

            var emps1 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select dept;

            var emps2 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select new { emp, dept };

            var emps3 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select new { emp.Name, dept.DeptName };
            foreach (var item in emps2)
            {
                Console.WriteLine(item.emp.Name);
                Console.WriteLine(item.dept.DeptName);
            }
            foreach (var item in emps3)
            {
                Console.WriteLine(item.Name);
                Console.WriteLine(item.DeptName);

            }
            Console.ReadLine();
        }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
}
namespace LINQExample2
{
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });




            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vishal", Basic = 11000, DeptNo = 10, Gender = "M" });

            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });

            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });

            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }

        static Employee GetEmployee(Employee obj)
        {
            return obj;
        }
        static void Main1()
        {
            AddRecs();
            //var emps = from emp in lstEmp select emp;
            //var emps1 = lstEmp.Select(GetEmployee);  //function
            var emps2 = lstEmp.Select(delegate(Employee obj)
            {
                return obj;
            });
            var emps3 = lstEmp.Select(obj => obj);

            foreach (var item in emps3)
            {
                Console.WriteLine(item.Name);
            }
        }
        static string GetEmployeeName(Employee obj)
        {
            return obj.Name;
        }
        static void Main2()
        {
            AddRecs();
            //var emps = from emp in lstEmp select emp.Name;
            var emps1 = lstEmp.Select(GetEmployeeName);
            var emps2 = lstEmp.Select(delegate(Employee obj)
            {
                return obj.Name;
            });
            var emps3 = lstEmp.Select(obj => obj.Name);

            //var emps = from emp in lstEmp select emp.EmpNo;

            foreach (var item in emps3)
            {
                Console.WriteLine(item);
            }
        }
        static void Main3()
        {
            AddRecs();
            //var returnvalue = from single_object in collection select some_object
            //var emps = from emp in lstEmp select (emp.EmpNo, emp.Name);
            var emps = from emp in lstEmp select new { emp.EmpNo, emp.Name };

            var emps2 = lstEmp.Select(delegate (Employee obj)
            {
                return new { obj.EmpNo, obj.Name };
            });

            var emps3 = lstEmp.Select(obj => new { obj.EmpNo, obj.Name });
            foreach (var item in emps3)
            {
                Console.WriteLine(item.Name);
            }
        }
        static bool IsBasicGreaterThan10000(Employee obj)
        {
            return obj.Basic > 10000;
        }
        static void Main4()
        {
            AddRecs();
            //var emps = from emp in lstEmp
            //           where emp.Basic > 10000
            //           select emp;
            //var emps = lstEmp.Where(IsBasicGreaterThan10000);
            //var emps2a = lstEmp.Where(obj => obj.Basic > 10000);
            //var emps2b = lstEmp.Where(obj => obj.Basic > 10000).Select(obj => obj);
            //var emps2c = lstEmp.Select(obj => obj).Where(obj => obj.Basic > 10000);



            //var emps3b = lstEmp.Where(obj => obj.Basic > 10000).Select(obj => obj.Name);
            //error        //var emps3c = lstEmp.Select(obj => obj.Name).Where(obj => obj.Basic > 10000);

            //var emps4b = lstEmp.Where(obj => obj.Basic > 10000).Select(obj => obj.Basic);
            //////var emps4c = lstEmp.Select(obj => obj.Basic).Where(obj => obj.Basic > 10000);
            //var emps4d = lstEmp.Select(obj => obj.Basic).Where(obj => obj > 10000);

            //foreach (var emp in emps)
            //{
            //    Console.WriteLine(emp);
            //}

            Console.ReadLine();

        }
        static void Main5()
        {
            AddRecs();


            //var emps = from emp in lstEmp
            //               //where emp.Basic > 10000
            //           orderby emp.Name
            //           select emp;
            var emp2 = lstEmp.OrderBy(obj => obj.Name);


            //var emps = from emp in lstEmp
            //           orderby emp.Name descending
            //           select emp;
            var emp3 = lstEmp.OrderByDescending(obj => obj.Name);

            var emps = from emp in lstEmp
                       orderby emp.DeptNo ascending, emp.Name descending
                       select emp;
            var emps4 = lstEmp.OrderBy(obj=>obj.DeptNo).ThenByDescending(obj => obj.Name);

            foreach (var emp in emps4)
            {
                Console.WriteLine(emp);
            }

            Console.ReadLine();

        }
        static void Main6()
        {
            AddRecs();


            var emps0 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select emp;

            //var emps0 = from  in 
            //            join  in 
            //                  on  equals 
            //            select emp;

            // List<Department><---- lstDept ---> IEnumerable<TInner>
            //TInner- Department

            var emps2 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp, dept });
            var emps3= lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp.Name, dept.DeptName });

           
            foreach (var item in emps2)
            {
                Console.WriteLine(item.emp.Name);
                Console.WriteLine(item.dept.DeptName);
            }
            foreach (var item in emps3)
            {
                Console.WriteLine(item.Name);
                Console.WriteLine(item.DeptName);

            }
            Console.ReadLine();
        }
        //deferred execution
        static void Maindef()
        {
            AddRecs();
            var emps = from emp in lstEmp select emp;

            Console.WriteLine();
            lstEmp.RemoveAt(0);

            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();


            Console.WriteLine();
            lstEmp.Add(new Employee { EmpNo = 9, Name = "New", Basic = 11000, DeptNo = 40, Gender = "F" });
            foreach (var emp in emps)
            {

                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
        }
        //immediate execution
        static void MainImm()
        {
            AddRecs();
            var emps = from emp in lstEmp select emp;
            //var emps = (from emp in lstEmp select emp).ToList();

            //immediate execution
            emps = emps.ToList();  //.ToArray .ToDictionary
            //Employee [] arrEmps = emps.ToArray();
            //Dictionary<int, Employee> d = emps.ToDictionary(e => e.EmpNo);

            Console.WriteLine();
            lstEmp.RemoveAt(0);
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
            Console.WriteLine();
            lstEmp.Add(new Employee { EmpNo = 9, Name = "New", Basic = 11000, DeptNo = 40, Gender = "F" });
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
        }
        //Single
        static void Mainsingle()
        {
            AddRecs();
            Employee emp = lstEmp.Single(e => e.EmpNo == 1); //one record = okay
            //Employee emp = lstEmp.Single(e => e.EmpNo == 10);  //no records = error
            //Employee emp = lstEmp.Single(e => e.Basic > 5000); //multiple records - error


            //Employee emp = lstEmp.SingleOrDefault(e => e.EmpNo == 1); //one record = okay
            //Employee emp = lstEmp.SingleOrDefault(e => e.EmpNo == 10); //no records=null
            //Employee emp = lstEmp.SingleOrDefault(e =>  e.Basic > 5000);//multiple records - error

            if (emp != null)
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            else
                Console.WriteLine("not found");
            Console.ReadLine();
        }

        //simple group
        static void Maingroup()
        {
            AddRecs();
            var emps = from emp in lstEmp
                       group emp by emp.DeptNo;
            foreach (var item in emps)
            {
                Console.WriteLine(item.Key); //deptno
                foreach (var e in item)  //e is an Employee, item is a grouping of Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }
            Console.ReadLine();
        }

        //group with name
        static void Maingroupname()
        {
            AddRecs();
            var emps = from emp in lstEmp
                       group emp by emp.DeptNo into group1
                       select group1;


            foreach (var item in emps)
            {
                Console.WriteLine(item.Key); //deptno
                foreach (var e in item)  //e is an Employee, item is a grouping of Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }

            Console.ReadLine();
        }

        //group with properties
        static void Maingrpprop()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       group emp by emp.DeptNo into group1
                       select new { group1, Count = group1.Count(), Max = group1.Max(x => x.Basic), Min = group1.Min(x => x.Basic) };


            foreach (var item in emps)
            {
                Console.WriteLine(item.group1.Key); //DeptNo
                Console.WriteLine(item.Count); //count
                Console.WriteLine(item.Min); //min
                Console.WriteLine(item.Max); //max
                //emp.group1.Key;  //DeptNo

                foreach (var e in item.group1)  //e is an Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }

            Console.ReadLine();

        }
        //plinq
        static void Main()
        {
            //AddRecs();
            AddRecs2();
            //plinq example

            Stopwatch stopwatch = new Stopwatch();

            stopwatch.Start();
            //var emps = lstEmp.Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            //var emps = lstEmp.AsParallel().WithDegreeOfParallelism(2).Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            //var emps = lstEmp.AsParallel().Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            var emps = lstEmp.AsParallel().AsOrdered().Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            //var emps = lstEmp.AsParallel().AsOrdered().WithDegreeOfParallelism(2).Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });

            //var emps2 = lstEmp.AsParallel();

            //Console.WriteLine("Elapsed Time is {0} ms", stopwatch.ElapsedMilliseconds);
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            stopwatch.Stop();
            Console.WriteLine("Elapsed Time is {0} ms", stopwatch.ElapsedMilliseconds);


        }
        public static void AddRecs2()
        {
            for (int i = 0; i < 200; i++)
            {
                lstEmp.Add(new Employee { EmpNo = i + 1, Name = "Vikram" + i, Basic = 10000, DeptNo = 10, Gender = "M" });
            }
        }
        public static string LongRunningFunc(string s)
        {
            System.Threading.Thread.Sleep(10);
            return s.ToUpper();
        }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
}