package com.portfolio.data.controlador;

import com.portfolio.data.modelo.experiencia;
import com.portfolio.data.servicio.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin
public class experienciaControlador {

    @Autowired
    private IExperienciaService expeService;

    @GetMapping("/ver")
    @ResponseBody
    public List<experiencia> ver(){
        return expeService.verExperiencia();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody experiencia expe){
        expeService.crearExperiencia(expe);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id){
        expeService.eliminarExperiencia(id);
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody experiencia editExpe){
        experiencia expe= expeService.encontrarExperiencia(id);
        expe.setTrabajo(editExpe.getTrabajo());
        expe.setEmpresa(editExpe.getEmpresa());
        expe.setFecha_inicio(editExpe.getFecha_inicio());
        expe.setFecha_fin(editExpe.getFecha_fin());
        expe.setDescripcion(editExpe.getDescripcion());

        expeService.crearExperiencia(expe);
    }
}
