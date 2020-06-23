package Ventanas;
import javax.swing.*;
import java.awt.*;
public class MiVentana3 extends JFrame {
    public MiVentana3(){
        super("Mi ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
