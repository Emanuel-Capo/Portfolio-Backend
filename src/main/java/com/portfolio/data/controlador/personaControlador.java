package com.portfolio.data.controlador;

import com.portfolio.data.modelo.persona;
import com.portfolio.data.servicio.IPersonaService;
import com.portfolio.data.utilidades.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin
public class personaControlador {
    @Autowired
    IPersonaService persoService;

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping("/ver")
    @ResponseBody
    public persona ver(){return persoService.verPersona(1);}

    @PutMapping("/modificar")
    public void modificar(@RequestBody persona editPer,@RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)){
        persona per= persoService.verPersona(1);
        per.setAcerca(editPer.getAcerca());
        per.setImg(editPer.getImg());

        persoService.crearPersona(per);}
    }
}
