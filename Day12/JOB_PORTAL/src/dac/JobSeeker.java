package dac;

import java.time.LocalDate;



public class JobSeeker implements Comparable<JobSeeker> {
	Integer registrationId;
	String name;
	String email;
	String password;
	LocalDate dateOfBirth;
	String aadharId;
	String phoneNo;
	LocalDate graduationDate;
	Degree degree;
	int id=123456;
	public JobSeeker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobSeeker( String name, String email, String password, LocalDate dateOfBirth,
			String aadharId, String phoneNo, LocalDate graduationDate, Degree degree) {
		super();
		this.registrationId = id++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
		this.phoneNo = phoneNo;
		this.graduationDate = graduationDate;
		this.degree = degree;
	}
	
	
	@Override
	public String toString() {
		return "JobSeeker [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", dateOfBirth=" + dateOfBirth + ", aadharId=" + aadharId + ", phoneNo=" + phoneNo
				+ ", graduationDate=" + graduationDate + ", degree=" + degree + "]";
	}
	
	
	 
	  
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public LocalDate getGraduationDate() {
		return graduationDate;
	}
	
	public Degree getDegree() {
		return degree;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadharId() {
		return aadharId;
	}
	
	@Override
	public int compareTo(JobSeeker o) {
		return this.email.compareTo(o.email);
	}
	
}
