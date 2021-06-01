package com.abc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	private int eid;
	@Column
	private String  empname;
	@Column
	 private String eaddr;
	 
	 
	public Employee() {
		super();
		System.out.println("Object has been Created");
	
	}


	public Employee(int eid, String empname, String eaddr) {
		super();
		this.eid = eid;
		this.empname = empname;
		this.eaddr = eaddr;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEname(String empname) {
		this.empname = empname;
	}


	public String getEaddr() {
		return eaddr;
	}


	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	 
	 
	
	

}
