package aristovo.task1;

/**
 * Вывести числа от 1000 до 1 с шагом -2.
 */
public class CounterReverse {

    public static void main(String[] args) {
        int startNumber = 1000;
        int finishNumber = 1;
        int step = -2;

        for (int i = startNumber; i > finishNumber; i += step) {
            System.out.println(i);
        }
    }

}
