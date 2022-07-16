//necessary to get user input
import java.util.Scanner;


public class functions {

    //a function that finds the sum of two numbers
    static double sum(double a, double b){
        return a + b;
    }

    //a function to get user input
    static double getInput(){
        System.out.println("Enter a number");// request user input
        Scanner myObj = new Scanner(System.in);//accept user input
        return Double.parseDouble(myObj.nextLine());//parse the input

    }

    //the main function, it's the place where everything runs from.
    public static void main(String[] args) {
        double a = getInput(); // call geInput, and assign the return value to the double variable a
        double b = getInput(); //do the same for b
        System.out.printf("The sum of %f and %f is %f", a,b,sum(a,b)); // print out the sum of a and b
    }
}