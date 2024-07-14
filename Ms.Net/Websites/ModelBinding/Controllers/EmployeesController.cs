using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using ModelBinding.Models;

namespace ModelBinding.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: EmployeesController
        //http://localhost:1234/Employees/Index
        public ActionResult Index()
        {
            List<Employee> employees = new List<Employee>();
            employees.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 12345, DeptNo = 10 });
            employees.Add(new Employee { EmpNo = 2, Name = "Shweta", Basic = 22345, DeptNo = 20 });
            employees.Add(new Employee { EmpNo = 3, Name = "Ananya", Basic = 32345, DeptNo = 30 });
            employees.Add(new Employee { EmpNo = 4, Name = "Harsh", Basic = 42345, DeptNo = 40 });

            return View(employees);
        }

        // GET: EmployeesController/Details/5
        //http://localhost:1234/Employees/Details/1
        public ActionResult Details(int id=1)
        {
            Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Vikram";
            obj.DeptNo = 10;
            obj.Basic = 12345;
            return View(obj);
        }

        // GET: EmployeesController/Create
        //http://localhost:1234/Employees/Create
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }

        // POST: EmployeesController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Employee obj)
        {
            try
            {
               
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
        //public ActionResult Create(int EmpNo, string Name, decimal Basic, int DeptNo)
        //{
        //    try
        //    {

        //        return RedirectToAction(nameof(Index));
        //    }
        //    catch
        //    {
        //        return View();
        //    }
        //}
        ////public ActionResult Create(IFormCollection collection)
        //{
        //    try
        //    {
        //        string Name = collection["Name"];
        //        string EmpNo = collection["EmpNo"];
        //        string Basic = collection["Basic"];
        //        string DeptNo = collection["DeptNo"];

        //        return RedirectToAction(nameof(Index));
        //    }
        //    catch
        //    {
        //        return View();
        //    }
        //}


        // GET: EmployeesController/Edit/5

        //http://localhost:1234/Employees/Edit/1
        public ActionResult Edit(int id=1)
        {

            Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Vikram";
            obj.DeptNo = 10;
            obj.Basic = 12345;
            return View(obj);
        }

        // POST: EmployeesController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id,Employee obj)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Delete/5
        public ActionResult Delete(int id=1)
        {
            Employee obj = new Employee();
            obj.EmpNo = id;
            obj.Name = "Vikram";
            obj.DeptNo = 10;
            obj.Basic = 12345;
            return View(obj);
        }

        // POST: EmployeesController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(IFormCollection collection, int id = 1)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
