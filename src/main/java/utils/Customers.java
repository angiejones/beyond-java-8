package utils;

public class Customers {

    //Demonstrates Switch Expressions (Java 12)
    public static String getCustomerId(String name) {
        return switch(name){
            case "john" -> "12212";
            case "mary" -> "4847474";
            case "tom" -> "293743";
            default    -> "";
        };
    }
}