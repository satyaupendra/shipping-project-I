package main;

public class Place{
	static String cityname;
	int zip;
	String Statename;
	String countryname;
	public Place(String CN,int zip,String SN,String CoN){
		setCityname(CN);
		setZip(zip);
		setStatename(SN);
		setCountryname(CoN);
	}
	public static String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getStatename() {
		return Statename;
	}
	public void setStatename(String statename) {
		Statename = statename;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
}