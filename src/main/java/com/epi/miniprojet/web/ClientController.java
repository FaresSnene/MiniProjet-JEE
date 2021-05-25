package com.epi.miniprojet.web;

import com.epi.miniprojet.dao.entity.Banque;
import com.epi.miniprojet.dao.entity.Client;
import com.epi.miniprojet.service.IBanqueService;
import com.epi.miniprojet.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService iClientService;

    @GetMapping("/all")
    public ModelAndView getAllClient(){
        List<Client> allclients = iClientService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("client-page");
        modelAndView.addObject("clients",allclients);
        return modelAndView;
    }

    @PostMapping("/add")
    public void addClient(@RequestBody Client client){
        iClientService.addClient(client);
    }

    @PutMapping("/update")
    public void updateClient(@RequestBody Client client){
        iClientService.updateClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable("id") Long id){
        iClientService.deleteClient(id);
    }
}
