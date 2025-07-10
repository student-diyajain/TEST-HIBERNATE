package com.map.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	  int P_id;
	  String P_name;
	  @ManyToMany(mappedBy = "project")
	  List<Emp> emp;
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
}
