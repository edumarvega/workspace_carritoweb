
package ar.com.templateit.cds.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadUsuarioEcommerceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadUsuarioEcommerceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadUsuarioEcommerce" type="{http://service.web.cds.templateit.com.ar/}usuarioEcommerce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadUsuarioEcommerceResponse", propOrder = {
    "loadUsuarioEcommerce"
})
public class LoadUsuarioEcommerceResponse {

    protected UsuarioEcommerce loadUsuarioEcommerce;

    /**
     * Gets the value of the loadUsuarioEcommerce property.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioEcommerce }
     *     
     */
    public UsuarioEcommerce getLoadUsuarioEcommerce() {
        return loadUsuarioEcommerce;
    }

    /**
     * Sets the value of the loadUsuarioEcommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioEcommerce }
     *     
     */
    public void setLoadUsuarioEcommerce(UsuarioEcommerce value) {
        this.loadUsuarioEcommerce = value;
    }

}
