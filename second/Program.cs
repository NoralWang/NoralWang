using System;

using System.Collections.Generic;

using System.Linq;

using System.Text;



namespace sorter

{ 
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = ReadArray();
            int[] newarray = SquareArray(array);
            EbullitionSorter selSor = new EbullitionSorter();
            selSor.Sort(newarray);
            
        }
        private static int[] ReadArray()
        {
            Console.WriteLine("Enter number if Element ");
            string line = Console.ReadLine();
            int count = Int32.Parse(line);

            int[] array = new int[count];
            for (int i = 0; i <count; i++)
            {
                Console.WriteLine("Enter Element " + i);
                string current = Console.ReadLine();
                array[i] = Int32.Parse(current);
            }
            return array;
        }

        private static int[] SquareArray(int[] array)
        {
            int len = array.Length;
            int[] newarray = new int[len];
            for (int i = 0; i < len; i++)
            {
                int current = Convert.ToInt32(Math.Pow(array[i],2));
                newarray[i] = Convert.ToInt32(current);
                Console.WriteLine("newarray Element " + newarray[i]);
            }
            return newarray;
        }

    }
    public class EbullitionSorter
    {
        public void Sort(int[] arr)
        {
            int i, j=1, temp;
            bool done = false;
            while ((j < arr.Length) && (!done))  // 判断长度 
            {
                done = true;
                for (i = 0; i < arr.Length - j; i++)
                {
                    if (arr[i] > arr[i + 1])
                    {
                        done = false;
                        temp = arr[i];
                        arr[i] = arr[i + 1]; // 交换数据 
                        arr[i + 1] = temp;
                    }
                }
                j++;
            }
            foreach (int l in arr)
            {
                Console.WriteLine(l);
            }
            Console.ReadKey();
        }
    }

} 
