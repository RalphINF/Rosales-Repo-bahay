public class Schooltest {

    
        public static void main(String[] args) {
            
            Student student = new Student("Ralph", 1, "1st Year College");
            Teacher teacher = new Teacher("Sir Jayson", 2, "Inter Prog");
            Staff staff = new Staff("Sir Asher", 3, "ITSO");
    
            
            System.out.println("Student Information:");
            student.displayInfo();
            System.out.println();
    
            System.out.println("Teacher Information:");
            teacher.displayInfo();
            System.out.println();
    
            System.out.println("Staff Information:");
            staff.displayInfo();
        
    }

}
