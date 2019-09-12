package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SERVICE_RD_INC database table.
 * 
 */
@Entity
@Table(name="SERVICE_RD_INC")
@NamedQuery(name="ServiceRdInc.findAll", query="SELECT s FROM ServiceRdInc s")
public class ServiceRdInc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"ID\"")
	private long id;

	@Column(name="APP_AADHAR")
	private String appAadhar;

	@Column(name="APP_ADDRESS")
	private String appAddress;

	@Column(name="APP_AFFIDAVIT")
	private String appAffidavit;

	@Column(name="APP_DISTRICT")
	private int appDistrict;

	@Column(name="APP_DOB")
	private String appDob;

	@Column(name="APP_EMAIL")
	private String appEmail;

	@Column(name="APP_FINANCIAL")
	private String appFinancial;

	@Column(name="APP_FMRELATION")
	private String appFmrelation;

	@Column(name="APP_FNAME")
	private String appFname;

	@Column(name="APP_GENDER")
	private int appGender;

	@Column(name="APP_IDPROOF")
	private String appIdproof;

	@Column(name="APP_IMAGE")
	private String appImage;

	@Column(name="APP_INCOME")
	private String appIncome;

	@Column(name="APP_LANDOWNER")
	private String appLandowner;

	@Column(name="APP_LNAME")
	private String appLname;

	@Column(name="APP_MNAME")
	private String appMname;

	@Column(name="APP_MOBILE")
	private String appMobile;

	@Column(name="APP_MOD")
	private int appMod;

	@Column(name="APP_PARIWAR")
	private String appPariwar;

	@Column(name="APP_PATWAR")
	private int appPatwar;

	@Column(name="APP_RELIGION")
	private int appReligion;

	@Column(name="APP_RESIDENCE")
	private String appResidence;

	@Column(name="APP_STATE")
	private int appState;

	@Column(name="APP_STATUS")
	private String appStatus;

	@Column(name="APP_TEHSIL")
	private int appTehsil;

	@Column(name="APP_TITLE")
	private int appTitle;

	@Column(name="APP_VILLAGE")
	private int appVillage;

	@Column(name="APPLICATION_CURRENT_USER")
	private String applicationCurrentUser;

	@Column(name="APPLICATION_NO")
	private String applicationNo;

	@Column(name="APPLICATION_STATUS")
	private String applicationStatus;

	@Column(name="APPLICATION_SUBMIT_DATE")
	private Timestamp applicationSubmitDate;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="DEPARTMENT_ID")
	private long departmentId;

	@Column(name="F_FNAME")
	private String fFname;

	@Column(name="F_LNAME")
	private String fLname;

	@Column(name="F_MNAME")
	private String fMname;

	@Column(name="F_TITLE")
	private int fTitle;

	@Column(name="FD_NAME")
	private String fdName;

	@Column(name="FD_RELATION")
	private String fdRelation;

	@Column(name="IS_ACTIVE")
	private int isActive;

	@Column(name="LAND_DETAILS")
	private String landDetails;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="MODIFIED_DATE")
	private Timestamp modifiedDate;

	@Column(name="SERVICE_ID")
	private long serviceId;

	@Column(name="SKILL_INDIANOTE")
	private int skillIndianote;

	public ServiceRdInc() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAppAadhar() {
		return this.appAadhar;
	}

	public void setAppAadhar(String appAadhar) {
		this.appAadhar = appAadhar;
	}

	public String getAppAddress() {
		return this.appAddress;
	}

	public void setAppAddress(String appAddress) {
		this.appAddress = appAddress;
	}

	public String getAppAffidavit() {
		return this.appAffidavit;
	}

	public void setAppAffidavit(String appAffidavit) {
		this.appAffidavit = appAffidavit;
	}

	public int getAppDistrict() {
		return this.appDistrict;
	}

	public void setAppDistrict(int appDistrict) {
		this.appDistrict = appDistrict;
	}

	public String getAppDob() {
		return this.appDob;
	}

	public void setAppDob(String appDob) {
		this.appDob = appDob;
	}

	public String getAppEmail() {
		return this.appEmail;
	}

	public void setAppEmail(String appEmail) {
		this.appEmail = appEmail;
	}

	public String getAppFinancial() {
		return this.appFinancial;
	}

	public void setAppFinancial(String appFinancial) {
		this.appFinancial = appFinancial;
	}

	public String getAppFmrelation() {
		return this.appFmrelation;
	}

	public void setAppFmrelation(String appFmrelation) {
		this.appFmrelation = appFmrelation;
	}

	public String getAppFname() {
		return this.appFname;
	}

	public void setAppFname(String appFname) {
		this.appFname = appFname;
	}

	public int getAppGender() {
		return this.appGender;
	}

	public void setAppGender(int appGender) {
		this.appGender = appGender;
	}

	public String getAppIdproof() {
		return this.appIdproof;
	}

	public void setAppIdproof(String appIdproof) {
		this.appIdproof = appIdproof;
	}

	public String getAppImage() {
		return this.appImage;
	}

	public void setAppImage(String appImage) {
		this.appImage = appImage;
	}

	public String getAppIncome() {
		return this.appIncome;
	}

	public void setAppIncome(String appIncome) {
		this.appIncome = appIncome;
	}

	public String getAppLandowner() {
		return this.appLandowner;
	}

	public void setAppLandowner(String appLandowner) {
		this.appLandowner = appLandowner;
	}

	public String getAppLname() {
		return this.appLname;
	}

	public void setAppLname(String appLname) {
		this.appLname = appLname;
	}

	public String getAppMname() {
		return this.appMname;
	}

	public void setAppMname(String appMname) {
		this.appMname = appMname;
	}

	public String getAppMobile() {
		return this.appMobile;
	}

	public void setAppMobile(String appMobile) {
		this.appMobile = appMobile;
	}

	public int getAppMod() {
		return this.appMod;
	}

	public void setAppMod(int appMod) {
		this.appMod = appMod;
	}

	public String getAppPariwar() {
		return this.appPariwar;
	}

	public void setAppPariwar(String appPariwar) {
		this.appPariwar = appPariwar;
	}

	public int getAppPatwar() {
		return this.appPatwar;
	}

	public void setAppPatwar(int appPatwar) {
		this.appPatwar = appPatwar;
	}

	public int getAppReligion() {
		return this.appReligion;
	}

	public void setAppReligion(int appReligion) {
		this.appReligion = appReligion;
	}

	public String getAppResidence() {
		return this.appResidence;
	}

	public void setAppResidence(String appResidence) {
		this.appResidence = appResidence;
	}

	public int getAppState() {
		return this.appState;
	}

	public void setAppState(int appState) {
		this.appState = appState;
	}

	public String getAppStatus() {
		return this.appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public int getAppTehsil() {
		return this.appTehsil;
	}

	public void setAppTehsil(int appTehsil) {
		this.appTehsil = appTehsil;
	}

	public int getAppTitle() {
		return this.appTitle;
	}

	public void setAppTitle(int appTitle) {
		this.appTitle = appTitle;
	}

	public int getAppVillage() {
		return this.appVillage;
	}

	public void setAppVillage(int appVillage) {
		this.appVillage = appVillage;
	}

	public String getApplicationCurrentUser() {
		return this.applicationCurrentUser;
	}

	public void setApplicationCurrentUser(String applicationCurrentUser) {
		this.applicationCurrentUser = applicationCurrentUser;
	}

	public String getApplicationNo() {
		return this.applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public Timestamp getApplicationSubmitDate() {
		return this.applicationSubmitDate;
	}

	public void setApplicationSubmitDate(Timestamp applicationSubmitDate) {
		this.applicationSubmitDate = applicationSubmitDate;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getFFname() {
		return this.fFname;
	}

	public void setFFname(String fFname) {
		this.fFname = fFname;
	}

	public String getFLname() {
		return this.fLname;
	}

	public void setFLname(String fLname) {
		this.fLname = fLname;
	}

	public String getFMname() {
		return this.fMname;
	}

	public void setFMname(String fMname) {
		this.fMname = fMname;
	}

	public int getFTitle() {
		return this.fTitle;
	}

	public void setFTitle(int fTitle) {
		this.fTitle = fTitle;
	}

	public String getFdName() {
		return this.fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}

	public String getFdRelation() {
		return this.fdRelation;
	}

	public void setFdRelation(String fdRelation) {
		this.fdRelation = fdRelation;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getLandDetails() {
		return this.landDetails;
	}

	public void setLandDetails(String landDetails) {
		this.landDetails = landDetails;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public int getSkillIndianote() {
		return this.skillIndianote;
	}

	public void setSkillIndianote(int skillIndianote) {
		this.skillIndianote = skillIndianote;
	}

}