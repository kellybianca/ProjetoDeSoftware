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
	
	 public boolean ehNumero(String elemento){
	        return elemento.matches("[0-9]+");
	    }
	
	public String verificarCpf(String cpf) {
		boolean flag = false;
		while(!flag){
			try {
				cpf = input.nextLine();
				if(cpf.length() == 11) {
					if(ehNumero(cpf)) {
						flag = true;
						System.out.println("CPF válido");
					}
				}
				else {
					throw new Exception();
				}
				
			}catch(Exception e){
				flag = false;
				System.out.println("Dados invalidos, só pode ter números e 11 digitos");
			}
		}
		return cpf;
	}
}
