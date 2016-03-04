
package ar.com.templateit.cds.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUsuarioEcommerceByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUsuarioEcommerceByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getUsuarioEcommerceById" type="{http://service.web.cds.templateit.com.ar/}usuarioEcommerce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuarioEcommerceByIdResponse", propOrder = {
    "getUsuarioEcommerceById"
})
public class GetUsuarioEcommerceByIdResponse {

    protected UsuarioEcommerce getUsuarioEcommerceById;

    /**
     * Gets the value of the getUsuarioEcommerceById property.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioEcommerce }
     *     
     */
    public UsuarioEcommerce getGetUsuarioEcommerceById() {
        return getUsuarioEcommerceById;
    }

    /**
     * Sets the value of the getUsuarioEcommerceById property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioEcommerce }
     *     
     */
    public void setGetUsuarioEcommerceById(UsuarioEcommerce value) {
        this.getUsuarioEcommerceById = value;
    }

}
