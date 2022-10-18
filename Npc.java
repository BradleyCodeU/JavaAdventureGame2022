/*
Npc (9 tasks)
 dib KB - private instance vars for name, speech, description
 dib KB + NoArgsConstructor
 dib KB + Npc(String _name, String _description)
 dib KB + String getName
 dib TC + String getSpeech
 dib TC + void setDescription(String d)
 dib TC + void setName(String _name)
 dib TC + void setSpeech
 dibs WB + toString() // returns the description
 */
public class Npc
{
 private String name;
 private String speech;
 private String description;
  // instance variable go here
  // private instance vars for name, speech, description

  public Npc()
  {
    name = "James Charles Bartholemule II";
    speech = "Why hello there traveler... I've been expecting a main character such as yourself to cross paths with me...";
    description = "James Charles was his original name until he was banished from his village for doing questionable acts, he was raised by a wise tree named Bartholemule...";
    
  }

  public Npc(String newName, String newDescription)
  {
    name = newName;
    description = newDescription;
    speech = "Why hello there traveler... I've been expecting a main character such as yourself to cross paths with me...";
  }

  public String getName()
  {
    return name;
  }

  public String getSpeech()
  {
    return speech;
  }

  public void setDescription(String _description)
  {
   description = _description;

  }

  public void setName(String _name)
  {
   name = _name;

  }

  public void setSpeech(String _speech)
  {
   speech = _speech

  }

  public String toString()
  {
    return description.toString();
  }


}
