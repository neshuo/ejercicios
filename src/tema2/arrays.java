package tema2;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		//a
		int raid[]=new int[9];
		int a=0;
		int raid2[]=new int [9];
		int raid2copia[]=new int [9];
		int raid3[]=new int[9];
		
		for(int i=0;i<raid.length;i++) {
			raid[i]= (int) (Math.random()*(31+1));
		//b
			System.out.println(raid[i]);
		}
		System.out.println("valores raid");
		for(int i=0;i<raid.length;i++) {
			System.out.println(raid[i]);
		}
		for(int i=0;i<raid.length;i++) {
			a=a+raid[i];
			
		}
		System.out.print("la suma:");
		System.out.println(a);
		System.out.print("la media:");
		System.out.println(a/10);
		
		//c
		Arrays.sort(raid);

		System.out.println("raid ordenada");
		for (int i=0;i<raid.length;i++)
		{
			System.out.println(raid[i]);
			
		}
		
		//d
		System.out.println("menor");
		System.out.println(raid[0]);
		System.out.println("mayor");
		System.out.println(raid[8]);
				
		//e
		Arrays.fill(raid2, -10);
		System.out.println("raid2 ordenada");
		for (int i=0;i<raid2.length;i++)
		{
			System.out.println(raid2[i]);
		}
		//f
		System.arraycopy(raid2,0,raid2copia,0,raid.length);
		System.out.println("raid2copia ordenada");
		for (int i=0;i<raid2copia.length;i++)
		{
			System.out.println(raid2copia[i]);
		}
		//g
		Arrays.fill(raid2copia,4,8,3);
		for (int i=0;i<raid2copia.length;i++)
		{
			System.out.println(raid2copia[i]);
		}
		//h
		System.out.println("raid3 es:");
		for(int i=0;i<raid3.length;i++) {
			raid3[i]=raid[i]*raid2[i];
			System.out.println(raid3[i]);
		}
		//i
		Arrays.sort(raid3);
		System.out.println("raid3 ordenada");
		for (int i=0;i<raid3.length;i++)
		{
			System.out.println(raid3[i]);
		}
		
		
		
		
	}
}

