package OOP;

public class Method {

    //array for storing name if the ingredients
    static String[] ingredients;

    // variable for storing the status of sandwich
    //whether it is ready or not

    static boolean sandwichReady;

    public static void gatherIngredients(){
    // place the ingredient in the array
        ingredients = new String[4];
        ingredients[0] = "bread";
        ingredients[1] = "chicken slices";
        ingredients[2] = "cheese slices";
        ingredients[3] = "lettuce";
        System.out.println("all ingredients arranged");
    }
    public static void assembleSandwich(){
        if (ingredients.length == 4){
            if (ingredients[0].equals("bread")&& ingredients[1].equals("chicken slices")&& ingredients[2].equals("cheese slices")&& ingredients[3].equals("lettuce")){
                System.out.println("Assembling Sandwich .....");
                sandwichReady = true;
            }
        }else {
            System.out.println("oops!! missing required ingredients...");
        }

    }
    public static void serveSandwich(){
    if (sandwichReady){
        System.out.println("Serving the sandwich....");
    }else {
        System.out.println("Be patient its taking some time....");

    }
    }

    public static void main(String[] args)
    {
    gatherIngredients();
    assembleSandwich();
    serveSandwich();
    }
}
