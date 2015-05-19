//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:26:23 PM JST 
//


package de.hybris.platform.print.comet.notes.definition.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pathpointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pathpointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="point"/>
 *     &lt;enumeration value="tangent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pathpointType", namespace = "http://comet.werk-ii.com/base")
@XmlEnum
public enum PathpointType {

    @XmlEnumValue("point")
    POINT("point"),
    @XmlEnumValue("tangent")
    TANGENT("tangent");
    private final String value;

    PathpointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathpointType fromValue(String v) {
        for (PathpointType c: PathpointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}