package com.tokyomanager.olympics.competitions;

import com.tokyomanager.olympics.model.Competition;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ricardo Sanfelice
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/competition")
public class CompetitionController {

    @Autowired
    private Competitions competitions;

    @RequestMapping("/list")    
    public ModelAndView list() {
        List<Competition> lista = competitions.findAll();

        ModelAndView modelAndView = new ModelAndView("competitionlist");
        modelAndView.addObject("competitions", lista);

        return modelAndView;
    }

}
