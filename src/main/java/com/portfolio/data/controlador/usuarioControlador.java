package com.portfolio.data.controlador;


import com.portfolio.data.modelo.token;
import com.portfolio.data.modelo.usuario;
import com.portfolio.data.servicio.IUsuariosService;
import com.portfolio.data.utilidades.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/login")
@CrossOrigin
public class usuarioControlador {

    @Autowired
    private IUsuariosService usuarioServ;

    @Autowired
    private JWTUtil jwtUtil;

    token newToken=new token();

    @PostMapping("/validar")
    public token validar(@RequestBody usuario usuarioForm){
        usuario usuarioDB= usuarioServ.verUsuario(1);

       if (usuarioServ.validarUsuario(usuarioForm,usuarioDB)){
          String tokenjwt=jwtUtil.create("1",usuarioDB.getNombre());
          this.newToken.setToken(tokenjwt);
          return this.newToken;
       }
       return null;
    }

}
