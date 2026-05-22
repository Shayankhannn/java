package DefensiveProgramming;

public class TryCatch {
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            int result = a/b;
        }catch (ArithmeticException e){
            System.out.println("cannot devideby zero");
        }
    }
}
