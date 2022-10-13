/*
Item (11 tasks)
 dibs AJ - private instance vars for name, strength, description, int magicType, Random rng 
 dibs AJ + NoArgsConstructor
 dibs AJ + Item(String _name, String _description)
 dibs AJ + int getMagicType()
 + String getName()
 + int getStrength()
 + void setDescription(String d)
 + void setName(String _name)
 dibs WB + isBroken()
 dibs WB + toString() // returns the description
 dibs WB + void weaken()
 */

import java.util.Random;


public class Item
{
  // instance variables go here
  // private instance vars for name, strength, description, int magicType, Random rng

  private String name;
  private int strength;
  private String description;
  private int magicType;
  Random rng = new Random();
  
  public Item()
  {
    // set magicType to a random number 1-3 (inclusive)
    name = "";
    strength = 0;
    description = "";
    magicType = rng.nextInt(3)+1;
  }


  public Item(String _name, String _description)
  {
    name = _name;
    strength = 0;
    description = _description;
    // set magicType to 1
    magicType = 1;
  }
  public String toString(){
    return description.toString();
  }


  public int getMagicType()
  {
    return magicType;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String _name)
  {
    name = _name;
  }

  public int getStrength()
  {
    return strength;
  }

  public void setDescription(String _string)
  {
    description = _string;
  }

  // sets strength to be strength divided by two
  public void weaken()
  {
    strength = strength / 2;
  }

  // returns true if the strength is zero or less, otherwise returns true
  public boolean isBroken()
  {
   if(strength<=0){
    
    return true;
   }else{
    return false;
   }
  }

}

