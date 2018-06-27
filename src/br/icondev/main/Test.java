package br.icondev.main;

import java.util.List;

import br.icondev.connector.PersonConnector;
import br.icondev.entity.MoviPerson;

public class Test {
//Teste de commit
	public static void main(String[] args) throws Exception {
		
		PersonConnector pc = new PersonConnector("eb48b59c-4952-40be-ba49-48b9f6947faa");
		
		MoviPerson mp = pc.getById("#1853400718");
		System.err.println("--------------------------------------------------------------------");
		System.out.println(
				"Codigo: " + mp.getId() + "\n" +
				"Nome: " + mp.getBusinessName() + "\n" +
				"E-mail: " + mp.getEmailPrincipal()
				);
		
		
		List<MoviPerson> lst = pc.getAll();
		for(MoviPerson mp1: lst){
			System.err.println("--------------------------------------------------------------------");
			System.out.println(
					"Codigo: " + mp.getId() + "\n" +
					"Nome: " + mp.getBusinessName() + "\n" +
					"E-mail: " + mp.getEmailPrincipal()
					);
		}
		
	}
}
