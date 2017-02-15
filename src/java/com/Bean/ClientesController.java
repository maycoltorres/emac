package com.Bean;

import com.Bean.util.MobilePageController;
import com.Entities.Clientes;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "clientesController")
@ViewScoped
public class ClientesController extends AbstractController<Clientes> {

    @Inject
    private MobilePageController mobilePageController;

    public ClientesController() {
        // Inform the Abstract parent controller of the concrete Clientes Entity
        super(Clientes.class);
    }

    /**
     * Sets the "items" attribute with a collection of Movimientos entities that
     * are retrieved from Clientes?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Movimientos page
     */
    public String navigateMovimientosCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Movimientos_items", this.getSelected().getMovimientosCollection());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/movimientos/index";
    }

}
