import java.util.regex.*;

/**
 * Created by user on 27.09.2016.
 */
class RegExpr {
    public static void main(String args[]){
        String InputString1 = "Java";
        String InputString2 = "Java 8";
        boolean found;

        Pattern pat = Pattern.compile("Java");

        Matcher mat = pat.matcher(InputString1);
        found = mat.matches();
        System.out.println("Проверка совпадения Java и Java:");
        if (found) {
            System.out.println("Совпадает.");
        }
        else System.out.println("Не совпадает.");

        mat = pat.matcher(InputString2);
        found = mat.matches();

        System.out.println("Проверка совпадения Java и Java 8:");
        if (found) {
            System.out.println("Совпадает.");
        }
        else System.out.println("Не совпадает.");

    }
}

/*
* Класс Pattern содержит фабричный метод matcher, возвращий объект типа Matcher.
* CharSequence - тип аргумента метода matcher()
* 1)Разные виды входных данных требуют разных движков, поэтому создание движка (экземпляра класса
* Matcher) доверено классу Pattern.
* Движок, т.е. объект mat типа Matcher формируется фабричным методом matcher() объекта
* pat типа Pattern:
*   Matcher mat = pat.matcher(InputString1);
* При создании экземпляра класса Matcher используется информация, содержащаяся в уже созданном
* экземпляре pat класса Pattern, а также некие строковые данные, передаваемые методу pat.matcher()
* в качестве аргументов.
* 2)Собственно сравнение выполняется методом matches() объекта mat типа Matcher (движка):
*   found = mat.matches();
*
*
* */