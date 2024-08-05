
public class Finonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		fibUntilN(n);

	}
	public static void fibUntilN(int n) {
		int num1=0;
		int num2=1;
		if(n==0) {
			System.out.print(num1 );
		}else {
			System.out.print(num1+" "+num2);
			if(n==1) {
				System.out.print(" "+(num1+num2));
			}
			for(int i=2;i<=n;i++) {
				int fib=num1+num2;
				if(fib>n) {
					break;
				}
				System.out.print(" "+fib);
				num1=num2;
				num2=fib;
			}
		}
	}

}
