package operators;

public class Comparision_Logical {
	public static void main(String[] args) {
		int a=12;
		int b=12;
		
		//Comparision operator
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		//logical operator
		System.out.println((a<b)&&(a==b));
		System.out.println((a<b)||(a==b));
		System.out.println(!((a<b)||(a==b)));
		
	}

}
