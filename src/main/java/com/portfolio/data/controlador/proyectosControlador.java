package com.portfolio.data.controlador;

import com.portfolio.data.modelo.proyectos;
import com.portfolio.data.servicio.IProyectosService;
import com.portfolio.data.utilidades.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
@CrossOrigin
public class proyectosControlador {

    @Autowired
    private IProyectosService proyServ;

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping("/ver")
    @ResponseBody
    public List<proyectos> ver(){
        return proyServ.verProyectos();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody proyectos proy,@RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)) proyServ.crearProyectos(proy);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id,@RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)) proyServ.eliminarProyectos(id);
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody proyectos editProy,
                          @RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)){
        proyectos proy= proyServ.encontrarProyectos(id);
        proy.setNombre(editProy.getNombre());
        proy.setDescripcion(editProy.getDescripcion());
        proy.setLink(editProy.getLink());
        proy.setImg(editProy.getImg());

        proyServ.crearProyectos(proy);}
    }
}
