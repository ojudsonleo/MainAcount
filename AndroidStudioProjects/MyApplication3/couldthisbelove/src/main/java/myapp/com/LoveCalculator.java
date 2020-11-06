package myapp.com;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {

        System.out.println("Your love score is: " + ifYouHadMyLove("Philipp", "Jenny from the Block"));

    }

    public static int ifYouHadMyLove(String yourName, String theirName){

        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if (loveScore > 80) {
            System.out.println(yourName + "and"+ theirName +"You love each other like Kanye loves Kanye");
        }else if (loveScore > 40){
            System.out.println(yourName + "and"+ theirName +"You go together like coke and menthos");
        } else {
            System.out.println("No love possible. you'll be forever alone...");
        }

        // TODO : time 05:43 video 9

        return loveScore;
    }

}