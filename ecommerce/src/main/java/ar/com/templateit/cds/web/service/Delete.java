
package ar.com.templateit.cds.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://service.web.cds.templateit.com.ar/}usuarioEcommerce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete", propOrder = {
    "usuario"
})
public class Delete {

    protected UsuarioEcommerce usuario;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioEcommerce }
     *     
     */
    public UsuarioEcommerce getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioEcommerce }
     *     
     */
    public void setUsuario(UsuarioEcommerce value) {
        this.usuario = value;
    }

}
