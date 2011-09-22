//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.30 at 04:53:46 PM PDT 
//


package org.apache.ambari.common.rest.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeMetricsType complex type. 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeMetricsType", propOrder = {
    "cpuType",
    "cpuUnits",
    "cpuCores",
    "ramInGB",
    "diskSizeInGB",
    "diskUnits"
})
public class NodeAttributes {

    @XmlElement(name = "CPU_Type", required = true)
    protected String cpuType;
    @XmlElement(name = "CPU_Units")
    protected short cpuUnits;
    @XmlElement(name = "CPU_Cores")
    protected short cpuCores;
    @XmlElement(name = "RAM_InGB")
    protected long ramInGB;
    @XmlElement(name = "DISK_SizeInGB")
    protected long diskSizeInGB;
    @XmlElement(name = "DISK_Units")
    protected short diskUnits;

    /**
     * Gets the value of the cpuType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPUType() {
        return cpuType;
    }

    /**
     * Sets the value of the cpuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPUType(String value) {
        this.cpuType = value;
    }

    /**
     * Gets the value of the cpuUnits property.
     * 
     */
    public short getCPUUnits() {
        return cpuUnits;
    }

    /**
     * Sets the value of the cpuUnits property.
     * 
     */
    public void setCPUUnits(short value) {
        this.cpuUnits = value;
    }

    /**
     * Gets the value of the cpuCores property.
     * 
     */
    public short getCPUCores() {
        return cpuCores;
    }

    /**
     * Sets the value of the cpuCores property.
     * 
     */
    public void setCPUCores(short value) {
        this.cpuCores = value;
    }

    /**
     * Gets the value of the ramInGB property.
     * 
     */
    public long getRAMInGB() {
        return ramInGB;
    }

    /**
     * Sets the value of the ramInGB property.
     * 
     */
    public void setRAMInGB(long value) {
        this.ramInGB = value;
    }

    /**
     * Gets the value of the diskSizeInGB property.
     * 
     */
    public long getDISKSizeInGB() {
        return diskSizeInGB;
    }

    /**
     * Sets the value of the diskSizeInGB property.
     * 
     */
    public void setDISKSizeInGB(long value) {
        this.diskSizeInGB = value;
    }

    /**
     * Gets the value of the diskUnits property.
     * 
     */
    public short getDISKUnits() {
        return diskUnits;
    }

    /**
     * Sets the value of the diskUnits property.
     * 
     */
    public void setDISKUnits(short value) {
        this.diskUnits = value;
    }

}
