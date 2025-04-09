package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercernmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnSumarDosEnteros;
	private JButton btnSumarTresEnteros;
	private JButton btnSumarDosReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número: ");
			lblNewLabel.setBounds(26, 11, 112, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número: ");
			lblSegundoNmero.setBounds(26, 40, 112, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercernmero = new JLabel("Tercer número: ");
			lblTercernmero.setBounds(26, 70, 112, 14);
			contentPane.add(lblTercernmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(148, 8, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(148, 37, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(148, 67, 86, 20);
			contentPane.add(txtN3);
		}
		{
			btnSumarDosEnteros = new JButton("Sumar dos enteros");
			btnSumarDosEnteros.addActionListener(this);
			btnSumarDosEnteros.setBounds(273, 7, 170, 23);
			contentPane.add(btnSumarDosEnteros);
		}
		{
			btnSumarTresEnteros = new JButton("Sumar tres enteros");
			btnSumarTresEnteros.addActionListener(this);
			btnSumarTresEnteros.setBounds(273, 40, 170, 23);
			contentPane.add(btnSumarTresEnteros);
		}
		{
			btnSumarDosReales = new JButton("Sumar dos reales");
			btnSumarDosReales.addActionListener(this);
			btnSumarDosReales.setBounds(273, 70, 170, 23);
			contentPane.add(btnSumarDosReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 115, 415, 154);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumarDosReales) {
			do_btnSumarDosReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumarTresEnteros) {
			do_btnSumarTresEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnSumarDosEnteros) {
			do_btnSumarDosEnteros_actionPerformed(e);
		}
	}
	protected void do_btnSumarDosEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			Calculadora c =new Calculadora(n1, n2);
			txtS.append("La suma es: "+ c.Sumar(n1, n2));
		} catch (Exception e2) {
			MostrarError();
		}
	}
	private void MostrarError() {
		JOptionPane.showMessageDialog(this, "Ingrese número(s) válido(s)");
	}
	protected void do_btnSumarTresEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			int n3=Integer.parseInt(txtN3.getText());
			Calculadora c =new Calculadora(n1, n2,n3);
			txtS.append("La suma es: "+ c.Sumar(n1, n2, n3));
		} catch (Exception e2) {
			MostrarError();
		}
	}
	protected void do_btnSumarDosReales_actionPerformed(ActionEvent e) {
			double num1=Double.parseDouble(txtN1.getText());
			double num2=Double.parseDouble(txtN2.getText());
			Calculadora c =new Calculadora(num1, num2);
			txtS.append("La suma es: "+ c.Sumar(num1, num2));
	}
}
