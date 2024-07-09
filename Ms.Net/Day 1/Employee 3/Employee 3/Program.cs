namespace Employee_3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee manager = new Manager("ABC", 10, 55000, "HR Manager");
            Employee ceo = new CEO("KLM", 20, 120000);
            Employee generalmanager = new GeneralManager("XYZ", 30, 99999, "Sales Manager", "Excellent Soft Skills");

            manager.Display();
            ceo.Display();
            generalmanager.Display();

        }
    }
}
