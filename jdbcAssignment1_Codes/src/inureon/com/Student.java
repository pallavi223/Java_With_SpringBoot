package inureon.com;


public class Student {

	
	private int sId;
	private String sName;
	private String sPhone;
	private String sCity;
	
	public Student(int sId, String sName, String sPhone, String sCity) {
		this.sId = sId;
		this.sName = sName;
		this.sPhone = sPhone;
		this.sCity = sCity;
	}

	public Student( String sName, String sPhone, String sCity) {
		super();
		
		this.sName = sName;
		this.sPhone = sPhone;
		this.sCity = sCity;
	}
	public Student() {
	   super();
	}
	
	


	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sId=");
		builder.append(sId);
		builder.append(", sName=");
		builder.append(sName);
		builder.append(", sPhone=");
		builder.append(sPhone);
		builder.append(", sCity=");
		builder.append(sCity);
		builder.append("]");
		return builder.toString();
	}
}
