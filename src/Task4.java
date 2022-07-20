import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] article = scanner.nextLine().split(", ");
            Article art = new Article(article[0], article[1], article[2]);
            list.add(art);
        }
        String command = scanner.nextLine();
        for (Article article : list) {
            article.ToString();
        }
    }


    public static class Article {
        String title, content, author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void ToString() {
            System.out.println(this.title + " - " + this.content + ": " + this.author);
        }
    }
}