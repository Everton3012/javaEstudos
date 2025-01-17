package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.23456789789764;
		System.out.println(b);
		
		int c = 350;
		byte d = (byte) c;
		
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}
