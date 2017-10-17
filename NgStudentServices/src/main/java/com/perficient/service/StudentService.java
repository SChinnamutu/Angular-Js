package com.perficient.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.perficient.bean.Student;
import com.perficient.exception.StudentNotFoundException;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class StudentService {

	static HashMap<Integer,Student> countryIdMap=getCountryIdMap();


	public StudentService() {
		super();

		if(countryIdMap==null)
		{
			countryIdMap=new HashMap<Integer,Student>();
			// Creating some object of countries while initializing
			Student student = new Student(10,"Messi", "Lio");
			Student student2 = new Student(7,"Ronaldo", "Cristiano");
			Student student3 = new Student(9,"Sauraz", "Luis");
			Student student4 = new Student(21,"Ramos", "Sergio");

			countryIdMap.put(10,student);
			countryIdMap.put(7,student2);
			countryIdMap.put(9,student3);
			countryIdMap.put(21,student4);
		}
	}

	public List<Student> getAllCountries()
	{
		List<Student> countries = new ArrayList<Student>(countryIdMap.values());
		return countries;
	}

	public Student getCountry(int id)
	{
		Student country= countryIdMap.get(id);

		if(country == null)
		{
			throw new StudentNotFoundException("Student with id "+id+" not found");
		}
		return country;
	}
	public boolean addCountry(Student student)
	{
		try {
			Student std  = countryIdMap.get(student.getId());
			if(std != null){
				std.setId(student.getId());
				std.setFirstName(student.getFirstName());
				std.setLastName(student.getLastName());
				countryIdMap.put(student.getId(), student);
			}else{
				countryIdMap.put(5, student);
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	
	public static HashMap<Integer, Student> getCountryIdMap() {
		return countryIdMap;
	}

	// Utility method to get max id
	public static int getMaxId()
	{ 	 int max=0;
	for (int id:countryIdMap.keySet()) {  
		if(max<=id)
			max=id;

	}  

	return max;
	}
	
	public Student updateCountry(Student country)
	{
		if(country.getId()<=0)
			return null;
		countryIdMap.put(country.getId(), country);
		return country;

	}
	
	public void deleteCountry(int id)
	{
		countryIdMap.remove(id);
	}
}
