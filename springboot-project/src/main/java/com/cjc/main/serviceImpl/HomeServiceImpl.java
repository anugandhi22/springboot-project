package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeRepository sdi;

	@Override
	public void saveStudent(Student s) {
		sdi.save(s);
	}
	@Override
	public Student logincheck(String un, String ps) {
		
		return  sdi.findAllByUnameAndPassword(un,ps);
	}

	@Override
	public Iterable<Student> getAlldata() {
		return sdi.findAll();
	}

	@Override
	public void deleteData(int rollno) {
        sdi.deleteById(rollno);		
	}

	@Override
	public Student editData(int rollno) {
		return sdi.findAllByRollno(rollno);
	}

}
