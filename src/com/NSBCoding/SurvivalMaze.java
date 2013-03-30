package com.NSBCoding;

import javax.swing.JFrame;

public class SurvivalMaze extends JFrame {


	private static final long serialVersionUID = 1L;
		public static Screen f = new Screen();
		public static int w = 1280;
		public static int h = 720;
		public static void main(String args[]) {
			f.setSize(w, h);
			f.setResizable(false);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setTitle("SurvivalMaze");
			f.setLocationRelativeTo(null);
			f.setAlwaysOnTop(false);

	}

}
