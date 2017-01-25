package main;

import window.Window;

public class Run {
	//General method
	public static void main(String[] arg){
		//Run window
		RunWindow();
		
	}
	
	private static void RunWindow() {
		//methods for run window
		//use package window
		Window app = new Window(); //create new variable of window class
	    app.setVisible(true); //run window
	}
}
