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

public class Medicamento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigo;
	private JTextField txtnombre;
	private JTextField txtlaboratorio;
	private JTextField txtprecio;
	private JTextField txtstock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Medicamento dialog = new Medicamento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Medicamento() {
		setTitle("Medicamento");
		setBounds(100, 100, 642, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Medicamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(25, 19, 579, 277);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigo = new JLabel("Codigo");
				lblCodigo.setBounds(6, 42, 61, 16);
				panel.add(lblCodigo);
			}
			{
				txtcodigo = new JTextField();
				txtcodigo.setBounds(107, 37, 130, 26);
				panel.add(txtcodigo);
				txtcodigo.setColumns(10);
			}
			{
				JLabel lblNombre = new JLabel("Nombre");
				lblNombre.setBounds(6, 88, 61, 16);
				panel.add(lblNombre);
			}
			{
				JLabel lblLaboratorio = new JLabel("Laboratorio");
				lblLaboratorio.setBounds(6, 128, 79, 16);
				panel.add(lblLaboratorio);
			}
			{
				JLabel lblPrecio = new JLabel("Precio");
				lblPrecio.setBounds(6, 181, 61, 16);
				panel.add(lblPrecio);
			}
			{
				JLabel lblStock = new JLabel("Stock");
				lblStock.setBounds(6, 222, 61, 16);
				panel.add(lblStock);
			}
			{
				txtnombre = new JTextField();
				txtnombre.setBounds(107, 83, 130, 26);
				panel.add(txtnombre);
				txtnombre.setColumns(10);
			}
			{
				txtlaboratorio = new JTextField();
				txtlaboratorio.setBounds(107, 123, 130, 26);
				panel.add(txtlaboratorio);
				txtlaboratorio.setColumns(10);
			}
			{
				txtprecio = new JTextField();
				txtprecio.setBounds(107, 176, 130, 26);
				panel.add(txtprecio);
				txtprecio.setColumns(10);
			}
			{
				txtstock = new JTextField();
				txtstock.setBounds(107, 217, 130, 26);
				panel.add(txtstock);
				txtstock.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(16, 340, 588, 67);
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
