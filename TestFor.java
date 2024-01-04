import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {
        // i:index
		int i = 1 ; 
		for (  ; i <= 100	; i++ ) {
			System.out.println(i);
			//i = 99, 
			//i = 100,
			//i = 101, 不符合<=100, 跳脫迴圈
		}
		// i 僅能作用於本大括號
		// i cannot resolved to a variable 
		System.out.println("finally i =" + i);
		
		int sum = 0;
		for (int k = 1 ; k <= 100 ; k++) {
			sum = sum + k ;
		}
		System.out.println("總和=" + sum);
		
		
		int sum1 = 0;
		for (int z = 1 ; z <= 100 ; z = z + 2 ) {
			sum1 = sum1 + z ;
		}
		System.out.println("總和=" + sum1);
		// z=1 sum1 = 0+1
		// z=3 sum1 = 1+3
		// z=5 sum1 = 4+5
		
		
		//While迴圈
		int sum2 = 0;
		for (int h = 1 ; h <= 100; h++) {
			//如果偶數跳過
			if (h%2 == 0) {
				continue;
			}
		if (h >= 50) break; //加到超過50就停止
		System.out.println("h=" +h);
		sum2 = sum2 + h;
		
		System.out.println(sum2);
		
		}

		int c = 1;
		int sum3 = 0;
		while (c <= 100) {
			sum3 += c;
			c++;
		}
		System.out.println("while="+sum3);
		
		//DO WHILE
		int v = 1;
		int sumofDoWhile = 0;
		do {
			sumofDoWhile += v;
			v++;
		}while (v<=100);
		System.out.println("sum of Dowhile="+sumofDoWhile);
		
		
		
		
		
	}	
}

	
		