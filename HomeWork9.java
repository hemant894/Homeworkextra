package HomeWorkExtra;

public class HomeWork9 {
    int x;

    // instant variable x which is inside the class and outside any method
    public void addition(){
        int a=99;
        int b=89;
        x=a+b;

        // we create a nd b local variable for addition method
        // only can use for local not for any other method
        System.out.println(" Sum of a and b is : " +x);
    }
    public void subtract(){
        int a=101;
        int b=90;
        x=a-b;
        // we use same a and b variable, but it does not make any difference because it local for each method.
        System.out.println(" A take away B is : "+ x);
    }
// now we call that variable method in main method by object
    // create the object use , provide class name then object ref. name = new (operator ) HomeWork( constructor name)
    // than () parameter instant new object
    public static void main(String[] args) {
        HomeWork9 ans1= new HomeWork9();
        ans1.addition();
        ans1.subtract();
    }
}
