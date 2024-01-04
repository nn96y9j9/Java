
public class Test9X9 {

	public static void main(String[] args) {
		
		//1X1=1...1X9=9
		//2X1=2...2X9=18
		//9X1=9...9X9=81
		
		//先印第一排 ,println的ln為換行功能
		//int i = 2;//1x...
		//for(int j=1 ; j<=9 ; j++) {
			//System.out.print(i +"x" + j +"="+(i*j)+";");
		//}

		//迴圈不限層數，實務多做至兩到三層
		for(int i=1 ; i <= 9 ; i++) {
			for(int j=1; j <= 9 ; j++) {

				System.out.print(i +"x" + j +"="+(i*j)+"	");//可用/t表示
			}
			System.out.println();
			//F6執行下步驟
			
            //i==4 && j==4;
			//jupyter 學習
		}
		
		

	}

}
