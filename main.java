import javax.swing.*;

public class main {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Tipo de Conta");

        JPanel painel = new JPanel();

        JLabel texto = new JLabel("Escolha sua conta:");

        String[] contas = {
            "Conta corrente",
            "Conta poupança",
            "Conta salário"
        };

        JComboBox<String> lista = new JComboBox<>(contas);

        JButton botao = new JButton("Confirmar");

        botao.addActionListener(e -> {

            String contaSelecionada =
                    (String) lista.getSelectedItem();

            JOptionPane.showMessageDialog(janela,
                    "Você escolheu: " + contaSelecionada);
        });

        painel.add(texto);
        painel.add(lista);
        painel.add(botao);

        janela.add(painel);
        janela.setSize(350, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}