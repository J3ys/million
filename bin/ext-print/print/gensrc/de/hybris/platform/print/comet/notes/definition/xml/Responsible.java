//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:26:23 PM JST 
//


package de.hybris.platform.print.comet.notes.definition.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responsible complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responsible">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="user" use="required" type="{http://comet.werk-ii.com/base}varchar255" />
 *       &lt;attribute name="role" use="required" type="{http://comet.werk-ii.com/base}varchar255" />
 *       &lt;attribute name="on" use="required" type="{http://comet.werk-ii.com/base}internalDateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responsible", namespace = "http://comet.werk-ii.com/psc_notes")
public class Responsible {

    @XmlAttribute(name = "user", required = true)
    protected String user;
    @XmlAttribute(name = "role", required = true)
    protected String role;
    @XmlAttribute(name = "on", required = true)
    protected String on;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the on property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOn() {
        return on;
    }

    /**
     * Sets the value of the on property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOn(String value) {
        this.on = value;
    }

}
