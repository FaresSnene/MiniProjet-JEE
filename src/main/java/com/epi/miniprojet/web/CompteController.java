package com.epi.miniprojet.web;

import com.epi.miniprojet.dao.entity.Compte;
import com.epi.miniprojet.dao.entity.Compte;
import com.epi.miniprojet.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/compte")
public class CompteController {
    
    @Autowired
    private ICompteService iCompteService;

    @GetMapping("/all")
    public ModelAndView getAllCompte(){
        List<Compte> allcomptes = iCompteService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("compte-page");
        modelAndView.addObject("compte",allcomptes);
        return modelAndView;
    }

    @PostMapping("/add")
    public void addCompte(@RequestBody Compte compte){
        iCompteService.addCompte(compte);
    }

    @PutMapping("/update")
    public void updateCompte(@RequestBody Compte compte){
        iCompteService.updateCompte(compte);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompte(@PathVariable("id") Long id){
        iCompteService.deleteCompte(id);
    }
}
