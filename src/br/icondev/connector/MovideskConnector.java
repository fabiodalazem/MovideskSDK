package br.icondev.connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;


public class MovideskConnector {

	private static String URL_API_V1_PROTOCOL = "https";
	private static String URL_API_V1_HOST = "api.movidesk.com";
	private static int URL_API_V1_PORT = 443;
	private static String URL_API_V1_SERVICE = "/public/v1/";
	//"https://api.movidesk.com/public/v1/persons?token=??????
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Inicio...");
		MovideskConnector http = new MovideskConnector();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet("persons", null);

/*		System.out.println("\nTesting 2 - Send Http POST request");
		http.sendPost();*/	
	}
	
	// HTTP GET request
	private void sendGet(String serviceName, List<NameValuePair> params) throws Exception {

		URIBuilder b = new URIBuilder();
		b.setScheme(URL_API_V1_PROTOCOL);
		b.setHost(URL_API_V1_HOST);
		b.setPort(URL_API_V1_PORT);
		b.setPath(URL_API_V1_SERVICE + serviceName);
		
		// Parametros;
		b.addParameter("token", "eb48b59c-4952-40be-ba49-48b9f6947faa");
		if (params!=null && !params.isEmpty())
			b.addParameters(params);
		//b.addParameter("id", "#200");
		
		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(b.build());
		//System.out.println(request.getURI());

		// add request header
		//request.addHeader("User-Agent", "USER_AGENT");

		HttpResponse response = client.execute(request);

		//System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		//System.out.println(result.toString());

		Gson g = new Gson();
		Object o = g.fromJson(result.toString(), Object.class);
		
		List<LinkedTreeMap<String, Object>> lst = new ArrayList();
		if (o instanceof List<?>){
			lst = (List<LinkedTreeMap<String, Object>>) o;
		}else{
			LinkedTreeMap<String, Object> valor1 = (LinkedTreeMap<String, Object>) o;
			lst.add(valor1);
		}
		
		for(Object v : lst){
			LinkedTreeMap<String, Object> ltm = (LinkedTreeMap<String, Object>) v;
			System.out.println(ltm.get("id") + " - " + ltm.get("businessName"));
		}
	}

	// HTTP POST request
	private void sendPost() throws Exception {

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
		System.out.println("Response Code : " +
                                    response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		System.out.println(result.toString());

	}	

}
