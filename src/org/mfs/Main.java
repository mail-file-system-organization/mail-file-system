package org.mfs;

import org.mfs.FileSystem;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FileSystem fs = new FileSystem();
				System.out.println("MFS Started...");
			}
		});
	}
}
