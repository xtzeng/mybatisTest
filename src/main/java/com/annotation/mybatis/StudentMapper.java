package com.annotation.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository  
@Transactional
public interface StudentMapper {   
    
    public StudentEntity getStudent(String studentID);   
       
    public StudentEntity getStudentAndClass(String studentID);   
       
    public List<StudentEntity> getStudentAll();   
       
    public void insertStudent(StudentEntity entity);   
       
    public void deleteStudent(StudentEntity entity);   
       
    public void updateStudent(StudentEntity entity);   
}  