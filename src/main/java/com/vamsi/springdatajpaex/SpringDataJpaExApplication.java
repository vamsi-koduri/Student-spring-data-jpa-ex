package com.vamsi.springdatajpaex;

import com.vamsi.springdatajpaex.model.Student;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		StudentRepo repo=context.getBean(StudentRepo.class);

		s1.setRollNo(27);
		s1.setName("vamsi");
		s1.setMarks(97);

		s2.setRollNo(28);
		s2.setName("hello");
		s2.setMarks(98);

		s3.setRollNo(29);
		s3.setName("hihihi");
		s3.setMarks(99);

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		System.out.println(repo.findAll());

//		Optional<Student> s=repo.findById(30);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("vamsi"));




	}

}
