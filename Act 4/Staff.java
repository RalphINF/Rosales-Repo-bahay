public class Staff extends Person {

    String dept;

    public Staff(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Department: " + dept);
    }

}
