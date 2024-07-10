namespace ThreadingExamples
{
    internal class Program
    {
        static void Main0()
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            t1.Start();

            Thread t2 = new Thread(Func2);
            t2.Start();

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Main : " + i);
            }

        }

        static void Main1()
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            t1.IsBackground =true;
            t1.Start();

            Thread t2 = new Thread(Func2);
            t2.IsBackground = true;
            t2.Start();

            for (int i = 0; i < 1; i++)
            {
                Console.WriteLine("Main : " + i);
            }

        }
        static void Main2()
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            t1.Start();

            Thread t2 = new Thread(Func2);
            t2.Start();

            for (int i = 0; i < 1; i++)
            {
                Console.WriteLine("Main : " + i);
            }
            t1.Join(); //wait for t1 to finish 
            Console.WriteLine("this code should run only after Func1(t1) is over");
        }
        static void Main3()
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            t1.Priority = ThreadPriority.Highest;
            t1.Start();

            Thread t2 = new Thread(Func2);
            t2.Priority = ThreadPriority.Lowest;

            t2.Start();

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Main : " + i);
            }

        }

        static void Main()
        {
            Thread t1 = new Thread(new ThreadStart(Func1));
            Thread t2 = new Thread(Func2);

            //if(t1.ThreadState == ThreadState.)

            t1.Start();
            //t1.Start();

            //t1.Abort();
            //t1.Suspend();
            //t1.Resume();



            t2.Start();

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Main : " + i);
                Thread.Sleep(5000);
            }
        }
        static void Func1()
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("First : " + i);
                //Console.WriteLine("First : "  + Thread.CurrentThread.ManagedThreadId );
                Thread.Sleep(5000);
            }

        }
        static void Func2()
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Second : " + i);
                Thread.Sleep(5000);

            }

        }
    }
}
