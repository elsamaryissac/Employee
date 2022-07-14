package com.example.employeedatabase.database.entity;

import java.io.Serializable;

public class WorksWithId implements Serializable {

	private Integer emp_id;
	private Integer client_id;
	public WorksWithId() {
		
	}
	public WorksWithId(Integer emp_id, Integer client_id) {
		super();
		this.emp_id = emp_id;
		this.client_id = client_id;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Integer getClient_id() {
		return client_id;
	}
	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client_id == null) ? 0 : client_id.hashCode());
		result = prime * result + ((emp_id == null) ? 0 : emp_id.hashCode());
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
		WorksWithId other = (WorksWithId) obj;
		if (client_id == null) {
			if (other.client_id != null)
				return false;
		} else if (!client_id.equals(other.client_id))
			return false;
		if (emp_id == null) {
			if (other.emp_id != null)
				return false;
		} else if (!emp_id.equals(other.emp_id))
			return false;
		return true;
	}
	
}
