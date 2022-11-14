package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		Empresa alura = new Empresa();
		alura.setNome("Alura");
				
		Empresa caelum = new Empresa();
		caelum.setNome("Caelum");
		
		listaEmpresas.add(alura);
		listaEmpresas.add(caelum);
	}

	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

}
