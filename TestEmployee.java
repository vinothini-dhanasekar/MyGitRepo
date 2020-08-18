class Program
    {
        static void Main(string[] args)
        {
            Employee[] e = new Employee[10];
            for(int i = 0; i < 10; i++)
            {
                 Console.WriteLine($"Enter the data of employee with id: {i} *****************************************");
                e[i] = new Employee();
                e[i].GetEmployeeData();
            }

            Console.WriteLine("***********The data of given employees is: ");

            for(int i = 0; i < 10; i++)
            {
                e[i].DisplayEmployee();
            }
        }
    }

/////////this is the main class for employee pragram............................................//////////////////////




            Employee[] e = new Employee[10];
            for(int i = 0; i < 10; i++)
            {
                 Console.WriteLine($"Enter the data of employee with id: {i} *****************************************");
                e[i] = new Employee();
                e[i].GetEmployeeData();
            }

            Console.WriteLine("***********The data of given employees is: ");

            for(int i = 0; i < 10; i++)
            {
                e[i].DisplayEmployee();
            }
        }
    }