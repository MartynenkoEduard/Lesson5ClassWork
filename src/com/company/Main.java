package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        classWorkExercise1();
//        classWorkExercise2();
//        classWorkExercise3();
//        classWorkExercise4();
//        classWorkExercise5();
//        classWorkExercise6();
        classWorkExercise7();
    }

    public static void classWorkExercise1() {
        // 1. Найти наибольший и наименьший элементы Двумерного
        //массива вещественных чисел В[m, n].
        int m = 10;
        int n = 10;
        float max = 0;
        float min = 0;
        Random random = new Random();
        float B[][] = new float[m][n];

        for (int column = 0; column < m; column++) {
            System.out.println();
            for (int row = 0; row < n; row++) {
                B[column][row] = random.nextFloat() * 100;
                System.out.printf("%5.1f", B[column][row]);
                if (B[column][row] > max)
                    max = B[column][row];
                if (B[column][row] < min)
                    min = B[column][row];
            }
        }
        System.out.println(System.lineSeparator() + "max : " + max);
        System.out.println("min : " + min);
    }

    public static void classWorkExercise2() {
        //2. Найти сумму элементов Двумерного массива
        //вещественных чисел C[15, 15], расположенных на
        //главной диагонали. (элементы главной диагонали – это
        //элементы у которых индекс столбца и строки совпадает,
        //например matrix[1][1] – второй элемент главной
        //диагонали матрицы)
        int sum = 0;
        int sum1 = 0;
        int rows = 15;
        int columns = 15;
        Random random = new Random();
        int array[][] = new int[columns][rows];
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                array[column][row] = random.nextInt(50);
                System.out.print(array[column][row] + " ");
            }
            System.out.println();
        }
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                if (column == row) {
                    sum += array[column][row];
                }
            }
        }
        System.out.println(System.lineSeparator() + "First variant : " + sum);

        for (int i = 0; i < rows; i++) {
            sum1 += array[i][i];
        }
        System.out.println("Second variant : " + sum1);

    }

    public static void classWorkExercise3() {
        //3. Найти номер строки и столбца Двумерного массива для
        //максимального элемента этого массива. Аналогично для
        //минимального.
        int rows = 15;
        int columns = 15;
        int maxValue = 0, maxColumn = 0, maxRow = 0;
        Random random = new Random();
        int array[][] = new int[columns][rows];
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                array[column][row] = random.nextInt(50);
                System.out.print(array[column][row] + " ");

                if (array[column][row] > maxValue) {
                    maxValue = array[column][row];
                    maxColumn = column;
                    maxRow = row;
                }
            }
            System.out.println();
        }
        System.out.println(" Max value : " + maxValue);
        System.out.println("Number of column : " + maxColumn);
        System.out.println("Number of row : " + maxRow);
    }

    public static void classWorkExercise4() {
        //Задан Двумерный массив вещественных чисел. Найти:
        //а) максимальную сумму абсолютных значений
        //элементов по строкам и номер строки с такой суммой;
        //б) максимальную сумму абсолютных значений
        //элементов по столбцам и номер столбца с такой суммой.

        final int ROWS = 5;
        final int COLUMNS = 5;
        int[] sumColumns = new int[ROWS];
        int[] sumRows = new int[COLUMNS];
        int sumRowsElementMax = 0;
        int sumRowsElementMaxPosition = 0;


        Random random = new Random();
        int array[][] = new int[COLUMNS][ROWS];
        for (int column = 0; column < COLUMNS; column++) {
            System.out.println();

            for (int row = 0; row < ROWS; row++) {
                array[column][row] = random.nextInt(50);
                System.out.print(array[column][row] + " ");
            }
        }

        for (int column = 0; column < COLUMNS; column++) {
            for (int row = 0; row < ROWS; row++) {
                sumRows[column] += array[column][row];
            }
        }
        System.out.println();
        System.out.println("Sum elements on rows : ");
        System.out.println(Arrays.toString(sumRows));

        for (int i = 0; i < COLUMNS; i++) {
            if (sumRows[i] > sumRowsElementMax) {
                sumRowsElementMax = sumRows[i];
                sumRowsElementMaxPosition = i;
            }
        }
        System.out.println("Max value : " + sumRowsElementMax);
        System.out.println("Position : " + sumRowsElementMaxPosition);
    }

    public static void classWorkExercise5() {
        //5. Дан Двумерный массив. Определить:
        //а) количество максимальных элементов в массиве;
        //б) количество минимальных элементов в массиве.
        final int ROWS = 5;
        final int COLUMNS = 5;
        int counterMax = 0;
        int counterMin = 0;
        int maxValue = 0;
        int minValue = 0;
        Random random = new Random();
        int array[][] = new int[COLUMNS][ROWS];
        for (int column = 0; column < COLUMNS; column++) {
            System.out.println();
            for (int row = 0; row < ROWS; row++) {
                array[column][row] = random.nextInt(10) - 5;
                System.out.print(array[column][row] + " ");
            }
        }
        for (int column = 0; column < COLUMNS; column++) {
            for (int row = 0; row < ROWS; row++) {
                if (array[column][row] > maxValue)
                    maxValue = array[column][row];
                if (array[column][row] < minValue)
                    minValue = array[column][row];
            }
        }
        for (int[] subArray : array) {
            for (int element : subArray) {
                if (element == maxValue)
                    counterMax++;
                if (element == minValue)
                    counterMin++;
            }
        }
        System.out.println();
        System.out.println("Max : " + maxValue);
        System.out.println("Min : " + minValue);
        System.out.println("Quantity of MAX value : " + counterMax);
        System.out.println("Quantity of MIN value : " + counterMin);
    }

    private static void printArray(double[][] array) {
        System.out.println();
        for (double[] row : array) {
            for (double element : row) {
                System.out.print(String.format("%6.2f", element));
            }
            System.out.println();
        }
    }

    public static void classWorkExercise6() {
//Дан Двумерный массив целых чисел. В каждом его
//столбце найти:
//а) сумму нечетных элементов;
//б) количество положительных элементов;
//в) количество элементов, кратных а или b.
        final int ROWS = 5;
        final int COLUMNS = 5;
        int counter = 0;
        int a = 2, b = 3;
        int multipleCounter = 0;
        int[] sumOddElements = new int[COLUMNS];
        Random random = new Random();

/*        int array[][] = new int[COLUMNS][ROWS];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        for (int column = 0; column < COLUMNS; column++) {
            System.out.println();
            for (int row = 0; row < ROWS; row++) {
                System.out.print(array[column][row] + " ");
            }
        }*/

        int array[][] = new int[COLUMNS][ROWS];
        for (int column = 0; column < COLUMNS; column++) {
            System.out.println();
            for (int row = 0; row < ROWS; row++) {
                array[column][row] = random.nextInt(10) - 5;
                System.out.print(array[column][row] + " ");
            }
        }

        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                if (array[column][row] % 2 != 0) {
                    sumOddElements[row] += array[column][row];
                }
                if (array[column][row] > 0)
                    counter++;
                if ((array[column][row] % a == 0) || (array[column][row] % b == 0))
                    multipleCounter++;
            }
        }
        System.out.println();
        System.out.println("Sum of odd elements in column : " + Arrays.toString(sumOddElements));
        System.out.println("Quantity of positive elements : " + counter);
        System.out.println("Quantity of multiple A or B  elements : " + multipleCounter);
    }

    public static void classWorkExercise7() {
        //Дан Двумерный массив из четного числа строк. Поменять
        //местами первую строку со второй, третью — с четвертой
        //и т. д.
        final int ROWS = 6;
        final int COLUMNS = 6;
        Random random = new Random();
        int array[][] = new int[COLUMNS][ROWS];
        for (int column = 0; column < COLUMNS; column++) {
            System.out.println();
            for (int row = 0; row < ROWS; row++) {
                array[column][row] = random.nextInt(10);
                System.out.printf("%3d", array[column][row]);
            }
        }

        int temp = 0;
        for (int column = 0; column < COLUMNS; column += 2) {


            for (int row = 0; row < array[0].length; row++) {
                temp = array[0][row];
                array[0][row] = array[0 + 1][row];
                array[0 + 1][row] = temp;
            }
//            System.out.println();
//            System.out.println(Arrays.toString(array[0]));
//            System.out.println(Arrays.toString(array[1]));
        }

        System.out.println(System.lineSeparator());
        for (int column = 0; column < array.length; column++) {
            for (int row = 0; row < array[column].length; row++) {
                System.out.printf("%3d", array[column][row]);
            }
            System.out.println();
        }
    }
}