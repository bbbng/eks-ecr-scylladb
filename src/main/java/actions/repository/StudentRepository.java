package actions.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import actions.entity.Student;

@Repository
public interface StudentRepository extends CassandraRepository<Student, UUID> {

}
