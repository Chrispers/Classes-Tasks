import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<People> people = new ArrayList<>();
        String[] command;
        while(true){
            command = scanner.nextLine().split(" ");
            if(command[0].equals("End"))
                break;
            people.add(new People(command[0],command[1], Integer.parseInt(command[2])));
        }
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size(); j++) {
                if(people.get(i).getAge() > people.get(j).getAge()){
                    People temp = people.get(i);
                    people.set(i, people.get(j));
                    people.set(j, temp);
                }
            }
        }
        for (int i = people.size() - 1; i >= 0; i--) {
            people.get(i).getPerson();
        }
    }

    public static class People{
        String name, id;
        int age;
        public int getAge(){return this.age;}
        public People(String name, String id, int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public void getPerson(){
            System.out.println(this.name + " with ID: " + this.id +
                    " is " + this.age + " years old.");
        }
    }
}
