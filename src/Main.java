import model.Student;

public class Main {
    public static void main(String [] args){
        //initialize the value of the student's attribute
        Student student = new Student();
        student.setName("Jeyem");
        student.setAge(23);
        student.setGender("Male");
        student.setIdNumber("ABC12345");

        //printed all attributes
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Gender: "+student.getGender());
        System.out.println("ID NO.: "+student.getIdNumber());
    }
}
