package com.portfolio.data.controlador;

import com.portfolio.data.modelo.habilidades;
import com.portfolio.data.servicio.IHabilidadesService;
import com.portfolio.data.utilidades.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habilidades")
@CrossOrigin
public class habilidadesControlador {

    @Autowired
    private IHabilidadesService habilService;

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping("/ver")
    @ResponseBody
    public List<habilidades> ver(){
        return habilService.verHabilidades();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody habilidades hab,@RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)) habilService.crearHabilidades(hab);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id,@RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)) habilService.eliminarHabilidades(id);
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody habilidades editHabi,
                          @RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)){
        habilidades hab= habilService.encontrarHabilidades(id);
        hab.setHabilidad(editHabi.getHabilidad());
        hab.setPorcentaje(editHabi.getPorcentaje());
        hab.setIconVB(editHabi.getIconVB());
        hab.setIconPath(editHabi.getIconPath());

        habilService.crearHabilidades(hab);}
    }
}
