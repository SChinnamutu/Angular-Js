package com.perficient.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.perficient.bean.Student;
import com.perficient.service.StudentService;


@Path("/students")
public class StudentController {

	StudentService studentService = new StudentService(); 
	
	@GET
	@Path("/GetStudents")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Student> getCountries()
	{
		List<Student> listOfCountries = studentService.getAllCountries();
		return listOfCountries;
	}
	
	@POST
	@Path("/AddStudent")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Student> addCountry(Student student)
	{
		if(studentService.addCountry(student)){
			return studentService.getAllCountries();
		}else{
			return studentService.getAllCountries();
		}
		
	}
	
	@PUT
	@Path("/UpdateStudent")
    @Produces(MediaType.APPLICATION_JSON)
	public Student updateCountry(Student country)
	{
		return studentService.updateCountry(country);
		
	}
	
    @DELETE
   // @Path("/DeleteStudent/{id}")
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteCountry(@PathParam("id") int id)
	{
    	studentService.deleteCountry(id);
		
	}
    
    @GET
    @Path("/GetStudentById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id") int id)
	{
		return studentService.getCountry(id);
	}
   
    
}
