package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class BusquedaHospitalizacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtfecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BusquedaHospitalizacion dialog = new BusquedaHospitalizacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BusquedaHospitalizacion() {
		setTitle("hospitalizacion");
		setBounds(100, 100, 617, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos de Hospitaliazion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(29, 18, 558, 393);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblFecha = new JLabel("Fecha");
				lblFecha.setBounds(27, 50, 61, 16);
				panel.add(lblFecha);
			}
			{
				txtfecha = new JTextField();
				txtfecha.setBounds(108, 45, 130, 26);
				panel.add(txtfecha);
				txtfecha.setColumns(10);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(31, 116, 502, 258);
				panel.add(scrollPane);
				{
					JTextArea txtS = new JTextArea();
					scrollPane.setViewportView(txtS);
				}
			}
			{
				JButton btnMostrar = new JButton("Mostrar");
				btnMostrar.setBounds(357, 45, 117, 29);
				panel.add(btnMostrar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setBounds(357, 75, 117, 29);
				panel.add(btnSalir);
			}
		}
	}

}
