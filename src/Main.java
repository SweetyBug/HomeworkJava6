import java.util.*;

public class Main {
    public static Set<Notebook> notebookSet = new HashSet<>();

    public static Map<Integer, String> menu = new TreeMap<>();
    public static Scanner iScan = new Scanner(System.in);
    public static String menuOne() {
        String menu = "1.Посмотреть все варинты\n" +
                "2.Отфильтровать выбор";
        return menu;
    }

    private static void notebooks() {
        notebookSet.add(new Notebook("Irbis", "NB77", "Windows 10", "Black", 13.3f, "Intel Atom Z3735F", 4, 500));
        notebookSet.add(new Notebook("ASUS", "Laptop E410KA-BV1422W", "Windows 10", "gray", 14.0f, "Intel Celeron N4020", 4, 240));
        notebookSet.add(new Notebook("Echips", "Lite", "Windows 10", "red", 14.0f, "Intel Celeron J4005", 8, 240));
        notebookSet.add(new Notebook("Irbis", "NB276", "Windows 10", "Black", 15.6f, "Intel Pentium J3710", 4, 128));
        notebookSet.add(new Notebook("Lenovo", "V15", "Windows 11", "Black", 15.6f, "Intel Celeron N4020", 4, 128));
        notebookSet.add(new Notebook("ASUS", "Laptop 14 F415KA-EK025", "Windows 11", "gray", 14.0f, "Intel Celeron N4500", 8, 128));
        notebookSet.add(new Notebook("Lenovo", "IdeaPad 1 14ADA05", "Windows 10", "Black", 14.0f, "AMD Athlon Silver 3050e", 4, 500));
        notebookSet.add(new Notebook("Acer", "Extensa 15 EX215-31-C6FV", "Windows 10", "Black", 15.6f, "Intel Celeron N4020", 4, 256));
        notebookSet.add(new Notebook("HP", "15s-eq1129ur", "Windows 11", "Black", 15.6f, "AMD 3020e", 4, 256));
        notebookSet.add(new Notebook("Lenovo", "IdeaPad 3 15IGL05", "Windows 10", "Black", 14.0f, "Intel Celeron N4020", 4, 500));
    }

    public static void menuTwo() {;
        menu.put(1, "ОЗУ");
        menu.put(2, "Объём ЖД");
        menu.put(3, "Цвет");
        menu.put(4, "Модель");
        menu.put(5, "Операционная система");
        menu.put(6, "Диагональ экрана");
    }

    public static void main(String[] args) {
        notebooks();
        menuTwo();
        System.out.println("Приветсвую в нашем магазине ноутбуков!\nЧем я могу помочь?");
        System.out.println(menuOne());
        String user = "";
        while (!(user.equals("end"))) {
            user = iScan.nextLine();
            if (user.equals("1") || user.equals("Посмотреть все варианты") || user.equals("1.Посмотреть все варинты")) {
                for (Notebook notebook : notebookSet) {
                    System.out.println(notebook);
                }
            }   else if (user.equals("2") || user.equals("Отфильтровать выбор") || user.equals("2.Отфильтровать выбор")){
                    System.out.println("Введите цифру, соответствующую необходимому критерию");
                    for (Map.Entry<Integer, String> entry : menu.entrySet()) {
                        System.out.println(entry.getKey() + ". " + entry.getValue());
                    }
                    user = iScan.nextLine();
                    if (user.equals("1")) {
                        System.out.println("Введите значение: ");
                        int userScan = iScan.nextInt();
                        for (Notebook notebook : notebookSet) {
                            if (userScan == notebook.getRAM()) {
                                System.out.println(notebook);
                            }
                        }
                    } else if (user.equals("2")) {
                        System.out.println("Введите значение: ");
                        int userScan = iScan.nextInt();
                        for (Notebook notebook : notebookSet) {
                            if (userScan == notebook.getCapacityHD()) {
                                System.out.println(notebook);
                            }
                        }
                    } else if (user.equals("3")) {
                        System.out.println("Введите значение: ");
                        user = iScan.nextLine();
                        for (Notebook notebook : notebookSet) {
                            if (user.equals(notebook.getColor())) {
                                System.out.println(notebook);
                            }
                        }
                    } else if (user.equals("4")) {
                        System.out.println("Введите значение: ");
                        user = iScan.nextLine();
                        for (Notebook notebook : notebookSet) {
                            if (user.equals(notebook.getName())) {
                                System.out.println(notebook);
                            }
                        }
                    } else if (user.equals("5")) {
                        System.out.println("Введите значение: ");
                        user = iScan.nextLine();
                        for (Notebook notebook : notebookSet) {
                            if (user.equals(notebook.getoS())) {
                                System.out.println(notebook);
                            }
                        }
                    } else if (user.equals("6")) {
                        System.out.println("Введите значение: ");
                        float userScan = iScan.nextFloat();
                        for (Notebook notebook : notebookSet) {
                            if (userScan == notebook.getScreenDiagonal()) {
                                System.out.println(notebook);
                            }
                        }
                    }
            }
            System.out.println("Для выхода введите 'end'");
        }
        System.out.println("До встречи!");
    }


}
