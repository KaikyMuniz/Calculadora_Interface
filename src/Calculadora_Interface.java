import javax.swing.*; // Importações dos Componentes Jframe
import java.awt.event.ActionEvent; // Importação dos Eventos
import java.awt.event.ActionListener; // Importação dos Eventos

public class Calculadora_Interface {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora com Interface");
        janela.setSize(500, 500);
        janela.setLocationRelativeTo(null); // alinha o JFrame no centro da tela
        janela.setVisible(true);
        janela.setLayout(null);

        JLabel texto1 = new JLabel("Boas Vindas!");
        texto1.setBounds(10, 10, 80, 25); // Define a posição e o tamanho da label

        JTextField input1 = new JTextField("Valor 1:");
        input1.setBounds(10, 40, 165, 25); // Define a posição e o tamanho do campo de texto

        JComboBox<String> check = new JComboBox<>(); // Declarar a Selação do tipo de conta que será realizado
        check.addItem("+");
        check.addItem("-");
        check.addItem("x");
        check.addItem("/");
        check.setBounds(10, 80, 50, 20);

        JTextField input2 = new JTextField("Valor 2:");
        input2.setBounds(10, 120, 165, 25); // Define a posição e o tamanho do campo de texto

        JButton button = new JButton("Calcular");
        button.setBounds(10, 160, 100, 25);
        button.addActionListener(new ActionListener() { // Eventos em Java
            public void actionPerformed(ActionEvent e) {
                String valor1String = input1.getText();
                String valor2String = input2.getText();
                try {
                    Integer valor1 = Integer.parseInt(valor1String);
                    Integer valor2 = Integer.parseInt(valor2String);
                    String operador = check.getSelectedItem().toString();
                    switch (operador) {
                        case "+" -> JOptionPane.showMessageDialog(null, valor1 + valor2);
                        case "-" -> JOptionPane.showMessageDialog(null, valor1 - valor2);
                        case "x" -> JOptionPane.showMessageDialog(null, valor1 * valor2);
                        case "/" -> JOptionPane.showMessageDialog(null, valor1 / valor2);
                        default -> JOptionPane.showMessageDialog(null, "Nenhuma operação encontrada");
                    }
                } catch (NumberFormatException e2) {
                    JOptionPane.showMessageDialog(null, "Apenas números inteiros são aceitos");
                }
            }
        });

        janela.add(texto1);
        janela.add(input1);
        janela.add(check);
        janela.add(input2);
        janela.add(button);
    }
}