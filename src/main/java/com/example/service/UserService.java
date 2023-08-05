package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<User> users;

    public List<User> findByUserNameOrEmail(String username) {

        List<User> result = users.stream()
                .filter(x -> x.getUsername().equalsIgnoreCase(username))
                .collect( Collectors.toList());

        return result;

    }

    // Init some users for testing
    @PostConstruct
    private void iniDataForTesting() {

        users = new ArrayList<User>();

        User user1 = new User("hamza", "password111", "hamza@yahoo.com");
        User user2 = new User("Ahsan", "password222", "ahsan@yahoo.com");
        User user3 = new User("usman", "password333", "usman@yahoo.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);

    }
}
