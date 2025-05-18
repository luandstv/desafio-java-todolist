package com.luanalves.todo_list.config;

import com.luanalves.todo_list.entities.Task;
import com.luanalves.todo_list.entities.User;
import com.luanalves.todo_list.repositories.TaskRepository;
import com.luanalves.todo_list.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig {

    private static final Logger log = LoggerFactory.getLogger(TestConfig.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, TaskRepository taskRepository){

        // https://spring.io/guides/tutorials/rest
        return args -> {
            User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
            User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

            log.info("Preloading users {}", userRepository.saveAll(Arrays.asList(u1, u2)));

            Task t1 = new Task(null, "Estudar para prova de java", "prova de java na semana que vem, estudar 1 horas por dia", false);
            Task t2 = new Task(null, "AWS curso", "estudar o curso introdutorio de AWS", false);
            log.info("Preloading {}", taskRepository.saveAll(Arrays.asList(t1, t2)));

            log.info("Preloading {}", taskRepository.save(new Task(null, "AWS curso test 2", "estudar o curso introdutorio de AWS", false)));
        };
    }

//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private TaskRepository taskRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Task t1 = new Task(null, "Estudar para prova de java", "prova de java na semana que vem, estudar 1 horas por dia", false);
//        Task t2 = new Task(null, "AWS curso", "estudar o curso introdutorio de AWS", false);
//
//        taskRepository.saveAll(Arrays.asList(t1,t2));
//
//        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
//        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
//
//        userRepository.saveAll(Arrays.asList(u1,u2));
//    }
}
