import java.util.Scanner;
public class NovelRecommendationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the novel recommendation program!");
        System.out.println("Please enter information of your favorite novel, and I (34k karma on reddit) shall provide recommendations based on the information provided.");
        while (true) {
            System.out.println("Please enter the name of the Novel(no acronyms or type nvm to exit): ");
            String userNovel = s.nextLine();
            if (userNovel.equals("nvm")) {
                break;
            }
            System.out.println("Please enter the original language of the novel(Chinese/Korean): ");
            String userLanguage = s.nextLine();
            userLanguage = userLanguage.toLowerCase();
            System.out.println("Please enter the amount of chapters (in numeric form) the novel has: ");
            double userChapters = Double.parseDouble(s.nextLine());
            System.out.println("The information of the novel you provided: \n" + userNovel + "\n" + userLanguage + "\n" + userChapters + "\n");
            NovelRecommendation recommend = new NovelRecommendation(userNovel, userLanguage, userChapters);
            System.out.println(recommend.getNovelFromLanguage());
            System.out.println(recommend.getNovelFromWords());
            System.out.println(recommend.getNovelFromChapters());
            System.out.println("You have received your recommendations. As you haven't quit this program, you can go for another run!\n");
        }
    }
}
