package com.portfolio.data.controlador;

import com.portfolio.data.modelo.proyectos;
import com.portfolio.data.servicio.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
@CrossOrigin
public class proyectosControlador {

    @Autowired
    private IProyectosService proyServ;

    @GetMapping("/ver")
    @ResponseBody
    public List<proyectos> ver(){
        return proyServ.verProyectos();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody proyectos proy){
        proyServ.crearProyectos(proy);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id){
        proyServ.eliminarProyectos(id);
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody proyectos editProy){
        proyectos proy= proyServ.encontrarProyectos(id);
        proy.setTipo(editProy.getTipo());
        proy.setDescripcion(editProy.getDescripcion());
        proy.setLink(editProy.getLink());

        proyServ.crearProyectos(proy);
    }
}
