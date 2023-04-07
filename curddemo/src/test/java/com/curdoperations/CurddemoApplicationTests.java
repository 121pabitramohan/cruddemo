package com.curdoperations;



import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.curdoperations.entities.Student;
import com.curdoperations.repository.StudentRepository;

@SpringBootTest
class CurddemoApplicationTests {
	@Autowired
  private StudentRepository  studentRepo;
	@Test
	void saveOneStudent() {
	Student s = new Student();
	s.setName("badatya");
	s.setCourse("datalist");
	s.setFee(11000);
	 studentRepo.save(s);
	}
	
	@Test
		void deleteByStudent() {
		  studentRepo.deleteById(2L);
		
	}
	@Test
	 void getOneStudent() {
Optional<Student> findById = studentRepo.findById(1L);   //optional class used here in our project
		if(findById.isPresent()) {
			Student student = findById.get();
			System.out.println(student.getName());
		}else {
			System.out.println("no record found");
		}
//		   Student student=findById.get();
//		   System.out.println(student.getId());
//		   System.out.println(student.getName());
//		   System.out.println(student.getFee());
//		   System.out.println(student.getCourse());
	 }
 @Test
	  void findOneStudentByName() {
		   Student student = studentRepo.findByFee(18000);
		   System.out.println(student.getId());
		   System.out.println(student.getName());
	   }
 @Test
 void updateOneStudent() {
	 Optional<Student> findById = studentRepo.findById(1L);
	   Student student = findById.get();
	   student.setFee(20000);
	   
	   studentRepo.save(student);
 }
 @Test
 void GetAllStudents() {
	 Iterable<Student> findAll = studentRepo.findAll();
	 //System.out.println(findAll);
	 for (Student student : findAll) {
		 System.out.println(student.getId());
		 System.out.println(student.getName());
		 System.out.println(student.getCourse());
		 System.out.println(student.getFee());
	 }
 }


 
 }


  
  
	
    

