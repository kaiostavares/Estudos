package com.kaio.estudos_SpringSecurity.init;

import com.kaio.estudos_SpringSecurity.model.User;
import com.kaio.estudos_SpringSecurity.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StartApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public StartApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        User user = userRepository.findByUsername("admin");
        if(user == null) {
            user = new User();
            user.setName("ADMIN");
            user.setUsername("admin");
            user.setPassword(new BCryptPasswordEncoder().encode("admin123"));
            user.getRoles().add("MANAGERS");
            userRepository.save(user);
        }
        user = userRepository.findByUsername("user");
        if(user == null){
            user = new User();
            user.setName("USER");
            user.setUsername("user");
            user.setPassword(new BCryptPasswordEncoder().encode("user123"));
            user.getRoles().add("USERS");
            userRepository.save(user);
        }
    }

}
