public class Schooltest {

    
        public static void main(String[] args) {
            
            Student student = new Student("Alice", 1, "10th Grade");
            Teacher teacher = new Teacher("Mr. Smith", 2, "Mathematics");
            Staff staff = new Staff("Mrs. Johnson", 3, "Administration");
    
            
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
