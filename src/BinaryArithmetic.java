import javax.swing.*;
import java.awt.*;

public class BinaryArithmetic extends JPanel {

    private JButton convert;
    private JLabel binaryCalc, binaryValue, first,second;
    private JTextField text1,text2,text3,text4,text5;
    private JComboBox comboBox;
    private JLabel label1, label2,label3,label4;
    String operator []= {"+","-","×","÷"};
    Font myFont = new Font("Arial Black",Font.BOLD,14);

    BinaryArithmetic() {
        binaryCalc = new JLabel("Binary Calculation-Add, Subtract, Multiply, or Divide");
        binaryValue = new JLabel("Binary value:");
        first = new JLabel("1's Complement");
        second = new JLabel("2's Complement");
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox = new JComboBox(operator);
        text1 = new JTextField(15);
        text2 = new JTextField(15);
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        convert = new JButton("=Convert");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 8;
        add(binaryCalc, gbc);
        binaryCalc.setFont(myFont);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(text1, gbc);
        text1.setPreferredSize(new Dimension(0, 30));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(comboBox, gbc);
        comboBox.setPreferredSize(new Dimension(0, 30));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(text2, gbc);
        text2.setPreferredSize(new Dimension(0, 30));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(label1, gbc);
        label1.setPreferredSize(new Dimension(0, 20));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(convert, gbc);
        convert.setPreferredSize(new Dimension(90, 40));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(label2, gbc);
        label2.setPreferredSize(new Dimension(0, 20));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(binaryValue, gbc);
        binaryValue.setFont(myFont);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 8;
        add(text3, gbc);
        text3.setPreferredSize(new Dimension(0, 40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(label3, gbc);
        label3.setPreferredSize(new Dimension(0, 20));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 8;
        add(first, gbc);
        first.setFont(myFont);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 8;
        add(text4, gbc);
        text4.setPreferredSize(new Dimension(0, 40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 10;
        add(label4, gbc);
        label4.setPreferredSize(new Dimension(0, 20));

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 11;
        add(second, gbc);
        second.setFont(myFont);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 8;
        add(text5, gbc);
        text5.setPreferredSize(new Dimension(0, 40));
    }
}