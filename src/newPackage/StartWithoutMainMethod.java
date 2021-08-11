package newPackage;

public class StartWithoutMainMethod {
    static {
        System.out.println("Possibility of start program without main method!");
        System.exit(0);
//        Теоретически и в старых версиях это работало.
//        Вероятно, в новой версии IntelliJ IDEA это пофиксили и теперь среда разработки
//        не дает запустить программу без метода main.

    }
}
