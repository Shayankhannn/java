package DefensiveProgramming;
//When no Exception occurs
public class Finally {

        public static void main(String[] args) {
            try {
                int[] array = {10, 20, 30, 40, 50};
                System.out.println(array[4]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("In the finally block!");
            }

            System.out.println("More code");
        }
    }

//But what if an Exception occurs and there is a catch block to handle it?

public class FinallyTestTwo {
    public static void main(String[] args) {
        try {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println(array[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In the finally block!");
        }

        System.out.println("More code");

    }
}

//When an exception occurs but is NOT handled by any catch block
public class FinallyTestThree {
    public static void main(String[] args) {
        try {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println(array[5]);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In the finally block!");
        }

        System.out.println("More code");
    }
}