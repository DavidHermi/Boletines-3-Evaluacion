
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Gui extends JFrame{
    private JTextField celdaNome;
    private JTextField celdaApelido;
    private JComboBox comboBox1;
    private JButton AGREGARTABOAButton;
    private JTable table1;
    private JLabel textoNome;
    private JLabel textoApelido;
    private JPanel panel1;


    public Gui() {
        setContentPane(panel1);
        DefaultTableModel model = new DefaultTableModel();
        table1.setAutoCreateColumnsFromModel(true);
        table1.setFillsViewportHeight(true);
        model.addColumn("NOME");
        model.addColumn("APELIDOS");
        model.addColumn("CURSO");

        AGREGARTABOAButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos[]={celdaNome.getText(),celdaApelido.getText(),comboBox1.getSelectedItem().toString()};
                table1.setModel(model);
                model.addRow(datos);
            }
        });
    }
}
