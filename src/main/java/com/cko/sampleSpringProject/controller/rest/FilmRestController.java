package com.cko.sampleSpringProject.controller.rest;

import com.cko.sampleSpringProject.dao.FilmDAO;
import com.cko.sampleSpringProject.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/film")
public class FilmRestController {

    @Autowired
    FilmDAO filmDAO;

    @GetMapping("/get")
    public Film getFilmById(@RequestParam Long id) {
        Film film = filmDAO.findFilmById(id);
        return film;
    }
    @GetMapping("/all")
    public List<Film> getAllFilms() {
        List<Film> films = filmDAO.findAll();
        return films;
    }

}
