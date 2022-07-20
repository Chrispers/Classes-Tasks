import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student student = new Student(input[0], input[1], Double.parseDouble(input[2]));
            students.add(student);
        }
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size(); j++) {
                if(students.get(i).getGrade() < students.get(j).getGrade()){
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        for (int i = students.size() - 1; i >= 0 ; i--) {
            students.get(i).printStudent();
        }
    }

    public static class Student{
        String name, surname;
        public String getName(){return this.name;}
        public String getSurname(){return this.surname;}
        double grade;
        public double getGrade(){return this.grade;}
        public Student(String name,String surname,double grade){
            this.name = name;
            this.surname = surname;
            this.grade = grade;
        }

        public void printStudent(){
            System.out.printf(this.name + " " + this.surname + ": " + "%.2f" + "\n", this.grade);
        }
    }
}
