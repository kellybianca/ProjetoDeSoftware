package excessoes;

import java.util.Scanner;

@SuppressWarnings("serial")
public class TratandoExcessoes extends Exception{

	String erro;
	Scanner input = new Scanner(System.in);
	boolean flag = false;
	
	public TratandoExcessoes(String erro) {
		this.erro = erro;
	}
	public TratandoExcessoes() {
		super();
	}
	
	public String getMenssage() {
		return "string digitada: "+this.erro;
	}
	
	public int lerInteiro(int senha1) {
		flag = false;
		senha1 = 0;
		while(!flag) {
			try {
				flag = true;
//				System.out.println("Senha: ");
				senha1 = input.nextInt();
				input.nextLine();
			}
			catch(Exception e) {
				flag = false;
				System.out.println("Só pode ter números");
				System.out.println("Insira novamente");
				input.nextLine();
			}
		}
		return senha1;	
	}
}
