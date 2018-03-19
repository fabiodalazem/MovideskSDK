package br.icondev.connector;

/**
 * Conexão direta com a API do Movidesk via Post/Get/Patch/Delete
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.GsonBuilder;

import br.icondev.entity.MoviEntity;
import br.icondev.entity.MoviPerson;
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

	/**
	 * Executa o GET nos serviços da API do Movidesk
	 * 
	 * @param serviceName
	 * @param params
	 * @return
	 * @throws URISyntaxException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	protected String sendGet(List<NameValuePair> params)
			throws URISyntaxException, ClientProtocolException, IOException {

		URIBuilder b = new URIBuilder();
		b.setScheme(URL_API_V1_PROTOCOL);
		b.setHost(URL_API_V1_HOST);
		b.setPort(URL_API_V1_PORT);
		b.setPath(URL_API_V1_SERVICE + getServiceName());

		// Parametros;
		b.addParameter("token", token);
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

		return result.toString();
	}

	/**
	 * 
	 * @throws Exception
	 */
	protected void sendPost() throws Exception {

		String url = "https://selfsolve.apple.com/wcResults.do";

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent", "USER_AGENT");

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
		urlParameters.add(new BasicNameValuePair("cn", ""));
		urlParameters.add(new BasicNameValuePair("locale", ""));
		urlParameters.add(new BasicNameValuePair("caller", ""));
		urlParameters.add(new BasicNameValuePair("num", "12345"));

		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		HttpResponse response = client.execute(post);
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + post.getEntity());
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		System.out.println(result.toString());

	}
	
	public <T> T fromJson(String json, Class<T> typeOf){
		return new GsonBuilder()
				.registerTypeAdapter(Date.class, new DateTimeDeserializer())
				.create()
				.fromJson(json, typeOf);
	}

}
