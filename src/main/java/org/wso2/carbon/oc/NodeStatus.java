package org.wso2.carbon.oc;


public enum NodeStatus {

	STARTED("started"), STOPPED("stopped"), CRASHED("crashed");

	private String statusCode;

	private NodeStatus(String s) {
		statusCode = s;
	}

	public String getStatusCode() {
		return statusCode;
	}

}
