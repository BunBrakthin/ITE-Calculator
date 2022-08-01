import javax.swing.*;
import java.awt.*;

public class NumberSystemConversion extends JPanel {

    JTextField text1,text2,text3,text4;
    JLabel label1,label2,label3,label4;
    public JLabel labels1,labels2,labels3;
    public JLabel numberTwo,numberTen,numberSexTeen,numberEight;
    public Font myFont = new Font("Segoe UI Black",Font.BOLD,14);
    public void nsc(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        label1 = new JLabel("Binary");
        label2 = new JLabel("Decimal");
        label3 = new JLabel("Hexadecimal");
        label4 = new JLabel("Octal");
        labels1 = new JLabel();
        labels2 = new JLabel();
        labels3 = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        numberTwo = new JLabel("2");
        numberTen = new JLabel("10");
        numberSexTeen= new JLabel("16");
        numberEight = new JLabel("8");

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =0;
        this.add(label1,gbc);
        label1.setFont(myFont);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =1;
        gbc.gridwidth=3;
        this.add(text1,gbc);
        text1.setPreferredSize(new Dimension(400,50));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =4;
        gbc.gridy =1;
        this.add(numberTwo,gbc);
        numberTwo.setFont(myFont);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =2;
        this.add(labels1,gbc);
        labels1.setPreferredSize(new Dimension(0,30));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =3;
        this.add(label2,gbc);
        label2.setFont(myFont);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =4;
        this.add(text2,gbc);
        text2.setPreferredSize(new Dimension(400,50));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =4;
        gbc.gridy =4;
        this.add(numberTen,gbc);
        numberTen.setFont(myFont);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =5;
        this.add(labels2,gbc);
        labels2.setPreferredSize(new Dimension(0,30));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =6;
        this.add(label3,gbc);
        label3.setFont(myFont);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =7;
        this.add(text3,gbc);
        text3.setPreferredSize(new Dimension(400,50));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =4;
        gbc.gridy =7;
        this.add(numberSexTeen,gbc);
        numberSexTeen.setFont(myFont);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =8;
        this.add(labels3,gbc);
        labels3.setPreferredSize(new Dimension(0,30));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =9;
        this.add(label4,gbc);
        label4.setFont(myFont);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =10;
        this.add(text4,gbc);
        text4.setPreferredSize(new Dimension(400,50));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =4;
        gbc.gridy =10;
        this.add(numberEight,gbc);
        numberEight.setFont(myFont);
    }
    NumberSystemConversion(){
        nsc();

    }
}
