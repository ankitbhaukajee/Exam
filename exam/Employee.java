package exam;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.id.compareTo(e.id);
	}

}
