public class JvmComprehension { /*С помощью classLoader подгрузились
                                    JvmComprehension.class, String.class, Integer.class
                                    Object.class в metaspace*/

    public static void main(String[] args) { //Создается новый фрейм main()
        int i = 1;                      // 1 В куче создался примитив int со значением 1,  со ссылкой на него во фрейме main()
        Object o = new Object();        // 2 В куче создался объект типа Object, со ссылкой на него во фрейме main()
        Integer ii = 2;                 // 3 В куче создался объект типа Integer = 2, со ссылкой на него во фрейме main()
        printAll(o, i, ii);             // 4 В стеке был добавлен новый фрейм printAll(), внутри фрейма создаются переменные o,i,ii - ссылки на объекты
        System.out.println("finished"); // 7 В стеке был добавлен новый фрейм println(). В куче создался объект типа String = "finished".
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 В куче создался объект типа Integer = 700, ссылка в стеке printAll() uselessVar
        System.out.println(o.toString() + i + ii);  // 6 В стеке добавился фрейм toString(), затем println()
    }
}
