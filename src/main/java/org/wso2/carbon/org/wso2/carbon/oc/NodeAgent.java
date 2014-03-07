package org.wso2.carbon.org.wso2.carbon.oc;


import java.io.Serializable;

public class NodeAgent implements Serializable {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 * 
	 * Maintainers must change this value if and only if the new version of this
	 * class is not compatible with old versions. See Sun docs for <a
	 * href=http://java.sun.com/products/jdk/1.1/docs/guide
	 * /serialization/spec/version.doc.html> details. </a>
	 * 
	 * Not necessary to include in first version of the class, but included here
	 * as a reminder of its importance.
	 */
	private static final long serialVersionUID = 6321012848212629219L;

	private int agentId;
	private int clusterId;
	private String product;
	private String[] elb;
	private String nodeName;
	private String nodeDescription;
	private int cpuUsage;
	private NodeStatus statusCode;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String[] getElb() {
		return elb;
	}

	public void setElb(String[] elb) {
		this.elb = elb;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeDescription() {
		return nodeDescription;
	}

	public void setNodeDescription(String nodeDescription) {
		this.nodeDescription = nodeDescription;
	}

	public int getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(int cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public NodeStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(NodeStatus statusCode) {
		this.statusCode = statusCode;
	}

	public int getAgentId() {
		return agentId;
	}

	public int getClusterId() {
		return clusterId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agentId;
		result = prime * result + clusterId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeAgent other = (NodeAgent) obj;
		if (agentId != other.agentId)
			return false;
		if (clusterId != other.clusterId)
			return false;
		return true;
	}

}
