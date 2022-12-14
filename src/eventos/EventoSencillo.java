package eventos;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventoSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotonesColores mimarco = new MarcoBotonesColores();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoBotonesColores extends JFrame{
	public MarcoBotonesColores() {
		setTitle("Botones y Colores");
		setBounds (700,300,500,300);
		LaminaBotonesColores milamina = new LaminaBotonesColores();
		add(milamina);
	}
}

class LaminaBotonesColores extends JPanel implements ActionListener{
	JButton botonAzul = new JButton ("Azul");
	
	JButton botonRojo = new JButton ("Rojo");
	
	JButton botonVerde = new JButton ("Verde");
	
	public LaminaBotonesColores () {
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonVerde.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object botonPulsado = e.getSource();
		
		if(botonPulsado==botonAzul) {
			setBackground(Color.BLUE);
		}else if(botonPulsado==botonRojo) {
			setBackground(Color.RED);
		}else {
			setBackground(Color.GREEN);
		}
		
	}
}
