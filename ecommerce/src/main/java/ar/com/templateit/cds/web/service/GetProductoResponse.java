
package ar.com.templateit.cds.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProductoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProductoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getProducto" type="{http://service.web.cds.templateit.com.ar/}producto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductoResponse", propOrder = {
    "getProducto"
})
public class GetProductoResponse {

    protected Producto getProducto;

    /**
     * Gets the value of the getProducto property.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getGetProducto() {
        return getProducto;
    }

    /**
     * Sets the value of the getProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setGetProducto(Producto value) {
        this.getProducto = value;
    }

}
