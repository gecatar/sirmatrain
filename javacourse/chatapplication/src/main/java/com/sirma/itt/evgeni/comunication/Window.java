package com.sirma.itt.evgeni.comunication;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window(Component componnent) {
		add(componnent);
		setSize(new Dimension(400, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
