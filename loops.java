public class loops{
    public static void main(String[] args){

        //declare a variable
        int x = 0;

        while (x < 5){ //while the variable is less than 5, do everything in these curly braces
            System.out.println(x); // print the value of the variable
            x++; //increment the value by one
        }
        
        do { //execute the contents of these curly braces at least once
            System.out.println(x);
            x--;
        } while (x % 2 == 0 || x > 0 && x != 5); // then check to see if this is true, if it is, continue.


        //a for loop is different from a while loop, with a for loop you typically have a set number of times for the code to execute.

        //   declare the variable   State the condition to check    at the end of the for loop, increment the variable.
        for (int i=0;               i < 100;                        i++){ 
            if (i % 10 == 0) System.out.println(i);
        }

        //create a list of strings called foods.
        String[] foods = {"Pizza","Ice Cream","Lasagna","Enchiladas","Biscuits"};

        //in this case, it says for each string in foods, execute the following code
        for (String i: foods) {
            System.out.println(i); // print out the current string.
        }

        // while x is less than 1 million, do the following
        while (x < 1000000){
            if (x == 4) break; //if x is 4, exit the loop
            System.out.println(x); // print out the value of x
            x++; //increment x by one
        }

        //declare j = 0, run while j is less than 10, and increment j each time
        for (int j = 0; j < 10; j++){
            if (j % 2 == 0) continue;// if j is divisible by 2, skip to the next step
            System.out.println(j);//print out the value of j
        }
    }
}