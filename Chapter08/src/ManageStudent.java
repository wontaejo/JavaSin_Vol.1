
public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;
        
        ManageStudent ms = new ManageStudent();
        student = ms.addStudent();
        
        ms.printStudents(student);
        
    }
    
    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }
    
    public void printStudents(Student[] student) {
        for(Student data:student) {
            System.out.println(data);
        }
    }
}
