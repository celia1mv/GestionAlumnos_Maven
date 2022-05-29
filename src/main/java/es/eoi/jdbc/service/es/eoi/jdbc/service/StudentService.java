package es.eoi.jdbc.service.es.eoi.jdbc.service;

import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.es.eoi.jdbc.repository.StudentRepository;
import es.eoi.jdbc.repository.es.eoi.jdbc.repository.StudentRepositoryImpl;

public class StudentService {
    //crear atributo studentrepository
    //la instancia en studenrepositoryimpl
    //atributo privado student repository pero studenrepositoryimpl
private final StudentRepository studentRepository;

public StudentService(){
    studentRepository = new StudentRepositoryImpl();
}

public Student findById(String id){
    this.studentRepository.openConnection();
            return this.studentRepository.findById(id);
}
}
