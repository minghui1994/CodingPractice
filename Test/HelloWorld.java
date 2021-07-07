import java.util.HashMap;

class HelloWorld {

    static {
        System.out.println("STATIC BLOCK");
    }

    public static void main(String[] args) {
        
        System.out.println("MAIN METHOD");
        String str = "This is a test string";
        System.out.println(str.substring(10, str.length()));
    }
}