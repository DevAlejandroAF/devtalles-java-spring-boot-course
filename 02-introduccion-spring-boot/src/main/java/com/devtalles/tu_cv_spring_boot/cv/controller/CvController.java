package com.devtalles.tu_cv_spring_boot.cv.controller;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/cv")
@RequiredArgsConstructor
public class CvController {

    private final Person person;

    @GetMapping({"/index", "", "/"})
    public String index(Model model){
//        Person person = new Person("Gabriel", "Chaldú", "Dev");
//        model.addAttribute("name", "Ga");
//        model.addAttribute("persona", person);
        model.addAttribute("property", person.getFirstName());
        return "index";
    }

    @GetMapping("index2")
    public String index2(Model model,
                         @RequestParam(required = false) String texto,
                         @RequestParam(required = false) Integer number
    ){
        model.addAttribute("texto", texto);
        model.addAttribute("number", number);
        return "index2";
    }

}
