//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:26:23 PM JST 
//


package de.hybris.platform.print.comet.notes.definition.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="space" type="{http://comet.werk-ii.com/base}colorSpace" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="c1" type="{http://comet.werk-ii.com/base}float" />
 *       &lt;attribute name="c2" type="{http://comet.werk-ii.com/base}float" />
 *       &lt;attribute name="c3" type="{http://comet.werk-ii.com/base}float" />
 *       &lt;attribute name="c4" type="{http://comet.werk-ii.com/base}float" />
 *       &lt;attribute name="tint" type="{http://comet.werk-ii.com/base}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fill", namespace = "http://comet.werk-ii.com/base")
public class Fill {

    @XmlAttribute(name = "space")
    protected ColorSpace space;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "c1")
    protected BigDecimal c1;
    @XmlAttribute(name = "c2")
    protected BigDecimal c2;
    @XmlAttribute(name = "c3")
    protected BigDecimal c3;
    @XmlAttribute(name = "c4")
    protected BigDecimal c4;
    @XmlAttribute(name = "tint")
    protected BigDecimal tint;

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link ColorSpace }
     *     
     */
    public ColorSpace getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorSpace }
     *     
     */
    public void setSpace(ColorSpace value) {
        this.space = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the c1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getC1() {
        return c1;
    }

    /**
     * Sets the value of the c1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setC1(BigDecimal value) {
        this.c1 = value;
    }

    /**
     * Gets the value of the c2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getC2() {
        return c2;
    }

    /**
     * Sets the value of the c2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setC2(BigDecimal value) {
        this.c2 = value;
    }

    /**
     * Gets the value of the c3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getC3() {
        return c3;
    }

    /**
     * Sets the value of the c3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setC3(BigDecimal value) {
        this.c3 = value;
    }

    /**
     * Gets the value of the c4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getC4() {
        return c4;
    }

    /**
     * Sets the value of the c4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setC4(BigDecimal value) {
        this.c4 = value;
    }

    /**
     * Gets the value of the tint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTint() {
        return tint;
    }

    /**
     * Sets the value of the tint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTint(BigDecimal value) {
        this.tint = value;
    }

}