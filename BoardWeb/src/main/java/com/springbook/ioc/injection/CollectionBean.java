package com.springbook.ioc.injection;

import java.util.Properties;

public class CollectionBean {

//	private List<String> addressList;
//
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}
//	
//	public List<String> getAddressList() {
//		return addressList;
//	}	
	
//	private Set<String> addressList;
//
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}
//
//	public Set<String> getAddressList() {
//		return addressList;
//	}
	
//	private Map<String, String> addressList;
//
//	public void setAddressList(Map<String, String> addressList) {
//		this.addressList = addressList;
//	}
//
//	public Map<String, String> getAddressList() {
//		return addressList;
//	}
	
	private Properties addressList;
	
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}

}