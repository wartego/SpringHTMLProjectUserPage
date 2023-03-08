package pl.sda.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringProjectHtmlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectHtmlApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        //adding new students into database

//        Student student1 = new Student("Ramesh", "Fadateare" , "ramesh@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Tomek", "Rochala" , "tomcio@gmail.com");
//        studentRepository.save(student2);
    }
}
