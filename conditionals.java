public class conditionals {
    public static void main(String[] args) {
        
        //If statements
        if (true) {System.out.println("This statement is true");} //the code inside the {} only executes if the condition evaluates to true
        if (5 + 5 == 10){
            System.out.println("5 + 5 = 10"); //since 5 + 5 is equal to 10, it prints the string
        }
        //declare and define a variable
        int x = 0;

        if (x > 5) { //if the variable is greater than 5, do the following
            System.out.println(x + " is greater than 5"); //print (the value of the variable, in this case 0) is greater than 5
        } else if (x < 5) { //if the above is not true, check to see if the variable is less than 5
            System.out.println(x + " is less than 5"); // if it is, print out the value of the variable, and say it's less than 5
        }
        //Switch Statement

        int month = 13;
        switch (month) {
            case 1: //if month = 1
            System.out.println("January"); //print January
            break; //don't check anything else
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
            System.out.println("There are only 12 months in a year");
        }
    }
}