/**
 * cls_agricultor
 */
public class cls_agricultor {

    private String id_agricultorStr;
    private String nombreStr;
    private String contactoStr;
    private String fincaStr;


    public cls_agricultor(String id_agricultorStr, String nombreStr, String contactoStr, String fincaStr) {
        this.id_agricultorStr = id_agricultorStr;
        this.nombreStr = nombreStr;
        this.contactoStr = contactoStr;
        this.fincaStr = fincaStr;
    }


    public String getId_agricultorStr() {
        return id_agricultorStr;
    }


    public void setId_agricultorStr(String id_agricultorStr) {
        this.id_agricultorStr = id_agricultorStr;
    }


    public String getNombreStr() {
        return nombreStr;
    }


    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }


    public String getContactoStr() {
        return contactoStr;
    }


    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }


    public String getFincaStr() {
        return fincaStr;
    }


    public void setFincaStr(String fincaStr) {
        this.fincaStr = fincaStr;
    }

    

    
}