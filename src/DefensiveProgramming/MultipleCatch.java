package DefensiveProgramming;

public class MultipleCatch {
    public static void main(String[] args){
        try{
            int[] numbers = new int[5];

            numbers[5] = 10/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());

        }
    }
}
