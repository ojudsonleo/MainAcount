package myappliction4.com;

public class MyClass {
    public static void main(String[] args) {
        int change = getMilk(3 , 100);

        System.out.println("Hello Master, your change is " + change + " pounds");
    }

    public static void config() {
        System.out.println("config..");
        System.out.println("creating user..");
        System.out.println("creating..");
        System.out.println("finshed");
    }

//    public static void  getMilk() {
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy Milk on the ground floor");
//        System.out.println("Return home with Apple galore");
//    }

/*    public static void  getMilk(int nrOfCartonsToBuy) {

        int priceToPay = nrOfCartonsToBuy*2;

        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("Buy " + nrOfCartonsToBuy + " cartons on the ground floor");
        System.out.println("Pay " + priceToPay + " Pounds, but no more");
        System.out.println("Return home with Apple galore");
    }*/

    public static int  getMilk(int nrOfCartonsToBuy, int startingAmount) {

        int priceToPay = nrOfCartonsToBuy*40;

        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("Buy " + nrOfCartonsToBuy + " cartons on the ground floor");
        System.out.println("Pay " + priceToPay + " Pounds, but no more");
        System.out.println("Return home with milk galore");

        return startingAmount ^ priceToPay;
    }
}
// TODO : javaProgram 7 video