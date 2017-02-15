package com.Bean;

import com.Bean.util.MobilePageController;
import com.Entities.Puntos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "puntosController")
@ViewScoped
public class PuntosController extends AbstractController<Puntos> {

    @Inject
    private MobilePageController mobilePageController;

    public PuntosController() {
        // Inform the Abstract parent controller of the concrete Puntos Entity
        super(Puntos.class);
    }

}
