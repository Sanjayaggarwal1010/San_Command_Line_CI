package San_CI_Package;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpMethods {

	private final String USER_AGENT = "Mozilla/5.0";
	public static int responseCode = 0;

	public static void main(String[] args) throws Exception {

		HttpMethods http = new HttpMethods();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet("https://www.americanfunds.com/advisor/literature/catalog.htm?cat=44");

		System.out.println("\nTesting 2 - Send Http POST request" + responseCode);
	
		System.out.println("\nTesting 2 - Send Http POST request--- after calling function 123455677");
		
		System.out.println("Testing 1 - ************GIT************");
		
		System.out.println("Testing 1 - ************GIT************");
		
		System.out.println("Testing 1 - ************GIT************");
		System.out.println("Testing 1 - ************GIT************");
		
		System.out.println("*** First Chnage***********");
		System.out.println("\nTesting 2 - Send Http POST request");
	}

	// HTTP GET request
	private int sendGet(String row ) throws Exception {
	
	//	String url = "http://www.google.com/search?q=mkyong";
try {
		URL obj = new URL(row);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		 responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + row);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
		
}
catch(Exception ex) 
{
	   System.out.println("Bad Response for URL" + row);
	   
}
 return responseCode;
}	
}