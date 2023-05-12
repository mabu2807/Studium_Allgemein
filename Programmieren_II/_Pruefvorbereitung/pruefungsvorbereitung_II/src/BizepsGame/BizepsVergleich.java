package BizepsGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BizepsVergleich extends JFrame {
    public static final String ACTION_VERGLEICHEN = "VERGLEICHEN";
    public static final String ACTION_SCHLIESSEN = "SCHLIESSEN";

    private BizepsVergleich(){
        super("Bizeps Vergleich");
        this.setLayout(new GridLayout(2, 2));
        JLabel lblSpieler1 = new JLabel("Spieler 1");
        JLabel lblSpieler2 = new JLabel("Spieler 2");

        final JTextField tfSpieler1 = new JTextField("Murvin");
        tfSpieler1.setEnabled(false);
        final JTextField tfSpieler2 = new JTextField();

        Integer[] bWerte = {30, 32, 34, 36, 38, 40, 55, 46, 48};
        final JComboBox<Integer> bizepsBox1 = new JComboBox(bWerte);
        final JComboBox<Integer> bizepsBox2 = new JComboBox(bWerte);

        JButton btnVergleichen = new JButton("Vergleichen");
        JButton btnSchliessen = new JButton("Schliessen");
        btnVergleichen.setActionCommand(ACTION_VERGLEICHEN);

        ActionListener btBizeps = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(ACTION_VERGLEICHEN.equals(e.getActionCommand())){

                    String spieler1 = tfSpieler1.getText();
                    String spieler2 = tfSpieler2.getText();
                    Integer bizeps1 = (Integer) bizepsBox1.getSelectedItem();
                    Integer bizeps2 = (Integer) bizepsBox2.getSelectedItem();
                    if(bizeps1 == bizeps2){
                        System.out.println(spieler1 + " und " + spieler2 + " müssen trainieren!");
                    } else if (bizeps1 > bizeps2) {
                        System.out.println(spieler1 + " ist der Babo!");

                    }
                    else{
                        System.out.println(spieler2 + " ist der Babo!");
                    }
                }
                else{
                    System.exit(0);
                }
            }
        };

        this.add(lblSpieler1);
        this.add(tfSpieler1);
        this.add(bizepsBox1);
        this.add(btnVergleichen);

        this.add(lblSpieler2);
        this.add(tfSpieler2);
        this.add(bizepsBox2);
        this.add(btnSchliessen);

        btnSchliessen.addActionListener(btBizeps);
        btnVergleichen.addActionListener(btBizeps);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);


    }

    public static void main(String[] args) {
        new BizepsVergleich();
    }
}
