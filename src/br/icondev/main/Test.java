package br.icondev.main;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

import br.icondev.connector.PersonConnector;
import br.icondev.connector.TicketConnector;
import br.icondev.entity.MoviPerson;
import br.icondev.entity.MoviPersonEmail;
import br.icondev.entity.MoviTicket;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
//		testPersons();
		
		testTickets();
		
	}
	
	private static void testTickets() throws Exception{
		
		TicketConnector tc = new TicketConnector("eb48b59c-4952-40be-ba49-48b9f6947faa");
		
		MoviTicket mt = tc.getTicketById("5735");
		System.out.println("Result: " + mt.getSubject() + " --> " + "[" + mt.getBaseStatus() +"] " + mt.getStatus() + " --> " + mt.getJustification() + "\n" +
				"Origem: " + mt.getOrigin() + "\n" +
				"Tipo (1=interno, 2=publico): " + mt.getType());
	}

	private static void testPersons() throws Exception {
		
		PersonConnector pc = new PersonConnector("eb48b59c-4952-40be-ba49-48b9f6947faa");
		
		MoviPerson mp = pc.getPersonById("#1000");
		System.err.println("--------------------------------------------------------------------");
		System.out.println(
				"Codigo: " + mp.getId() + "\n" +
						"Nome: " + mp.getBusinessName() + "\n" +
						"E-mail: " + mp.getEmailPrincipal()
				);
		
		
		List<MoviPerson> lst = pc.getPersonAll();
		for(MoviPerson mp1: lst){
			System.err.println("--------------------------------------------------------------------");
			System.out.println(
					"Codigo: " + mp1.getId() + "\n" +
							"Nome: " + mp1.getBusinessName() + "\n" +
							"E-mail: " + mp1.getEmailPrincipal()
					);
		}
		
		
// 		MoviPerson mp = new MoviPerson();
//		mp.setBusinessName("Nova Pessoa 998998");
//		mp.setIsActive(true);
//		mp.setPersonType(1);
//		mp.setProfileType(2);
//		mp.setAccessProfile("Clientes");
//		mp.setEmails(new ArrayList<MoviPersonEmail>());
//		mp.getEmails().add(new MoviPersonEmail("Pessoal", "email@gmail.com", false));
//		mp = pc.postPerson(mp);
//		System.out.println(mp.getId());
//		
//		
//		boolean deleted = pc.deletePerson("2b2bddd7-309e-402c-");
//		System.out.println("Pessoa foi apagada? " + deleted);
//
//		
//		MoviPerson mp = pc.getPersonById("100");
//		if (mp!=null){
//			mp.setBusinessName("Fabio Dalazem alteração em " + System.currentTimeMillis());
//			mp.setCpfCnpj("044.301.149-43");
//			mp.setClassification("Sicredi");
//			mp.getEmails().add(new MoviPersonEmail("Profissional", "novoemail@gmail.com", false));
//			
//			if (pc.patchPersonById(mp.getId(), mp))
//				System.out.println("Atualizado com sucesso!");
//			else
//				System.err.println("Não atualizado!");
//		}
//
//		
//		JsonObject o = new JsonObject();
//		o.addProperty("businessName", "Nome alteração com Fábio Acentuação");
//		boolean upd = pc.patchPersonPropertyById("100", o);
//		System.out.println("Alterado: " + upd);

		
		
		
	}
}
