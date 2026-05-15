//package fundamentals;
//
//public class Manipulating_String {
//
//    // uppercase
//
//    String welcomeToJavaString = "Welcome java";
//    // “welcomeToJavaStringInUpperCase” will be “WELCOME JAVA”
//    String welcomeToJavaStringInUpperCase = welcomeToJavaString.toUpperCase();
//
//    System.out.println("The string  " + welcomeToJavaString  + " in upper case is : " + welcomeToJavaStringInUpperCase );
//
//    // starts with
//    String testString = "This is a test";
//
//    boolean result1 = testString.startsWith("test"); // false
//    boolean result2 = testString.startsWith("This"); // true
//
//        System.out.println("testString.startsWith(\"test\") : " + testString.startsWith("test"));
//        System.out.println("testString.startsWith(\"This\") : " + testString.startsWith("This"));
//
//// ends with
//String testString = "This is a test";
//
//    boolean result1 = testString.endsWith("test"); // true
//    boolean result2 = testString.endsWith("This"); // false
//
//        System.out.println("testString.endsWith(\"test\") : " + testString.endsWith("test"));
//        System.out.println("testString.endsWith(\"This\") : " + testString.endsWith("This"));
//
//        // is empty
//
//    String testString1 = "This is a test";
//    String testString2 = "";
//
//    boolean stringEmpty1 = testString1.isEmpty(); // false
//    boolean stringEmpty2 = testString2.isEmpty();  // true
//
//
//        System.out.println("testString1.isEmpty() : " + testString1.isEmpty());
//        System.out.println("testString2.isEmpty() : " + testString2.isEmpty());
//
//        // index of
//
//    String testString = "This is a test which is nice";
//    int indexOfSearch1= testString.indexOf("Java"); // returns -1
//    int indexOfSearch2 = testString.indexOf("is"); // returns 2
//    int indexOfSearch3 = testString.indexOf("est"); // returns 11
//
//        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
//        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
//        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));
//
////    The output indicates that the substring starts at index number 2. It's important to note that this example treats a collection of characters as a substring, returning the index number of the first position of the first occurrence. If the substring is not present in the original String, the method will return an index number of -1.
////
////    Note: indexOfSearch1 is -1 because the string Java is not in testString. indexOfSearch2 is 2 because the first occurrence of the substring "is" starts at index position 2. indexOfSearch3 is 11 because it finds "est" in "test" at index 11.
//
//// substring
//
//    String testString = "This is a test";
//    String result1 = testString.substring(3);  //”s is a test”
//    String result2 = testString.substring(12); // “st”
//
//        System.out.println("testString.substring(3) : " + testString.substring(3));
//        System.out.println("testString.substring(12) : " + testString.substring(12));
//
//        // trim
//        String testString = "  This is a test	";
//    String result1 = testString.trim(); // results in “This is a test”
//
//    	System.out.println("testString : #" + testString + "#");
//        System.out.println("testString.trim() : #" +  testString.trim() + "#");
//
//        // equalsIgnoreCase(String stringToCompare)
//
//    String testString = "Java";
//
//    boolean result1 = testString.equalsIgnoreCase("java"); //true
//    boolean result2 = testString.equalsIgnoreCase("JAVA"); //true
//
//        System.out.println("testString.equalsIgnoreCase(\"java\") : " + testString.equalsIgnoreCase("java"));
//        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));
//
//    String testString = "Java";
//
//    // non-zero is not equal and zero means equal
//    int result1 = testString.compareTo ("java"); // returns -32
//    int result2 = testString.compareTo("JAVA"); // returns 32
//
//    int result3 = testString.compareToIgnoreCase("java"); // returns 0
//    int result4 = testString.compareToIgnoreCase("JAVA"); // returns 0
//
//
//    	System.out.println("------- Comparing with respect to case ----------");
//        System.out.println("testString.compareTo (\"java\") : " + testString.compareTo ("java"));
//        System.out.println("testString.compareTo(\"JAVA\") : " +  testString.compareTo("JAVA"));
//
//    	System.out.println("------- Comparing irrespective of case ----------");
//        System.out.println("testString.compareToIgnoreCase(\"java\") : " + testString.compareToIgnoreCase("java"));
//        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  testString.compareToIgnoreCase("JAVA"));
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
