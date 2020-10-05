import model.Student;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String [] args){
        Student student = new Student();
        student.setName("Jeyem");
        student.setAge(23);
        student.setGender("Male");
        student.setIdNumber("ABC12345");

        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Gender: "+student.getGender());
        System.out.println("ID NO.: "+student.getIdNumber());
    }
}
