package com.portfolio.data.controlador;

import com.portfolio.data.modelo.experiencia;
import com.portfolio.data.modelo.usuario;
import com.portfolio.data.servicio.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class usuarioControlador {

    @Autowired
    private IUsuariosService usuarioServ;

    @GetMapping("/ver")
    @ResponseBody
    public List<usuario> ver(){
        return usuarioServ.verUsuarios();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody usuario usuario){
        usuarioServ.crearUsuarios(usuario);
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id){
        usuarioServ.eliminarUsuarios(id);
    }
}
