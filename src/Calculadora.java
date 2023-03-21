import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField pantalla;
    private double numero1, numero2, resultado;
    private String operador;

    public Calculadora() {
        super("Calculadora");
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 4));

        String[] botones = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", ".", "=", "+",
                            "C", "←"};

        for (int i = 0; i < botones.length; i++) {
            JButton boton = new JButton(botones[i]);
            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
        
        pack();
        setVisible(true);
        requestFocusInWindow();
    }

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("C")) {
            pantalla.setText("");
        } else if (comando.equals("/")) {
            numero1 = Double.parseDouble(pantalla.getText());
            operador = "/";
            pantalla.setText("");
        } else if (comando.equals("*")) {
            numero1 = Double.parseDouble(pantalla.getText());
            operador = "*";
            pantalla.setText("");
        } else if (comando.equals("-")) {
            numero1 = Double.parseDouble(pantalla.getText());
            operador = "-";
            pantalla.setText("");
        } else if (comando.equals("+")) {
            numero1 = Double.parseDouble(pantalla.getText());
            operador = "+";
            pantalla.setText("");
        } else if (comando.equals("=")) {
            numero2 = Double.parseDouble(pantalla.getText());

            if (operador.equals("/")) {
                resultado = numero1 / numero2;
            } else if (operador.equals("*")) {
                resultado = numero1 * numero2;
            } else if (operador.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operador.equals("+")) {
                resultado = numero1 + numero2;
            }

            pantalla.setText("" + resultado);
        } else if (comando.equals("←")) {
            String textoActual = pantalla.getText();
            if (!textoActual.isEmpty()) {
                String nuevoTexto = textoActual.substring(0, textoActual.length() - 1);
                pantalla.setText(nuevoTexto);
            }
        } else {
            // Si el comando es un número, se agrega a la pantalla
            pantalla.setText(pantalla.getText() + comando);
        }
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}