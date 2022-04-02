import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Campo extends JFrame{
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("Imagem.png"));	
	JLabel label = new JLabel(imagem);
	public Campo() {
		
		add(label);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Campo();
	}
}
