import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] article = scanner.nextLine().split(", ");
        Article art = new Article(article[0], article[1], article[2]);
        int n = Integer.parseInt(scanner.nextLine());
        String[] command;
        for (int i = 0; i < n; i++) {
            command = scanner.nextLine().split(": ");
            if(command[0].equals("Edit")){
                art.editContent(command[1]);
            }else if(command[0].equals("ChangeAuthor")){
                art.changeAuthor(command[1]);
            }else if(command[0].equals("Rename")){
                art.renameTitle(command[1]);
            }
        }
        art.ToString();
    }

    public static class Article {
        String title, content, author;
        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void editContent(String content){
            this.content = content;
        }
        public void changeAuthor(String author){
            this.author  =author;
        }
        public void renameTitle(String title){
            this.title = title;
        }
        public void ToString(){
            System.out.println(this.title + " - " + this.content + ": " + this.author);
        }
    }
}

