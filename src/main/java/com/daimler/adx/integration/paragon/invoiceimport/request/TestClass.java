package com.daimler.adx.integration.paragon.invoiceimport.request;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class TestClass {
    public static void main(String[] args) throws Exception{
        MTIF63INVOICEREQ test123 = new MTIF63INVOICEREQ();
        MTIF63INVOICEREQ.Request req=new MTIF63INVOICEREQ.Request();
        req.setInvoices(new MTIF63INVOICEREQ.Request.Invoices());
        req.setLogin(new MTIF63INVOICEREQ.Request.Login());
        test123.setRequest(req);
        jaxbObjectToXML(test123);
    }

    private static String jaxbObjectToXML(MTIF63INVOICEREQ test123) throws Exception {
        String xmlString = "";

            JAXBContext context = JAXBContext.newInstance(MTIF63INVOICEREQ.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(test123, sw);
            xmlString = sw.toString();

        return xmlString;
    }
}
