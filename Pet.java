public class Pet{
  private String name;
  private int cash;
  private int type;
  private int health = 50;
  private int happiness;
  private boolean light;
  int hunger = 50;
  int clevel = 50;

  public Pet(String q){
    System.out.println(q);
    name = q;
    System.out.println(name);
    int type = 0;
    int health = 50;
    int happiness = 50;
    int hunger = 50;
    int clevel = 50;
    int cash = 100;
    boolean light = true;
  }

  public String toString(){
    String s = "";
    s += "Pet: " + getname() + "\n";
    s += "Health: " + health + "%\n";
    s += "Hunger: " + hunger + "%\n";
    s += "Happiness: " + happiness + "%\n";
    s += "Cleanliness: " + clevel + "%\n";
    return s;
  }

  public boolean getlight(){
    return light;
  }

  public void setlight(boolean y){
    light = y;
  }

  public boolean isDead(){
    return health < 0;
  }

  public String getname(){
    return name;
  }

  public void sethealth(int n){
    health = n;
  }

  public void sethappiness(int n){
    happiness = n;
  }

  public void settype(int n){
    type = n;
  }

  public void sethunger(int n){
    hunger = n;
  }

  public void setclevel(int n){
    clevel = n;
  }

  public void setcash(int n){
    cash = n;
  }

  public int getcash(){
    return cash;
  }

  public int gethealth(){
    return health;
  }

  public int gethappiness(){
    return happiness;
  }

  public int gethunger(){
    return hunger;
  }

  public int getclevel(){
    return clevel;
  }


}
