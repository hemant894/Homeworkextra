package HomeWorkExtra;

public class HomeWork10 {
    int z;

    // Z is instant variable declared in class and outside any method
    public void division(){
        int x=100;
        int y=50;
        z=x/y;
        System.out.println(" Z is equal to = " + z);
        // made x and y local variable for division class and not use any other class
    }
    public void time(){
        int x=100;
        int y=50;
        z=x*y;
        System.out.println(" Z is equal to ="+ z);
    }
 // x and y for local for time class and not use for any other method

    // now for call instant variable in main method we have to create the object
    // create the object provide class name and then ref. mame = new (operator) HomeWork10 constructor name than parameters

    public static void main(String[] args) {
        HomeWork10 ins2 = new HomeWork10();
        ins2.time();
        ins2.division();
    }

}
