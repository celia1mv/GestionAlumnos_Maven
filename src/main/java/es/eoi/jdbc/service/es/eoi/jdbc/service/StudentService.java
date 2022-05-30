package es.eoi.jdbc.service.es.eoi.jdbc.service;

import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;

import java.util.List;

public interface StudentService {

    Student findById(String id);

    List<Student> findAll();

    Student create(Student student);

    boolean delete(String id);

    Student update(Student student);


}
