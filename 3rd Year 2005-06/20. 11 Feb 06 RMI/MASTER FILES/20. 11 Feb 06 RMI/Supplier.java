import java.io.Serializable;

public class Supplier implements Serializable
{
	private String m_IDNumber;
	private String m_SName;
	private String m_Address;
	private String m_PhoneNo;
	private String m_MobileNo;
	private String m_Email;
	private String m_Enrolldate;

	public Supplier()
	{
	    m_IDNumber="";
		m_SName="";
		m_Address="";
		m_PhoneNo="";
		m_MobileNo="";
		m_Email="";
		m_Enrolldate="";

	}//--------End of Default Constructor

/*
	public Supplier(Supplier supp)
	{
	     m_IDNumber		=supp.m_IDNumber;
	     m_SName		=supp.m_SName;
	     m_Address		=supp.m_Address;
	     m_PhoneNo		=supp.m_PhoneNo;
	     m_MobileNo		=supp.m_MobileNo;
	     m_Email		=supp.m_Email;
	     m_Enrolldate	=supp.m_Enrolldate;

	}//----------End of Constructor
*/

    //------------ Set Methods -------------------
	public void setIDNumber(String IDNumber)
	{ m_IDNumber=IDNumber; }

	public void setSName(String SName)
	{ m_SName=SName; }

	public void setAddress(String Address)
	{ m_Address=Address; }

	public void setPhoneNo(String PhoneNo)
	{ m_PhoneNo=PhoneNo; }

	public void setMobileNo(String MobileNo)
	{ m_MobileNo=MobileNo; }

	public void setEmail(String Email)
	{  m_Email=Email; }

	public void setEnrolldate(String Enrolldate)
	{   m_Enrolldate=Enrolldate; }

    //------------ Get Methods -------------------
	public String getIDNumber() { return m_IDNumber; }
	public String getSName()    { return m_SName;    }
	public String getAddress() 	{ return m_Address;  }
    public String getPhoneNo()  { return m_PhoneNo;  }
	public String getMobileNo() { return m_MobileNo; }
	public String getEmail()    { return m_Email; 	 }
	public String getEnrolldate(){return m_Enrolldate;}

}//-------End of Class





