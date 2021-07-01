package com.extramarks.springboot_practice.controller;

import com.extramarks.springboot_practice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.extramarks.springboot_practice.repository.*;
import java.util.List;

@RestController
public class FormController {

    @Autowired
    public FormRepository formRepository;
    
    @Autowired
    private SequenceGenerator sequenceGenerator;

    @GetMapping(value="/all")
    public List<Form> getForm(){
        return formRepository.findAll();
    }

    @PostMapping(value = "/create")
    public String createForm(@RequestBody Form form){
    	form.setId(sequenceGenerator.getSequenceNumber(Form.SEQUENCE_NAME));
    	
        Form insertedForm=formRepository.insert(form);
        return "Form created for "+ insertedForm.getName()+".";
    }
}
