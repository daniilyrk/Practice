public class Main {

    public static void main(String[] args) {
        int[][] Array = generateArray();
        printOfArray(Array);
        System.out.println();
        printOfArray(sortOfArray1(Array));
        clearArray(Array);
        System.out.println();
        printOfArray(sortOfArray2(Array));
        clearArray(Array);
        System.out.println();
        printOfArray(sortOfArray3(Array));
        clearArray(Array);
        System.out.println();
        printOfArray(sortOfArray4(Array));
        clearArray(Array);
        System.out.println();
    }

    //Метод, создающий массив
    public static int[][] generateArray() {
        int size = 11;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }

    //Вывод массива на экран
    public static void printOfArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Заполнение массива крестом
    public static int[][] sortOfArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (i + j == array.length - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    //Заполнение массива плюсом
    public static int[][] sortOfArray2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == array.length/2) || (j == array.length/2)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    //Заполнение массива квадратом
    public static int[][] sortOfArray3(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == 0)||(i == array.length - 1)||(j == 0)||(j == array.length - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    //Заполнение массива ромбом
    public static int[][] sortOfArray4(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if((i + j == 3 * array.length/2 - 1)||(i + j == array.length/2)
                        ||(i - j == array.length/2)||(j - i == array.length/2)){
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    //Очистка массива
    public static int[][] clearArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }
}