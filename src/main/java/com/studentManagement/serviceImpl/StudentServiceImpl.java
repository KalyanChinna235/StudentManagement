package com.studentManagement.serviceImpl;

import com.studentManagement.model.Student;
import com.studentManagement.repository.StudentRepo;
import com.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
