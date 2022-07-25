package com.portfolio.data.controlador;

import com.portfolio.data.modelo.habilidades;
import com.portfolio.data.servicio.IHabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habilidades")
@CrossOrigin
public class habilidadesControlador {

    @Autowired
    private IHabilidadesService habilService;

    @GetMapping("/ver")
    @ResponseBody
    public List<habilidades> ver(){
        return habilService.verHabilidades();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody habilidades hab){
        habilService.crearHabilidades(hab);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id){
        habilService.eliminarHabilidades(id);
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody habilidades editHabi){
        habilidades hab= habilService.encontrarHabilidades(id);
        hab.setHabilidad(editHabi.getHabilidad());
        hab.setPorcentaje(editHabi.getPorcentaje());
        hab.setIconVB(editHabi.getIconVB());
        hab.setIconPath(editHabi.getIconPath());

        habilService.crearHabilidades(hab);
    }
}
