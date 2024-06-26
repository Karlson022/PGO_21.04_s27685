package Project;
public class Employee {
    
    protected String empName;
    protected String empSurname;
    protected String empCity;
    protected String empEmail;
    protected String empPesel;
    protected int empStartDate;
    protected int baseSalary = 3000;
    protected int currentYear = 2024;
    protected int salary;
    

    public Employee(String name, String surname, String city, String email, String pesel, int startDate){
        this.empName = name;
        this.empSurname = surname;
        this.empCity = city;
        this.empEmail = email;
        this.empPesel = pesel;
        this.empStartDate = startDate;
        this.salary = this.baseSalary + ((this.currentYear - startDate)*1000);
    }

    public int getSalary() {
        return salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPesel() {
        return empPesel;
    }

    public void setEmpPesel(String empPesel) {
        this.empPesel = empPesel;
    }

    public int getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(int empStartDate) {
        this.empStartDate = empStartDate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    
}
