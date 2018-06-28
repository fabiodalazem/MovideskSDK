package br.icondev.entity;

import java.util.HashMap;

@SuppressWarnings("serial")
public class MoviPersonCustomFieldValue extends MoviEntity {
	
	private int customFieldId;
	private int customFieldRuleId;
	private int line;
	private String value;
//	private HashMap<String, String> items; //Lista de itens. *Obrigatório quando o tipo do campo for: lista de valores, lista de pessoas, lista de clientes, lista de agentes, seleção múltipla ou seleção única. Deve ser informado apenas um item se o campo adicional não permitir seleção múltipla.

}
