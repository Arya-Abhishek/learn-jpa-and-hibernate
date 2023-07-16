package com.personallearning.learnjpaandhibernate.course;

import com.personallearning.learnjpaandhibernate.course.Course;
import com.personallearning.learnjpaandhibernate.jdbc.CourseJdbcRepository;
import com.personallearning.learnjpaandhibernate.jpa.CourseJpaRepository;
import com.personallearning.learnjpaandhibernate.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "learn aws", "Ranga sir"));
        repository.save(new Course(2, "learn azure", "Ranga sir"));
        repository.save(new Course(3, "learn devops", "Ranga sir"));

        repository.deleteById(3l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));

        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Ranga sir"));
        System.out.println(repository.findByAuthor(""));

        System.out.println("Course table names");
        System.out.println(repository.findByName("learn aws"));
        System.out.println(repository.findByName("learn azure"));
    }
}
