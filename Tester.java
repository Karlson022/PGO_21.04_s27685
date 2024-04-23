import java.util.ArrayList;

public class Tester extends Employee{

    ArrayList <String> testList = new ArrayList<>();
    private int testBonus = 300;

    public Tester(String name, String surname, String city, String email, String pesel, int startDate) {
        super(name, surname, city, email, pesel, startDate);
    }

    public void addTestType(String testType){
        salary += testBonus;
        this.testList.add(testType); 
    }

    public String getTestList() {
        return this.empName + " done tests :" + this.testList.toString();
    }

    public void setTestList(ArrayList<String> testList) {
        this.testList = testList;
    }

    
}
