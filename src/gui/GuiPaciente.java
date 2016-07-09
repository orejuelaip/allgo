package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import Arreglos.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import clases.Paciente;
import java.awt.Toolkit;

public class GuiPaciente extends JDialog implements  ActionListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private TextArea txtListar;
	private JTextField txtapellido;
	private JTextField txttelefono;
	private JTextField txtdni;
	private JTextField txtcodigo;
	private JButton btnAceptar;
	private JComboBox cmbmantenimiento ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiPaciente dialog = new GuiPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	public GuiPaciente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\PROYECTOALGORITMIA\\src\\img\\doctor (1).png"));
		setFont(new Font("SansSerif", Font.PLAIN, 12));
		setTitle("Paciente\n");
		setBounds(100, 100, 738, 523);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setForeground(new Color(0, 128, 0));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dato Paciente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
			panel.setBounds(27, 24, 685, 305);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigo = new JLabel("Codigo");
				lblCodigo.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblCodigo.setBounds(16, 54, 61, 16);
				panel.add(lblCodigo);
			}
			{
				JLabel lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblNombre.setBounds(16, 95, 61, 16);
				panel.add(lblNombre);
			}
			{
				JLabel lblApellido = new JLabel("Apellido");
				lblApellido.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblApellido.setBounds(16, 145, 61, 16);
				panel.add(lblApellido);
			}
			{
				JLabel lblTelefono = new JLabel("Telefono");
				lblTelefono.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblTelefono.setBounds(16, 195, 61, 16);
				panel.add(lblTelefono);
			}
			{
				JLabel lblDni = new JLabel("DNI");
				lblDni.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblDni.setBounds(16, 242, 61, 16);
				panel.add(lblDni);
			}
			{
				txtnombre = new JTextField();
				txtnombre.setBounds(87, 91, 130, 26);
				panel.add(txtnombre);
				txtnombre.setColumns(10);
				
			}
			{
				txtapellido = new JTextField();
				txtapellido.setBounds(87, 141, 130, 26);
				panel.add(txtapellido);
				txtapellido.setColumns(10);
			}
			{
				txttelefono = new JTextField();
				
				txttelefono.setBounds(87, 191, 130, 26);
				panel.add(txttelefono);
				txttelefono.setColumns(10);
			}
			{
				txtdni = new JTextField();
				txtdni.setBounds(87, 238, 130, 26);
				panel.add(txtdni);
				txtdni.setColumns(10);
			}
			{
				txtcodigo = new JTextField();
				txtcodigo.setEditable(false);
				txtcodigo.setBounds(87, 49, 130, 26);
				panel.add(txtcodigo);
				
				txtcodigo.setColumns(10);
			}
			
			txtListar = new TextArea();
			txtListar.setEditable(false);
			txtListar.setBounds(223, 25, 441, 255);
			panel.add(txtListar);
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(24, 358, 688, 67);
			contentPanel.add(panel);
			{
				 cmbmantenimiento = new JComboBox();
				 cmbmantenimiento.addItemListener(this);
				cmbmantenimiento.setModel(new DefaultComboBoxModel(new String[] {"-- Seleccionar", "Ingreso", "Modificar", "Consulta", "Eliminar", "Listar"}));
				cmbmantenimiento.setBounds(31, 20, 244, 27);
				panel.add(cmbmantenimiento);
			}
			{
				btnAceptar = new JButton("Aceptar");
				btnAceptar.setEnabled(false);
				btnAceptar.addActionListener(this);
				btnAceptar.setBounds(360, 19, 117, 29);
				panel.add(btnAceptar);
			}
			{
				btnSalir = new JButton("Salir");
				btnSalir.addActionListener(this);
				btnSalir.setBounds(489, 19, 117, 29);
				panel.add(btnSalir);
			}
		}
		habilitar(false);
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedSalir(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedAceptar(e);
		}
	}
	ArregloPaciente pac = new ArregloPaciente();
	private JButton btnSalir;
boolean guardar(int cod,String ape,String nom,String num,String dni){
		try {
			Paciente p = new Paciente(cod, ape, nom, num, dni);
			int n1=pac.tamano(); 
			pac.agregarPaciente(p);
			int n2=pac.tamano();//tamaño despues de agregar
			pac.grabar();
			if(n2>n1){
				txtListar.setText("Se ingreso: " + p.getCodigo());
				limpiar();
				listar();
				return true;
			}else{
				txtListar.setText("No se ingreso por codigo repetido " 
			                 + p.getCodigo());
				return false;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
}
	
	
	public void msj(String m){
		JOptionPane.showMessageDialog(null, m);
	}
	
	void limpiar(){
		txtapellido.setText("");
		txtcodigo.setText(pac.retornarCod()+1+"");
		txtdni.setText("");
		txtnombre.setText("");
		txttelefono.setText("");
		txtcodigo.setText("");
	}
	void buscar(int cod){
		
		Paciente P;
		P= pac.buscarPaciente(cod);
		if (P!=null &&  P.getNombres().length()!=0){
			txtnombre.setText(P.getNombres());
			txtapellido.setText(P.getApellido());
			txtdni.setText(P.getDni());
			txttelefono.setText(P.getTelefono());
			txtcodigo.setText(P.getCodigo()+"");
		}
		else{
			msj("El codigo indicado no  existe");
			txtcodigo.setText("");
		}
	}
	boolean eliminar(int cod){
		try {
			Paciente P;
			P=pac.buscarPaciente(cod);
			pac.eliminar(P);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	void listar(){
		imprimir();
		imprimir("Codigo"+"\tNombre\tApellidos\tTelefono\tDNI\n");
		imprimir("--------\t--------\t----------\t----------\t----------------------\n");
		for(int i=0; i<pac.tamano(); i++){
			Paciente v=pac.obtener(i);
			imprimir(v.getCodigo()+"\t" + 
			         v.getNombres()+"\t"+
				     v.getApellido()+"\t"+
				     v.getTelefono()+"\t"+
				     v.getDni()+"\n"
				     );
		}
	}
	void imprimir(String t){
		txtListar.append(t);
	}
	void imprimir(){
		txtListar.setText("");;
	}
	protected void actionPerformedAceptar(ActionEvent e) {
		int cmb = cmbmantenimiento.getSelectedIndex();
		if(cmb ==1){
			 pac.generarCodigo();
			int cod =pac.retornarCod();
			String nombre = txtnombre.getText();
			String numero = txttelefono.getText();
			String dni = txtdni.getText();
			String ape = txtapellido.getText();
			if (guardar(cod, ape, nombre, numero, dni)){
				msj( "Agregado Correctamente el Paciente "+nombre);
				habilitar(false);
				cmbmantenimiento.setSelectedIndex(0);
			}
			else{
				msj("Error al registrar al paciente "+nombre);
			}
		}else if(cmb==2){
			if (modificar()){
				msj( "Modificado Correctamente el Paciente ");
				habilitar(false);
				cmbmantenimiento.setSelectedIndex(0);
			}
			else{
				msj("Error al modificar al paciente ");
			}
		}
		else if(cmb==3){
			buscar(Integer.parseInt(txtcodigo.getText()));
			habilitar(false);
			cmbmantenimiento.setSelectedIndex(0);
		}
		else if(cmb==4){
			if (modificar()){
				msj( "Eliminado Correctamente el Paciente ");
				habilitar(false);
				cmbmantenimiento.setSelectedIndex(0);
			}
			else{
				msj("Error al eliminar al paciente ");
			}
		}else{
			listar();
		}
	}
	
	void habilitar(boolean t){
		txtcodigo.setEditable(false);
		txtapellido.setEditable(t);
		txtdni.setEditable(t);
		txtnombre.setEditable(t);
		txttelefono.setEditable(t);
		btnAceptar.setEnabled(t);
		btnSalir.setEnabled(!t);
	}
	boolean modificar(){
		
		try {
			Paciente P =new Paciente(Integer.parseInt(txtcodigo.getText()), txtapellido.getText(), txtnombre.getText(), txttelefono.getText(), txtdni.getText());
			pac.Modificar(P);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}
	protected void actionPerformedSalir(ActionEvent e) {
		dispose();
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbmantenimiento) {
			itemStateChangedComboBox(e);
		}
	}
	protected void itemStateChangedComboBox(ItemEvent e) {
		int cmb=cmbmantenimiento.getSelectedIndex();
		if(cmb==0){
		
			habilitar(false);
			
		}else if(cmb==1){
			habilitar(true);
			txtnombre.requestFocus();
			limpiar();
			txtcodigo.setText(pac.retornarCod()+1+"");
			
		}else if(cmb==2){
			habilitar(true);
			txtnombre.requestFocus();
		}else if(cmb==3){
			limpiar();
			habilitar(false);
			txtcodigo.setEditable(true);
			txtcodigo.setText("");
			btnAceptar.setEnabled(true);
			txtcodigo.requestFocus();
		}else if(cmb==4){
			limpiar();
			habilitar(false);
			txtcodigo.setEditable(true);
			txtcodigo.setText("");
			btnAceptar.setEnabled(true);
			txtcodigo.requestFocus();
			
		}
		else{
			limpiar();
			habilitar(false);
			btnAceptar.setEnabled(true);
		}
			
		
	}
}
