import java.util.ArrayList;

public class NovelRecommendation {
    private String name;
    private String language;
    public NovelRecommendation(String novelName, String novelLanguage)
    {
    name = novelName;
    language = novelLanguage;
    }
    String [] cNovels = {"Archfiend", "RSSG", "LOTM", "The Legendary Mechanic"};
    String [] kNovels = {"The Remarried Empress", "Clearing the game at the End of the World"};
    String [] longTitle = {"fdhtrhtt5ggregreggrgregreg"};
    int randomCNovel = (int) (Math.random() * cNovels.length);
    int randomKNovel = (int) (Math.random() * kNovels.length);
    int randomLongNovel = (int) (Math.random() * longTitle.length);

    public String getNovelFromWords(){
        if (name.length() > 50){
            String bigNovel = "recommend Novel based on title inputted: " + longTitle[randomLongNovel];
            return bigNovel;
        }
    }
    public String getNovelFromLanguage() {
        if (language.equals("chinese")) {
            String chineseRec = "recommend Novel based on language inputted: " + cNovels[randomCNovel];
            return chineseRec;
        } else {
            String koreanRec = "recommend novel based on language inputted: " + kNovels[randomKNovel];
            return koreanRec;
        }
    }
}