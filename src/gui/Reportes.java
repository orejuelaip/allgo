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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Reportes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtpaciente;
	private JLabel lblFecha;
	private JLabel lblPaciente;
	private JTextField txtfecha;
	private JComboBox comboBox;
	private JLabel lblTipoPaciente;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reportes dialog = new Reportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reportes() {
		setTitle("Busqueda Paciente");
		setBounds(100, 100, 753, 642);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Paciente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(24, 19, 667, 468);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				txtpaciente = new JTextField();
				txtpaciente.setBounds(187, 49, 130, 26);
				panel.add(txtpaciente);
				txtpaciente.setColumns(10);
			}
			{
				JButton btnMostrar = new JButton("Mostrar");
				btnMostrar.setBounds(418, 49, 117, 29);
				panel.add(btnMostrar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setBounds(418, 92, 117, 29);
				panel.add(btnSalir);
			}
			
			lblFecha = new JLabel("Fecha");
			lblFecha.setBounds(53, 97, 61, 16);
			panel.add(lblFecha);
			
			lblPaciente = new JLabel("Paciente");
			lblPaciente.setBounds(53, 54, 61, 16);
			panel.add(lblPaciente);
			
			txtfecha = new JTextField();
			txtfecha.setBounds(187, 87, 130, 26);
			panel.add(txtfecha);
			txtfecha.setColumns(10);
			
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admitido", "Cancelado"}));
			comboBox.setBounds(187, 140, 110, 27);
			panel.add(comboBox);
			
			lblTipoPaciente = new JLabel("Tipo Paciente");
			lblTipoPaciente.setBounds(49, 144, 101, 16);
			panel.add(lblTipoPaciente);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(31, 215, 602, 219);
			panel.add(scrollPane);
			
			txtS = new JTextArea();
			scrollPane.setViewportView(txtS);
		}
	}
}
