package br.icondev.connector;

/**
 * Conexão direta com a API do Movidesk via Post/Get/Patch/Delete
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.GsonBuilder;

import br.icondev.util.DateTimeDeserializer;

public abstract class MovideskConnector {

	private static String URL_API_V1_PROTOCOL = "https";
	private static String URL_API_V1_HOST = "api.movidesk.com";
	private static int URL_API_V1_PORT = 443;
	private static String URL_API_V1_SERVICE = "/public/v1/";
	// "https://api.movidesk.com/public/v1/persons?token=??????

	private String token = "";

	/**
	 * Retornar o serviço: /persons /tickets ou /services
	 * @return
	 */
	protected abstract String getServiceName();

	public MovideskConnector(String token) {
		this.token = token;
	}

	protected URIBuilder getDefaultURIBuilder(){
		URIBuilder b = new URIBuilder();
		b.setScheme(URL_API_V1_PROTOCOL);
		b.setHost(URL_API_V1_HOST);
		b.setPort(URL_API_V1_PORT);
		b.setPath(URL_API_V1_SERVICE + getServiceName());

		// Parametros padrão
		b.addParameter("token", token);
		return b;
	}
	
	/**
	 * Executa o GET nos serviços da API do Movidesk
	 * 
	 * @param serviceName
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	protected String sendGet(List<NameValuePair> params) throws Exception {

		URIBuilder b = getDefaultURIBuilder();
		if (params != null && !params.isEmpty())
			b.addParameters(params);

		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(b.build());
		HttpResponse response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			//System.out.println(line);
		}

		if (response.getStatusLine().getStatusCode()!=Status.OK.getStatusCode())
			throw new Exception(result.toString());
		
		return result.toString();
	}

	/**
	 * Executa o Patch nos serviços da API do Movidesk
	 * 
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	protected boolean sendPatch(List<NameValuePair> params, String bodyRequest) throws Exception {

		URIBuilder b = getDefaultURIBuilder();
		if (params != null && !params.isEmpty())
			b.addParameters(params);

		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpPatch request = new HttpPatch(b.build());
		request.addHeader("Content-Type", MediaType.APPLICATION_JSON);
		request.setEntity(new StringEntity(bodyRequest, Charset.forName("UTF-8")));
		
		HttpResponse response = client.execute(request);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			//System.out.println(line);
		}
		
		if (response.getStatusLine().getStatusCode()!=Status.OK.getStatusCode())
			throw new Exception(result.toString());

		return response.getStatusLine().getStatusCode()==Status.OK.getStatusCode();
	}
	
	
	/**
	 * Executa o Patch nos serviços da API do Movidesk
	 * 
	 * @param params
	 * @param bodyRequest
	 * @return
	 * @throws Exception 
	 */
	protected String sendPost(List<NameValuePair> params, String bodyRequest) throws Exception {

		URIBuilder b = getDefaultURIBuilder();
		if (params != null && !params.isEmpty())
			b.addParameters(params);

		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(b.build());
		request.addHeader("Content-Type", MediaType.APPLICATION_JSON);
		request.setEntity(new StringEntity(bodyRequest, Charset.forName("UTF-8")));
		
		HttpResponse response = client.execute(request);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			//System.out.println(line);
		}
		
		if (response.getStatusLine().getStatusCode()!=Status.OK.getStatusCode())
			throw new Exception(result.toString());

		return result.toString();
	}	
	
	/**
	 * Executa o Delete nos serviços da API do Movidesk
	 * 
	 * @param params
	 * @param bodyRequest
	 * @return
	 * @throws Exception
	 */
	protected boolean sendDelete(List<NameValuePair> params, String bodyRequest) throws Exception {

		URIBuilder b = getDefaultURIBuilder();
		if (params != null && !params.isEmpty())
			b.addParameters(params);

		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpDelete request = new HttpDelete(b.build());
		request.addHeader("Content-Type", MediaType.APPLICATION_JSON);
		//request.setEntity(new StringEntity(bodyRequest, Charset.forName("UTF-8")));
		
		HttpResponse response = client.execute(request);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			//System.out.println(line);
		}
		
		if (response.getStatusLine().getStatusCode()!=Status.OK.getStatusCode())
			throw new Exception(result.toString());

		//return result.toString();
		return response.getStatusLine().getStatusCode()==Status.OK.getStatusCode();
	}	
	
	public <T> T fromJson(String json, Class<T> typeOf){
		return new GsonBuilder()
				.registerTypeAdapter(Date.class, new DateTimeDeserializer())
				.create()
				.fromJson(json, typeOf);
	}

}
