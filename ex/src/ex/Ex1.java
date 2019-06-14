package ex;

public class Ex1 {
	
	public String divisor(int num) {
		String str = num +"의 약수는 : ";
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				if(num!=i) {
					str +=i+",";
				}else str += i;
			}
		}	
		return str;
	}
	//소수 구하는 메소드 생성 
	public String primeNumber(int num) { 
		String str = num + "까지의 소수는 : ";
		for(int i=2; i<=num; i++) {
			boolean flag = true;
			for(int j=2; j<=i/2; j++) {
			//for(int j=2; j*j <=i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				str += i+",";
			}
		}
		//return str;
		return str.substring(0,str.trim().length()-1);
	}
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		Ex1 ex2 = new Ex1();
		
		System.out.println(ex1.divisor(10));
		System.out.println(ex2.primeNumber(100));
	}
}