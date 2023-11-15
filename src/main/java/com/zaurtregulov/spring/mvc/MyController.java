package com.zaurtregulov.spring.mvc;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {


        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
////        String surName = request.getParameter("employeeSurname");
////        int salary = request.getIntHeader("salary");
//        empName = "Mr. " + empName;
//        //контейнер для данных
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description","teacher of history");
//        return "show-emp-details-view";
//    }


//    @RequestMapping("/showDetails")
//    public String showEmpDetails(
//            @RequestParam("employeeName") String empName,
//            Model model) {
//        //в изъятии параметра нет необъодимости, поскольку есть аннтоация реквест парам
////        String empName = request.getParameter("employeeName");
////        empName = "Mr. " + empName;
////        //контейнер для данных
////        model.addAttribute("nameAttribute", empName);
////        model.addAttribute("description", "teacher of history");
//
//
//        return "show-emp-details-view";
//    }


    @PostMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult) {
        System.out.println(emp.getSurname().length());
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
//        String name = emp.getName();
//        emp.setName("mr " + name);
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 14);


    }
}
