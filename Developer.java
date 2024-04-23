import java.util.ArrayList;

public class Developer extends Employee{

    private ArrayList<Technology> tech = new ArrayList<>(); 

    public Developer(String name, String surname, String city, String email, String pesel, int startDate) {
        super(name, surname, city, email, pesel, startDate); 
    }

    public void addTechnology(Technology techn){
        salary += techn.salaryBonus;
        this.tech.add(techn);
    }

    public String showKnownTechnology(){
        return this.empName + " tech stack: " + this.tech.toString();
    }

    
    
    
    

}
