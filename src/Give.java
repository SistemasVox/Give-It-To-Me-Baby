import javax.swing.JOptionPane;

public class Give {

    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("Mensagem:").trim();
        StringBuilder formattedText = new StringBuilder(txt.length());

        boolean capitalizeNext = true;
        for (char c : txt.toCharArray()) {
            if (capitalizeNext && Character.isLetter(c)) {
                formattedText.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                formattedText.append(c);
                capitalizeNext = c == ' ';
            }
        }

        JOptionPane.showMessageDialog(null, formattedText.length() + " caracteres.");

        vwGive give = new vwGive();
        give.setTextArea(formattedText.toString());
        give.setVisible(true);
    }
}
