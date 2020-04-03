
public class CalculadoraVer {

	private int num1,num2;

	public CalculadoraVer(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public CalculadoraVer(int num1){
		this.num1 = num1;
	}
	
	
	private int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	
	private int restar(int num1, int num2) {
		return num1-num2;
	}
	
	
	
}
