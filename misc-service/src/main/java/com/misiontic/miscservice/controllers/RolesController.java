package com.misiontic.miscservice.controllers;

import java.util.ArrayList;
import java.util.List;

import com.misiontic.miscservice.model.Role;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolesController {
  @GetMapping("/roles")
  public List<Role> getRoles() {
    List<Role> roles = new ArrayList<Role>();
    roles.add(new Role("ADMIN", "Administrador"));
    roles.add(new Role("LEADER", "Líder"));
    roles.add(new Role("STUDENT", "Estudiante"));

    return roles;
  }
}
