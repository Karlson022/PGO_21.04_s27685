package Project;
public class Technology {
    protected String techName;
    protected int salaryBonus;

    public Technology(String name, int bonus){
        this.techName = name;
        this.salaryBonus = bonus;
    }

    @Override
    public String toString() {
        return this.techName;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    

    
}
