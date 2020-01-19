package com.cko.sampleSpringProject.controller;

import com.cko.sampleSpringProject.dao.UserDAO;
import com.cko.sampleSpringProject.model.Film;
import com.cko.sampleSpringProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/casino")
public class CasinoController {

    @Autowired
    UserDAO userDAO;


    @GetMapping("/casino")
    public String showNewCasinoMain() {
        return "casino/casinoFront";
    }

    @GetMapping("/akkCasino")
    public ModelAndView showEditFilmPage(@RequestParam String email) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userDAO.findByEmail(email);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("casino/casinoAkk");
        return modelAndView;
    }
    @PostMapping("/akkCasino")
    public String showNewCasinoToMain() {
        return "casino/casinoFront";
    }





//    @PostMapping("/editFilm")
//    public RedirectView editFilm(Film film) {
//       userDAO.save(film);
//        return new RedirectView("/film/all");
//    }

}
