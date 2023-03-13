import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		// adding components to jframe
		this.add(new GamePanel()); //same as GamePanel panel = new GamePanel()
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //add iframe and fit the components
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
