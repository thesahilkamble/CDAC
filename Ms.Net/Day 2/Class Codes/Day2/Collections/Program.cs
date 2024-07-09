using System.Collections;

namespace Collections
{
    internal class Program
    {
        static void Main1()
        {
            ArrayList objArrayList = new ArrayList();
            objArrayList.Add("Vikram");
            objArrayList.Add(1);
            objArrayList.Add(10.3);
            objArrayList.Insert(0, "new");

            ArrayList arrayList2 = new ArrayList();
            arrayList2.Add(1);

            objArrayList.AddRange(arrayList2);
            objArrayList.InsertRange(0, arrayList2);

            Console.WriteLine(objArrayList.Count);

            objArrayList.Remove("Vikram");
            objArrayList.RemoveAt(0);
            //objArrayList.RemoveRange(start_Pos, count )

            foreach (object item in objArrayList)
            {
                Console.WriteLine(item);
            }

            //objArrayList.Clear();
            //objArrayList.Clone
            bool isPresent = objArrayList.Contains(1);
            object[] arr = new object[objArrayList.Count];
            objArrayList.CopyTo(arr);

            arrayList2 = objArrayList.GetRange(0, 3);//start, count

            //objArrayList  1 2 3 4 5 6 7 8 9 10
            //arrayList2  10 20 30 40 50
            objArrayList.SetRange(0, arrayList2);
            //objArrayList  10 20 30 40 50 6 7 8 9 10

            Console.WriteLine(objArrayList[0]);
            //Console.WriteLine(objArrayList.this[0]); //indexer

            object[] arr2 = objArrayList.ToArray();

        }
        static void Main2()
        {
            ArrayList arrayList = new ArrayList();
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(1);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(2);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(3);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(4);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(5);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(6);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(7);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(8);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");
            arrayList.Add(9);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");

            arrayList.TrimToSize();
            Console.WriteLine($"after trim count ={arrayList.Count}, capacity={arrayList.Capacity}");

            arrayList.Add(10);
            Console.WriteLine($"count ={arrayList.Count}, capacity={arrayList.Capacity}");

        }
        static void Main3()
        {
            //Hashtable objDictionary = new Hashtable();
            SortedList objDictionary = new SortedList();
            objDictionary.Add(4, "a");
            objDictionary.Add(1, "b");
            objDictionary.Add(5, "c");
            objDictionary.Add(3, "d");
            objDictionary.Add(2, "e");

            objDictionary[2] = "changed value";
            objDictionary[6] = "new value";

            objDictionary.Remove(1);//key
            objDictionary.RemoveAt(1);//index

            //objDictionary.Contains
            //objDictionary.ContainsKey
            //objDictionary.ContainsValue

            //objDictionary.GetByIndex(INDEX) --> VALUE
            //objDictionary.GetKey(INDEX) --> key
            IList keys = objDictionary.GetKeyList();
            IList values = objDictionary.GetValueList();
            //objDictionary.IndexOfKey
            //objDictionary.IndexOfValue
            ICollection keys2 = objDictionary.Keys;
            ICollection values2 = objDictionary.Values ;
            //objDictionary.SetByIndex(index, value)
            foreach (DictionaryEntry item in objDictionary)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }

        }
        static void Main4()
        {
            Stack s = new Stack();
            s.Push(1);
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue q = new Queue();
            q.Enqueue(1);
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue();


        }

        static void Main5()
        {
            List<int> list = new List<int>();
            list.Add(1);
            list.Add(2);
            foreach (int item in list)
            {
                Console.WriteLine(item);
            }
        }
        static void Main6()
        {
            List<Employee> list = new List<Employee>();
            list.Add(new Employee { EmpNo = 1, Name = "aaa" });
            list.Add(new Employee { EmpNo = 2, Name = "aaa" });
            list.Add(new Employee { EmpNo = 3, Name = "aaa" });
            foreach (Employee item in list)
            {
                Console.WriteLine(item.Name);
                Console.WriteLine(item.EmpNo);
            }
        }

        public static void Main7() 
        {
            SortedList<int, Employee> objDictionary = new SortedList<int, Employee>();
            objDictionary.Add(1, new Employee { EmpNo = 1, Name = "aaa" });

            foreach(KeyValuePair<int, Employee> item in objDictionary)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value.Name);
            }
        }

        public static void Main()
        {
            Stack<int> s = new Stack<int>();
            s.Push(1);

            Queue<int> q = new Queue<int>();    
            q.Enqueue(1);

        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}
