package Entities;

public class Customer {

	private String firstName;
	private String lastName;
	private int id;
	private long DateOfBirth;
	private long NationalyId;
	public Customer(String firstName, String lastName, int id, int dateOfBirth, long nationalyId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		DateOfBirth = dateOfBirth;
		NationalyId = nationalyId;
	}
	public Customer() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public long getNationalyId() {
		return NationalyId;
	}
	public void setNationalyId(long nationalyId) {
		NationalyId = nationalyId;
	}
	

}
