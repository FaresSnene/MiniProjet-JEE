package com.epi.miniprojet.web;

import com.epi.miniprojet.dao.entity.Banque;
import com.epi.miniprojet.service.IBanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/banque")
public class BanqueController {

    @Autowired
    private IBanqueService iBanqueService;

    @GetMapping("/all")
    public ModelAndView getAllBanque(){
        List<Banque> allbanques = iBanqueService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("banque-page");
        modelAndView.addObject("banques",allbanques);
        return modelAndView;
    }

    @PostMapping("/add")
    public void addBanque(@RequestBody Banque banque){
        iBanqueService.addBanque(banque);
    }

    @PutMapping("/update")
    public void updateBanque(@RequestBody Banque banque){
        iBanqueService.updateBanque(banque);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBanque(@PathVariable("id") Long id){
        iBanqueService.deleteBanque(id);
    }
}
