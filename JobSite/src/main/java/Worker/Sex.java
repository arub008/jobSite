package Worker;

/**
 * Created by Anastasya on 02.03.2015.
 */
public enum Sex {
    MALE("мужской"), 
    FEMALE("женский");
    
    public final String name;
    
    Sex(String name)
    {
        this.name = name;
        
    }



    @Override
    public String toString(){
        return " пол: " + name;
        
    }
    
}
