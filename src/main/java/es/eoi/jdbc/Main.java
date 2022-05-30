package es.eoi.jdbc;

import es.eoi.jdbc.entity.es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.service.es.eoi.jdbc.service.StudentService;
import es.eoi.jdbc.service.es.eoi.jdbc.service.StudentServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//controlador llama a servicio e iteraciona con usuario

public class Main {

    public static void main(String[] args, StudentService studentService) throws ParseException {
        Scanner in = new Scanner(System.in);
        String option = "";
        while (!option.equals("0")) {
            menuStudent(in);
            userCaseOption(in, option);
        }
    }

    private static String menuStudent(Scanner in) {
        System.out.println("GESTION INSTITUTO V1");
        System.out.println("_______");
        System.out.println("1 - LISTADO ALUMNOS");
        System.out.println("2 - BUSCAR ALUMNO(DNI)");
        System.out.println("3 - CREAR ALUMNO");
        System.out.println("4 - ELIMINAR ALUMNO");
        System.out.println("5 - MODIFICAR ALUMNO");
        System.out.println("0 - SALIR");
        System.out.println("_______");
        System.out.print("Enter your option: ");
        return in.nextLine();
    }

    private static void userCaseOption(Scanner in, String option) throws ParseException {
        StudentService service = new StudentServiceImpl(); //implemento servicio para poderlo llamar
        switch (option) {
            case "1" -> {
                System.out.print("List of students: ");
                service.findAll();
            }
            case "2" -> {
                System.out.print("Enter your DNI: ");
                service.findById(in.nextLine());
            }
            case "3" -> {
                System.out.print("Create student");
                service.create(createStudent(in));
            }
            case "4" -> {
                System.out.print("Delete of students: ");
                service.delete(in.nextLine());
            }
            case "5" -> {
                System.out.print("Modify of students: ");
                service.update(modifyStudent(in));
            }
            case "0" -> System.out.println("Exit");
            default -> System.out.println("Option incorrect");
        }
        ;
    }

    private static Student createStudent(Scanner in) throws ParseException {
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your surname: ");
        String surname = in.nextLine();
        System.out.print("Enter your date: ");
        String date = in.nextLine();
        Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return new Student(name, surname, birthDate);
    }

    private static Student modifyStudent(Scanner in) throws ParseException {
        System.out.print("Enter your DNI: ");
        String id = in.nextLine();
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your surname: ");
        String surname = in.nextLine();
        System.out.print("Enter your date: ");
        String date = in.nextLine();
        Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return new Student(Integer.valueOf(id), name, surname, birthDate);
    }
}

