import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JComboBox cboPosicion;
    private JTextField txtRendimiento;
    private JTextField txtSalario;
    private JButton btnRegistrar;
    private JComboBox cboActualizarPosicion;
    private JTextField txtNuevoSalario;
    private JButton btnActualizar;
    private JTextArea txtListado;

    private Equipo equipo1=new Equipo();

    public Ventana(){

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo=Integer.parseInt(txtCodigo.getText());
                String nombre=txtNombre.getText();
                String posicion=cboPosicion.getSelectedItem().toString();
                float rendimiento=Float.parseFloat(txtRendimiento.getText());
                float sueldo=Float.parseFloat(txtSalario.getText());
                try {
                    equipo1.agregarJugador(new Jugador(codigo, nombre,
                            rendimiento, posicion, sueldo));
                    JOptionPane.showMessageDialog(null,"Jugador agregado");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String posicion=cboActualizarPosicion.getSelectedItem().toString();
                float sueldo=Float.parseFloat(txtNuevoSalario.getText());
                equipo1.actualizarSueldo(posicion,sueldo);
                JOptionPane.showMessageDialog(null, "Se actualizaron");
                txtListado.setText(equipo1.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
