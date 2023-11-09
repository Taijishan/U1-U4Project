import java.util.ArrayList;

public class NovelRecommendation {
    private String name;
    private String language;
    private int chapters;
    public NovelRecommendation(String novelName, String novelLanguage, int novelChapters)
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
            String bigNovel = "recommend Novel based on title inputted: " + longTitle[randomLongNovel];
            return bigNovel;
        }
        else {
            String smallNovel = "recommend Novel based on title inputted: " + shortTitle[randomShortNovel];
            return smallNovel;
        }
    }
    public String getNovelFromLanguage() {
        if (language.equals("chinese")) {
            String chineseRec = "recommend Novel based on language inputted: " + cNovels[randomCNovel];
            return chineseRec;
        } else if (language.equals("korean")) {
            String koreanRec = "recommend novel based on language inputted: " + kNovels[randomKNovel];
            return koreanRec;
        }
        return "Sorry, we are not accepting this language at the moment";
    }
    public String getNovelFromChapters(){
        if (chapters >= 700){
            String moreChapters = "recommend Novel based on chapters inputted: " + longChapters[randomFillerNovel];
            return moreChapters;
        } else if (chapters <= 250){
            String lessChapters = "recommend novel based on chapters inputted: " + shortChapters[randomContentNovel];
            return lessChapters;
        }
        return "Peculiar tastes for one that reads webnovels. Don't like long ones, don't like short ones.";
    }
}