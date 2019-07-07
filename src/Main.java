import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = sc.nextInt();
        array = new int[size];
        System.out.println("mang nhap vao la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhap vao phan tu thu " + (i + 1)+ ": ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min cua mang la: " + min);
    }
}
