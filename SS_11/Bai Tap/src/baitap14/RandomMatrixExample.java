package baitap14;

import java.util.ArrayList;
import java.util.Random;

public class RandomMatrixExample {
    public static void main(String[] args) {
        // Tạo một ma trận vuông với kích thước ngẫu nhiên từ 1 đến 10
        int size = getRandomNumberInRange(1, 10);
        ArrayList<ArrayList<Integer>> matrix = createRandomMatrix(size);

        // In ra ma trận vuông
        System.out.println("Ma trận vuông:");
        printMatrix(matrix);
    }

    // Phương thức tạo một số ngẫu nhiên trong khoảng từ min đến max
    private static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    // Phương thức tạo ma trận vuông với kích thước ngẫu nhiên và giá trị ngẫu nhiên từ 0 đến 100
    private static ArrayList<ArrayList<Integer>> createRandomMatrix(int size) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(getRandomNumberInRange(0, 100));
            }
            matrix.add(row);
        }

        return matrix;
    }

    // Phương thức in ra ma trận vuông
    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (Integer value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}

