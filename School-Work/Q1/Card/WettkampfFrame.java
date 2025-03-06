
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.*;

public class WettkampfFrame extends JFrame {
    private JPanel contentPane;
    private Wettkampfergebnis we;
    JButton btnNeuerSchler;
    JLabel lblBundesjugendspiele;
    JSeparator separator;
    JTextArea anzeige;
    JRadioButton rdbtnLauf;
    JRadioButton rdbtnSprung;
    JRadioButton rdbtnWurf;
    JRadioButton rdbtnGesamt;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JButton btnSortierenDurchAuswahl;
    private JPanel panel;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WettkampfFrame frame = new WettkampfFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        );
    }

    private void erzeugeBeispiele() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            String n = "Name" + i;
            String v = "Vorname" + i;
            String k = "Klasse_7";
            int ps = r.nextInt(100);
            int pl = r.nextInt(100);
            int pw = r.nextInt(100);
            Wettkampfkarte wk = new Wettkampfkarte(n, v, k);
            wk.setzePunkte(2, ps);
            wk.setzePunkte(1, pl);
            wk.setzePunkte(3, pw);
            we.ergaenzeKarte(wk);
        }
    }

    public WettkampfFrame() {
        this.we = new Wettkampfergebnis();
        //erzeugeBeispiele();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 696, 522);
        contentPane = new JPanel();
        contentPane.setBackground(UIManager.getColor("Button.background"));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        lblBundesjugendspiele = new JLabel("Bundesjugendspiele");
        lblBundesjugendspiele.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblBundesjugendspiele.setHorizontalAlignment(SwingConstants.CENTER);
        lblBundesjugendspiele.setBounds(10, 11, 668, 32);
        contentPane.add(lblBundesjugendspiele);
        separator = new JSeparator();
        separator.setBounds(10, 54, 668, 2);
        contentPane.add(separator);
        btnNeuerSchler = new JButton("Neuen Schueler anf\u00FCgen");
        btnNeuerSchler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                neuerSchueler_JOP();
            }
        });
        btnNeuerSchler.setBounds(10, 67, 210, 23);
        contentPane.add(btnNeuerSchler);
        panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED,
                null, null), "Sortieren", TitledBorder.LEADING,
                TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
        panel.setBounds(395, 71, 283, 265);
        contentPane.add(panel);
        panel.setLayout(null);
        rdbtnLauf = new JRadioButton("nach den Punkten beim Laufen");
        rdbtnLauf.setBounds(38, 21, 226, 23);
        panel.add(rdbtnLauf);
        buttonGroup.add(rdbtnLauf);
        rdbtnLauf.setSelected(true);
        rdbtnSprung = new JRadioButton("nach den Punkten beim Springen");
        rdbtnSprung.setBounds(38, 41, 226, 23);
        panel.add(rdbtnSprung);
        buttonGroup.add(rdbtnSprung);
        rdbtnWurf = new JRadioButton("nach den Punkten beim Werfen");
        rdbtnWurf.setBounds(38, 61, 226, 23);
        panel.add(rdbtnWurf);
        buttonGroup.add(rdbtnWurf);
        rdbtnGesamt = new JRadioButton("nach der Punktesumme");
        rdbtnGesamt.setBounds(38, 81, 226, 23);
        panel.add(rdbtnGesamt);
        buttonGroup.add(rdbtnGesamt);
        btnSortierenDurchAuswahl = new JButton("sortieren");
        btnSortierenDurchAuswahl.setBounds(38, 111, 132, 23);
        panel.add(btnSortierenDurchAuswahl);
        anzeige = new JTextArea();
        anzeige.setBackground(UIManager.getColor("Button.background"));
        anzeige.setBorder(new LineBorder(new Color(0, 0, 0)));
        JScrollPane sp = new JScrollPane(anzeige);
        sp.setBounds(10, 188, 375, 285);
        contentPane.add(sp);     
        btnSortierenDurchAuswahl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                sortAction();
            }
        });     
        showActual();
    }

    private void showActual() {
        we.getWettkampfkarten().toFirst();
        String inhalt = "";
        while (we.getWettkampfkarten().hasAccess()) {
            Wettkampfkarte wk = we.getWettkampfkarten().getContent();
            inhalt += wk.toString() + "\n";
            we.getWettkampfkarten().next();
        }
        this.anzeige.setText(inhalt);
    }

    private void sortAction() {
        if (this.rdbtnLauf.isSelected()) {
            sortAction(1);
        } else if (this.rdbtnSprung.isSelected()) {
            sortAction(2);
        } else if (this.rdbtnWurf.isSelected()) {
            sortAction(3);
        } else if (this.rdbtnGesamt.isSelected()) {
            sortAction(4);
        }
        this.we.getWettkampfkarten().toFirst();
        showActual();
    }

    private void sortAction(int pDisziplin) {
        this.we.auswahlSort(pDisziplin);
    }

    private void neuerSchueler_JOP() {
        JTextField name = new JTextField();
        JTextField vorname = new JTextField();
        JTextField klasse = new JTextField();
        JTextField punkteLauf = new JTextField();
        JTextField punkteSprung = new JTextField();
        JTextField punkteWurf = new JTextField();
        Object[] message = { "Name", name, "Vorname", vorname, "Klasse",
                klasse, "Punkte beim Laufen", punkteLauf,
                "Punkte beim Springen", punkteSprung, "Punkte beim Werfen",
                punkteWurf };
        JOptionPane pane = new JOptionPane(message, JOptionPane.PLAIN_MESSAGE,
                JOptionPane.OK_CANCEL_OPTION);
        pane.createDialog(this, "Neuer Schueler").setVisible(true);
        if (pane.getValue() != null
                && (int) pane.getValue() == JOptionPane.OK_OPTION) {
            String inhalt = name.getText() + "," + vorname.getText() + ","
                    + klasse.getText() + "," + punkteLauf.getText() + ","
                    + punkteSprung.getText() + "," + punkteWurf.getText();
            Wettkampfkarte wk = new Wettkampfkarte(inhalt);
            we.ergaenzeKarte(wk);
            we.getWettkampfkarten().toFirst();
            showActual();
        } else {
            // System.out.println("Abgebrochen!");
        }
    }

}
