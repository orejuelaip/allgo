package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ConsumoPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodpaciente;
	private JTextField txtcodconsumo;
	private JTextField txtcantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsumoPaciente dialog = new ConsumoPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsumoPaciente() {
		setTitle("ConsumoPaciente");
		setBounds(100, 100, 599, 276);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "ConsumoPaciente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(21, 6, 556, 217);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigoPaciente = new JLabel("Codigo Paciente");
				lblCodigoPaciente.setBounds(27, 35, 107, 32);
				panel.add(lblCodigoPaciente);
			}
			{
				JLabel lblCodigoConsumo = new JLabel("Codigo Consumo");
				lblCodigoConsumo.setBounds(27, 108, 122, 26);
				panel.add(lblCodigoConsumo);
			}
			{
				JLabel lblCantidad = new JLabel("Cantidad");
				lblCantidad.setBounds(27, 170, 107, 26);
				panel.add(lblCantidad);
			}
			{
				txtcodpaciente = new JTextField();
				txtcodpaciente.setBounds(185, 38, 130, 26);
				panel.add(txtcodpaciente);
				txtcodpaciente.setColumns(10);
			}
			{
				txtcodconsumo = new JTextField();
				txtcodconsumo.setBounds(185, 108, 130, 26);
				panel.add(txtcodconsumo);
				txtcodconsumo.setColumns(10);
			}
			{
				txtcantidad = new JTextField();
				txtcantidad.setBounds(185, 170, 130, 26);
				panel.add(txtcantidad);
				txtcantidad.setColumns(10);
			}
			{
				JButton btnAceptar = new JButton("Aceptar");
				btnAceptar.setBounds(384, 38, 117, 29);
				panel.add(btnAceptar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setBounds(384, 85, 117, 29);
				panel.add(btnSalir);
			}
		}
	}

}
