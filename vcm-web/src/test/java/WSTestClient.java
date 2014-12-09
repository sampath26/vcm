import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.vin.web.vcm.soap.DummyServiceWS;


public class WSTestClient {

	public static void main(String[] args) {

		WSTestClient client = new WSTestClient();
		try {
			client.testDummyServiceWS();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void testDummyServiceWS() throws Exception {
		String wsdlUrlString = "http://localhost:18080/vcm-web/ws?wsdl";
		URL wsdlUrl = new URL(wsdlUrlString);
		QName qName = new QName("http://vin.vcm.com/ws", "DummyService");
		Service service = Service.create(wsdlUrl, qName);
		DummyServiceWS serviceProxy = service.getPort(DummyServiceWS.class);
		serviceProxy.sayHello();
	}

}
