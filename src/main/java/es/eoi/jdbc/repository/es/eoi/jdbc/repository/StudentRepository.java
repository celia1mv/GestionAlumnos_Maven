package es.eoi.jdbc.repository.es.eoi.jdbc.repository;
import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;
import java.sql.Connection;
import java.util.List;

public interface StudentRepository {
    Connection openConnection();

    public Student findById(String id);
    public List<Student> findAll();
    public Student create(Student student);
    public boolean delete(String id);
    public Student update(Student student);


}
