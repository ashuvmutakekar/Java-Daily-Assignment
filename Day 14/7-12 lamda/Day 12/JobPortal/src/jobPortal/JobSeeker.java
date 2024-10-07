package jobPortal;

import java.time.LocalDate;

public class JobSeeker implements Comparable<JobSeeker> {
	Integer RegId;
	String name;
	String email;
	String password;
	LocalDate Dob;
	Double aadharId;
	String PhoneNo;
	LocalDate GradDate;
	Degree degree;
	public JobSeeker() {
		super();
	}
	public JobSeeker(Integer regId, String name, String email, String password, LocalDate dob, Double aadharId,
			String phoneNo, LocalDate gradDate, Degree degree) {
		super();
		RegId = regId;
		this.name = name;
		this.email = email;
		this.password = password;
		Dob = dob;
		this.aadharId = aadharId;
		PhoneNo = phoneNo;
		GradDate = gradDate;
		this.degree = degree;
	}
	public Integer getRegId() {
		return RegId;
	}
	public void setRegId(Integer regId) {
		RegId = regId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return Dob;
	}
	public void setDob(LocalDate dob) {
		Dob = dob;
	}
	public Double getAadharId() {
		return aadharId;
	}
	public void setAadharId(Double aadharId) {
		this.aadharId = aadharId;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public LocalDate getGradDate() {
		return GradDate;
	}
	public void setGradDate(LocalDate gradDate) {
		GradDate = gradDate;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "JobSeeker [RegId=" + RegId + ", name=" + name + ", email=" + email + ", password=" + password + ", Dob="
				+ Dob + ", aadharId=" + aadharId + ", PhoneNo=" + PhoneNo + ", GradDate=" + GradDate + ", degree="
				+ degree + "]";
	}
	@Override
	public int compareTo(JobSeeker o) {
		// TODO Auto-generated method stub
		return this.email.compareToIgnoreCase(o.email);
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof JobSeeker) {
			JobSeeker other=(JobSeeker)o;
			return this.RegId== other.RegId;
		}
		return false;
	}

}
