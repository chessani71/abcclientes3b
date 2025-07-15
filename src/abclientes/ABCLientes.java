package abclientes;
//David Hernández Chessani
public class ABCLientes {

    public static void main(String[] args) {
        BDModelo modelo=new BDModelo();
        Vista vista=new Vista();
        Control controlador=new Control(vista,modelo);
        vista.setVisible(true);
    }
    
}
