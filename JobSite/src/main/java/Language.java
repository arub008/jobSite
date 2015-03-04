/**
 * Created by Anastasya on 02.03.2015.
 */
public enum Language {
    ENGLISH("английский"),
    GERMAN("немецкий"), 
    TAI("тайский"), 
    ITALIAN("итальянский"), 
    SPANISH("испанский"), 
    FRENCH("французский");
    
    public final String lang;
    
    Language(String lang){
        this.lang = lang;
        
    }
    
    @Override
    public String toString(){
        return " язык: " + lang;
    }

    
}
