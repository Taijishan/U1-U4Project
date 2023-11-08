import java.util.Scanner;
public class NovelRecommendationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the novel recommendation program!");
        System.out.println("You enter information of your favorite novel, and I shall provide a recommendation based on the information provided.");
        System.out.println("Please enter the name of the Novel(no acronyms): ");
        String userNovel = s.nextLine();
        System.out.println("Please enter the original language of the novel(Chinese/Korean): ");
        String userLanguage = s.nextLine();
        userLanguage = userLanguage.toLowerCase();
        NovelRecommendation recommend = new NovelRecommendation(userNovel, userLanguage);
        System.out.println(recommend.getNovelFromLanguage());
        System.out.println(recommend.getNovelFromWords());
    }

}
