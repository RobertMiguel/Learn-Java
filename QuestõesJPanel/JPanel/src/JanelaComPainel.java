

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaComPainel extends JFrame	{
	
	private JPanel jpnCliente;
	private JLabel jlbNomeCliente;
	private JTextField jtfNomeCliente;
	private JPanel jpnInfo;
	private JLabel jlbInfo;

	public JanelaComPainel() {
		super();
		this.configurarFrame();
		this.add(this.jpnCliente);
		this.configurarPainelCliente();
		this.add(this.jpnInfo);
	}
	
	private void configurarPainelCliente(){
		this.jpnCliente = new JPanel(new FlowLayout());
		this.setPreferredSize(new Dimension(400,100));
		this.setBackground(Color.black);
	}
	
	private void configurarFrame() {
		this.setTitle("JANELA");
		this.setSize(new Dimension(500,150));
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
