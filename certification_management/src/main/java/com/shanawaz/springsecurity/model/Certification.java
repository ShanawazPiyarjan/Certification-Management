package com.shanawaz.springsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Certification {
	
	@Id
	private long id;
	private String domain_name;
	private String certification_name;
	private String created_by;
	private String created_date;
	private String re_certification;
	public String getDomain_name() {
		return domain_name;
	}
	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}
	public String getCertification_name() {
		return certification_name;
	}
	public void setCertification_name(String certification_name) {
		this.certification_name = certification_name;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getRe_certification() {
		return re_certification;
	}
	public void setRe_certification(String re_certification) {
		this.re_certification = re_certification;
	}
	@Override
	public String toString() {
		return "Certification [id=" + id + ", domain_name=" + domain_name + ", certification_name=" + certification_name
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", re_certification="
				+ re_certification + "]";
	}
	
	

}
