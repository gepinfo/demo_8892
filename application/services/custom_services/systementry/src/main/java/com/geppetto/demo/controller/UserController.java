package com.geppetto.demo.controller;

import com.geppetto.demo.dto.UserDto;
import com.geppetto.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

   private final UserService userService;

   public UserController(UserService userService) {
      this.userService = userService;
   }







}