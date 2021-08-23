// однострочный комментарий

/*
многострочный
комментарий
 */

/**
 * @author Dmitriy Tishcenko
 * @version 1.0
 */

public class Kitchen {
    // psvm + tab
    public static void main(String[] args) {
        System.out.println("Main");
        cookBreakfast();
        cookSoup();
    }

    static void cookSoup() {
        // sout + tab
        // Ctrl + D дублирование строки
        System.out.println("Boil water");
        System.out.println("...");
        System.out.println("done");
    }

    static void cookBreakfast() {
        System.out.println("Breakfast done");
    }
}