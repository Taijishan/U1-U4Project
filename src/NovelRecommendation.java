import java.util.ArrayList;

public class NovelRecommendation {
    private String name;
    private String language;
    private double chapters;
    public NovelRecommendation(String novelName, String novelLanguage, double novelChapters)
    {
    name = novelName;
    language = novelLanguage;
    chapters = novelChapters;
    }
    String [] cNovels = {"My House of Horrors", "Lord of Mysteries", "The Legendary Mechanic", "Worlds' Apocalypse Online", "Deep Sea Embers", "I am the Fated Villain"};
    String [] kNovels = {"The Remarried Empress", "Solo Leveling", "Valhalla Saga", "I became a Mafia in the Academy"};
    String [] longTitle = {"Clearing the Game at the End of the World", "Reincarnation of the Strongest Sword God", "The Deeds of an Extremely Arrogant Villain Aristocrat", "Weird Live Broadcast: I can deduce Endlessly"};
    String [] shortTitle = {"Archean Eon Art", "Underworld Player", "Deep Sea Embers", "Valhalla Saga", "Overgeared", "Grasping Evil"};
    String [] longChapters = {"Cosmic Professional Gladiator", "The First Order", "End of the Magic Era", "Martial World"};
    String [] shortChapters = {"The Regressor and the Blind Saint", "The Priest of Corruption", "This Game is too Realistic"};
    int randomCNovel = (int) (Math.random() * cNovels.length);
    int randomKNovel = (int) (Math.random() * kNovels.length);
    int randomLongNovel = (int) (Math.random() * longTitle.length);
    int randomShortNovel = (int) (Math.random() * shortTitle.length);
    int randomFillerNovel = (int) (Math.random() * longChapters.length);
    int randomContentNovel = (int) (Math.random() * shortChapters.length);

    public String getNovelFromWords(){
        if (name.length() > 42){
            String bigNovel = "The recommended novel based on title inputted is: " + longTitle[randomLongNovel] + ".\n";
            return bigNovel;
        }
        else {
            String smallNovel = "The recommended novel based on title inputted is: " + shortTitle[randomShortNovel] + ".\n";
            return smallNovel;
        }
    }
    public String getNovelFromLanguage() {
        if (language.equals("chinese")) {
            String chineseRec = "The recommended novel based on language inputted is: " + cNovels[randomCNovel] +".\n";
            return chineseRec;
        } else if (language.equals("korean")) {
            String koreanRec = "The recommended novel based on language inputted is: " + kNovels[randomKNovel] + ".\n";
            return koreanRec;
        }
        return "We are not accepting this language at the moment.\n";
    }
    public String getNovelFromChapters(){
        if (chapters >= 700){
            String moreChapters = "The recommended novel based on chapters inputted is: " + longChapters[randomFillerNovel] + ".\n";
            return moreChapters;
        } else if (chapters <= 250 && chapters > 1){
            String lessChapters = "The recommended novel based on chapters inputted is: " + shortChapters[randomContentNovel] + ".\n";
            return lessChapters;
        } else if (chapters == 1) {
            String oneShot = "What novel has one chapter? This isn't a oneshot recommendation system!";
            return oneShot;
        } else if (chapters <= 0) {
            String imagination = "How do you read something with no chapters? You must be out of your mind!";
            return imagination;
        }
        return "You have a peculiar taste for one that reads webnovels. You don't like long ones, yet you don't like short ones. Or maybe your favorite is one of a kind.\n";
    }
}