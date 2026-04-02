package task;

@FunctionalInterface
interface StringLength {
    int getLength(String s);
}

public class CustomStringLength {
    public static void main(String[] args) {

        StringLength obj = str -> str.length();

        String name = "Sagar";
        System.out.println("Length: " + obj.getLength(name));
    }
}