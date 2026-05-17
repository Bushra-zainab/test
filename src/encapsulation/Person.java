package encapsulation;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {

			this.firstName = "";
		} else {
			this.firstName = firstName;

		}

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {

		if (lastName == null || lastName.isEmpty()) {

			this.lastName = "";
		} else {
			this.lastName = lastName;
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100) {

			this.age = 0;
		} else {

			this.age = age;
		}
	}

	public String getFullName() {
		if (firstName.isEmpty() && lastName.isEmpty()) {
			return "";
		}

		if (lastName.isEmpty()) {
			return firstName;
		}

		if (firstName.isEmpty()) {
			return lastName;
		}

		return firstName + " " + lastName;
	}

	public boolean isTeen() {
		// TODO Auto-generated method stub
		return age >= 13 && age <= 19;
	}

}
