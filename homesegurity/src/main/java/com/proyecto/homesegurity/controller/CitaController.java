package com.proyecto.homesegurity.controller;

import com.proyecto.homesegurity.entity.Cita;
import com.proyecto.homesegurity.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class CitaController {

    @Autowired
    private CitaRepository citaRepository;

    @GetMapping("/citas/agendar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cita", new Cita());
        model.addAttribute("minDate", LocalDate.now().toString());
        return "agendar";
    }

    @PostMapping("/citas/agendar")
    public String guardarCita(Cita cita, Model model) {
        citaRepository.save(cita);
        model.addAttribute("mensaje", "Cita agendada exitosamente");
        model.addAttribute("cita", new Cita());
        model.addAttribute("minDate", LocalDate.now().toString());
        return "agendar";
    }
}
