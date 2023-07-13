package Day02;

public class Ex15_OddEven {
	public static void main(String[] args) {
		/*
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while(a <= 20) {
			if (a % 2 == 1)
				sum1 += a++;
			if (a % 2 == 0)
				sum2 += a++;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		*/
		int a=1, sum1=0, sum2=0;
		while (a <= 20) {
			sum1 += (a%2 == 1) ? a++ : 0 ;
			sum2 += (a%2 == 0) ? a++ : 0 ;			
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
