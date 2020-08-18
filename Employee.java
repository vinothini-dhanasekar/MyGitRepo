class Employee
    {
        public string name;
        public int salary;
        public int joiningDate;

        public Employee()
        {

        }

        public Employee(string name, int salary, int joiningDate)
        {
            this.name = name;
            this.salary = salary;
            this.joiningDate = joiningDate;
        }

        public void GetEmployeeData()
        {
            {
                Console.WriteLine("Enter the name of employee: ");
                name = Convert.ToString(Console.ReadLine());
                Console.WriteLine("Enter the salary of employee: ");
                salary = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the date of joining of employee: ");
                joiningDate = Convert.ToInt32(Console.ReadLine());
            }
        }

        public void DisplayEmployee()
        {
            Console.WriteLine("The name of employee is: "+ name);
            Console.WriteLine("The salary of employee is: "+salary);
            Console.WriteLine("The date of joining of employee is: "+joiningDate);
        }
    }
	}
	
	/////////this is the program for employee details.......................................main method in another java file........................../////////////