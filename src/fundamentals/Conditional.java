package fundamentals;

public class Conditional {

    public static void main(String[] args) {

        String password = "secRetOfM3*@";

        if(password.compareTo("secRetOfM3*@") == 0 ) {
            System.out.println("Welcome");
        }

        String testString = "";

        if( testString.isEmpty() ) {
            System.out.println("The String is empty");
        }
//Determine if a String contains a substring
        String fullName = "Tim Berners Lee";
        String familyName = "Lee";

        if( fullName.contains(familyName) ) {
            System.out.println("The family name " + familyName + " exists in the name " + fullName);
        }
    }


//Compare two Strings
/*
 *
 *  Tip: Such code is used when comparing names so that it does not matter what case the user enters in
 *
 */
String testString1 = "This is java";
    String upperCaseTestString1 = testString1.toUpperCase();

    //this will not execute
        if( testString1.equals(upperCaseTestString1) ) {
        System.out.println("Value of testString1 is equal to is uppercase version");
    }

    String testString2 = "THIS IS JAVA";
    String upperCaseTestString2 = testString2.toUpperCase();

    //this will execute
        if( testString2.equals(upperCaseTestString2) ) {
        System.out.println("Value of testString2 is equal to is uppercase version");
    }


// assignment to do
//    Program 1:  Create a String that contains a substring "good". Query the String whether it contains the substring "good". If it does, the output should display "You get a gift from Santa". If the substring is not present, the output should display "Next year, please".

//    Program 2:  Create two Strings with same name but in different cases. Compare the two Strings, irrespective of the case.



}
