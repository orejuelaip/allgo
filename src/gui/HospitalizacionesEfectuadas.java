package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class HospitalizacionesEfectuadas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HospitalizacionesEfectuadas dialog = new HospitalizacionesEfectuadas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HospitalizacionesEfectuadas() {
		setTitle("Reporte\n");
		setBounds(100, 100, 640, 511);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Hospitalizaciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(6, 6, 628, 458);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton btnMostrarEmpleado = new JButton("Mostrar Lista");
				btnMostrarEmpleado.setBounds(234, 24, 172, 29);
				panel.add(btnMostrarEmpleado);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(24, 88, 577, 348);
				panel.add(scrollPane);
				{
					JTextArea txtS = new JTextArea();
					scrollPane.setViewportView(txtS);
				}
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setBounds(467, 24, 117, 29);
				panel.add(btnSalir);
			}
		}
	}

}
