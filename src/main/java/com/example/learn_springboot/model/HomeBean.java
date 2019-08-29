package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="home")
public class HomeBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String ID;
	private String PASSWORD;
	private String NAME;

	public HomeBean() {
	}

	public HomeBean(String ID, String PASSWORD, String NAME) {
		this.ID = ID;
		this.PASSWORD = PASSWORD;
		this.NAME = NAME;
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getPASSWORD() {
		return this.PASSWORD;
	}

	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}

	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public HomeBean ID(String ID) {
		this.ID = ID;
		return this;
	}

	public HomeBean PASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
		return this;
	}

	public HomeBean NAME(String NAME) {
		this.NAME = NAME;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof HomeBean)) {
			return false;
		}
		HomeBean homeBean = (HomeBean) o;
		return Objects.equals(ID, homeBean.ID) && Objects.equals(PASSWORD, homeBean.PASSWORD) && Objects.equals(NAME, homeBean.NAME);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, PASSWORD, NAME);
	}

	@Override
	public String toString() {
		return "{" +
			" ID='" + getID() + "'" +
			", PASSWORD='" + getPASSWORD() + "'" +
			", NAME='" + getNAME() + "'" +
			"}";
	}


}