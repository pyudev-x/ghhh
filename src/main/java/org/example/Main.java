package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public synchronized static void main(String[] args) throws InterruptedException {
        warn();

        while (true) {
            JFrame frame = makeWindow();

            frame.setLocation(random.nextInt(0, 2000)+1, random.nextInt(0, 1000)+1);
        }
    }

    public static JFrame makeWindow() {
        JFrame frame = new JFrame("You ran a cool program");
        frame.setLocation(random.nextInt(0, 3000)+1, random.nextInt(0, 3000)+1);
        frame.setSize(700, 420);
        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("org/example/download.png");

        JLabel label = new JLabel();
        label.setText("Welcome, now... You can use ALT-F4 or CMD-Q to exit :)");
        label.setIcon(icon);
        frame.add(label);
        Color color = new Color(random.nextInt(0, 255), random.nextInt(0, 255), random.nextInt(0, 255));
        frame.getContentPane().setBackground(color);


        return frame;
    }

    public static void warn() throws InterruptedException {
        ImageIcon icon = new ImageIcon("org/example/download.png");
        JLabel text = new JLabel("This program is crazy\nIt contains many colors\nSave your eyes");
        text.setIcon(icon);
        JFrame warn = new JFrame("Warning!");
        warn.setSize(700, 420);
        warn.setVisible(true);
        warn.add(text);
        Color color = new Color(random.nextInt(0, 255), random.nextInt(0, 255), random.nextInt(0, 255));
        warn.getContentPane().setBackground(color);

        Thread.sleep(5000);
        warn.setVisible(false);
    }
}