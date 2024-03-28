package com.vamsi.springdatajpaex;

import com.vamsi.springdatajpaex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
//    @Query("select s from Student where s.name=?1")
//     List<Student> findByName(String name);
}
