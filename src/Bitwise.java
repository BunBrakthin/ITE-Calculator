
import javax.swing.*;
import java.awt.*;

public class Bitwise extends JPanel {
     private JPanel jPanel1;
     private JPanel jPanel2;

     JButton and;
     JButton xox;
     JButton or;

      JLabel num1, num2, operator, result;
      JLabel label1,label2,label3,label4,label5;
      JTextField text1, text2, text3;

    Font myFont = new Font("Cambria Math",Font.BOLD,18);
    Font myFont1 = new Font("Segoe UI Black",Font.BOLD,14);

    void firstPanel(){
        jPanel1 = new JPanel(new GridBagLayout());
        text1 = new JTextField(30);
        text2 = new JTextField(30);
        num1 = new JLabel("Number1:");
        num2 = new JLabel("Number2:");
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel1.add(label3,gbc);
        label3.setPreferredSize(new Dimension(0,40));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        jPanel1.add(num1,gbc);
        num1.setFont(myFont);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        jPanel1.add(label1,gbc);
        label1.setPreferredSize(new Dimension(30,50));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 1;
        jPanel1.add(text1,gbc);
        text1.setPreferredSize(new Dimension(0,40));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        jPanel1.add(label2,gbc);
        label2.setPreferredSize(new Dimension(20,40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth =1;
        jPanel1.add(num2,gbc);
        num2.setFont(myFont);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        jPanel1.add(text2,gbc);
        text2.setPreferredSize(new Dimension(0,40));
    }
    void secondPanel(){
        jPanel2 = new JPanel(new GridBagLayout());
        text3 = new JTextField(10);
        operator = new JLabel("Bitwise Operator:      ");
        and = new JButton("AND");
        or = new JButton("OR");
        xox = new JButton("XOX");
        result = new JLabel("Result:");
        label4 = new JLabel();
        label5 = new JLabel();
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel2.add(label4,gbc);
        label4.setPreferredSize(new Dimension(0,40));

        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        jPanel2.add(operator,gbc);
        operator.setFont(myFont);

        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        jPanel2.add(and,gbc);
        and.setPreferredSize(new Dimension(82,50));
        and.setFont(myFont1);
        and.setBackground(Color.cyan);
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 1;
        jPanel2.add(or,gbc);
        or.setPreferredSize(new Dimension(82,50));
        or.setFont(myFont1);
        or.setBackground(Color.red);
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 1;
        jPanel2.add(xox,gbc);
        xox.setPreferredSize(new Dimension(82,50));
        xox.setFont(myFont1);
        xox.setBackground(Color.YELLOW);
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        jPanel2.add(label5,gbc);
        label5.setPreferredSize(new Dimension(0,20));

        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        jPanel2.add(result,gbc);
        result.setFont(myFont);

        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        jPanel2.add(text3,gbc);
        text3.setPreferredSize(new Dimension(400,80));

    }
    // add button, textField and label to JFrame
    Bitwise() {
       firstPanel();
       secondPanel();
       this.add(jPanel1);
       this.add(jPanel2);

    }
}