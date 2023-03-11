package GraphicsEditor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private GMenuBar menuBar; 
	private GToolBar toolBar;
	private GDrawingPanel drawingPanel;

	public GMainFrame() {
		// attributes
		this.setVisible(true);
		this.setLocation(200, 100);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// components

		this.menuBar = new GMenuBar();
		this.setJMenuBar(menuBar);//메뉴바는 고정.
		
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		
		this.toolBar = new GToolBar();
		this.add(this.toolBar, BorderLayout.NORTH);

		this.drawingPanel = new GDrawingPanel();
		this.add(drawingPanel, BorderLayout.CENTER);
		
		//this.setLocationRelativeTo(null);//화면 가운데 정렬.
	}
}