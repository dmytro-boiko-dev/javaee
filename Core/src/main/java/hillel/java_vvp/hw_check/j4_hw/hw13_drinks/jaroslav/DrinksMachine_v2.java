package hillel.java_vvp.hw_check.j4_hw.hw13_drinks.jaroslav;
//In this enum, I use arguments for constants by creating a constructor.
//Also, I use a method for creating a menu.
public enum DrinksMachine_v2 {
    COFFEE(3.50, "Кофе"),
    TEA(2.50, "Чай"),
    LEMONADE(5.00, "Лимонад"),
    MOJITO(12.25, "Мохито"),
    SODA(4.25, "Минеральная вода"),
    COCACOLA(8.75, "Coca Cola");

    private final double price;
    private final String name;

    DrinksMachine_v2(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static void printPriceList(){
        System.out.println(Colors.RED + "┃│ᨉᨊᨉᨊᨉᨊᨉᨊᨉᨊᨉᨊᨉᨉᨊᨉᨊᨆᨈᨆᨈᨆᨈ ᨆ  ᨈ   ᨆ    ᨈ     ᨆ      ᨈ" + Colors.RESET);
        System.out.println(Colors.RED + "┃│            " + Colors.RED_INTENSE + "◦ М ◦ Е ◦ Н ◦ Ю ◦" + Colors.RESET);
        System.out.println(Colors.RED + "┃│     " + Colors.DARK_GRAY_BLACK_BG + "Предлагаем напитки в ассортименте" + Colors.RESET);
        System.out.println(Colors.RED + "┃│" + Colors.RESET);
        System.out.println(Colors.RED + "┃│  ☕" + Colors.YELLOW + "   " + DrinksMachine_v2.COFFEE.getName() + "...................€" + DrinksMachine_v2.COFFEE.price + Colors.RESET);
        System.out.println(Colors.RED + "┃│  ☕" + Colors.YELLOW + "   " + DrinksMachine_v2.TEA.getName() + "....................€" + DrinksMachine_v2.TEA.price + Colors.RESET);
        System.out.println(Colors.RED + "┃│  ☕" + Colors.YELLOW + "   " + DrinksMachine_v2.LEMONADE.getName() + "................€" + DrinksMachine_v2.LEMONADE.price + Colors.RESET);
        System.out.println(Colors.RED + "┃│  ☕" + Colors.YELLOW + "   " + DrinksMachine_v2.MOJITO.getName() + ".................€" + DrinksMachine_v2.MOJITO.price + Colors.RESET);
        System.out.println(Colors.RED + "┃│  ☕" + Colors.YELLOW + "   " + DrinksMachine_v2.SODA.getName() + ".......€" + DrinksMachine_v2.SODA.price + Colors.RESET);
        System.out.println(Colors.RED + "┃│  ☕" + Colors.YELLOW + "   " + DrinksMachine_v2.COCACOLA.getName() + "..............€" + DrinksMachine_v2.COCACOLA.price + Colors.RESET);
        System.out.println(Colors.RED + "┃│" + Colors.RESET);
        System.out.println(Colors.RED + "┃│ᨉᨊᨉᨊᨉᨊᨉᨊᨉᨊᨉᨊᨉᨉᨊᨉᨊᨆᨈᨆᨈᨆᨈ ᨆ  ᨈ   ᨆ    ᨈ     ᨆ      ᨈ" + Colors.RESET);

    }

}

