//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.30 at 04:53:46 PM PDT 
//


package org.apache.ambari.common.rest.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for ClusterType complex type.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cluster", propOrder = {
    "name",
    "ID",
    "revision",
    "clusterDefinition",
    "clusterState"
})
@XmlRootElement(name = "Cluster")
public class Cluster {
	
    protected String ID;
    protected long revision;
	
	@XmlElement(name = "ClusterDefinition", required = true)
	protected ClusterDefinition clusterDefinition;
	@XmlElement(name = "ClusterState", required = true)
	protected ClusterState clusterState;
	
	/**
	 * @return the revision
	 */
	public long getRevision() {
		return revision;
	}
	/**
	 * @param revision the revision to set
	 */
	public void setRevision(long revision) {
		this.revision = revision;
	}
	
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	
	/**
	 * @return the clusterDefinition
	 */
	public ClusterDefinition getClusterDefinition() {
		return clusterDefinition;
	}
	/**
	 * @param clusterDefinition the clusterDefinition to set
	 */
	public void setClusterDefinition(ClusterDefinition clusterDefinition) {
		this.clusterDefinition = clusterDefinition;
	}
	/**
	 * @return the clusterState
	 */
	public ClusterState getClusterState() {
		return clusterState;
	}
	/**
	 * @param clusterState the clusterState to set
	 */
	public void setClusterState(ClusterState clusterState) {
		this.clusterState = clusterState;
	}
	
}
