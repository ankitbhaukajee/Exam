package exam;

public class Address {

	private String streetName;
	private Integer zipCode;

	public Address(String streetName, Integer zipCode) {
		super();
		this.streetName = streetName;
		this.zipCode = zipCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", zipCode=" + zipCode + "]";
	}

}
