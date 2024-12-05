package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService {
	public void saveStudent(Student s);
	public Student logincheck(String un, String ps);
 public Iterable<Student> getAlldata();
public void deleteData(int rollno);
public Student editData(int rollno);

}
