package No2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GUIJSoup {

    public static void main(String[] args) {
        // https://en.wikipedia.org/
        
        JFrame frame = new JFrame("Aplikasu GUI");
        
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());
        
        JPanel panelAtas = new JPanel(new FlowLayout());
        panelAtas.setBackground(Color.white);
        contentPane.add(panelAtas, BorderLayout.NORTH);
        JLabel labelURL = new JLabel("URL");
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(400,30));
        JButton button = new JButton("PARSE");
        
        panelAtas.add(labelURL);
        panelAtas.add(textField);
        panelAtas.add(button);
        
        JPanel panelTengah = new JPanel(new BorderLayout());
        panelTengah.setBackground(Color.DARK_GRAY);
        contentPane.add(panelTengah, BorderLayout.CENTER);
        JScrollPane scrolPane = new JScrollPane();
        JTextPane textPane = new JTextPane();
        scrolPane.setViewportView(textPane);
        panelTengah.add(scrolPane,BorderLayout.CENTER);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sURL = textField.getText();
                    Document doc = Jsoup.connect(sURL).get();
                    String text = doc.text();
                    textPane.setText(text);
                } catch (Exception ex) {
                   textPane.setText("Isi Link Diatas");
                }
            }
        });
        
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}