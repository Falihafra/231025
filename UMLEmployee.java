public class UMLEmployee extends umlperson {
    int employeeNumber;
    String Job;
    double Salary;

    public UMLEmployee() {
        super();
        employeeNumber = 1001;
        Job = "Engineer";
        Salary = 50000.0;
    }
        public UMLEmployee(String name, int age, char gender, int employeeNumber, String Job, double Salary) {
            super(name, age, gender);
            this.employeeNumber = employeeNumber;
            this.Job = Job;
            this.Salary = Salary;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getJob() {
        return Job;
    }
    public void setJob(String Job) {
        this.Job = Job;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    public void displayEmployee() {
        super.display();
        System.out.println("Nama:" + super.getName());
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Job: " + Job);
        System.out.println("Salary: " + Salary);
    }
}

    

