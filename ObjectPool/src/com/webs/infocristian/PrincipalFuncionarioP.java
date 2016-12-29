package com.webs.infocristian;

public class PrincipalFuncionarioP {

	public static void main(String[] args) {

		Pool<Funcionario> funcionarioP = new FuncionarioP();
		Funcionario funcionario = funcionarioP.acquire();
		while(funcionario !=null){
			
			System.out.println(funcionario.getNome());
			funcionario = funcionarioP.acquire();
		}
	}

}
