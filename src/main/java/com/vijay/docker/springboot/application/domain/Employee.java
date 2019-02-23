package com.vijay.docker.springboot.application.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

/**
 * Employee domain contains the details of Employee
 * 
 * @author Vijay.Kumar
 * @since 16/02/2019
 *
 */

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	/**
	 * serialVersionUID
	 */
	protected static final long serialVersionUID = -7195813446420610925L;

	@Id
	@Column(name = "emp_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "Id of the Employee",name="id",required=true,value="id")
	private long id;

	@Column(name = "first_name", nullable = false)
	@ApiModelProperty(notes = "First Name of the Employee",name="firstName",required=true,value="firstName")
	private String firstName;

	@Column(name = "last_name", nullable = false)
	@ApiModelProperty(notes = "Last Name of the Employee",name="lastName",required=true,value="lastName")
	private String lastName;

	@Column(name = "email_Id", nullable = false)
	@ApiModelProperty(notes = "Emai-Id of the Employee",name="emailId",required=true,value="emailId")
	private String emailId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}	
}
