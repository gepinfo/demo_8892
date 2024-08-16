package com.geppetto.demo.controller;

import com.geppetto.demo.config.NewConstant;
import com.geppetto.demo.apiAdapter.ApiAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.lang.Exception;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.jsonwebtoken.*;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/")
public class EmployeeModelController {

    @Autowired
    private ApiAdapter apiAdapter;



@PutMapping("/employeemanagement/get/update")
public ResponseEntity<Object> GpSearchForUpdate(@RequestBody Object object,HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpSearchForUpdate");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.put(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement/get/update",object,request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpSearchForUpdate");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@GetMapping("/employeemanagement")
public ResponseEntity<Object> GpGetAllValues(HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpGetAllValues");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.get(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement",request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpGetAllValues");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@DeleteMapping("/employeemanagement/{id}")
public ResponseEntity<Object> GpDelete( @PathVariable String id,HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpDelete");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.delete(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement/"+id,request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpDelete");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@GetMapping("/employeemanagement/get/search")
public ResponseEntity<Object> GpSearch(HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpSearch");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.get(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement/get/search",request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpSearch");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@PostMapping("/employeemanagement")
public ResponseEntity<Object> GpCreate(@RequestBody Object object,HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpCreate");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.post(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement",object,request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpCreate");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@GetMapping("/employeemanagement/{id}")
public ResponseEntity<Object> GpGetEntityById( @PathVariable String id,HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpGetEntityById");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.get(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement/"+id,request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpGetEntityById");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@GetMapping("/employeemanagement/{id}")
public ResponseEntity<Object> GpGetEntityById( @PathVariable String id,HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpGetEntityById");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.get(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement/"+id,request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpGetEntityById");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

@GetMapping("/employeemanagement/userid/created_by")
public ResponseEntity<Object> GpGetNounCreatedBy(HttpServletRequest request, HttpServletResponse response) throws IOException{
        log.info("Enter into EmployeeModelController : GpGetNounCreatedBy");
        try{
            String servletPath = request.getContextPath();
                    switch (servletPath) {
                        case "/mobile":
                        case "/web":
          Object result= apiAdapter.get(NewConstant.EMPLOYEEMANAGEMENTURL + "/employeemanagement/userid/created_by",request);
          return ResponseEntity.ok(result);
          default:
                    String errorMessage = "Invalid servlet path: " + servletPath;
                     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
                    }
        }
        catch(Exception e){
        log.info("Exit into EmployeeModelController : GpGetNounCreatedBy");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }







    }

