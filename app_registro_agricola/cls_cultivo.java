public class cls_cultivo {
    
    private String id_cultivoStr;
    private String nombre_cultivoStr;
    private String area;  // en metros cuadrados
    

    public cls_cultivo(String id_cultivoStr, String nombre_cultivoStr, String area) {
        this.id_cultivoStr = id_cultivoStr;
        this.nombre_cultivoStr = nombre_cultivoStr;
        this.area = area;
       
    }

    public String getId_cultivoStr() {
        return id_cultivoStr;
    }

    public void setId_cultivoStr(String id_cultivoStr) {
        this.id_cultivoStr = id_cultivoStr;
    }

    public String getNombre_cultivoStr() {
        return nombre_cultivoStr;
    }

    public void setNombre_cultivoStr(String nombre_cultivoStr) {
        this.nombre_cultivoStr = nombre_cultivoStr;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    

    
}
