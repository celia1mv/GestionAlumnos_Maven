package es.eoi.jdbc.repository.es.eoi.jdbc.repository;
import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;
import java.sql.Connection;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    //Clase que implementa el interface
    public Connection openConnection() {
        return null;
    }

    @Override
    public Student findById(String id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Student update(Student student) {
        return null;
    }
}