package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class ControlPago extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodpaciente;
	private JTextArea txtS;
	private JButton btnMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ControlPago dialog = new ControlPago();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ControlPago() {
		setTitle("Control de Pago");
		setBounds(100, 100, 628, 465);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos de Pago", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(6, 6, 603, 418);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigoPaciente = new JLabel("Codigo Paciente");
				lblCodigoPaciente.setBounds(19, 44, 114, 16);
				panel.add(lblCodigoPaciente);
			}
			{
				txtcodpaciente = new JTextField();
				txtcodpaciente.setBounds(146, 39, 130, 26);
				panel.add(txtcodpaciente);
				txtcodpaciente.setColumns(10);
			}
			
			txtS = new JTextArea();
			txtS.setBounds(47, 153, 528, 236);
			panel.add(txtS);
			
			btnMostrar = new JButton("Mostrar");
			btnMostrar.setBounds(438, 39, 117, 29);
			panel.add(btnMostrar);
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setBounds(438, 98, 117, 29);
				panel.add(btnSalir);
			}
		}
	}
}
