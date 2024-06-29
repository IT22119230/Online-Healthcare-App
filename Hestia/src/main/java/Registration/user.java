package Registration;

public class user {

	
	private String fname;
	private String lname;
	private String uname;
	private String address;
	private String email;
	private String mobile;
	private String password;
	
	
	public user(String fname, String lname, String uname, String address, String email, String mobile,String password) {
		
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	
	
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getUname() {
		return uname;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPassword() {
		return password;
	}

	
}
