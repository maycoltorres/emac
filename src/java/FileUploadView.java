/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
 
@ManagedBean
public class FileUploadView {
     
    private UploadedFile file;
 
    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
     
    public void handleFileUpload(FileUploadEvent event) {
        String path;
        //FacesMessage message = new FacesMessage("El archivo", event.getFile().getFileName() + " is uploaded.");
        //FacesContext.getCurrentInstance().addMessage(null, message);
         //path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("Archivos");
         path= FacesContext.getCurrentInstance().getExternalContext().getRealPath("Archivos");
        path=path.substring(0, path.indexOf("\\build"));
        path=path+"\\web\\resources\\Archivos\\";
        try {
            InputStream in =  file.getInputstream();
            byte[] data = new byte[in.available()];
            in.read(data);
            FileOutputStream out= new FileOutputStream(new File(path+"clientes.xlsx"));
            out.write(data);
            in.close();
            out.close();
             FacesMessage message = new FacesMessage("El archivo", event.getFile().getFileName() + " is uploaded.");
             FacesContext.getCurrentInstance().addMessage(null, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
}
