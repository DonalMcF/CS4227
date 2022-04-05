package projectmoria;
import projectmoria.*;


public class CharacterFactory
{


public static Character getCharacter(String charType){
   if(charType == null)
   {
      return null;
   }
   
   if(charType.equalsIgnoreCase("Player")){
      return new Player();
       
    } else if(charType.equalsIgnoreCase("Monster")){
       return new Monster("Goblin", "A grotesque, small enemy with a sub-par "
       + "skill-set. ", 30, 10, 15, 2, 10, true); 
    }
    else
    {
    return null;
    }
}

}