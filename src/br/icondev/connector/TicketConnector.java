package br.icondev.connector;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import br.icondev.entity.MoviTicket;

/*
 * 
 * LEMBRETE! TICKET: GET / PATCH / POST
 * 
 */

/**
 * Conector com Tickets da API Movidesk;
 * 
 * @author Dalazem
 *
 */
public class TicketConnector extends MovideskConnector {

	@Override
	protected String getServiceName() {
		return "tickets";
	}
	
	public TicketConnector(String token) {
		super(token);
	}
	
	/**
	 * Busca um ticket
	 * 
	 * @param idCode
	 * @return
	 * @throws Exception 
	 */
	public MoviTicket getTicketById(String id) throws Exception {
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		String json = sendGet(params);
		MoviTicket mt = fromJson(json, MoviTicket.class);
		
		return mt;
	}
	
	public List<MoviTicket> getTicketAll() throws Exception{
		
		String json = sendGet(null);
		List<MoviTicket> lst =  new GsonBuilder().create().fromJson(json, new TypeToken<ArrayList<MoviTicket>>() {}.getType());
		
		return lst;
	}
	
	
	public boolean patchTicketPropertyById(String id, JsonObject o) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		return sendPatch(params, o.toString());
	}
	
	
	public boolean patchTicketById(String i, MoviTicket mt) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", i));
		
		return sendPatch(params, mt.toJSON());
	}
	
	public MoviTicket postTicket(MoviTicket mt) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("returnAllProperties", "true"));
		
		String json = sendPost(params, mt.toJSON());
		mt =  fromJson(json, MoviTicket.class);
		
		return mt;
	}
	
	public void fileUpload(String idticket, String idaction, File file) throws Exception{
		
		//Monta a url de requisição do post, seleciona o id do ticket e o id do trâmite
		idticket = "&id=" + idticket;
		idaction = "&actionId=" + idaction;
		String url = "https://api.movidesk.com/public/v1/ticketFileUpload?token=eb48b59c-4952-40be-ba49-48b9f6947faa" + idticket + idaction;
		
		//Executa post, está dando certo
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		
		FileBody uploadFilePart = new FileBody(file);
		MultipartEntity reqEntity = new MultipartEntity();
		reqEntity.addPart("upload-file", uploadFilePart);
		httpPost.setEntity(reqEntity);
		
		HttpResponse response = httpclient.execute(httpPost);
		System.out.println(response);
	}
	 
}
