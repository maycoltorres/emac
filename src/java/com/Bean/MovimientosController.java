package com.Bean;

import com.Bean.util.MobilePageController;
import com.Entities.Movimientos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "movimientosController")
@ViewScoped
public class MovimientosController extends AbstractController<Movimientos> {

    @Inject
    private ClientesController idClienteController;
    @Inject
    private MobilePageController mobilePageController;

    public MovimientosController() {
        // Inform the Abstract parent controller of the concrete Movimientos Entity
        super(Movimientos.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        idClienteController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Clientes controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareIdCliente(ActionEvent event) {
        if (this.getSelected() != null && idClienteController.getSelected() == null) {
            idClienteController.setSelected(this.getSelected().getIdCliente());
        }
    }
}
