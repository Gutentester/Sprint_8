public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        int maxSizeName = 19;
        int minSizeName = 3;
        if ((name.length() >= minSizeName) && (name.length() <= maxSizeName)
                && ((name.matches(".* .*") && !(name.matches(".* .* .*"))
                && (!(name.startsWith(" ")) && !(name.endsWith(" ")))))) {
            System.out.println("Имя и фамилия корректны");
            return true;
        } else
            System.out.println("Имя и фамилия некорректны");
            return false;
    }

}