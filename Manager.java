import java.util.ArrayList;

public class Manager extends Employee{

    private ArrayList <Goal> goalList = new ArrayList<>();

    public Manager(String name, String surname, String city, String email, String pesel, int startDate) {
        super(name, surname, city, email, pesel, startDate);
    }

    
}
