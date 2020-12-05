package cn.dreamchase.chasedreamlistthree.pojos;

public class Student {
	private int sId;
	private String sName;
	private char sSex;
	private int sAge;

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

	public char getsSex() {
		return sSex;
	}

	public void setsSex(char sSex) {
		this.sSex = sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + "]";
	}

}
