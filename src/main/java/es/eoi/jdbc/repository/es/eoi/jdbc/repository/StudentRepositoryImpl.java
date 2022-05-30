package es.eoi.jdbc.repository.es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;

import java.sql.*;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    //Clase que implementa el interface

    @Override
    public Student findById(String id) {
        Student student = new Student();
        student = getConnection("SELECT * FROM student WHERE id = " + id);
        return student;
    }

    @Override
    public boolean delete(String id) {
        Student student = new Student();
        String query = "";
        getConnection(query);
        return false;
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
    public Student update(Student student) {
        return null;
    }

    //metodo dinamico para que pueda buscar por cualquier cosa
    private Student getConnection(String query) {

        final String url = "jdbc:mysql://localhost:3306/jdbcproject";
        final String user = "root";
        final String password = "caniche95";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(String.format("Already Connected to  %s", url));
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            //hay que hacer aqui un bucle para poder transformarlos a un obj student definido arriba
            Student student = new Student();

            while (resultSet.next()) {
                student.setId(resultSet.getInt("id"));
                student.setBirthDate(resultSet.getDate("birth_date"));
                student.setName(resultSet.getString("Name"));
                student.setSurname(resultSet.getString("Surname"));
            }

            connection.close();
            return student;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}