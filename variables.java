//the class name needs to be the same as the file name
public class variables {
    //need to include (String[] args) as parameters
    public static void main(String[] args) {

        String myString = "Hello";
        System.out.println(myString);

        //options for integers are byte, short, int, long, each double the size of the previous
        int myInt = 5;
        System.out.println(myInt);
        
        //to be used with one decimal place.
        float myFloat = 5.5f;
        System.out.println(myFloat);
        
        //to be used for more decimal places, such as money
        double myDouble = 3.1415d;
        System.out.println(myDouble);

        //java uses unicode, not ascii
        char myChar = 'f';
        System.out.println(myChar);
        
        //this can only be true or false.
        boolean myBool = true;
        System.out.println(myBool);
    }
}