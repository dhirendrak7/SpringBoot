package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SERVICE_RD_FFC database table.
 * 
 */
@Entity
@Table(name="SERVICE_RD_FFC")
@NamedQuery(name="ServiceRdFfc.findAll", query="SELECT s FROM ServiceRdFfc s")
public class ServiceRdFfc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"ID\"")
	private long id;

	@Column(name="APP_AADHAR")
	private String appAadhar;

	@Column(name="APP_ADDRESS")
	private String appAddress;

	@Column(name="APP_DISTRICT")
	private int appDistrict;

	@Column(name="APP_DOB")
	private String appDob;

	@Column(name="APP_EMAIL")
	private String appEmail;

	@Column(name="APP_FFNAME")
	private String appFfname;

	@Column(name="APP_FLNAME")
	private String appFlname;

	@Column(name="APP_FMNAME")
	private String appFmname;

	@Column(name="APP_FNAME")
	private String appFname;

	@Column(name="APP_FRELATION")
	private String appFrelation;

	@Column(name="APP_FTITLE")
	private String appFtitle;

	@Column(name="APP_GENDER")
	private int appGender;

	@Column(name="APP_IDPROOF")
	private String appIdproof;

	@Column(name="APP_IMAGE")
	private String appImage;

	@Column(name="APP_LETTER")
	private String appLetter;

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

	@Column(name="APP_RELATION")
	private int appRelation;

	@Column(name="APP_RESIDENCEPROOF")
	private String appResidenceproof;

	@Column(name="APP_STATE")
	private int appState;

	@Column(name="APP_TEHSIL")
	private int appTehsil;

	@Column(name="APP_TITLE")
	private int appTitle;

	@Column(name="APP_VILLAGE")
	private int appVillage;

	@Column(name="APPLICATION_CITIZEN_USER")
	private String applicationCitizenUser;

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

	@Column(name="IS_ACTIVE")
	private int isActive;

	@Column(name="IS_PAID")
	private String isPaid;

	@Column(name="LAND_DETAILS")
	private String landDetails;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="MODIFIED_DATE")
	private Timestamp modifiedDate;

	@Column(name="PATWAR_REPORT")
	private String patwarReport;

	@Column(name="SERVICE_ID")
	private long serviceId;

	@Column(name="WORKFLOW_ID")
	private int workflowId;

	public ServiceRdFfc() {
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

	public String getAppFfname() {
		return this.appFfname;
	}

	public void setAppFfname(String appFfname) {
		this.appFfname = appFfname;
	}

	public String getAppFlname() {
		return this.appFlname;
	}

	public void setAppFlname(String appFlname) {
		this.appFlname = appFlname;
	}

	public String getAppFmname() {
		return this.appFmname;
	}

	public void setAppFmname(String appFmname) {
		this.appFmname = appFmname;
	}

	public String getAppFname() {
		return this.appFname;
	}

	public void setAppFname(String appFname) {
		this.appFname = appFname;
	}

	public String getAppFrelation() {
		return this.appFrelation;
	}

	public void setAppFrelation(String appFrelation) {
		this.appFrelation = appFrelation;
	}

	public String getAppFtitle() {
		return this.appFtitle;
	}

	public void setAppFtitle(String appFtitle) {
		this.appFtitle = appFtitle;
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

	public String getAppLetter() {
		return this.appLetter;
	}

	public void setAppLetter(String appLetter) {
		this.appLetter = appLetter;
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

	public int getAppRelation() {
		return this.appRelation;
	}

	public void setAppRelation(int appRelation) {
		this.appRelation = appRelation;
	}

	public String getAppResidenceproof() {
		return this.appResidenceproof;
	}

	public void setAppResidenceproof(String appResidenceproof) {
		this.appResidenceproof = appResidenceproof;
	}

	public int getAppState() {
		return this.appState;
	}

	public void setAppState(int appState) {
		this.appState = appState;
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

	public String getApplicationCitizenUser() {
		return this.applicationCitizenUser;
	}

	public void setApplicationCitizenUser(String applicationCitizenUser) {
		this.applicationCitizenUser = applicationCitizenUser;
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

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getIsPaid() {
		return this.isPaid;
	}

	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
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

	public String getPatwarReport() {
		return this.patwarReport;
	}

	public void setPatwarReport(String patwarReport) {
		this.patwarReport = patwarReport;
	}

	public long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public int getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}

}