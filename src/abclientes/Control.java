package abclientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Control implements ActionListener{
    private Vista vista;
    private BDModelo modelo;
    public Control(Vista vista, BDModelo modelo){
        this.vista=vista;
        this.modelo=modelo;
        this.vista.btnAlta.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.btnAlta)){
            this.modelo.conectar();
            this.vista.lbMovimiento.setText(
            this.modelo.alta(
                    this.vista.txtUsuario.getText(), 
                    this.vista.txtPassword.getText(), 
                    this.vista.txtCorreo.getText(), 
                    this.vista.txtNombre.getText(), 
                    this.vista.txtApellido.getText())
            );
            this.modelo.cerrar();
        }
    }
}
