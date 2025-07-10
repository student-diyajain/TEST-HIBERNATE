package com.map.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Emp {
	@Id
  int E_id;
  String E_name;
  @ManyToMany
  @JoinTable(name="TableEP",
  joinColumns = {@JoinColumn(name="E_ID")},
  inverseJoinColumns = {@JoinColumn(name="P_ID")})
  
  
  List<Project> project;
public int getE_id() {
	return E_id;
}
public void setE_id(int e_id) {
	E_id = e_id;
}
public String getE_name() {
	return E_name;
}
public void setE_name(String e_name) {
	E_name = e_name;
}
public List<Project> getProject() {
	return project;
}
public void setProject(List<Project> project) {
	this.project = project;
}
  
  
  
  
  
  
  
}
