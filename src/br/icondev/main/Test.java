package br.icondev.main;

import java.io.File;

import br.icondev.connector.PersonConnector;
import br.icondev.connector.TicketConnector;
import br.icondev.entity.MoviPerson;
import br.icondev.entity.MoviTicket;

public class Test {

	private static String TOKEN = "eb48b59c-4952-40be-ba49-48b9f6947faa";
	
	private static void testTickets() throws Exception {

		TicketConnector tc = new TicketConnector(TOKEN);
		MoviTicket mt = tc.getTicketById("6025");
		// System.out.println("Result: " + mt.getSubject() + " --> " + "[" +
		// mt.getBaseStatus() +"] " + mt.getStatus() + " --> " +
		// mt.getJustification() + "\n" +
		// "Origem: " + mt.getOrigin() + "\n" +
		// "Tipo (1=interno, 2=publico): " + mt.getType());
		System.out.println(mt.getSubject());
		System.out.println(mt.getCategory());
		System.out.println(mt.getUrgency());
		System.out.println(mt.getStatus());
		System.out.println(mt.getBaseStatus());
		System.out.println(mt.getOrigin());
		System.out.println(mt.getCreatedDate());
		System.out.println(mt.getOwner());
		System.out.println(mt.getServiceFull());
		System.out.println(mt.getCreatedDate());
		/*
		 * for(MoviTicketAction a: mt.getActions()){
		 * System.out.println(a.getId()); }
		 */

		// mt.setType(1);
		// mt.setStatus(mt.getStatus());
		// mt.setCreatedDate(mt.getCreatedDate());
		// mt.setCreatedBy(mt.getCreatedBy());
		// mt.setClients(mt.getClients());
		// mt.setActions(mt.getActions());
		// mt = tc.postTicket(mt);
		// System.out.println("Post concluído");
		// System.out.println(mt.getId());
		//
		// MoviTicket mt1 = tc.getTicketById("6025");
		// if (mt!=null){
		// mt.setSubject("Teste");
		// mt.setStatus("Em desenvolvimento");
		// mt.setJustification("");
		// List<String> a = new ArrayList<>();
		// a.add("Teste");
		// a.add("Outros");
		// mt.setTags(a);
		// mt.setRedmineIssueId(1);// "RedmineIssueId","errorMessage":"Nullable
		// object must have a value."
		//
		// MoviTicketAction ma = new MoviTicketAction();
		// MoviTicketActionAttachment mat = new MoviTicketActionAttachment();
		// List<MoviTicketAction> listact = new ArrayList<>();
		// List<MoviTicketActionAttachment> listatt = new ArrayList<>();
		//
		// ma.setType(1);
		// ma.setDescription("Teste efetuado com sucesso");
		//
		// File file = new File("C:\\Users\\pc\\Testes.txt");
		// mat.setFileName(file.getName());
		// mat.setPath(file.getAbsolutePath());
		//
		// listatt.add(mat);
		// ma.setAttachments(listatt);
		// listact.add(ma);
		// mt.setActions(listact);
		//
		// System.out.println(file.getName());
		// System.out.println(file.getAbsolutePath());
		//
		// if (tc.patchTicketById(mt.getId(), mt))
		// System.out.println("Atualizado com sucesso!");
		// else
		// System.err.println("Não atualizado!");
		// }

	}

	private static void testPersons() throws Exception {

		PersonConnector pc = new PersonConnector(TOKEN);
		MoviPerson mp = pc.getPersonById("#8441");
		System.err.println("--------------------------------------------------------------------");
		System.out.println("{");
		System.out.println("Codigo: " + mp.getId() + "\n" + "Nome: " + mp.getBusinessName() + "\n" + "E-mail: "
				+ mp.getEmailPrincipal());
		System.out.println("}");

		// List<MoviPerson> lst = pc.getPersonAll();
		// for(MoviPerson mp1: lst){
		// System.err.println("--------------------------------------------------------------------");
		// System.out.println("{");
		// System.out.println(
		// "Codigo: " + mp1.getId() + "\n" +
		// "Nome: " + mp1.getBusinessName() + "\n" +
		// "E-mail: " + mp1.getEmailPrincipal()
		// );
		// System.out.println("}");
		// }

		// MoviPerson mp = new MoviPerson();
		// mp.setBusinessName("Nova Pessoa 998998");
		// mp.setIsActive(true);
		// mp.setPersonType(1);
		// mp.setProfileType(2);
		// mp.setAccessProfile("Clientes");
		// mp.setEmails(new ArrayList<MoviPersonEmail>());
		// mp.getEmails().add(new MoviPersonEmail("Pessoal", "email@gmail.com",
		// false));
		// mp = pc.postPerson(mp);
		// System.out.println("Post concluído");
		// System.out.println(mp.getId());

		// boolean deleted = pc.deletePerson("2b2bddd7-309e-402c-");
		// System.out.println("Pessoa foi apagada? " + deleted);

		// MoviPerson mp3 = pc.getPersonById("100");
		// if (mp3!=null){
		// mp3.setBusinessName("Fabio Dalazem alteração em " +
		// System.currentTimeMillis());
		// mp3.setCpfCnpj("044.301.149-43");
		// mp3.setClassification("Sicredi");
		// mp3.getEmails().add(new MoviPersonEmail("Profissional",
		// "novoemail@gmail.com", false));
		//
		// if (pc.patchPersonById(mp3.getId(), mp3))
		// System.out.println("Atualizado com sucesso!");
		// else
		// System.err.println("Não atualizado!");
		// }

		// JsonObject o = new JsonObject();
		// o.addProperty("businessName", "Nome alteração com Fábio Acentuação");
		// boolean upd = pc.patchPersonPropertyById("100", o);
		// System.out.println("Alterado: " + upd);

	}

	private static void testFileUpload() {
		
		TicketConnector tc = new TicketConnector(TOKEN);
		File f = new File("c:/tmp/logo_min_big.png");
		try {
			if (tc.fileUpload("6025", "7", f))
				System.out.println("Sucesso ao subir arquivo!");
			else
				System.err.println("Falha ao subir arquivo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		// testPersons();
		
		 //testTickets();
		
		testFileUpload();

	}

}
