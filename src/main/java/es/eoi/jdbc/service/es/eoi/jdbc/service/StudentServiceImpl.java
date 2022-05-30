package es.eoi.jdbc.service.es.eoi.jdbc.service;

import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.es.eoi.jdbc.repository.StudentRepository;
import es.eoi.jdbc.repository.es.eoi.jdbc.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //aqui va toda la logica de negocio
    private final StudentRepository studentRepository; //atr. que impl la interface (?)

    public StudentServiceImpl() {
        studentRepository = new StudentRepositoryImpl(); //ni idea
    }


    @Override
    public Student findById(String id) {
        Student student = new Student();
        student = studentRepository.findById(id);
        return student;

        //OTRAS OPCIONES
        // return studentRepository.findById(id);

        // Student estudiante = studentRepository.findById(id);
        // return estudiante;
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
