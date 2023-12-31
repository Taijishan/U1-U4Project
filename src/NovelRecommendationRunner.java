import java.util.Scanner; //scanner that will read user inputs
public class NovelRecommendationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the novel recommendation program!"); //this is start of user interaction with program
        System.out.println("Please enter information of your favorite novel, and I (34k karma on reddit) shall provide and vouch for the recommendations given based on the information provided.");
        while (true) {
            System.out.println("Please enter the name of the Novel(no acronyms or type nvm to exit): ");
            String userNovel = s.nextLine();
            if (userNovel.equals("nvm")) {
                break;
            }
            System.out.println("If your novel's original language is not here, we apologize. \nPlease enter the original language of the novel(languages accepted at this moment: Chinese/Korean/English), or type nvm to exit: ");
            String userLanguage = s.nextLine();
            userLanguage = userLanguage.toLowerCase();
            if (userLanguage.equals("nvm")){
                break;
            }
            System.out.println("Please enter the amount of chapters (in numeric form) the novel has: ");
            double userChapters = Double.parseDouble(s.nextLine());
            System.out.println("The information of the novel you provided: \n" + "Title: " + userNovel + "\n" + "Language: " + userLanguage + "\n" + "Chapters: " + userChapters + " chapters\n");
            NovelRecommendation recommend = new NovelRecommendation(userNovel, userLanguage, userChapters);
            System.out.println(recommend.getNovelFromLanguage());
            System.out.println(recommend.getNovelFromWords());
            System.out.println(recommend.getNovelFromChapters());
            System.out.println("Enter your name: ");
            recommend.setUserName(s.nextLine());
            System.out.println("Hello " + recommend.getUserName() + ". You should listen to these songs while reading this novel!\n" + recommend.toString());
            System.out.println("I'm impressed. You completed the first iteration of this program. Now, you can go for another run!\n");
        }
    }
}
