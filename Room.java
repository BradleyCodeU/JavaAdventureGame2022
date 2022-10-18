/*
Room (14 tasks)
 dibs SW - private instance vars for name, description, character, roomItem, Room north, Room south, Room east, Room west
 dibs SW + NoArgsConstructor
 dibs SW + Room(String _name)
 dibs SW + Npc getCharacter()
 dibs TC + Item getItem()
 dibs TC + Room getLocationTo(String direction)
 dibs TC + String getName()
 dibs TC + String getPossibleDirections()
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
   return roomItem;
  }
 
 // precondition: direction is either "north" or "south" or "east" or "west"
  public Room getLocationTo(String direction)
  {
    if (direction.equals("north")){
     return north; 
    }
    else if (direction.equals("south")){
     return south; 
    }
    else if (direction.equals("east")){
     return east; 
    }
    else if (direction.equals("west")){
     return west; 
    }
    else {
      // if none of those conditions, then return the current room
     
    }
  }

  public String getName()
  {
    return name;
  }

  public String getPossibleDirections()
  {
    String possibleDirections = "Type either: ";
    if(north != null){
      possibleDirections += "north, "
    }
    if(south != null){
      possibleDirections += "south, "
    }
    if(east != null){
      possibleDirections += "east, "
     
    }
    if(west != null){
      possibleDirections += "west, "
    }
   
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
    item = i;
  }

  public void setName(String _name)
  {
    name = _name;
  }
  
  /** 
  @return the names of the instance variables and what is stored inside them
  
 */
  public String toString()
  {
    return "Room name: " + name + " Description: " + description;
  }


}
