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

public class Servicio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigo;
	private JTextField txtdescripcion;
	private JTextField txtservicio;
	private JTextField txtprecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Servicio dialog = new Servicio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Servicio() {
		setBounds(100, 100, 606, 418);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Servicio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(25, 19, 534, 244);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigo = new JLabel("Codigo");
				lblCodigo.setBounds(19, 42, 61, 16);
				panel.add(lblCodigo);
			}
			{
				JLabel lblNombre = new JLabel("Descripcion");
				lblNombre.setBounds(19, 82, 81, 16);
				panel.add(lblNombre);
			}
			{
				JLabel lblTipoServicio = new JLabel("Tipo Servicio");
				lblTipoServicio.setBounds(19, 123, 81, 16);
				panel.add(lblTipoServicio);
			}
			{
				JLabel lblPrecio = new JLabel("Precio");
				lblPrecio.setBounds(19, 161, 61, 16);
				panel.add(lblPrecio);
			}
			{
				txtcodigo = new JTextField();
				txtcodigo.setBounds(132, 37, 130, 26);
				panel.add(txtcodigo);
				txtcodigo.setColumns(10);
			}
			{
				txtdescripcion = new JTextField();
				txtdescripcion.setBounds(132, 77, 130, 26);
				panel.add(txtdescripcion);
				txtdescripcion.setColumns(10);
			}
			{
				txtservicio = new JTextField();
				txtservicio.setBounds(132, 118, 130, 26);
				panel.add(txtservicio);
				txtservicio.setColumns(10);
			}
			{
				txtprecio = new JTextField();
				txtprecio.setBounds(132, 168, 130, 26);
				panel.add(txtprecio);
				txtprecio.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(6, 307, 588, 67);
			contentPanel.add(panel);
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Modificar", "Consulta", "Eliminar"}));
				comboBox.setBounds(31, 20, 244, 27);
				panel.add(comboBox);
			}
			{
				JButton button = new JButton("Aceptar");
				button.setBounds(324, 19, 117, 29);
				panel.add(button);
			}
			{
				JButton button = new JButton("Salir");
				button.setBounds(453, 19, 117, 29);
				panel.add(button);
			}
		}
	}

}
