public class Goal {
    protected String goalName;
    protected int goalYear;
    protected int goalMonth;
    protected int goalDay;
    protected int goalBonus;

    public Goal(int year, int month, int day, String name, int bonus){
        this.goalYear = year;
        this.goalMonth = month;
        this.goalDay = day;
        this.goalName = name;
        this.goalBonus = bonus;
    }

    
}
