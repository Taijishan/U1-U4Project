import java.util.Scanner;
public class NovelRecommendationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the novel recommendation program!");
        System.out.println("You enter information of your favorite novel, and I shall provide recommendations based on the information provided.");
        System.out.println("Please enter the name of the Novel(no acronyms): ");
        String userNovel = s.nextLine();
        System.out.println("Please enter the original language of the novel(Chinese/Korean): ");
        String userLanguage = s.nextLine();
        userLanguage = userLanguage.toLowerCase();
        System.out.println("Please enter the amount of chapters the novel has: ");
        double userChapters = Double.parseDouble(s.nextLine());
        System.out.println("The information of the novel you provided: \n" + userNovel + "\n" + userLanguage + "\n" + userChapters );
        NovelRecommendation recommend = new NovelRecommendation(userNovel, userLanguage, userChapters);
        System.out.println(recommend.getNovelFromLanguage());
        System.out.println(recommend.getNovelFromWords());
        System.out.println(recommend.getNovelFromChapters());
        System.out.println("Rerun this program for more variation in novel recommendations!");
    }

}
