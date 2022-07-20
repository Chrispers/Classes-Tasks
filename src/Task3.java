import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<String>();
        List<Integer> ages = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split(" ");
            Person person = new Person(information[0], Integer.parseInt(information[1]));
            if(person.getAge() > 30){
                names.add(person.getName());
                ages.add(person.getAge());
            }
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " - " + ages.get(i) + "\n");
        }
    }

    public static class Person {
        String name;
        public String getName(){return this.name;}
        int age;
        public int getAge(){return  this.age;}
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
