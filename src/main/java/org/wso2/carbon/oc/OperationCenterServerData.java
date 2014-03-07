package org.wso2.carbon.oc;


import java.io.Serializable;

import org.wso2.carbon.server.admin.common.ServerData;
import org.wso2.carbon.server.admin.service.ServerAdmin;


public class OperationCenterServerData implements Serializable {

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
	private static final long serialVersionUID = -2824220142590618849L;

	private String javaRunTimeName;
	private String javaVMVersion;
	private String javaVMVendor;
	private String javaHome;
	private String javaVersion;
	private String osName;
	private String osVersion;
	private String userHome;
	private String userTimezone;
	private String userName;
	private String userCountry;
	private String axis2Location;
	private String serverName;
	private String repoLocation;
	private String carbonVersion = "undefined";
	private String serverStartTime;
	private String serverStartUpDuration;
	private String serverUpTime;
	private String serverIp;
	private String registryType;
	private String dbName;
	private String dbVersion;
	private String dbDriverName;
	private String dbDriverVersion;
	private String dbURL;
	private String remoteRegistryURL;
	private String remoteRegistryChroot;
	private ServerData extractedData;
	private ServerAdmin serverAdmin;
	
	

	public ServerData getExtractedData() {
		return extractedData;
	}

	public void setExtractedData(ServerData extractedData) {
		this.extractedData = extractedData;
	}

	public ServerAdmin getServerAdmin() {
		return serverAdmin;
	}

	public void setServerAdmin(ServerAdmin serverAdmin) {
		this.serverAdmin = serverAdmin;
	}

	public OperationCenterServerData() throws Exception {
	    super();
	    //TODO ServerAdmin object Singleton ? 
	    //setServerAdmin();
	    setExtractedData(getServerAdmin().getServerData());
	    init();
	    
    }

	public String getJavaRunTimeName() {
		return javaRunTimeName;
	}

	public void setJavaRunTimeName(String javaRunTimeName) {
		this.javaRunTimeName = javaRunTimeName;
	}

	public String getJavaVMVersion() {
		return javaVMVersion;
	}

	public void setJavaVMVersion(String javaVMVersion) {
		this.javaVMVersion = javaVMVersion;
	}

	public String getJavaVMVendor() {
		return javaVMVendor;
	}

	public void setJavaVMVendor(String javaVMVendor) {
		this.javaVMVendor = javaVMVendor;
	}

	public String getJavaHome() {
		return javaHome;
	}

	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getUserHome() {
		return userHome;
	}

	public void setUserHome(String userHome) {
		this.userHome = userHome;
	}

	public String getUserTimezone() {
		return userTimezone;
	}

	public void setUserTimezone(String userTimezone) {
		this.userTimezone = userTimezone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getAxis2Location() {
		return axis2Location;
	}

	public void setAxis2Location(String axis2Location) {
		this.axis2Location = axis2Location;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getRepoLocation() {
		return repoLocation;
	}

	public void setRepoLocation(String repoLocation) {
		this.repoLocation = repoLocation;
	}

	public String getCarbonVersion() {
		return carbonVersion;
	}

	public void setCarbonVersion(String carbonVersion) {
		this.carbonVersion = carbonVersion;
	}

	public String getServerStartTime() {
		return serverStartTime;
	}

	public void setServerStartTime(String serverStartTime) {
		this.serverStartTime = serverStartTime;
	}

	public String getServerStartUpDuration() {
		return serverStartUpDuration;
	}

	public void setServerStartUpDuration(String serverStartUpDuration) {
		this.serverStartUpDuration = serverStartUpDuration;
	}

	public String getServerUpTime() {
		return serverUpTime;
	}

	public void setServerUpTime(String serverUpTime) {
		this.serverUpTime = serverUpTime;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getRegistryType() {
		return registryType;
	}

	public void setRegistryType(String registryType) {
		this.registryType = registryType;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbVersion() {
		return dbVersion;
	}

	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

	public String getDbDriverName() {
		return dbDriverName;
	}

	public void setDbDriverName(String dbDriverName) {
		this.dbDriverName = dbDriverName;
	}

	public String getDbDriverVersion() {
		return dbDriverVersion;
	}

	public void setDbDriverVersion(String dbDriverVersion) {
		this.dbDriverVersion = dbDriverVersion;
	}

	public String getDbURL() {
		return dbURL;
	}

	public void setDbURL(String dbURL) {
		this.dbURL = dbURL;
	}

	public String getRemoteRegistryURL() {
		return remoteRegistryURL;
	}

	public void setRemoteRegistryURL(String remoteRegistryURL) {
		this.remoteRegistryURL = remoteRegistryURL;
	}

	public String getRemoteRegistryChroot() {
		return remoteRegistryChroot;
	}

	public void setRemoteRegistryChroot(String remoteRegistryChroot) {
		this.remoteRegistryChroot = remoteRegistryChroot;
	}

	public void init() {
		if(getExtractedData()!=null){
			/* Base initialization */ 
			setJavaRunTimeName(getExtractedData().getJavaRuntimeName());
			setJavaVMVersion(getExtractedData().getJavaVersion());
			setJavaVMVendor(getExtractedData().getJavaVMVersion());
			setJavaHome(getExtractedData().getJavaHome());
			setJavaVersion(getExtractedData().getJavaVersion());
			setOsName(getExtractedData().getOsName());
			setOsVersion(getExtractedData().getOsVersion());
			setUserHome(getExtractedData().getUserHome());
			setUserTimezone(getExtractedData().getUserTimezone());
			setUserName(getExtractedData().getUserName());
			setAxis2Location(getExtractedData().getAxis2Location());
			setServerName(getExtractedData().getServerName());
			setRepoLocation(getExtractedData().getRepoLocation());
			setCarbonVersion(getExtractedData().getCarbonVersion());
			setServerStartTime(getExtractedData().getServerStartTime());
			setServerStartUpDuration(getExtractedData().getServerStartUpDuration());
			setServerIp(getExtractedData().getServerIp());
			setRegistryType(getExtractedData().getRegistryType());
			setDbName(getExtractedData().getDbName());
			setDbVersion(getExtractedData().getDbVersion());
			setDbDriverName(getExtractedData().getDbDriverName());
			setDbDriverVersion(getExtractedData().getDbDriverVersion());
			setDbURL(getExtractedData().getDbURL());
			setRemoteRegistryURL(getExtractedData().getRemoteRegistryURL());
			setRemoteRegistryChroot(getExtractedData().getRemoteRegistryChroot());
			
			
		}

	}

}
