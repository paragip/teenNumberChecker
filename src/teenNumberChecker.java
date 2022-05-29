public class teenNumberChecker {
    public static void main (String[] args) {
        System.out.println(hasTeen(3,15,6));
        System.out.println(isTeen(15));
    }

    public static boolean hasTeen(int param1, int param2, int param3){
        return (param1 >= 13 && param1 <= 19) || (param2 >= 13 && param2 <= 19) || (param3 >= 13 && param3 <= 19);
    }

    public static boolean isTeen(int parameter){
        return (parameter >= 13 && parameter <= 19);
    }
}
