public class Dog {
    public static void main(String[] args) {
        String s;
        s = apport("косточка", 20);
        System.out.println(s);
    }

     static String apport(String it, int amount) {
         String result;
         result = "Пожеванная " + it + ", количество " + amount;
         return result;
    }
}