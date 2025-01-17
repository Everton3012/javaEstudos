package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s.toUpperCase();
		s.replace("X", "Senhora");
		s.concat(s);
		System.out.println(s.toUpperCase().replace("X", "Senhora").concat(s));
	}
}
