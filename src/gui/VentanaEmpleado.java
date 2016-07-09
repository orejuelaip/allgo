package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEmpleado extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblCodigo;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtcodigo;
	private JLabel lblLogin;
	private JTextField txtlogin;
	private JLabel lblPassword;
	private JPasswordField txtpassword;
	private JLabel lblTipoEmpleado;
	private JComboBox comboBox;
	private JLabel lblTurno;
	private JComboBox comboBox_1;
	private JButton btnGuardar;
	private JButton btnsalir;
	private JPanel panel;
	private JPanel panel_1;
	private JComboBox comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaEmpleado dialog = new VentanaEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaEmpleado() {
		setTitle("Empleado\n");
		setBounds(100, 100, 692, 444);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(24, 20, 644, 276);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(29, 43, 45, 16);
		panel.add(lblCodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(145, 38, 130, 26);
		panel.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(29, 86, 61, 16);
		panel.add(lblNombre);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(145, 76, 130, 26);
		panel.add(txtnombre);
		txtnombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(29, 124, 61, 26);
		panel.add(lblApellido);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(145, 124, 130, 26);
		panel.add(txtapellido);
		txtapellido.setColumns(10);
		
		lblLogin = new JLabel("Login");
		lblLogin.setBounds(29, 182, 61, 16);
		panel.add(lblLogin);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(145, 177, 130, 26);
		panel.add(txtlogin);
		txtlogin.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(29, 229, 61, 16);
		panel.add(lblPassword);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(145, 219, 130, 26);
		panel.add(txtpassword);
		
		lblTipoEmpleado = new JLabel("Tipo Empleado");
		lblTipoEmpleado.setBounds(341, 43, 108, 16);
		panel.add(lblTipoEmpleado);
		
		comboBox = new JComboBox();
		comboBox.setBounds(461, 39, 157, 27);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-- Seleccionar", "Administrador", "Empleado"}));
		
		lblTurno = new JLabel("Turno");
		lblTurno.setBounds(341, 86, 61, 16);
		panel.add(lblTurno);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(461, 82, 147, 27);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-- Seleccionar", "Noche", "Dia"}));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(34, 320, 630, 67);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Modificar", "Eliminar", "Consulta", "Listado"}));
		comboBox_2.setBounds(31, 20, 244, 27);
		panel_1.add(comboBox_2);
		
		btnGuardar = new JButton("Aceptar");
		btnGuardar.setBounds(360, 19, 117, 29);
		panel_1.add(btnGuardar);
		
		btnsalir = new JButton("Salir");
		btnsalir.addActionListener(this);
		btnsalir.setBounds(489, 19, 117, 29);
		panel_1.add(btnsalir);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnsalir) {
			actionPerformedBtnsalir(e);
		}
	}
	protected void actionPerformedBtnsalir(ActionEvent e) {
		dispose();
	}
}
