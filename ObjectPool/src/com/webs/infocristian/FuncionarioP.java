package com.webs.infocristian;

import java.util.ArrayList;
import java.util.List;


public class FuncionarioP implements Pool<Funcionario> {
	
	private List<Funcionario> funcionarios;
	
	public FuncionarioP(){
		
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("Cristian Fernandes"));
		this.funcionarios.add(new Funcionario("Igor"));
		this.funcionarios.add(new Funcionario("Mirian Rodrigues"));
		this.funcionarios.add(new Funcionario("Nonato Rodrigues"));
		this.funcionarios.add(new Funcionario("Luciano Rodrigues"));
		this.funcionarios.add(new Funcionario("Lucas Rodrigues"));
		this.funcionarios.add(new Funcionario("Maicon Rodrigues"));
		this.funcionarios.add(new Funcionario("Patricia Rodrigues"));
		this.funcionarios.add(new Funcionario("Kleber Rodrigues"));
		this.funcionarios.add(new Funcionario("Juliana Rodrigues"));
		this.funcionarios.add(new Funcionario("Fabiana Rodrigues"));
		this.funcionarios.add(new Funcionario("Caio Rodrigues"));
		this.funcionarios.add(new Funcionario("Mara Rodrigues"));
		this.funcionarios.add(new Funcionario("Renato Rodrigues"));
		this.funcionarios.add(new Funcionario("Mariana Rodrigues"));


	}
	public Funcionario acquire(){
		if(this.funcionarios.size()>0){
			return this.funcionarios.remove(0);
		}else{
			return null;
		}
	}
	@Override
	public void release(Funcionario funcionario) {

		this.funcionarios.add(funcionario);
	}

}
