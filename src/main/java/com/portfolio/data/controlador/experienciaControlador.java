package com.portfolio.data.controlador;

import com.portfolio.data.modelo.experiencia;
import com.portfolio.data.modelo.token;
import com.portfolio.data.modelo.usuario;
import com.portfolio.data.servicio.IExperienciaService;
import com.portfolio.data.servicio.IUsuariosService;
import com.portfolio.data.utilidades.JWTUtil;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin
public class experienciaControlador {

    @Autowired
    private IExperienciaService expeService;

    @Autowired
    private JWTUtil jwtUtil;


    @GetMapping("/ver")
    @ResponseBody
    public List<experiencia> ver(){
        return expeService.verExperiencia();
    }

    @PostMapping("/crear")
    public void crear(@RequestBody experiencia expe, @RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)) { expeService.crearExperiencia(expe); }
    }

    @DeleteMapping("/borrar/{id}")
    public void  eliminar(@PathVariable Integer id,@RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)) {expeService.eliminarExperiencia(id);}
    }

    @PutMapping("/modificar/{id}")
    public void modificar(@PathVariable Integer id,
                          @RequestBody experiencia editExpe,
                          @RequestHeader(value="Authorization") String token){
        if (jwtUtil.validarToken(token)){
        experiencia expe= expeService.encontrarExperiencia(id);
        expe.setTrabajo(editExpe.getTrabajo());
        expe.setEmpresa(editExpe.getEmpresa());
        expe.setFecha_inicio(editExpe.getFecha_inicio());
        expe.setFecha_fin(editExpe.getFecha_fin());
        expe.setDescripcion(editExpe.getDescripcion());
        expe.setImg(editExpe.getImg());

        expeService.crearExperiencia(expe);}
    }
}
