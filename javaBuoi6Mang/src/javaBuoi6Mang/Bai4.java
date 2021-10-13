package javaBuoi6Mang;
import java.util.Random;
import java.util.Scanner;
public class Bai4 {

	public static void NhapMangInt(int[] arr, int n) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
        int ranNum;
		System.out.println("Sinh so cho mang:");
		for(int i = 0; i < n; i++) {
			ranNum = rand.nextInt(100)+1;
			System.out.print(ranNum + " ");
			arr[i] = ranNum;
		}
	}
	
	public static void PrintLeftToRight(int[] arr, int n) {
		System.out.println("In tu trai sang phai");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void PrintRightToLeft(int[] arr, int n) {
		System.out.println("In tu phai sang trai");
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu cua mang");
		n = input.nextInt();
		int[] arrInt = new int[n];
		
		NhapMangInt(arrInt, n);
		PrintLeftToRight(arrInt, n);
		PrintRightToLeft(arrInt, n);
	}

}
