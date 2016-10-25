package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static  final class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String>  phoneNumbers, String firstName, String lastName) {
			
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public final  Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
// 		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
// 			phoneNumbers = newPhoneNumbers;
// 		}
		
		public final String getFirstName() {
			return firstName;
		}
// 		public void setFirstName(String newName) {
// 			firstName = newName;
// 		}
		
		public final  String getLastName() {
			return lastName;
		}
// 		public void setLastName(String newName) {
// 			lastName = newName;
// 		}
	}
}
