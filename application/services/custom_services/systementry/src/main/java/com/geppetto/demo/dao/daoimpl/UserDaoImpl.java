package com.geppetto.demo.dao.daoimpl;

import com.geppetto.demo.model.User;
import com.geppetto.demo.repository.UserRepository;
import com.geppetto.demo.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
