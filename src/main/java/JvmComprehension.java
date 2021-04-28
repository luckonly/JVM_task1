public class JvmComprehension { /*С помощью classLoader подгрузились system class,
                                 JvmComprehension.class в metaspace,  инициализация статического
                                метода printAll, инициализация константы uselessVar = 700*/

    public static void main(String[] args) {
        int i = 1;                      // 1 В куче создался объект int со значением 1,  со ссылкой на него  в стеке i
        Object o = new Object();        // 2 В куче создался объект Object, со ссылкой на него в стеке o
        Integer ii = 2;                 // 3 В куче создался объект Integer = 2, со ссылкой на него в стеке ii
        printAll(o, i, ii);             // 4 В стеке был добавлен новый фрейм
        System.out.println("finished"); // 7 В стеке был добавлен новый фрейм
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                 /*// 5 Была инициализирована в самом начале как константа,
                                                        объект Integer = 700 в куче, ссылка в стеке uselessVar */
        System.out.println(o.toString() + i + ii);  // 6 В стеке добавился фрейм toString(), затем println()
    }
}
