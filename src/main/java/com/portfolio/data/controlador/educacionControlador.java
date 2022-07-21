package com.portfolio.data.controlador;

import com.portfolio.data.modelo.educacion;
import com.portfolio.data.servicio.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/educacion")
@CrossOrigin
public class educacionControlador {

    @Autowired
    private IEducacionService eduService;

    @GetMapping("/ver")
    @ResponseBody
    public List<educacion> ver(){
        return eduService.verEducacion();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody educacion expe){
        eduService.crearEducacion(expe);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id){
        eduService.eliminarEducacion(id);
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody educacion editEdu){
        educacion edu= eduService.encontrarEducacion(id);
        edu.setTitulo(editEdu.getTitulo());
        edu.setAcademia(editEdu.getAcademia());
        edu.setFecha_fin(editEdu.getFecha_fin());

        eduService.crearEducacion(edu);
    }
}
