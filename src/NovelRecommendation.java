import java.util.ArrayList;

/**
 * The NovelRecommendation class represents a NovelRecommendation.
 * A NovelRecommendation must include a name, a language, as well as a set amount of chapters.
 */
public class NovelRecommendation {
    private String name;
    private String language;
    private double chapters;
    private String userName;
    public void setUserName(String yourName){
        userName = yourName;}
    public String getUserName(){
        return userName;
    }
    private String [] favSongs = {"Can't Hold us by Macklemore", "Ordinary Path(cover) by Jordan Chan", "Song of the Isle of Sorrow by Onmyoji", "Don't go by Henry", "spiral tunes by Mori Calliope", "Endless Love by Jackie Chan and Kim Hee Seon"}; //list that contains music recs
    private String [] favSongsPt2 = {"The Greatest Show by Hugh Jackman", "Victory by Two Steps from Hell", "Timelapse; Reverse by Corsak", "PS5 by salem ilese and TXT", "Back Here Again by EggPlantEgg", "Gotta Talk to U by Seungri"}; //list that contains music recs
    private String [] favSongsPt3 = {"Ya Gamila by Namewee", "Red Swan by Yoshiki", "Monsters(cover) by Zhou Shen", "Delusion by Singyeo", "Idol by Yoasobi", "Sick and Tired by Lewsz", "Every Breath You Take by The Police", "flawless by Joon"}; //list that contains music recs
    private String [] cNovels = {"My House of Horrors", "Lord of Mysteries", "The Legendary Mechanic", "Worlds' Apocalypse Online", "Deep Sea Embers", "I am the Fated Villain"}; //list that contains Chinese novels
    private String [] kNovels = {"The Remarried Empress", "Solo Leveling", "Valhalla Saga", "I became a Mafia in the Academy", "The Founder of the Great Financial Family"}; //list that contains Korean Novels
    private String [] engNovels = {"Ashes of Heaven", "Beware of Chicken", "Vainqueur the Dragon", "The Perfect Run", "1453: Revival of Byzantium", "System vs Rebirth", "Realm of Myths and Legends", "The Wandering Inn"}; //list that contains English novels
    private String [] longTitle = {"Clearing the Game at the End of the World", "Reincarnation of the Strongest Sword God", "The Deeds of an Extremely Arrogant Villain Aristocrat", "Weird Live Broadcast: I can deduce Endlessly", "i have a mansion in the post-apocalyptic world"}; //list that contains long title novels
    private String [] shortTitle = {"Archean Eon Art", "Underworld Player", "Deep Sea Embers", "Valhalla Saga", "Overgeared", "Grasping Evil"}; //list that contains short title novels
    private String [] longChapters = {"Cosmic Professional Gladiator", "The First Order", "End of the Magic Era", "Martial World", "Emperor's Domination", "Cultivation Chat Group"}; //list that contains novels with a lot of chapters
    private String [] shortChapters = {"The Regressor and the Blind Saint", "The Priest of Corruption", "This Game is too Realistic", "Dimensional Sovereign", "I reincarnated for nothing"}; //list that contains novels with not that many chapters

    /**
     * Constructor for the NovelRecommendation class. This creates a new instance of a NovelRecommendation
     * given the below parameters.
     *
     * @param novelName represents the name of the novel
     * @param novelLanguage represents the language of the novel
     * @param novelChapters represents the amount of chapters in the novel
     */
    public NovelRecommendation(String novelName, String novelLanguage, double novelChapters)
    {
    name = novelName;
    language = novelLanguage;
    chapters = novelChapters;
    }

    int randomCNovel = (int) (Math.random() * cNovels.length); //this is the math that randomizes the list that contains Chinese novels
    int randomKNovel = (int) (Math.random() * kNovels.length); //this is the math that randomizes the list that contains Korean novels
    int randomEngNovel = (int) (Math.random() * engNovels.length); //this is the math that randomizes the list that contains English novels
    int randomLongNovel = (int) (Math.random() * longTitle.length); //this is the math that randomizes the list that contains novels with long names
    int randomShortNovel = (int) (Math.random() * shortTitle.length); //this is the math that randomizes the list that contains novels with short names
    int randomFillerNovel = (int) (Math.random() * longChapters.length); //this is the math that randomizes the list that contains novels with a lot of chapters
    int randomContentNovel = (int) (Math.random() * shortChapters.length); //this is the math that randomizes the list that contains novels with not that many chapters
    int firstMusicRec = (int) (Math.random() * favSongs.length); //this is the math that randomizes the list containing music recs
    int secondMusicRec = (int) (Math.random() * favSongsPt2.length); //this is the math that randomizes the list containing music recs
    int lastMusicRec = (int) (Math.random() * favSongsPt3.length); //this is the math that randomizes the list containing music recs

    /**
     * toString method for the NovelRecommendation class. This method will return a String showing the randomized
     * music recommendations in a formatted sentence.
     *
     * @return returns a String in a properly formatted sentence containing 3 music recommendations for the user to listen to while reading.
     */
    public String toString(){
        return favSongs[firstMusicRec]  + ", " + favSongsPt2[secondMusicRec] + ", as well as " + favSongsPt3[lastMusicRec] +"\n";
    }

    /**
     * getNovelFromWords method for the NovelRecommendation class. This method will return a String that contains a
     * novel Recommendation based on the length of the title the user inputs.
     *
     * @return returns a String that contains a novel recommendation based on length of title.
     */
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
    /**
     * getNovelFromLanguage method for the NovelRecommendation class. This method will return a String that contains a
     * novel Recommendation based on the language of the novel the user inputs.
     *
     * @return returns a String that contains a novel recommendation based on the novel's language.
     */
    public String getNovelFromLanguage() {
        if (language.equals("chinese")) {
            String chineseRec = "The recommended novel based on language inputted is: " + cNovels[randomCNovel] +".\n";
            return chineseRec;
        } else if (language.equals("korean")) {
            String koreanRec = "The recommended novel based on language inputted is: " + kNovels[randomKNovel] + ".\n";
            return koreanRec;
        } else if (language.equals("english")) {
            String englishRec = "The recommended novel based on language inputted is: " + engNovels[randomEngNovel] + ".\n";
            return englishRec;
        }
        return "Regarding the language you inputting, we are not accepting this language at the moment.\n";
    }
    /**
     * getNovelFromChapters method for the NovelRecommendation class. This method will return a String that contains a
     * novel Recommendation based on the amount of chapters the user inputs.
     *
     * @return returns a String that contains a novel recommendation based on the novel's amount of chapters.
     */
    public String getNovelFromChapters(){
        if (chapters >= 700){
            String moreChapters = "The recommended novel based on chapters inputted is: " + longChapters[randomFillerNovel] + ".\n";
            return moreChapters;
        } else if (chapters <= 250 && chapters > 1){
            String lessChapters = "The recommended novel based on chapters inputted is: " + shortChapters[randomContentNovel] + ".\n";
            return lessChapters;
        } else if (chapters == 1) {
            String oneShot = "Your novel has one chapter? What novel has one chapter? This isn't a oneshot recommendation system!\n";
            return oneShot;
        } else if (chapters < 0) {
            String imagination = "Your novel has negative chapters? You think you're funny? How do you read something with no chapters? You must be out of your mind!\n";
            return imagination;
        } else if (chapters == 0) {
            String zero = "Your novel has zero chapters? How'd the author write the book?\n";
            return zero;
        }
        return "You have a peculiar taste for one that reads webnovels. You don't like long ones, yet you don't like short ones. Or maybe your favorite is one of a kind.\n";
    }
}