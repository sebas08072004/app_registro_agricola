import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_agricultor {
    static LinkedList<cls_agricultor> agricultor = new LinkedList<>();
    static LinkedList<cls_cultivo> cultivo = new LinkedList<>();
    static LinkedList<cls_labores> labores = new LinkedList<>();
    public static void main(String[] args) {

        labores.add(new cls_labores("1", "siembra", "3"));

        fnt_menu(true);
    }

    public static void fnt_menu(boolean m){
        boolean me = true;
        if ( m ==  true) {
            while (me = true) {
                String menu = JOptionPane.showInputDialog(null, "----------------AGROVERDE--------------------\n\n1. agricultores \n2. cultivos \n3. labores \n4. registro \n5.salir " );
                
                if(menu.equals("1")){
                    String id = JOptionPane.showInputDialog(null,"identificacion del agricultor:  ");
                    String nombre = JOptionPane.showInputDialog(null, "nombre del agricultor:  ");
                    String contacto = JOptionPane.showInputDialog(null, "contacto del agricultor: ");
                    String finca = JOptionPane.showInputDialog(null, "finca : ");
                   
                    
                    if(id.equals("") || nombre.equals("")|| contacto.equals("")||finca.equals("")){
                        JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos para poder realizar el registro");
                    } else {
                        boolean encontrado = false;
                        for (int i = 0; i < agricultor.size(); i++) {
                            if (agricultor.get(i).getId_agricultorStr().equals(id)) {
                                encontrado = true;
                                break;
                            }
                        }
            
                        if (encontrado) {
                            JOptionPane.showMessageDialog(null, "Ya te encuentrabas registrado, ya puedes iniciar a realizar tus labores");
                        } else {
                            agricultor.add(new cls_agricultor(id, nombre, contacto, finca));
                            JOptionPane.showMessageDialog(null, "Has sido registrado con éxito");
                        }
                    }
                }
                if(menu.equals("2")){
                    String id = JOptionPane.showInputDialog(null,"identificacion del cultivo:  ");
                    String nombre = JOptionPane.showInputDialog(null, "nombre del cultivo:  ");
                    String area = JOptionPane.showInputDialog(null, "area del cultivo (mt2): ");
                    
                   
                    
                    if(id.equals("") || nombre.equals("")|| area.equals("")){
                        JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos para poder realizar el registro");
                    } else {
                        boolean encontrado = false;
                        for (int i = 0; i < cultivo.size(); i++) {
                            if (cultivo.get(i).getId_cultivoStr().equals(id)) {
                                encontrado = true;
                                break;
                            }
                        }
            
                        if (encontrado) {
                            JOptionPane.showMessageDialog(null, "este cultivo Ya se encontraba registrado, puedes realizar labores en el");
                        } else {
                            cultivo.add(new cls_cultivo(id, nombre, area));
                            JOptionPane.showMessageDialog(null, "el cultivo ha sido registrado con éxito");
                        }
                    }

                }
                if (menu.equals("3")) {
                    String id = JOptionPane.showInputDialog(null, "---------------LABORES---------------- \n\n1.siembra \n 2.cosecha \n3. aplicacion de fertilizantes \n4. aplicacion de matamalezas 5. ");

                    
                    
                }    
            }
            
        }
    }
}
