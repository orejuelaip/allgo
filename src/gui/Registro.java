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

public class Registro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodpaciente;
	private JTextField txtnvpaciente;
	private JButton btnAceptar;
	private JButton btnNuevoPaciente;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registro dialog = new Registro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registro() {
		setTitle("Hospitalizacion\n");
		setBounds(100, 100, 637, 409);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Dato Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(27, 24, 590, 333);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigoPaciente = new JLabel("Codigo Paciente");
				lblCodigoPaciente.setBounds(20, 53, 131, 16);
				panel.add(lblCodigoPaciente);
			}
			{
				txtcodpaciente = new JTextField();
				txtcodpaciente.setBounds(169, 48, 130, 26);
				panel.add(txtcodpaciente);
				txtcodpaciente.setColumns(10);
			}
			{
				JLabel lblNuevoPaciente = new JLabel("Codigo Empleado");
				lblNuevoPaciente.setBounds(28, 103, 123, 16);
				panel.add(lblNuevoPaciente);
			}
			{
				txtnvpaciente = new JTextField();
				txtnvpaciente.setBounds(169, 98, 130, 26);
				panel.add(txtnvpaciente);
				txtnvpaciente.setColumns(10);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Economico", "Ejecutivo"}));
				comboBox.setBounds(453, 49, 131, 27);
				panel.add(comboBox);
			}
			{
				JLabel lblCamas = new JLabel("Categoria Camas");
				lblCamas.setBounds(320, 53, 131, 16);
				panel.add(lblCamas);
			}
			
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(21, 154, 130, 29);
			panel.add(btnAceptar);
			
			btnNuevoPaciente = new JButton("Nuevo Paciente");
			btnNuevoPaciente.setBounds(21, 195, 140, 29);
			panel.add(btnNuevoPaciente);
			
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(427, 154, 117, 29);
			panel.add(btnCerrar);
		}
	}
}
