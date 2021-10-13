package javaBuoi6Mang;
import java.util.Scanner;
public class Bai1 {

	public static void NhapMang(int[] arr, int n) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap mang:");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu" + (i + 1) + " ");
			arr[i] = input.nextInt();
		}
	}
	
	public static double Tbc(int[] arr, int n) {
		double tbc = 0;
		int s = 0;
		for(int i = 0; i < n; i++) {
			s+= arr[i];
		}
		tbc = (double)s/n;
		return tbc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu cua mang");
		n = input.nextInt();
		int[] arr = new int[n];
		
		NhapMang(arr, n);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		double tbc = Tbc(arr, n);
		System.out.println("Trung binh cong: " + tbc);
	}

}
