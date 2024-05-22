package com.neo.neo4j.node;

import java.util.Date;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.format.annotation.DateTimeFormat;

@Node
public class PatientNode {

	@Id
	private String id;

	private String identifier; // hospital number

	private String title;

	private boolean priceUpdateRequired = false;

	private String firstName;

	private String lastName;

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dateOfBirth;

	private String gender;

	private String email;

	private String mobile;

	private String addressline1;

	private String addressline2;

	private String addressline3;

	private String addressline4;

	private String postcode;

	private String organisationIdentifier;

	private String transactionId;

	private String referrer;

	private String nextofkin;

	private String nextofkinrelation;

	private String nextofkinaddress;

	private String nkinphone;

	private String isinsured;

	private String residentofuk;

	private String insurer;

	private String membeshipid;

	private String registrationstatus;

	private String pdfFileName;

	private String registration;

	private String hcanumber;

	private String nhsnumber;

	private String preauthnumber;

	private String phone1;

	private String phone2;

	private String mobile2;

	private String initiatedBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isPriceUpdateRequired() {
		return priceUpdateRequired;
	}

	public void setPriceUpdateRequired(boolean priceUpdateRequired) {
		this.priceUpdateRequired = priceUpdateRequired;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getAddressline3() {
		return addressline3;
	}

	public void setAddressline3(String addressline3) {
		this.addressline3 = addressline3;
	}

	public String getAddressline4() {
		return addressline4;
	}

	public void setAddressline4(String addressline4) {
		this.addressline4 = addressline4;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getOrganisationIdentifier() {
		return organisationIdentifier;
	}

	public void setOrganisationIdentifier(String organisationIdentifier) {
		this.organisationIdentifier = organisationIdentifier;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getNextofkin() {
		return nextofkin;
	}

	public void setNextofkin(String nextofkin) {
		this.nextofkin = nextofkin;
	}

	public String getNextofkinrelation() {
		return nextofkinrelation;
	}

	public void setNextofkinrelation(String nextofkinrelation) {
		this.nextofkinrelation = nextofkinrelation;
	}

	public String getNextofkinaddress() {
		return nextofkinaddress;
	}

	public void setNextofkinaddress(String nextofkinaddress) {
		this.nextofkinaddress = nextofkinaddress;
	}

	public String getNkinphone() {
		return nkinphone;
	}

	public void setNkinphone(String nkinphone) {
		this.nkinphone = nkinphone;
	}

	public String getIsinsured() {
		return isinsured;
	}

	public void setIsinsured(String isinsured) {
		this.isinsured = isinsured;
	}

	public String getResidentofuk() {
		return residentofuk;
	}

	public void setResidentofuk(String residentofuk) {
		this.residentofuk = residentofuk;
	}

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	public String getMembeshipid() {
		return membeshipid;
	}

	public void setMembeshipid(String membeshipid) {
		this.membeshipid = membeshipid;
	}

	public String getRegistrationstatus() {
		return registrationstatus;
	}

	public void setRegistrationstatus(String registrationstatus) {
		this.registrationstatus = registrationstatus;
	}

	public String getPdfFileName() {
		return pdfFileName;
	}

	public void setPdfFileName(String pdfFileName) {
		this.pdfFileName = pdfFileName;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getHcanumber() {
		return hcanumber;
	}

	public void setHcanumber(String hcanumber) {
		this.hcanumber = hcanumber;
	}

	public String getNhsnumber() {
		return nhsnumber;
	}

	public void setNhsnumber(String nhsnumber) {
		this.nhsnumber = nhsnumber;
	}

	public String getPreauthnumber() {
		return preauthnumber;
	}

	public void setPreauthnumber(String preauthnumber) {
		this.preauthnumber = preauthnumber;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getInitiatedBy() {
		return initiatedBy;
	}

	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	

}
