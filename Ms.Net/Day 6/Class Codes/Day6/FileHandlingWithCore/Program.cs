namespace FileHandlingWithCore
{
    internal class Program
    {
        static void Main()
        {
            SaveToTextFile();
            ReadFromTextFile();
        }

        private static void SaveToTextFile()
        {
            //string s = "Hello World";

            //byte[] arr = Encoding.Default.GetBytes(s);


            //FileStream stream = File.Open("C:\\aaaa\\a.txt", FileMode.Create);

            //stream.Write(arr, 0, arr.Length);
            ////stream.Length
            ////stream.Read

            //stream.Close();










            //-------------------------------
            StreamWriter writer = File.CreateText("C:\\aaaa\\a.txt");
            writer.WriteLine("Hello World");
            writer.WriteLine("Line 2");
            writer.Close();


        }

        private static void ReadFromTextFile()
        {
            string s;
            StreamReader reader = File.OpenText("C:\\aaaa\\a.txt");
            while ((s = reader.ReadLine()) != null)
            {
                Console.WriteLine(s);
            }
            reader.Close();
        }

    }
}
