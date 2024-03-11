package exercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame {
    private JLabel label1, label2;
    private JButton startButton1, stopButton1, resetButton1;
    private JButton startButton2, stopButton2, resetButton2;
    private Thread contadorThread1, contadorThread2;
    private volatile boolean running1, running2;
    private int count1, count2;

    public SimpleGUI() {
        setTitle("Contadores");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 1));

        // Primeiro contador
        JPanel contadorPanel1 = new JPanel();
        label1 = new JLabel("0");
        contadorPanel1.add(label1);

        startButton1 = new JButton("Start");
        stopButton1 = new JButton("Stop");
        resetButton1 = new JButton("Reset");

        startButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startContador1();
            }
        });

        stopButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopContador1();
            }
        });

        resetButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetContador1();
            }
        });

        contadorPanel1.add(startButton1);
        contadorPanel1.add(stopButton1);
        contadorPanel1.add(resetButton1);

        add(contadorPanel1);

        // Segundo contador
        JPanel contadorPanel2 = new JPanel();
        label2 = new JLabel("0");
        contadorPanel2.add(label2);

        startButton2 = new JButton("Start");
        stopButton2 = new JButton("Stop");
        resetButton2 = new JButton("Reset");

        startButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startContador2();
            }
        });

        stopButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopContador2();
            }
        });

        resetButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetContador2();
            }
        });

        contadorPanel2.add(startButton2);
        contadorPanel2.add(stopButton2);
        contadorPanel2.add(resetButton2);

        add(contadorPanel2);

        setVisible(true);
    }

    // Métodos para o Contador 1
    private void startContador1() {
        running1 = true;
        contadorThread1 = new Thread(() -> {
            while (running1) {
                try {
                    Thread.sleep(1000); // Espera 1 segundo
                    count1++;
                    SwingUtilities.invokeLater(() -> label1.setText(Integer.toString(count1)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        contadorThread1.start();
    }

    private void stopContador1() {
        running1 = false;
    }

    private void resetContador1() {
        count1 = 0;
        label1.setText("0");
    }

    // Métodos para o Contador 2
    private void startContador2() {
        running2 = true;
        contadorThread2 = new Thread(() -> {
            while (running2) {
                try {
                    Thread.sleep(1000); // Espera 1 segundo
                    count2++;
                    SwingUtilities.invokeLater(() -> label2.setText(Integer.toString(count2)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        contadorThread2.start();
    }

    private void stopContador2() {
        running2 = false;
    }

    private void resetContador2() {
        count2 = 0;
        label2.setText("0");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleGUI());
    }
}
