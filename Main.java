public class Main {
    public static void main(String[] args) {
        
        Developer dev1 = new Developer("Karol", "Kowalski", "Warsaw", "kakowalski@gmail.com", "022530022341", 2002);
        Developer dev2 = new Developer("Karol", "Kowalski", "Warsaw", "kakowalski@gmail.com", "022530022341", 2023);

        System.out.println(dev1.getSalary());
        System.out.println(dev2.getSalary());

        Technology tech1 = new Technology("Java", 500);

        dev2.addTechnology(tech1);
        dev2.getSalary();
    }
}
