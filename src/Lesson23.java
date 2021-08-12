public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");                               // добавить
        sb.append(" friend");
        sb.append("!");
        System.out.println(sb.toString());              // понятно что.
        sb.append(" And by!");
        System.out.println(sb.toString());
        sb.append(" Very").append(" interesting").append(" this").append(".");   // и так можно, менее затратно в плане кода
        System.out.println(sb.toString());
    }
    /*
    конкатинация при большом количестве конкатинируемых строк очень затратна в плане использования памяти.
    поэтому используем StringBuilder.
    String - не может изменить значение строки, приходится переопределять, и переменная будет ссылаться на
    другую строку.
    а StringBuilder - изменяет значение строки.
    */
}
