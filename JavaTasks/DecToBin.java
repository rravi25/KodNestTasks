
public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec=10;
//		int or=dec;
//		String str="";
//		
//		while(dec!=0) {
//			int rem=dec%2;
//			str=rem+str;
//			dec/=2;
//	  }
//		System.out.println("Binary of "+or+" is "+str);
		System.out.println(decToBinary(12));

	}
	//using a digitCounter
	public static int decToBinary(int num) {
		int ans=1;
		int count=0;
		while(num!=0) {
			count++;
			int rem=num%2;
			if(count==1) {
				ans*=rem;
			}else {
				for(int i=1;i<=count;i++) {
					rem=rem*10;
				}
				ans+=rem;
			}
			num/=2;
		}
		return ans;
	}
	public static int digitCounter(int n) {
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;
	}

}
