package appa;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(serviceName = "ServiceCService", portName = "ServiceCPort", endpointInterface = "appa.IServiceC", targetNamespace = "http://appa/ServiceC")

public class ServiceC implements IServiceC {

	@Override
	public String NotSure(int left, String other) {
		// TODO Auto-generated method stub
		
		return other + String.valueOf(left);
	}

}
