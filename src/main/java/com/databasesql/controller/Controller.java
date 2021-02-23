package com.databasesql.controller;

import com.databasesql.model.Model;
import com.databasesql.repository.Reposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employeee")
@RestController
public class Controller {
    @Autowired
    Reposi reposi;


    @PostMapping("/create")
    public void CreateModel(@RequestBody Model m) {
        reposi.save (m);

    }

  /*  @GetMapping("/allfind")
    public List<Model> getAllModel() {

        List<Model> all = repository.findAll ();
        return all;
    }
    //if employee name = sloka then transfer location to USA :)
    @PutMapping("/updateRecord")
    public void condition() {
        List<Model> all = repository.findAll ();
        for (int i = 0; i < all.size (); i++) {
            Model model = all.get (i);
            if ("sloka".equals (model.getEmpName ())) {
                model.setLocation ("usa");
                repository.save (model);
            }
        }
    }*/

}


