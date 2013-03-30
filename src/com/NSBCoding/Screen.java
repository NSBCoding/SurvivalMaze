package com.NSBCoding;


import javax.swing.*;
import java.awt.*;


public class Screen extends JFrame{
	

	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public JPanel gp = (JPanel) getGlassPane();
public Images i;
public Nicolas k;



public Screen(){
	i = new Images();
	gp.setVisible(true);
	k = new Nicolas(this, i);
    





	gp.setLayout(new GridLayout(1, 1, 0, 0));
	this.setLayout(new GridLayout(1, 1, 0, 0));


	gp.add(k);
	this.add(i);

}




}
