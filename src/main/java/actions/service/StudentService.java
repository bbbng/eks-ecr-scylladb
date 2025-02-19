package actions.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datastax.oss.driver.api.core.uuid.Uuids;

import actions.entity.Student;
import actions.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(UUID id) {
		return studentRepository.findById(id).orElseThrow();
	}

	@Transactional
	public Student registerStudent(Student newStudent) {
		return studentRepository.save(Student.builder().sid(Uuids.timeBased()).name(newStudent.getName()).build());
	}

	@Transactional
	public Student updateStudent(Student updateStudent, UUID id) {
		Student stu = studentRepository.findById(id).orElseThrow();
		stu.setName(updateStudent.getName());
		return stu;
	}

	@Transactional
	public Student deleteStudentById(UUID id) {
		Student stu = studentRepository.findById(id).orElseThrow();
		studentRepository.delete(stu);
		return stu;
	}

}
