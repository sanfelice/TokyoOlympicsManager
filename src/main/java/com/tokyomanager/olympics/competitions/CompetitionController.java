package com.tokyomanager.olympics.competitions;

import com.google.gson.Gson;
import com.tokyomanager.olympics.Countries;
import com.tokyomanager.olympics.Sites;
import com.tokyomanager.olympics.Sports;
import com.tokyomanager.olympics.Stages;
import com.tokyomanager.olympics.model.Competition;
import com.tokyomanager.olympics.model.Country;
import com.tokyomanager.olympics.model.Site;
import com.tokyomanager.olympics.model.Sport;
import com.tokyomanager.olympics.model.Stage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @Autowired
    private Sports sports;
    @Autowired
    private Sites sites;
    @Autowired
    private Stages stages;
    @Autowired
    private Countries countries;
    
    /**
     * Loads the view with the form used to register a competition
     * @return The view loaded with the models containing all the sports, sites
     * stages and countries used to register a competition
     */
    @GetMapping("/register")    
    public ModelAndView registerForm() {
        List<Sport> listSport = sports.findAll();
        List<Site> listSite = sites.findAll();
        List<Stage> listStage = stages.findAll();
        List<Country> listCountries = countries.findAll();
        
        
        ModelAndView modelAndView = new ModelAndView("competitionregister");
        modelAndView.addObject("sports", listSport);
        modelAndView.addObject("sites", listSite);
        modelAndView.addObject("stages", listStage);
        modelAndView.addObject("countries", listCountries);
        modelAndView.addObject("competition", new Competition());

        return modelAndView;
    }
    
    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute Competition competition) {
        competitions.save(competition);
        return "redirect:/competition/list";
    }
    
    @PutMapping("/register")
    @ResponseBody
    public String registerPut(@ModelAttribute Competition competition) {
        competitions.save(competition);
        return "redirect:/competition/list";
    }

    /**
     * Loads the view that lists all the competitions ordered by start date
     * @return 
     */
    @GetMapping("/list")    
    public ModelAndView list() {
        List<Competition> lista = competitions.findAll();

        ModelAndView modelAndView = new ModelAndView("competitionlist");
        modelAndView.addObject("competitions", lista);

        return modelAndView;
    }
    
    /**
     * Loads the view that lists all the competitions ordered by start date
     * @return 
     */
    @PostMapping("/list")
    @ResponseBody
    public String listCompetitions() {
        List<Competition> lista = competitions.findAll();

        return new Gson().toJson(lista);
    }

}
