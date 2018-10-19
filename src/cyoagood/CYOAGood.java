/*
October 18, 2018
Mr Kaune ICS3U
Callum MacLeod
 */

package cyoagood;
import java.util.Scanner;
/**
 *
 * @author camac2045
 */
public class CYOAGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("You are a ww2 pilot for the RAF. You have just reached the african front when a bomber raid is called on an axis fortress near Tripoli");
    System.out.println("Type 1 if you: Take a bomber for the raid");
    System.out.println("Type 2 if you: Pilot a fighter");
    //starting the adventure (setup)
        
        
    String answer2, answer3, answer4, answer5, answer6;// declaring variables
    String answer;
    Scanner keyedInput = new Scanner (System.in);//setting up scanner
    answer = keyedInput.nextLine();//taking first answer
            
            

                if (answer.equals("1")){//first branch of adventures
                    System.out.println("As the raid begins things quickly head south. The enemies' AA guns and fighters are wreckjing havoc all of a sudden though you see a hole in the enemy defenses, you have the decision to take a chance and drop your bombs on the enemy anti-aircraft guns or keep to the safer clouds");
                    //continued adventure
                    System.out.println("Type 1 if you: Try and hit the AA guns"); //both decisions
                    System.out.println("Type 2 if you: Stay tight with your unit"); 
                    answer2 = keyedInput.nextLine();//setting next anwser as input
                        if (answer2.equals("1")){
                            System.out.println("You kiss the penant hanging around your neck and begin your descent, the enemy never expected such a bold move and your bombs hit true completely wiping out the enemy guns in an instant. The enemy fighters recover much faster and your plane is hit and goes down in a spiral of smoke. You try to eject but the system is jammed. The raid succeeds thanks to your daring actions and you're grave and memory is decorated with the victoria cross. The End!");
                        }
                        else if (answer2.equals("2")){
                            System.out.println("The AA guns continue to bombard your unit but you manage to hit your the target railway even if the damage is minimal. As the retreat is called you are broken off from your group by enemey fire.");
                            System.out.println("Type 1 if you: Try and find your unit");
                            System.out.println("Type 2 if you: Head in the genral directon of your airbase");
                            answer3 = keyedInput.nextLine();
                                if (answer3.equals("1")){
                                    System.out.println("You double back to where you last saw your unit but at this point there no sign of them. As you search the horizon for any sign of them you're plane is suddenly hit by an enbemy fighter plane. After you eject form the fire englufed vehicule you are easy prey for the same plane and you dont make it back home. The End."); 
                                    
                                }
                                else if (answer3.equals("2")){
                                    System.out.println("You head due northeast for hours until you begin to see your oil reserves running low, you continue on until you see land where you go to low altitude and eject from your plane you land on a hillside with a river on your left and a forest on the right.");
                                    System.out.println("Type 1 if you: Walk along the river");
                                    System.out.println("Type 2 if you: Take the path in the forest");
                                    answer4 = keyedInput.nextLine();
                                if (answer4.equals("1")){
                                    System.out.println("The river takes you to a large city which you find to be with the Allies, they give you refuge and you are a war hero for your survival and perseverance. The End.");
                                }
                                else if (answer4.equals("2")){
                                    System.out.println("You walk for hours and hours  along the narrow twisty path looking for any sign of civilization but hunger and exhaustrion slowly get to you until you collapse. The End.");
                                }
                            }
                    }
                }
                else if (answer.equals("2")) {
                    System.out.println("You take flight, on the way to your target you flank the many bombers as you fly across the desert when suddenly your unit is ambushed, the order to fight is issued but you are worried about the current situation");
                    System.out.println("Type 1 if you: Run from the fight");
                    System.out.println("Type 2 if you: Stay and fight");
                    answer5 = keyedInput.nextLine();
                        if (answer5.equals("2")){
                            System.out.println("As the dogfight begins you quickly get the jump on an enemy plane ripping through it. Suddenly you look over to see a group of enemy fighters targeting your escaping bombers.");
                            System.out.println("Type 1 if you: Stay in the fight with the fighters");
                            System.out.println("Type 2 if you: Defend the bombers");
                            answer6 = keyedInput.nextLine();
                                if(answer6.equals("1")){
                                    System.out.println("You are suddenly attacked by an enemy plane and pull evasive maneuvers in an attempt to turn on your attacker, this enemy is a master pilot and your attempts are in vain. You feel the ship burn up around you and then evrything goes black. The End.");
                                }
                                else if(answer6.equals("2")){
                                    System.out.println("You quickly jump on the fighters bearing down upon your bombers. Thinking there were no fighters around the enemy is taken by surprise and your heads up thinking saves the mission. You are rewarded by being promoted to squadron leader and continue the war as a reveared pilot with your name going down in the history books as one of the greatest. The End.");
                                }
                        }
                        else if (answer5.equals("1")){
                            System.out.println("As you try and abandon your unit an enemy fighter tracks your movements and when you aernt expecting it, it tears your plane apart. The End.");
                        }
                               
                }
        
    }     
}              
    

    

