public class YoungerOlder {

    public static void youngerOlder(String[] args) {
        int myAge = -50000;
        int herAge = 30;

        if (myAge < 0 || herAge < 0) {
            System.out.println("Invalid Age");
            System.out.println(Constants.INVALID_VALUE);
            System.exit(Constants.INVALID_VALUE);
        }
        else if (myAge == herAge){
            System.out.println("Same age");
        }
        else if (myAge > herAge) {
            System.out.println("Older than her");
        }
        else {
            System.out.println("Younger than her");
        }
    }
}