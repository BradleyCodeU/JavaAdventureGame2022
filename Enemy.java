/*
Enemy extends Npc (8 tasks)
 - private instance vars for health, int magicWeakness, attackName
 + NoArgsConstructor
 + Enemy(String _name, String _description)
 + String getAttackName()
 dibs AC + int getHealth
 dibs AC + int getMagicWeakness()
 dibs AC + void loseHealth(int h)
 dibs AC + void setAttackName()
*/
public class Enemy extends Npc
{
  // class variables
  private static int enemyCounter = 0;

  // class methods
  public static int getEnemyCounter()
  {
    return 0;
  }

  // instance variables
  private int health;
  private int magicWeakness;
  private String attackName;
  // private instance vars for health, int magicWeakness, attackName

  public Enemy(){
    super();
    health = 100;
    magicWeakness = 1;
    attackName = "slap";
    enemyCounter++;
  }

  public Enemy(String enemyName, String enemyDescription){
    super(enemyName,enemyDescription);
    health = 100;
    magicWeakness = 1;
    attackName = "slap";
    enemyCounter++;
  }

  public int getHealth(){
    return 0;
  }

  // sets health to be health minus healthLost
  public void loseHealth(int healthLost){

  }

  public String getAttackName(){
    return attackName;
  }

  public int getMagicWeakness(){
    return 0;
  }

  public void setAttackName(String _attackName){

  }
}

