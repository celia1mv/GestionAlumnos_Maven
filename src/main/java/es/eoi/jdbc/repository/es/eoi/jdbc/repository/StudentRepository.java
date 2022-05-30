package es.eoi.jdbc.repository.es.eoi.jdbc.repository;
import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;
import java.sql.Connection;
import java.util.List;

public interface StudentRepository {

     Student findById(String id);
     List<Student> findAll();
     Student create(Student student);
     boolean delete(String id);
     Student update(Student student);


}
