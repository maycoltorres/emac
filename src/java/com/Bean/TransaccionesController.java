package com.Bean;

import com.Bean.util.MobilePageController;
import com.Entities.Transacciones;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "transaccionesController")
@ViewScoped
public class TransaccionesController extends AbstractController<Transacciones> {

    @Inject
    private MobilePageController mobilePageController;

    public TransaccionesController() {
        // Inform the Abstract parent controller of the concrete Transacciones Entity
        super(Transacciones.class);
    }

}
