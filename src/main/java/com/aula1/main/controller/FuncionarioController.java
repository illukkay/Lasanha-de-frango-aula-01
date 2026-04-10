/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula1.main.controller;


import com.aula1.main.dao.FuncionarioDao;
import com.aula1.main.model.FuncionarioBean;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class FuncionarioController {
    
    FuncionarioDao Dao = new FuncionarioDao();
    
    @GetMapping("/funcionarios")
    public String Funcionarios(Model model){
        List<FuncionarioBean> lista = Dao.ler();
        model.addAttribute("lista", lista);
        return "funcionarios";
        
    }
    
    @GetMapping("/painel")
    public String Painel (Model model){
       int total = Dao.contarFuncionarios();
       model.addAttribute("Lista", total);
       return "painel";
    }
}
