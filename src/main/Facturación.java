package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class Facturación extends JFrame implements Serializable {
    private static final long serialVersionUID = 1L;  // Añadir serialVersionUID

    public Facturación() {
        setTitle("Bienvenido al Cine");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        // Crear etiqueta de bienvenida
        JLabel etiquetaBienvenida = new JLabel("¡Bienvenido al Cine!", SwingConstants.CENTER);
        etiquetaBienvenida.setFont(new Font("Serif", Font.BOLD, 24));
        panel.add(etiquetaBienvenida, BorderLayout.CENTER);

        // Crear botón para continuar
        JButton botonContinuar = new JButton("Entrar");
        botonContinuar.setFont(new Font("Serif", Font.BOLD, 18));
        panel.add(botonContinuar, BorderLayout.SOUTH);

        // Añadir acción al botón
        botonContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Disfruta de tu experiencia en el cine!");
                dispose(); // Cierra la ventana actual
                // Aquí puedes añadir el código para abrir la siguiente ventana o funcionalidad del sistema
            }
        });

        // Añadir panel al frame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear y mostrar la pantalla de bienvenida
        new Facturación();
    }
}