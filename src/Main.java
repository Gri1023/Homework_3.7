public class Main {
    public static void main(String[] args) {
        boolean a = true, b = true;
        if (!a && !b || a && b)
            System.out.println(true);
        else
            System.out.println(false);
    }
}