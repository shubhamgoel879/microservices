package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    List<User> list= List.of(
            new User(1000L,"Shubham","898989898"),
            new User(1001L,"Kanishak","454545454"),
            new User(1003L,"Satyam","5656565656")
    );

    public User getUser(Long id){
        return this.list.stream().filter(x->x.getUserId().equals(id)).findAny().orElse(null);
    }
}
