package net.javaGuides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaGuides.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
