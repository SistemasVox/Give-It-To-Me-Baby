import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.awt.Font;


public class vwGive extends JFrame {

	private JPanel contentPane;

	JScrollPane scrollPane;
	JTextArea txtrGiveItTo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vwGive frame = new vwGive();
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
	public vwGive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrGiveItTo = new JTextArea();
		txtrGiveItTo.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		txtrGiveItTo.setBackground(SystemColor.controlHighlight);
		txtrGiveItTo.setEditable(false);
		txtrGiveItTo.setWrapStyleWord(true);
		txtrGiveItTo.setLineWrap(true);
		contentPane.add(scrollPane = new JScrollPane(txtrGiveItTo));
		scrollPane.setBounds(0, 0, 434, 262);
		
	}

	public void setTextArea(String text) {
		txtrGiveItTo.setText(text);;
	}
	
}
