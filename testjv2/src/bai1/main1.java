package bai1;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // In mảng vừa nhập
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Tính tổng các phần tử
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Tổng các phần tử của mảng là: " + sum);
        // Tìm phần tử có giá trị lớn nhất và giá trị nhỏ nhất.

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Phần tử lớn nhất của mảng là: " + max);
        System.out.println("Phần tử nhỏ nhất của mảng là: " + min);

        // In và tính tổng các phần tử là số lẻ và chia hết cho 3.

        System.out.print("Các phần tử lẻ và chia hết cho 3 trong mảng là: ");
        int tongle = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
                tongle += arr[i];
            }
        }

        System.out.println("\nTổng các phần tử lẻ và chia hết cho 3 trong mảng là: " + tongle);

        // Sắp xếp các phần tử trong mảng theo thứ tự giá trị các phần tử giảm dần.
        int sapxep;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] < arr[j]) {
                    sapxep = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sapxep;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

    // Nhập một số nguyên dương x từ bàn phím. Đếm số lần xuất hiện của x trong mảng đã cho.










