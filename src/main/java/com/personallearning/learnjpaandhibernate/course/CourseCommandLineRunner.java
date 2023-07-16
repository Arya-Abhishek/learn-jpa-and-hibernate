package com.personallearning.learnjpaandhibernate.course;

import com.personallearning.learnjpaandhibernate.course.Course;
import com.personallearning.learnjpaandhibernate.jdbc.CourseJdbcRepository;
import com.personallearning.learnjpaandhibernate.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "learn aws", "Ranga sir"));
        repository.insert(new Course(2, "learn azure", "me sir"));
        repository.insert(new Course(3, "learn devops", "te sir"));

        repository.deleteById(3);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(2));
    }
}
