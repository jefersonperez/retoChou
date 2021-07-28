package com.choucair.formacion.models;

public class Insurant {
	public String firstName;
	public String lastName;
	public String dateBirth;
	public String gender;
	public String country;
	public String zipCode;
	public String occupation;
	public String hobbies;
	public String namePicture;
	public Insurant(String firstName, String lastName, String dateBirth, String gender, String country, String zipCode,
			String occupation, String hobbies, String namePicture) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
		this.gender = gender;
		this.country = country;
		this.zipCode = zipCode;
		this.occupation = occupation;
		this.hobbies = hobbies;
		this.namePicture = namePicture;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDateBirth() {
		return dateBirth;
	}
	public String getGender() {
		return gender;
	}
	public String getCountry() {
		return country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getOccupation() {
		return occupation;
	}
	public String getHobbies() {
		return hobbies;
	}
	public String getNamePicture() {
		return namePicture;
	}
		
	
}
