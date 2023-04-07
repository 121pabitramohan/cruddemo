
package com.curdoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.curdoperations.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
   
Student findByFee(int Fee);
	
}
