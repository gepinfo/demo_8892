package com.geppetto.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

import jakarta.persistence.*;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String _id;
    
    private String name;
    
    private Number age;
    
    
    }

