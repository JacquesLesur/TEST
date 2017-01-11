import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JComboBox;

/**
 * Created by Jacques on 03/01/2017.
 */
public class Fenetre extends JFrame{
    private JPanel pan = new JPanel();

    public Fenetre(){
        this.setTitle("Animation");
        this.setSize(600, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //Ajout du bouton à notre content pane

        String[] bouttonChoix = { "Rouge", "Blue"};

        JComboBox cbButton = new JComboBox(bouttonChoix);
        Button button = new bouttonT1();


        pan.add(cbButton);
        pan.add(button.button());

        //this.setContentPane(panB);
        this.setContentPane(pan);
        this.setVisible(true);
        cbButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                Button button;
                JComboBox comboBox = (JComboBox) event.getSource();
                Object selected =comboBox.getSelectedItem();
                if (selected.toString().equals("Rouge"))
                {
                    button = new bouttonT1();
                    pan.add(button.button());
                }
                else if(selected.toString().equals("Blue")){
                    button = new buttonT2();
                    pan.add(button.button());

                }
                pan.remove(1);
                pan.updateUI();
            }});
    }

}
