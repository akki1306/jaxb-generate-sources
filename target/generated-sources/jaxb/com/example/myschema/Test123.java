//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.04 at 07:14:06 PM GST 
//


package com.example.myschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Login"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UserPswd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Invoices"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Invoice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "Test123")
public class Test123 {

    @XmlElement(name = "Request", required = true)
    protected Test123 .Request request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Test123 .Request }
     *     
     */
    public Test123 .Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test123 .Request }
     *     
     */
    public void setRequest(Test123 .Request value) {
        this.request = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Login"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UserPswd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Invoices"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Invoice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "login",
        "invoices"
    })
    public static class Request {

        @XmlElement(name = "Login", required = true)
        protected Test123 .Request.Login login;
        @XmlElement(name = "Invoices", required = true)
        protected Test123 .Request.Invoices invoices;

        /**
         * Gets the value of the login property.
         * 
         * @return
         *     possible object is
         *     {@link Test123 .Request.Login }
         *     
         */
        public Test123 .Request.Login getLogin() {
            return login;
        }

        /**
         * Sets the value of the login property.
         * 
         * @param value
         *     allowed object is
         *     {@link Test123 .Request.Login }
         *     
         */
        public void setLogin(Test123 .Request.Login value) {
            this.login = value;
        }

        /**
         * Gets the value of the invoices property.
         * 
         * @return
         *     possible object is
         *     {@link Test123 .Request.Invoices }
         *     
         */
        public Test123 .Request.Invoices getInvoices() {
            return invoices;
        }

        /**
         * Sets the value of the invoices property.
         * 
         * @param value
         *     allowed object is
         *     {@link Test123 .Request.Invoices }
         *     
         */
        public void setInvoices(Test123 .Request.Invoices value) {
            this.invoices = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Invoice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "invoice"
        })
        public static class Invoices {

            @XmlElement(name = "Invoice", required = true)
            protected String invoice;

            /**
             * Gets the value of the invoice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoice() {
                return invoice;
            }

            /**
             * Sets the value of the invoice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoice(String value) {
                this.invoice = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UserPswd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "userId",
            "userPswd"
        })
        public static class Login {

            @XmlElement(name = "UserId", required = true)
            protected String userId;
            @XmlElement(name = "UserPswd", required = true)
            protected String userPswd;

            /**
             * Gets the value of the userId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserId() {
                return userId;
            }

            /**
             * Sets the value of the userId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserId(String value) {
                this.userId = value;
            }

            /**
             * Gets the value of the userPswd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserPswd() {
                return userPswd;
            }

            /**
             * Sets the value of the userPswd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserPswd(String value) {
                this.userPswd = value;
            }

        }

    }

}
