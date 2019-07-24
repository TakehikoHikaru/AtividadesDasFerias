package arrays;

import java.util.Arrays;
import java.util.Random;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ImprimeValorArray {

	static Random gerar = new Random();
	
	public static void ImprimeArray(int[] array) {
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		}
	
	public static void PreencheArray(int[] array) {
		for(int i = 0;i<array.length;i++) {
			array[i] = gerar.nextInt();
		}
		}
	
	
	public static void main(String[] args) {
		
		int[] Num =  new int[20];
		
		PreencheArray(Num);
		Arrays.sort(Num);
		ImprimeArray(Num);
		
		
	}

}
