package com.demo.LoanApp.Model;

import java.util.Objects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="example")
public class edtest{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.IDENTITY)
	private Long id;
	@Column(name="customerid")
	private String customerid;
	@Column(name="name")
	private String name;
	@Column(name="loantype")
	private String loantype;
	@Column(name="employmenttype")
	private String employmenttype;
	@Column(name="loanamount")
	private double loanamount;
	@Column(name="tenure")
	private double tenure; 
	@Column(name="interestrate")
	private String interestrate;
	@Column(name="monthlypayment")
	private String monthlypayment;
	@Column(name="approve")
	private boolean approve;
	@Column(name="collegename")
	private String collegename;
	@Column(name="qualification")
	private String qualification;
	@Column(name="branch")
	private String branch;
	@Column(name="percentage")
	private String percentage;
	@Column(name="passingyear")
	private String passingyear;
	@Column(name="referencename")
	private String referencename;
	@Column(name="contactno")
	private String contactno;
	@Column(name="loanreferenceid")
	private String loanreferenceid;
	
	
	
	public edtest() {
		
	}
	
	
	public edtest(String customerid, String name, String loantype, String employmenttype, double loanamount,
			double tenure, String interestrate, String monthlypayment, boolean approve, String collegename,
			String qualification, String branch, String percentage, String passingyear, String referencename,
			String contactno, String loanreferenceid) {
		
		this.customerid = customerid;
		this.name = name;
		this.loantype = loantype;
		this.employmenttype = employmenttype;
		this.loanamount = loanamount;
		this.tenure = tenure;
		this.interestrate = interestrate;
		this.monthlypayment = monthlypayment;
		this.approve = approve;
		this.collegename = collegename;
		this.qualification = qualification;
		this.branch = branch;
		this.percentage = percentage;
		this.passingyear = passingyear;
		this.referencename = referencename;
		this.contactno = contactno;
		this.loanreferenceid = loanreferenceid;
	}


	public edtest(Long id, String customerid, String name, String loantype, String employmenttype, double loanamount,
			double tenure, String interestrate, String monthlypayment, boolean approve, String collegename,
			String qualification, String branch, String percentage, String passingyear, String referencename,
			String contactno, String loanreferenceid) {
		
		this.id = id;
		this.customerid = customerid;
		this.name = name;
		this.loantype = loantype;
		this.employmenttype = employmenttype;
		this.loanamount = loanamount;
		this.tenure = tenure;
		this.interestrate = interestrate;
		this.monthlypayment = monthlypayment;
		this.approve = approve;
		this.collegename = collegename;
		this.qualification = qualification;
		this.branch = branch;
		this.percentage = percentage;
		this.passingyear = passingyear;
		this.referencename = referencename;
		this.contactno = contactno;
		this.loanreferenceid = loanreferenceid;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getEmploymenttype() {
		return employmenttype;
	}
	public void setEmploymenttype(String employmenttype) {
		this.employmenttype = employmenttype;
	}
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public double getTenure() {
		return tenure;
	}
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	public String getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(String interestrate) {
		this.interestrate = interestrate;
	}
	public String getMonthlypayment() {
		return monthlypayment;
	}
	public void setMonthlypayment(String monthlypayment) {
		this.monthlypayment = monthlypayment;
	}
	public boolean isApprove() {
		return approve;
	}
	public void setApprove(boolean approve) {
		this.approve = approve;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}
	public String getReferencename() {
		return referencename;
	}
	public void setReferencename(String referencename) {
		this.referencename = referencename;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getLoanreferenceid() {
		return loanreferenceid;
	}
	public void setLoanreferenceid(String loanreferenceid) {
		this.loanreferenceid = loanreferenceid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(approve, branch, collegename, contactno, customerid, employmenttype, id, interestrate,
				loanamount, loanreferenceid, loantype, monthlypayment, name, passingyear, percentage, qualification,
				referencename, tenure);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		edtest other = (edtest) obj;
		return approve == other.approve && Objects.equals(branch, other.branch)
				&& Objects.equals(collegename, other.collegename) && Objects.equals(contactno, other.contactno)
				&& Objects.equals(customerid, other.customerid) && Objects.equals(employmenttype, other.employmenttype)
				&& Objects.equals(id, other.id) && Objects.equals(interestrate, other.interestrate)
				&& Double.doubleToLongBits(loanamount) == Double.doubleToLongBits(other.loanamount)
				&& Objects.equals(loanreferenceid, other.loanreferenceid) && Objects.equals(loantype, other.loantype)
				&& Objects.equals(monthlypayment, other.monthlypayment) && Objects.equals(name, other.name)
				&& Objects.equals(passingyear, other.passingyear) && Objects.equals(percentage, other.percentage)
				&& Objects.equals(qualification, other.qualification)
				&& Objects.equals(referencename, other.referencename)
				&& Double.doubleToLongBits(tenure) == Double.doubleToLongBits(other.tenure);
	}
	@Override
	public String toString() {
		return "edtest [id=" + id + ", customerid=" + customerid + ", name=" + name + ", loantype=" + loantype
				+ ", employmenttype=" + employmenttype + ", loanamount=" + loanamount + ", tenure=" + tenure
				+ ", interestrate=" + interestrate + ", monthlypayment=" + monthlypayment + ", approve=" + approve
				+ ", collegename=" + collegename + ", qualification=" + qualification + ", branch=" + branch
				+ ", percentage=" + percentage + ", passingyear=" + passingyear + ", referencename=" + referencename
				+ ", contactno=" + contactno + ", loanreferenceid=" + loanreferenceid + "]";
	}
	
	

}
