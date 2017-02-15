package com.Bean;

import com.Bean.util.MobilePageController;
import com.Entities.Usuarios;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "usuariosController")
@ViewScoped
public class UsuariosController extends AbstractController<Usuarios> {

    @Inject
    private MobilePageController mobilePageController;

    public UsuariosController() {
        // Inform the Abstract parent controller of the concrete Usuarios Entity
        super(Usuarios.class);
    }

}
