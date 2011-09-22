//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.30 at 04:53:46 PM PDT 
//


package org.apache.ambari.common.rest.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeState", propOrder = {
    "lastHeartbeatTime",
    "clusterName",
    "allocatedToCluster",
    "agentInstalled",
	"nodeServers"
})
public class NodeState {

	@XmlElement(name = "lastHeartbeatTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastHeartbeatTime;
	
	/*
     * Associating the cluster name would reserve the node for a given cluster
     * 
     */
	@XmlElement(name = "ClusterName", required = true)
    protected String clusterName;

	/*
	 * Actual allocation of the node in terms of having components installed on it is reflected 
     * through this AllocatedToCluster boolean variable. This is updated through hearbeat message
     * sent by Node.
	 */
	@XmlElement(name = "AllocatedToCluster", required = true)
    protected Boolean allocatedToCluster = false;

	@XmlElement(name = "AgentInstalled", required = true)
    protected Boolean agentInstalled = true;
	
	@XmlElement(name = "NodeServers", required = true)
    protected List<NodeServer> nodeServers = new ArrayList<NodeServer>();

	/**
	 * @return the allocatedToCluster
	 */
	public Boolean getAllocatedToCluster() {
		return allocatedToCluster;
	}

	/**
	 * @param allocatedToCluster the allocatedToCluster to set
	 */
	public void setAllocatedToCluster(Boolean allocatedToCluster) {
		this.allocatedToCluster = allocatedToCluster;
	}

	/**
	 * @return the agentInstalled
	 */
	public Boolean getAgentInstalled() {
		return agentInstalled;
	}

	/**
	 * @param agentInstalled the agentInstalled to set
	 */
	public void setAgentInstalled(Boolean agentInstalled) {
		this.agentInstalled = agentInstalled;
	}
	
	/**
	 * @return the clusterName
	 */
	public String getClusterName() {
		return clusterName;
	}

	/**
	 * @param clusterName the clusterName to set
	 */
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	
	/**
	 * @return the lastHeartbeatTime
	 */
	public XMLGregorianCalendar getLastHeartbeatTime() {
		return lastHeartbeatTime;
	}

	/**
	 * @param lastHeartbeatTime the lastHeartbeatTime to set
	 */
	public void setLastHeartbeatTime(XMLGregorianCalendar lastHeartbeatTime) {
		this.lastHeartbeatTime = lastHeartbeatTime;
	}

	/**
	 * @return the nodeServers
	 */
	public List<NodeServer> getNodeServers() {
		return nodeServers;
	}

	/**
	 * @param nodeServers the nodeServers to set
	 */
	public void setNodeServers(List<NodeServer> nodeServers) {
		this.nodeServers = nodeServers;
	}
}
