package task3.rainbow;

public class Rainbow {
    private static final String COLOR_0 = "Красный";
    private static final String COLOR_1 = "Оранжевый";
    private static final String COLOR_2 = "Жёлтый";
    private static final String COLOR_3 = "Зеленый";
    private static final String COLOR_4 = "Голубой";
    private static final String COLOR_5 = "Синий";
    private static final String COLOR_6 = "Фиолетовый";

    private static final String COLOR_7 = "Красно-" + COLOR_1;
    private static final String COLOR_8 = "Оранжево-" + COLOR_2;
    private static final String COLOR_9 = "Жёлто-" + COLOR_0;
    private static final String COLOR_10 = "Зелено-" + COLOR_4;
    private static final String COLOR_11 = "Голубо-" + COLOR_2;
    private static final String COLOR_12 = "Сине-" + COLOR_6;
    private static final String COLOR_13 = "Фиолетово-" + COLOR_5;

    public void color(int num) {
        switch (num) {
            case 0:
                print(COLOR_0);
                break;
            case 1:
                print(COLOR_1);
                break;
            case 2:
                print(COLOR_2);
                break;
            case 3:
                print(COLOR_3);
                break;
            case 4:
                print(COLOR_4);
                break;
            case 5:
                print(COLOR_5);
                break;
            case 6:
                print(COLOR_6);
                break;
            default:
                System.out.println("Попробуйте еще раз, такого значения нет!");
        }
    }

    public void colorMix(int num) {
        switch (num - 7) {
            case 0:
                print(COLOR_7);
                break;
            case 1:
                print(COLOR_8);
                break;
            case 2:
                print(COLOR_9);
                break;
            case 3:
                print(COLOR_10);
                break;
            case 4:
                print(COLOR_11);
                break;
            case 5:
                print(COLOR_12);
                break;
            case 6:
                print(COLOR_13);
                break;
            default:
                System.out.println("Попробуйте еще раз, такого значения нет!");
        }
    }

    public void print(String str) {
        System.out.println("Вы выбрали ".concat(str) + " цвет!");
    }
}
