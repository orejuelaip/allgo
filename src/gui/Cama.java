package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Arreglos.ArreglosCamas;
import clases.Camas;
import clases.Paciente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Cama extends JDialog implements ActionListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcama;
	private JTextField txtprecio;
	private TextArea textS;
	private JButton button_1;
	private JComboBox cmbeconomico;
	private JComboBox cmbmantenimiento ;
	private JComboBox cmbestado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cama dialog = new Cama();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cama() {
		setTitle("Cama\n");
		setBounds(100, 100, 792, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Cama", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(25, 19, 741, 264);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCama = new JLabel("Cama");
				lblCama.setBounds(25, 35, 61, 16);
				panel.add(lblCama);
			}
			{
				JLabel lblCategoria = new JLabel("Categoria");
				lblCategoria.setBounds(25, 172, 61, 16);
				panel.add(lblCategoria);
			}
			{
				JLabel lblPrecio = new JLabel("Precio");
				lblPrecio.setBounds(25, 78, 61, 16);
				panel.add(lblPrecio);
			}
			{
				txtcama = new JTextField();
				txtcama.setEditable(false);
				txtcama.setBounds(96, 30, 130, 26);
				panel.add(txtcama);
				txtcama.setColumns(10);
			}
			{
				txtprecio = new JTextField();
				txtprecio.setEditable(false);
				txtprecio.setBounds(96, 73, 130, 26);
				panel.add(txtprecio);
				txtprecio.setColumns(10);
			}
			{
				JLabel lblEstado = new JLabel("Estado");
				lblEstado.setBounds(25, 125, 61, 16);
				panel.add(lblEstado);
			}
			{
				cmbestado = new JComboBox();
				cmbestado.setEnabled(false);
				cmbestado.setModel(new DefaultComboBoxModel(new String[] {"Cama Libre", "Cama Ocupada"}));
				cmbestado.setBounds(96, 120, 130, 27);
				panel.add(cmbestado);
			}
			{
				cmbeconomico = new JComboBox();
				cmbeconomico.setEnabled(false);
				cmbeconomico.setModel(new DefaultComboBoxModel(new String[] {"Economico", "Ejecutivo"}));
				cmbeconomico.setBounds(96, 167, 130, 27);
				panel.add(cmbeconomico);
			}
			
			textS = new TextArea();
			textS.setEditable(false);
			textS.setBounds(251, 28, 469, 215);
			panel.add(textS);
		}
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(25, 323, 612, 67);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(null, "Mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			{
				cmbmantenimiento = new JComboBox();
				cmbmantenimiento.addItemListener(this);
				cmbmantenimiento.setModel(new DefaultComboBoxModel(new String[] {"-- Seleccionar", "Ingreso", "Modificar", "Consulta", "Eliminar", "Listar"}));
				cmbmantenimiento.setBounds(31, 20, 244, 27);
				panel_1.add(cmbmantenimiento);
			}
			{
				button_1 = new JButton("Aceptar");
				button_1.addActionListener(this);
				button_1.setBounds(360, 19, 117, 29);
				panel_1.add(button_1);
			}
			{
				JButton button = new JButton("Salir");
				button.setBounds(489, 19, 117, 29);
				panel_1.add(button);
			}
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button_1) {
			actionPerformedButton(arg0);
		}
	}
	
	ArreglosCamas cam = new ArreglosCamas();
	
	void habilitar(Boolean t){
		txtcama.setEditable(t);
		txtprecio.setEditable(t);
		cmbeconomico.setEnabled(t);
		cmbestado.setEnabled(t);
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbmantenimiento) {
			itemStateChangedCmbmantenimiento(e);
		}
	}
	void limpiar(){
		txtcama.setText("");;
		txtprecio.setText("");
		cmbeconomico.setSelectedIndex(0);
		cmbestado.setSelectedIndex(0);
	}
	public void msj(String m){
		JOptionPane.showMessageDialog(null, m);
	}
	boolean eliminar(int cod){
		try {
			Camas c;
			c=cam.buscarCamas(cod);
			cam.eliminar(c);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	void listar(){
		imprimir();
		imprimir("Nº cama"+"\tCategoria\tEstado\tPrecio\n");
		imprimir("--------\t--------\t----------\t----------\t----------------------\n");
		for(int i=0; i<cam.tamano(); i++){
			Camas v=cam.obtener(i);
			imprimir(v.getNumCama()+"\t" + 
			         v.getCategoria()+"\t"+
				     v.getEstado()+"\t"+
				     v.getPrecioDia()+"\n"
				     );
		}
	}
	void imprimir(String t){
		textS.append(t);
	}
	void imprimir(){
		textS.setText("");;
	}
	void buscar(int cod){
		
		Camas  C;
		C= cam.buscarCamas(cod);
		if (C!=null ){
			txtcama.setText(C.getNumCama()+"");;
			txtprecio.setText(C.getPrecioDia()+"");
			cmbeconomico.setSelectedIndex(C.getCategoria());
			cmbestado.setSelectedIndex(C.getEstado());
			
		}
		else{
			msj("El codigo indicado no  existe");
			txtcama.setText("");
		}
	}
	Boolean guardar(int numCama, int categoria, double precioDia, int estado){
		try {
			Camas p = new Camas(numCama, categoria, precioDia, estado);
			cam.agregarCama(p);
			limpiar();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;		}
	}
	protected void itemStateChangedCmbmantenimiento(ItemEvent e) {
		int cmb =cmbmantenimiento.getSelectedIndex();
		if(cmb==1){
			if(guardar(Integer.parseInt(txtcama.getText()),cmbeconomico.getSelectedIndex(), Double.parseDouble(txtprecio.getText()), 0)){
				msj("Registrado Correctamente");
			}else{
				msj("Error al Registrar");
			}
		}
	}
}
