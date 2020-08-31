package com.udemy.imtiazAhmad.pma.controller;

import com.udemy.imtiazAhmad.pma.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path ="/project")
public class projectController {

    @Autowired
    Project project;

    @GetMapping(path = "/add-form")
    public String addProjectForm(Model model){
        model.addAttribute("project",project);
        return "add-project-form";
    }

    @PostMapping(path = "/save")
    public String saveProject(Model model,Project project){
        return "new project saved";
    }
}
