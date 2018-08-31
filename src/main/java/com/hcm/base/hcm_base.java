package com.hcm.base;

public class hcm_base 
{
	//Browser Info
	public final static String chromepath = "D:\\Projects\\HCM\\workspace_hcm\\HCM\\src\\main\\java\\com\\hcm\\browsers\\chromedriver.exe";
	public final static String chromedriver = "webdriver.chrome.driver";
	
	//URL
	public final static String appurl = "http://192.168.2.140:8282/thcm";
	
	//Credentials
	public final static String username = "1006";
	public final static String password = "Kishan@29";
	
	//Reporting Manager
	public static String usrnamepath = "//*[@id=\"employeecode\"]";
	public static String passwrdpath = "//*[@id=\"password\"]";
	public static String signinbuttonpath = "//*[@id=\"loginid\"]";
	public static String dashboardurl = "http://192.168.2.140:8282/thcm/employeeSelfService";
	public static String eregpath = "//*[@id=\"eregistrationtab\"]/a/div[1]/img";
	public static String hrisfoundationurl = "http://192.168.2.140:8282/thcm/Hrisfoundation";
	public static String showentriespath = "//*[@id=\"allEmployeesList_length\"]/label/select";
	public static String webtablepath = "//*[@id=\"allEmployeesList\"]";
	public static String reportingmanagerpath = "//*[@id=\"accordion\"]/div[3]";
	public static String addnewbuttonpath = "//*[@id=\"tab5\"]/div[1]/div[2]/a";
	public static String reportingtypepath = "//*[@id=\"ddlReportingType_chzn\"]/a";
	public static String employeecodepath = "//*[@id=\"ddlreportingemployeecode\"]";
	public static String effectivedatepath = "//*[@id=\"reportingdatepicker\"]";
	public static String date19path = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a";
	public static String savebuttonpath = "//*[@id=\"btnsave\"]";
	public static String yesbuttonpopuppath = "/html/body/div[22]/div/div/div[2]/button[2]";

	//Shift
	public static String configurationpath = "//*[@id=\"navbar-collapse-1\"]/ul/li[1]/a";
	public static String masterspath = "//*[@id=\"navbar-collapse-1\"]/ul/li[1]/ul/li[1]/a";
	public static String shiftpath = "//*[@id=\"navbar-collapse-1\"]/ul/li[1]/ul/li[1]/ul/li[6]/a";
	public static String addnewpath = "//*[@id=\"tableid\"]/div[2]/div[1]/div/button";
	public static String shiftnamepath = "//*[@id=\"ddlshiftname\"]";
	public static String shortnamepath = "//*[@id=\"ddlshortname\"]";
	public static String colorpath = "//*[@id=\"ddlassignedcolour\"]";
	public static String statuspath = "//*[@id=\"ddlshiftstatus\"]";
	public static String statuslablepath = "//*[@id=\"form1\"]/div/div[4]/label";
	public static String descriptionpath = "//*[@id=\"ddldescription\"]";
	public static String savebuttonatshiftpath = "//*[@id=\"btnsave\"]";
	public static String modalfooterpath = "/html/body/div[8]/div/div/div[2]";
	public static String yesbuttonatshiftpath = "/html/body/div[8]/div/div/div[2]/button[2]";
	public static String shiftmasterurl = "http://192.168.2.140:8282/thcm/ShiftMaster";
	
	//Shift Parameters
	public static String shiftparamerterurl = "http://192.168.2.140:8282/thcm/shiftParametersetup";
	public static String addnewatshiftparampath = "//*[@id=\"tableid\"]/div[2]/div[1]/div/button";
	public static String shiftnameatparampath = "//*[@id=\"shiftnameid\"]";
	public static String shifttypeatparampath = "//*[@id=\"shiftypeid\"]";
	public static String starttimepath = "//*[@id=\"starttimeid\"]";
	public static String endtimepath = "//*[@id=\"endtimeid\"]";
	public static String of1path = "//*[@id=\"ofid\"]";
	public static String maxcutoffintimepath = "//*[@id=\"cutoffintimeid\"]";
	public static String maxcutoffouttimepath = "//*[@id=\"cutoffoutid\"]";
	public static String of2path = "//*[@id=\"nextofid\"]";
	public static String graceintimepath = "//*[@id=\"graceintimeid\"]";
	public static String graceouttimepath = "//*[@id=\"graceouttimeid\"]";
	public static String allowovertimepath = "//*[@id=\"overtimeid\"]";
	public static String submitbuttonpath = "//*[@id=\"btnsave\"]";
	public static String yesbuttonatparampath = "/html/body/div[6]/div/div/div[2]/button[2]";
	
	//Time Picker
	public static String timehourtextpath = "/html/body/div[6]/table/tbody/tr[2]/td[1]/input";
	public static String timeminutetextpath = "/html/body/div[6]/table/tbody/tr[2]/td[3]/input";
	public static String timemeridiantextpath = "/html/body/div[6]/table/tbody/tr[2]/td[5]/input";
	
	//For Label click
	public static String startimelabelroughpath = "//*[@id=\"form1\"]/div[5]/div[1]/div[1]/div/label";
	
	//No of Breaks 
	public static String noofbreakspath = "//*[@id=\"totalnoofbreaksid\"]";
	
	//Break 1
	public static String break1typepath = "//*[@id=\"break1id\"]/div/select";//type
	public static String break1starttimepath = "//*[@id=\"formgroup1\"]/div[2]/div/div/input";//start
	public static String break1endtimepath = "//*[@id=\"formgroup1\"]/div[4]/div/div/input";//end
	
	//Break 2
	public static String break2typepath = "//*[@id=\"break2id\"]/div/select";//type
	public static String break2starttimepath = "//*[@id=\"formgroup2\"]/div[2]/div/div/input";//start
	public static String break2endtimepath = "//*[@id=\"formgroup2\"]/div[4]/div/div/input";//end
	
	//Break 3
	public static String break3typepath = "//*[@id=\"break3id\"]/div/select";//type
	public static String break3starttimepath = "//*[@id=\"formgroup3\"]/div[2]/div/div/input";//start
	public static String break3endtimepath = "//*[@id=\"formgroup3\"]/div[4]/div/div/input";//end
	
	//Break 4
	public static String break4typepath = "//*[@id=\"break4id\"]/div/select";//type
	public static String break4starttimepath = "//*[@id=\"formgroup4\"]/div[2]/div/div/input";//start
	public static String break4endtimepath = "//*[@id=\"formgroup4\"]/div[4]/div/div/input";//end
	
	//Fixed Roster without Shift
	public static String fixedrosterpath = "//*[@id=\"accordion\"]/div[2]";
	public static String addnewbuttonpathatfixedroster = "//*[@id=\"tab13\"]/div[1]/div[2]/a";
	public static String rosterrequiredpath = "//*[@id=\"ddlroasterrequired\"]";
	public static String effectivedateatrosterpath = "//*[@id=\"roasterdatepicker\"]";
	public static String date21path = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a";
	public static String savebuttonatrosterpath = "//*[@id=\"roasterform\"]/div[2]/button[1]";
	public static String yesbuttonatrosterpath = "/html/body/div[22]/div/div/div[2]/button[2]";
	
	//Fixed Roster Default Shift
	public static String date23path = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a";
	public static String date24path = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a";
	public static String defaultshiftpath = "//*[@id=\"assignid_chzn\"]/a";
	public static String defaultshifttextpath = "//*[@id=\"assignid_chzn\"]/div/div/input";
	
	
	
	
	
}
