package appa;

import javax.ejb.Local;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Use;

@Local
@WebService(targetNamespace="http://appa/ServiceC")
@SOAPBinding(style=javax.jws.soap.SOAPBinding.Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)

public interface IServiceC {
String NotSure(int left, String other);
}
