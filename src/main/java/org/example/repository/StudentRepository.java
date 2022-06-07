package org.example.repository;

import org.example.entity.Sinf;
import org.example.entity.Student;

import java.util.List;

public interface StudentRepository {
    public int create(Student student);

    public List<Student> read();

    public Student findStudentById(int studentId);

    public Student findStudentByEmail(String email);

    public Student findStudentByCourse(String email);

    public int update(Student student);

    public int delete(int studentId);

}
