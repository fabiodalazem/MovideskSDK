package br.icondev.connector;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response.Status;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.HttpClientBuilder;
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
	
	private static String SRV_TICKET = "tickets";
	private static String SRV_UPLOAD = "ticketFileUpload";
	private String localService = SRV_TICKET;

	private void setServiceName(String serviceName){
		this.localService = serviceName;
	}
	
	@Override
	protected String getServiceName() {
		return localService;
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
		
		setServiceName(SRV_TICKET);
		String json = sendGet(params);
		MoviTicket mt = fromJson(json, MoviTicket.class);
		
		return mt;
	}
	
	public List<MoviTicket> getTicketAll() throws Exception{
		
		setServiceName(SRV_TICKET);
		String json = sendGet(null);
		List<MoviTicket> lst =  new GsonBuilder().create().fromJson(json, new TypeToken<ArrayList<MoviTicket>>() {}.getType());
		
		return lst;
	}
	
	
	public boolean patchTicketPropertyById(String id, JsonObject o) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", id));
		
		setServiceName(SRV_TICKET);
		return sendPatch(params, o.toString());
	}
	
	
	public boolean patchTicketById(String i, MoviTicket mt) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("id", i));

		setServiceName(SRV_TICKET);
		return sendPatch(params, mt.toJSON());
	}
	
	public MoviTicket postTicket(MoviTicket mt) throws Exception{
		
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("returnAllProperties", "true"));
		
		setServiceName(SRV_TICKET);
		String json = sendPost(params, mt.toJSON());
		mt =  fromJson(json, MoviTicket.class);
		
		return mt;
	}
	
	public boolean fileUpload(String idticket, String idaction, File file) throws Exception{
		
		setServiceName(SRV_UPLOAD);
		
		URIBuilder uriBuilder = getDefaultURIBuilder();
		uriBuilder.addParameter("id", idticket);
		uriBuilder.addParameter("actionId", idaction);
		
		HttpClient httpclient = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(uriBuilder.build());
		
		FileBody uploadFilePart = new FileBody(file);
		MultipartEntityBuilder reqEntity = MultipartEntityBuilder.create();
		reqEntity.addPart("upload-file", uploadFilePart);
		httpPost.setEntity(reqEntity.build());
		
		HttpResponse response = httpclient.execute(httpPost);
		if (response.getStatusLine().getStatusCode()!=Status.OK.getStatusCode())
			throw new Exception(response.toString());
		
		return true;
	}
	 
}
