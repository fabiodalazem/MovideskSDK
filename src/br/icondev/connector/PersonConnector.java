package br.icondev.connector;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import br.icondev.entity.MoviPerson;

/**
 * Conector com Pessoas da API Movidesk;
 * 
 * @author Dalazem
 *
 */
public class PersonConnector extends MovideskConnector {

	@Override
	protected String getServiceName() {
		return "persons";
	}
	
	public PersonConnector(String token) {
		super(token);
	}

	/**
	 * Busca uma Pessoa pelo id ou Cod. Referencia
	 * 
	 * @param idCode
	 * @return
	 * @throws Exception 
	 */
	public MoviPerson getPersonById(String id) throws Exception {

		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		String json = sendGet(params);
		MoviPerson mp =  fromJson(json, MoviPerson.class);

		return mp;
	}
	
	public List<MoviPerson> getPersonAll() throws Exception{
		
		String json = sendGet(null);
		List<MoviPerson> lst =  new GsonBuilder().create().fromJson(json, new TypeToken<ArrayList<MoviPerson>>() {}.getType());
		
		return lst;
	}
	
	
	public boolean patchPersonPropertyById(String id, JsonObject o) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		return sendPatch(params, o.toString());
	}
	
	
	public boolean patchPersonById(String id, MoviPerson mp) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		return sendPatch(params, mp.toJSON());
	}
	
	public MoviPerson postPerson(MoviPerson mp) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("returnAllProperties", "true"));
		
		String json = sendPost(params, mp.toJSON());
		mp =  fromJson(json, MoviPerson.class);
		return mp; 
	}
	
	public boolean deletePerson(String id) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		return sendDelete(params, id);
	}



}
