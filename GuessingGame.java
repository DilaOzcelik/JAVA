

import java.util.*;
public class Guessingame {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("1-100 arasında bir sayi tutunuz");

		int tahmin=0;
		int lower=1;
		int upper=100;
		int sayac=0;
		tahmin=(lower+upper)/2;

		for(;;)
		{	tahmin=(lower+upper)/2;
		System.out.printf("Guessing: %d (0:right guess 1:my number is lower 2:my number is higher) : ", tahmin);
		int secim=input.nextInt();


		if(secim==0)
		{
			System.out.println("BULUNDUU");
			sayac++;
		}
		else if(secim==1)
		{
			upper=tahmin;
			sayac++;
			//tahmin=(lower+upper)/2;
		}
		else if(secim==2)
		{
			lower=tahmin;
			sayac++;
			//tahmin=(lower+upper)/2;
		}
		}
		
	}

}
