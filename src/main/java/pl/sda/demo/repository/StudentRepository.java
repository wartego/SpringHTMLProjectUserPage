package pl.sda.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
