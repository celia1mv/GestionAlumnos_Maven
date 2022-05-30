package es.eoi.jdbc.entity.es.eoi.jdbc.entity;

import javax.persistence.*;
import java.util.Date;

@Entity //esto es una entidad definida BBDD
@Table(name = "student")
public class Student {
    @Id //clave primaria BBDD
    @GeneratedValue(strategy = GenerationType.AUTO) //aleat o secuenc
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "birth_date")
    private Date birthDate;

    //const. vacio para que me funcione el service
    public Student() {
    }

    public Student(int id, String name, String surname, Date fecha) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;

    }

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    //acceder datos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
