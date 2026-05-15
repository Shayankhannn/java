package fundamentals;



public class string {
    public static void main(String[] args) {
        //TODO 1: Declare and initialize variable for First Name
        String firstName = "shayan";
        System.out.println("first name" + firstName);
        //TODO 1: Declare and initialize variable for Last Name
        String lastName = "saleem";
        System.out.println("last name" + lastName);
        //TODO 1: Declare and initialize variable for Movie Title
        String movieTitle = "Batman";
        System.out.println("movietitle" + movieTitle);
        //TODO 1: Declare and initialize variable for Number of tickets
        int numberOfTickets = 20;
        System.out.println("numberoftickes" + numberOfTickets);
        //TODO 1: Declare and initialize variable for Price per ticket
        int pricePerTicket = 10;
        System.out.println("price per ticket" + pricePerTicket);
        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        int totalPrice = numberOfTickets*pricePerTicket;
        System.out.println("total price" + totalPrice);
        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        String fullName = firstName + lastName;
        System.out.println("full name" + fullName.toLowerCase());

        // first and last name and convert them to lower case

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();
        System.out.println("updated movie name" + movieName);
        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("username :"  + fullName);
        System.out.println("movie :"  + movieName);
        System.out.println("number of tickets:"  + numberOfTickets);
        System.out.println("price per ticket :"  + pricePerTicket);
        System.out.println("total price :"  + totalPrice);
        System.out.println("thank you for choosing us enjoy!!");

    }
}
