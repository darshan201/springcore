package com.app.Springcollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private List<String> name;
	private Set<String> addresses;
	private Map<String, String> phones;

	public List<String> getName() {
		return name;
	}

	public Emp(List<String> name, Set<String> addresses, Map<String, String> phones) {
		super();
		this.name = name;
		this.addresses = addresses;
		this.phones = phones;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", addresses=" + addresses + ", phones=" + phones + "]";
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getPhones() {
		return phones;
	}

	public void setPhones(Map<String, String> phones) {
		this.phones = phones;
	}

}
