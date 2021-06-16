package day54_abstraction;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Student {
    String code = "JAVA";
    public void code(String language){
        System.out.println("Student is coding using "+ language);
    }

    public abstract void attendClass();

}


