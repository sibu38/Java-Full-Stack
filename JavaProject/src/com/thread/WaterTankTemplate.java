package com.thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTankTemplate extends Frame {
	private int y=100;
	private int height=300;
	private int percent = 100;
	public WaterTankTemplate() {
		super("Water Tank");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		//g.fillRect(150, 100, 200, 300); //g.fillRect(x,y,w,h);//full
		g.fillRect(150, y, 200, height);
		g.drawString(percent + "%", 380, 200);
	}

	public static void main(String[] args) {
		WaterTankTemplate waterTank = new WaterTankTemplate();
		waterTank.setSize(500, 500);
		waterTank.setVisible(true);
		waterTank.new WaterManagement("OUTLET");
	}

	class WaterManagement implements Runnable {
		Thread t;
		public WaterManagement(String threadName) {
			t = new Thread(this, threadName);
			t.start();
		}
		public void run() {
			if(Thread.currentThread().getName().equals("OUTLET")) {
				for(int i=0;i<60;i++) {
					y = y + 5;
					height = height - 5;
					percent=percent-2;
					repaint();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				for(int i=60;i>0;i--) {
					y = y - 5;
					height = height + 5;
					percent=percent+2;
					repaint();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			/*else if(Thread.currentThread().getName().equals("INLET")) {
				for(int i=55;i>0;i--) {
					y = y - 5;
					height = height + 5;
					repaint();
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				for(int i=0;i<55;i++) {
					y = y + 5;
					height = height - 5;
					repaint();
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}*/
			else if(Thread.currentThread().getName().equals("CONTROLLER")) {
				
			}
		}
	}}