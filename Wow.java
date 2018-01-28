import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Wow{
  public Pet woo;
  public String name;
  public String pname;
  public String type;
  public static int days;

  private InputStreamReader isr;
  private BufferedReader in;

  public Wow(){
    days = 1;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }

  public Pet getPet(){
    return woo;
  }

  public static void confirm() {
    String out = "(press 'Enter' to continue)";
    Scanner sc = new Scanner(System.in);
    System.out.println(out);
    sc.nextLine();
  }

  public void newGame(){
    String s;
    String name = "";
    pname = "";


    Scanner sc = new Scanner(System.in);

    s = "Welcome to\n";
    s += " ______ _            ______                   _     \n"
    + " / _____) |          / _____)                 | |    \n"
    + "( (____ | |__  _____( (____  ____  _____  ____| |  _ \n"
    + " \\____ \\|  _ \\| ___ |\\____ \\|  _ \\(____ |/ ___) |_/ )\n"
    + " _____) ) | | | ____|_____) ) | | / ___ ( (___|  _ ( \n"
    + "(______/|_| |_|_____|______/|_| |_\\_____|\\____)_| \\_)\n"
    + "                                                     \n";
    s+= "\t \t A  F R I E N D  I N  Y O U R  B O X\n";
    System.out.println(s);
    confirm();
    s = "You've always wanted a new friend... The ones you have in school ";
    s += "are kind of weird? This new thing came out called SheSnacks and ";
    s += "you decided to give it a shot. This is your time to shine!";
    System.out.println(s);
    confirm();
    System.out.print("\033[H\033[2J");
    s = "====================\n"
	    + "How to play:\n"
	    + "\t This is a very simple game. You are given an egg\n"
	    + "\t You will try to nurture the little egg and make it\n"
	    + "\t an amazing new creature! There will be hardships and\n"
	    + "\t struggles and at times, you may think there is no hope.\n"
	    + "\t But as the amazing person YOU are, you will continue to\n"
	    + "\t love your creature and help it live a long and happy life.\n"
	    + "\t -Crystal, Kaitlin, Maryann\n";
      System.out.println(s);
      confirm();
      System.out.print("\033[H\033[2J");
      System.out.println("What's your name?");
      try{
        name = in.readLine();
        System.out.println("Your name is:");
        System.out.println(name);
      }

      catch(IOException e){
      }
      System.out.print("\033[H\033[2J");

      System.out.println("What would you like to name your creature?");

      try{
        pname = in.readLine();
        System.out.println("Your pet's name is:");
        woo = new Pet(pname);
      }
      catch(IOException e){
      }

      System.out.print("\033[H\033[2J");
      System.out.println("Take this quiz to determine what type of creature you get!");

      int choiceOne = 0;
      int choiceTwo = 0;
      int choiceThree = 0;

      //Q1
      int ans = 0;
      s = "What is your favorite aspect of school? \n";
      s += "\t1: I like Homework!\n";
      s += "\t2: I like friends! \n";
      s += "\t3: I'm just here. \n";
      s += "Selection: ";
      System.out.println(s);

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          choiceOne += 1;
        }
	    else if (ans == 2){
        		choiceTwo += 1;
      }
	    else{
		      choiceThree += 1;
        }
      }
      catch ( IOException e ) {
      }
      System.out.print("\033[H\033[2J");
      //End of Q1
      s = "What is your favorite place to go? \n";
      s += "\t1: My house.\n";
      s += "\t2: The park.\n";
      s += "\t3: The beach.\n";
      s += "Selection: ";
      System.out.println(s);

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          choiceOne += 1;
        }
      else if (ans == 2){
            choiceTwo += 1;
      }
      else{
          choiceThree += 1;
        }
      }
      catch ( IOException e ) {
      }
      System.out.print("\033[H\033[2J");
      //end of q2
      s = "What is your favorite thing to do on weekends? \n";
      s += "\t1: I like to read books.\n";
      s += "\t2: I like to hang out with my close friends.\n";
      s += "\t3: I like to play sports.\n";
      s += "Selection: ";
      System.out.println(s);

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          choiceOne += 1;
        }
      else if (ans == 2){
            choiceTwo += 1;
      }
      else{
          choiceThree += 1;
        }
      }
      catch ( IOException e ) {
      }
      System.out.print("\033[H\033[2J");
      //end of q3
      s = "What is your favorite subject? \n";
      s += "\t1: Science.\n";
      s += "\t2: Humanities.\n";
      s += "\t3: Gym.\n";
      s += "Selection: ";
      System.out.println(s);

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          choiceOne += 1;
        }
      else if (ans == 2){
            choiceTwo += 1;
      }
      else{
          choiceThree += 1;
        }
      }
      catch ( IOException e ) {
      }
      System.out.print("\033[H\033[2J");
      //end of q4

      int highest = Math.max(choiceOne, Math.max(choiceTwo,choiceThree));
      if(highest == choiceOne){
        System.out.println("You are have gotten a turtle! You both are quiet and nerdy.  Have fun raising your turtle!");
        type = "Turtle";

      }
      else if (highest == choiceTwo){
        System.out.println("You will be raising a dog.  You are like a dog because you both love your friends, the humanities, and, of course, parks! Have fun raising your pet dog!");
        type = "Dog";
      }
      else{
        System.out.println("You will be raising a fish.  You will hopefully like your fish because you're both much more into swimming and sports than school. Although they may seem small they are still a huge responsibility so have fun with your fish!");
        type = "Fish";
      }
      confirm();
  }

  public boolean simDay(){
    int counter = 0;
    if(!woo.isDead()){

    System.out.print("\033[H\033[2J");
    System.out.println("==============================================");
    System.out.println("Day " + days);
    System.out.println("==============================================");
    System.out.println("Good Morning!");

    //'HOME PAGE' where the user can make choices
    while(counter < 3){
    int ans = 0;
    System.out.println("Please select one of the following:");
    String s;
    s = "";
    s += "\t1: Feed\n";
    s += "\t2. Light\n";
    s += "\t3: Clean\n";
    s += "\t4: Play \n";
    s += "\t5: Medicine \n";
    s += "\t6: Show Stats\n";
    s += "Selection: ";
    System.out.println(s);
		try {
      ans = Integer.parseInt( in.readLine() );
      String let;
      if (ans == 1){
        System.out.println("What do you want to feed " + pname + "?");
        ans = 0;
        s = ""
         + "\t1: Cookie || $3\n"
         + "\t2. Pet Food || $5\n"
         + "\t3: Fruit || $7\n"
         + "\t4: Pizza || $9 \n";
         System.out.println(s);
         try {
           int answer = Integer.parseInt( in.readLine() );
           if (answer == 1){
             woo.setcash(woo.getcash() - 3);
             if (woo.gethunger() >= 95){
               woo.sethunger(100);
             }
             else{
               woo.sethunger(woo.gethunger() + 5);
             }
           }
           else if (answer == 2){
             woo.setcash(woo.getcash() - 5);
             if (woo.gethunger() >= 93){
               woo.sethunger(100);
             }
             else{
               woo.sethunger(woo.gethunger() + 7);
             }
           }
           else if (answer == 3){
             woo.setcash(woo.getcash() - 7);
             if (woo.gethunger() >= 90){
               woo.sethunger(100);
             }
             else{
               woo.sethunger(woo.gethunger() + 10);
             }
           }
           else{
             woo.setcash(woo.getcash() - 9);
             if (woo.gethunger() >= 85){
               woo.sethunger(100);
             }
             else{
               woo.sethunger(woo.gethunger() + 15);
             }
           }
         }
         catch(IOException e){

         }


        confirm();
		    }
		    else if (ans == 2) {
          System.out.println(woo.getname() + " likes it to be dark if it's past 9pm...");
          Calendar cal = Calendar.getInstance();
          SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
          System.out.println("It is now...");
          System.out.println( sdf.format(cal.getTime()) );

          System.out.println("Should the light be on or off?");
          System.out.println(" 1 for on || 2 for off");

          try {
            ans = 0;
            ans = Integer.parseInt( in.readLine() );
            if (ans == 1){
              System.out.println("Light turned on!");
              woo.setlight(true);
            }

            else{
              woo.setlight(false);
              System.out.println("Light turned off!");
            }
          }
          catch(IOException e){
          }



          Calendar c1 = Calendar.getInstance();
          Calendar c2 = Calendar.getInstance();
          c2.set(Calendar.HOUR_OF_DAY,21);
          c2.set(Calendar.MINUTE,0);
          c2.set(Calendar.SECOND,0);


          c1.compareTo(c2);


          if((c1.compareTo(c2) >= 0 ) && woo.getlight() == true) {
            //after 9 and light is on
            woo.sethealth(woo.gethealth() - 10);
          }
          else if( (c1.compareTo(c2)) >= 0 && woo.getlight() == false){
            woo.sethealth(woo.gethealth() + 10);
          }

          confirm();
		    }
		    else if (ans == 3) {
          System.out.println("Bath Time!");
          woo.setclevel(100);
          woo.sethunger(woo.gethunger()-10);
          confirm();
		    }
		    else if (ans == 4){
          System.out.println("Went on a play date!");
          woo.sethappiness(100);
          woo.sethunger(woo.gethunger()-20);
          woo.setclevel(woo.getclevel()-20);
          confirm();
		    }
        else if (ans == 5) {
          System.out.println("Oh no Needles...");
          woo.sethealth(100);
          woo.sethappiness(woo.gethappiness()-20);
          woo.setcash(woo.getcash() - 45);

          confirm();
        }
		    else {
          System.out.println(woo);
          confirm();
		    }
        if(woo.getclevel() < 25 || woo.gethunger() < 25 || woo.gethappiness() < 25){
          woo.sethealth(woo.gethealth() - 2);
        }
      }
      catch ( IOException e ) {
    }
  }
    counter++;
  }
  return true;
}

public String getType(){
  return type;
}

public String getPName(){
  return pname;
}
  public static void main(String[] args){
    Wow game = new Wow();
    while (days <= 25){
      if(!game.simDay()){
        System.out.println("You're done...");
      }
      days++;
      System.out.println();
      }

  }

}
