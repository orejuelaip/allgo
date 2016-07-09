package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMantenimiento;
	private JMenu mnHospitalizacion;
	private JMenu mnRegistroconsumo;
	private JMenu mnControlpago;
	private JMenu mnReportes;
	private JMenuItem mntmEmpleado;
	private JMenuItem mntmPacientes;
	private JMenuItem mntmCamas;
	private JMenuItem mntmMedicamentos;
	private JMenuItem mntmServicios;
	private JMenuItem mntmRegistro;
	private JMenuItem mntmConsumo;
	private JMenuItem mntmControl;
	private JMenuItem mntmReportePacientes;
	private JMenuItem mntmReporteHospitalizacion;
	private JMenuItem mntmReporteEmpleados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmEmpleado = new JMenuItem("Empleado");
		mntmEmpleado.addActionListener(this);
		mnMantenimiento.add(mntmEmpleado);
		
		mntmPacientes = new JMenuItem("Pacientes");
		mntmPacientes.addActionListener(this);
		mnMantenimiento.add(mntmPacientes);
		
		mntmCamas = new JMenuItem("Camas");
		mnMantenimiento.add(mntmCamas);
		
		mntmMedicamentos = new JMenuItem("Medicamentos");
		mnMantenimiento.add(mntmMedicamentos);
		
		mntmServicios = new JMenuItem("Servicios");
		mnMantenimiento.add(mntmServicios);
		
		mnHospitalizacion = new JMenu("Hospitalizacion");
		menuBar.add(mnHospitalizacion);
		
		mntmRegistro = new JMenuItem("Registro");
		mnHospitalizacion.add(mntmRegistro);
		
		mnRegistroconsumo = new JMenu("RegistroConsumo");
		menuBar.add(mnRegistroconsumo);
		
		mntmConsumo = new JMenuItem("Consumo");
		mnRegistroconsumo.add(mntmConsumo);
		
		mnControlpago = new JMenu("ControlPago");
		menuBar.add(mnControlpago);
		
		mntmControl = new JMenuItem("Boleta\n");
		mnControlpago.add(mntmControl);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		mntmReportePacientes = new JMenuItem("Reporte Pacientes");
		mnReportes.add(mntmReportePacientes);
		
		mntmReporteHospitalizacion = new JMenuItem("Reporte Hospitalizacion");
		mnReportes.add(mntmReporteHospitalizacion);
		
		mntmReporteEmpleados = new JMenuItem("Reporte Empleados");
		mnReportes.add(mntmReporteEmpleados);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmPacientes) {
			actionPerformedMntmPacientes(e);
		}
		if (e.getSource() == mntmEmpleado) {
			actionPerformedMntmEmpleado(e);
		}
	}
	protected void actionPerformedMntmEmpleado(ActionEvent e) {
		try {
			VentanaEmpleado frame = new VentanaEmpleado();
			frame.setVisible(true);
		} catch (Exception error) {
			error.printStackTrace();
			}
		
	}
	protected void actionPerformedMntmPacientes(ActionEvent e) {
		try {
			GuiPaciente frame = new GuiPaciente();
			frame.setVisible(true);
		} catch (Exception error) {
			error.printStackTrace();
			}
	}
}
