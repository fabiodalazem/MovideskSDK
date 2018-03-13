package br.icondev.main;

import br.icondev.connector.PersonConnector;

public class Test {

	public static void main(String[] args) {
		
		PersonConnector pc = new PersonConnector("eb48b59c-4952-40be-ba49-48b9f6947faa");
		pc.getById("#200");
	}
}
