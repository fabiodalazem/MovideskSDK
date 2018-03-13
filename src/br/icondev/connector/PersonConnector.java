package br.icondev.connector;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import br.icondev.entity.MoviPerson;

/**
 * Conector com Pessoas da API Movidesk;
 * @author Dalazem
 *
 */
public class PersonConnector extends MovideskConnector {

	public PersonConnector(String token) {
		super(token);
	}

	/**
	 * Busca uma Pessoa pelo id ou Cod. Referencia
	 * @param idCode
	 * @return
	 */
	public MoviPerson getById(String id) {

		List<NameValuePair> params = new ArrayList<>();
		try {
			params.add(new BasicNameValuePair("id", id));
			sendGet(params);
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}

		return new MoviPerson();
	}

	@Override
	protected String getServiceName() {
		return "persons/";
	}

}
