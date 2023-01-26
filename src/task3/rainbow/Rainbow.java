package task3.rainbow;

public class Rainbow {

    private static final String[] COLOR = new String[]{"Красный", "Оранжевый", "Жёлтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

    public void color(int num) {
        String str = "";
        char c;
        if (num == 12) {
            c = 'е';
        } else {
            c = 'о';
        }
        if (num > 6) {
            str = COLOR[num - 7].substring(0, COLOR[num - 7].length() - 2).concat(c + "-");
        }
        switch (num) {
            case 0, 1, 2, 3, 4, 5, 6:
                print(COLOR[num]);
                break;
            case 7:
                print(str + COLOR[2]);
                break;
            case 8:
                print(str + COLOR[6]);
                break;
            case 9:
                print(str + COLOR[1]);
                break;
            case 10:
                print(str + COLOR[4]);
                break;
            case 11:
                print(str + COLOR[3]);
                break;
            case 12:
                print(str + COLOR[0]);
                break;
            case 13:
                print(str + COLOR[5]);
                break;
            default:
                System.out.println("Попробуйте еще раз, такого значения нет!");
        }
    }

    public void print(String str) {
        System.out.println("Вы выбрали ".concat(str) + " цвет!");
    }
}
