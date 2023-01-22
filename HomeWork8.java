package HomeWorkExtra;

public class HomeWork8 {
    int a;
    // variable a which is integer type
    //  this is instant variable which is declared in the class but outside any method.
    // this is common variable which can be used again and again
    public void addition(){
        int b=10;
        int c=20;
        a=b+c;
        // b and c is local variable for addition method and not call by any other method.

        System.out.println(" Total of b and c is : "+ a);
    }
    public void difference(){
        int b= 300;
        int c=200;
        a= b-c;
//  we declared a and b variable in difference method
        // we can same a and b variable because it is local to this method, because never confused with any other method
        System.out.println(" Difference between b and c is : " + a);

        // we using a variable
    }
// we should call them in our main method and print the value
    // under main method  first we need to creat the object ref.

    public static void main(String[] args) {
        HomeWork8 abc1= new HomeWork8();
        abc1.addition();
        abc1.difference();

    }
}
