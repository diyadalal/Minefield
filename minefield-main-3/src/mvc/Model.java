package mvc;

import java.io.Serializable;

public class Model extends Publisher implements Serializable {

    boolean unsavedChanges;
    String fileName;

    public Model() { // no arguments constructor
        this.fileName = null;
        this.unsavedChanges = false;
    }

    public Model(String fileName, boolean unsavedChanges) {
        this.fileName = fileName;
        this.unsavedChanges = unsavedChanges;
    }


    public boolean getUnsavedChanges(){
        return unsavedChanges;
    }

    public void setUnsavedChanges(boolean changes){
        unsavedChanges = changes;
    }

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fName){
        fileName = fName;
    }

    public void changed(){
        notifySubscribers();
    }
}