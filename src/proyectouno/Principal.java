package proyectouno;

public class Principal {

    
    public static void main(String[] args) {
        Ventana vtn = new Ventana();
        
        System.out.println("Hola");
        vtn.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        vtn.setLocationRelativeTo(null);
        vtn.setVisible(true);
        // TODO code application logic here
    }
    
}
