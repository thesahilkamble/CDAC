namespace Arrays
{
    internal class Program
    {
        static void Main1()
        {

            int[] arr = new int[5];
            //arr[0] ...arr[4]
            for (int i = 0; i < arr.Length; i++)
            {
                //Console.WriteLine("Enter arr[" + i + "] : "); //string concatenation
                //Console.WriteLine("Enter arr[{0}] : ",i); //placeholders
                Console.Write($"Enter arr[{i}] : "); //string interpolation
                arr[i] = int.Parse(Console.ReadLine());
                //arr[i] = Convert.ToInt32(Console.ReadLine());
            }

            foreach (int item in arr)
            {
                Console.WriteLine(item);
            }
        }
        static void Main2()
        {
            int[] arr = new int[5] { 10, 20, 30, 40,50};
            int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };


            int pos = Array.IndexOf(arr, 20);
            //if(pos == -1) //not found
            pos = Array.LastIndexOf(arr, 20);
            pos = Array.BinarySearch(arr, 20);
            //if(pos < 0) //not found
            

            //Array.Clear(arr)
            //Array.Copy(arr, arr2, arr.Length);
            //Array.ConstrainedCopy(arr, 0, arr2, 0, arr.Length);
            //Array.Reverse(arr);
            //Array.Sort(arr);

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine($"The value of arr[{i}] is {arr[i]}");
            }


        }

        static void Main3()
        {
            int[,] arr = new int[3, 5];
            Console.WriteLine(arr.Rank); //2
            Console.WriteLine(arr.Length); //15
            Console.WriteLine(arr.GetLength(0)); //3
            Console.WriteLine(arr.GetLength(1)); //5
            Console.WriteLine(arr.GetUpperBound(0)); //2
            Console.WriteLine(arr.GetUpperBound(1)); //4

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.Write($"Enter arr[{i}, {j}] : ");
                    arr[i, j] = int.Parse(Console.ReadLine());
                }
            }
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine($"Value of arr[{i}, {j}] is {arr[i,j]} ");
                }
            }
        }

        static void Main4()
        {
            //jagged
            int[][] arr = new int[4][];

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    arr[i] = new int[x]
            //}

            arr[0] = new int[3]; // arr[0][0] arr[0][1] arr[0][2]
            arr[1] = new int[4]; // arr[1][0] arr[1][1] arr[1][2] arr[1][3]
            arr[2] = new int[2];//  arr[2][0] - arr [2][1]
            arr[3] = new int[3];//  arr[3][0] arr[3][1] arr[3][2]

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write("enter value for subscript [{0}][{1}] : ", i, j);
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
                Console.WriteLine();
                Console.WriteLine();
            }


            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.WriteLine("value for subscript {0},{1} is {2}  ", i, j, arr[i][j]);

                }
            }
            Console.ReadLine();
        }
        static void Main()
        {
            Employee[] arr = new Employee[5];
            arr[0] = new Employee();
            
            
            arr[0].EmpNo = 1;
            arr[0].Name = "aa";

        }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}
