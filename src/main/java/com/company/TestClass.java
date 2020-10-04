package com.company;

import com.example.myschema.Test123;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class TestClass {
    public static void main(String[] args) throws Exception{
        Test123 test123 = new Test123();
        Test123.Request req=new Test123.Request();
        req.setInvoices(new Test123.Request.Invoices());
        req.setLogin(new Test123.Request.Login());
        test123.setRequest(req);
        jaxbObjectToXML(test123);
    }

    private static String jaxbObjectToXML(Test123 test123) throws Exception {
        String xmlString = "";

            JAXBContext context = JAXBContext.newInstance(Test123.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(test123, sw);
            xmlString = sw.toString();



        return xmlString;
    }
}
