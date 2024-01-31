import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập số cân nặng của bạn(Kg):");
        weight = scanner.nextDouble();

        System.out.print("Nhập chiều cao của bạn(m):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.print("Tình trạnh sức khoẻ của bạn:");
        if(bmi < 18)
            System.out.printf("%-20s%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("Bạn có chỉ số BMI:"+bmi+" Sức khoẻ bình thường.");
        else if (bmi < 30)
            System.out.printf("Bạn có chỉ số BMI: "+bmi+" Bạn bị thừa cân.");
        else
            System.out.printf("Bạn có chỉ số BMI: "+bmi+" Bạn bị béo phì.");
    }
}
