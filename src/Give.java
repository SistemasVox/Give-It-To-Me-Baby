import javax.swing.JOptionPane;

public class Give {

	public static void main(String[] args) {
		String txt = JOptionPane.showInputDialog("Mensagem:");
		txt = txt.trim();
		txt = txt.substring(0, 1).toUpperCase()+txt.substring(1, txt.length());
		JOptionPane.showMessageDialog(null, txt.length() + " caracteres.");

		for (int i = 0; i < txt.length(); i++) {

			if (txt.substring(i, (i + 1)).equals(" ")) {
				txt = txt.substring(0, i) + " " + txt.substring((i + 1), (i + 2)).toUpperCase() + txt.substring((i + 2), txt.length());
			}

		}
		vwGive give = new vwGive();
		give.setTextArea(txt);
		give.setVisible(true);
	}

}
