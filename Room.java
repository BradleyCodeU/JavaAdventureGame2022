/*
Room (14 tasks)
 - private instance vars for name, description, character, roomItem, Room north, Room south, Room east, Room west
 + NoArgsConstructor
 + Room(String _name)
 + Npc getCharacter()
 dibs TC + Item getItem()
 dibs TC + Room getLocationTo(String direction)
 dibs TC + String getName()
 dibs TC + String getPossibleDirections()
 + void linkRoom(Room r, String direction)
 + void setCharacter(Npc character)
 + void setDescription(String d)
 + void setItem(Item i)
 + void setName(String _name)
 + toString() // returns the description
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
  @param direction - direction should be the lowercase words "north" "south" "east" or "west
  @param r - a room object should be supplied for the variable r
  
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

    }
  
  
  /** 
  @param a npc object that is then stored into the instance variable character
  // sets the character to a Npc object that is passed into this method

 */
  public void setCharacter(Npc _character)
  {
     character = _character;
  }

  /** 
  @param  String that describes a room. example: "dark room that is very small"

 */
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
  
  /** 
  @return the names of the instance variables and what is stored inside them
  
 */
  public String toString()
  {
    return "Room name: " + name + "Description: " + description;
  }


}
