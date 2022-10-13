/*
Room (14 tasks)
 dibs SW - private instance vars for name, description, character, roomItem, Room north, Room south, Room east, Room west
 dibs SW + NoArgsConstructor
 dibs SW + Room(String _name)
 dibs SW + Npc getCharacter()
 dibs AB + Item getItem()
 dibs AB + Room getLocationTo(String direction)
 dibs AB + String getName()
 dibs AB + String getPossibleDirections()
 dibs RK + void linkRoom(Room r, String direction)
 dibs RK + void setCharacter(Npc character)
 dibs RK + void setDescription(String d) DONE
 + void setItem(Item i)
 + void setName(String _name)
 dibs RK + toString() // returns the description DONE
*/
public class Room{
  private String name;
  private String description;
  private Npc character;
  private Item roomItem;
  private Room north;
  private Room south;
  private Room east;
  private Room west;
 
  public Room(){
   name = "";
   description = "";
   character = null;
   roomItem = null;
   north = null;
   south = null;
   east = null;
   west = null;

  }
 
  public Room(String _name){
   name = _name;
   description = "";
   character = null;
   roomItem = null;
   north = null;
   south = null;
   east = null;
   west = null;
  }
 
  public Npc getCharacter(){
   return character;
  }

  public Item getItem()
  {
   return null;
  }
 
 // precondition: direction is either "north" or "south" or "east" or "west"
  public Room getLocationTo(String direction)
  {
    return null
  }

  public String getName()
  {
    return "x";
  }

  public String getPossibleDirections()
  {
    return "x";
  }
  /** 
  @param
  
  // precondition: direction is either "north" or "south" or "east" or "west" */
 public void linkRoom(Room r, String direction)
  {
    if (direction == "south") {
      south = r;
    }
    if (direction == "north") {
      north = r;
    }
    if (direction == "west") {
      west = r;
    }
    if (direction == "east") {
      east = r;
    }

     else {
       null;
      }
    }
  
  

  // sets the character to a Npc object that is passed into this method
  public void setCharacter(Npc _character)
  {
     character = _character;
  }

  public void setDescription(String newDescription)
  {
    description = newDescription;
  }

  public void setItem(Item i)
  {

  }

  public void setName(String _name)
  {

  }

  public String toString()
  {
    return "Room name: " + name + "Description: " + description;
  }


}
