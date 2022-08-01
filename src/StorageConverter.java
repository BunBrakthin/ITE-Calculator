import javax.swing.*;
import java.awt.*;

public class StorageConverter extends JPanel{
    public JButton convert;
    public JTextField text1,text2;
    public JLabel from, to, enter_byte, result;
    public JLabel label1,label2,label3,label4;
    public Font myFont = new Font("Arial Black",Font.BOLD,18);
    public Font myFont1 = new Font("Segoe UI Black",Font.BOLD,14);
    public JComboBox comboBox1,comboBox2;

    String aStroage1 [] ={"byte","kilobyte","megabyte","gigabyte","gigabyte","terabyte","petabyte"};
    String aStroage2 [] ={"kilobyte","byte","megabyte","gigabyte","gigabyte","terabyte","petabyte"};


    StorageConverter(){
        from = new JLabel("From");
        to = new JLabel("TO");
        enter_byte = new JLabel("Enter byte");
        result = new JLabel("Result");
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        convert = new JButton("= Convert");
        comboBox1 = new JComboBox(aStroage1);
        comboBox2 = new JComboBox(aStroage2);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =0;
        this.add(from,gbc);
        from.setFont(myFont1);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =3;
        gbc.gridy =0;
        this.add(to,gbc);
        to.setFont(myFont1);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =1;
        this.add(comboBox1,gbc);
        comboBox1.setPreferredSize(new Dimension(0,40));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =2;
        gbc.gridy =1;
        this.add(label1,gbc);
        label1.setPreferredSize(new Dimension(100,0));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =3;
        gbc.gridy =1;
        gbc.gridwidth = 2;
        this.add(comboBox2,gbc);
        comboBox2.setPreferredSize(new Dimension(120,40));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =2;
        this.add(label2,gbc);
        label2.setPreferredSize(new Dimension(0,40));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =3;
        this.add(enter_byte,gbc);
        enter_byte.setFont(myFont1);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =4;
        gbc.gridwidth = 5;
        this.add(text1,gbc);
        text1.setPreferredSize(new Dimension(0,40));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =5;
        gbc.gridwidth = 1;
        this.add(label3,gbc);
        label3.setPreferredSize(new Dimension(0,40));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =6;
        this.add(convert,gbc);
        convert.setPreferredSize(new Dimension(150,50));
        convert.setFont(myFont1);
        convert.setBackground(Color.cyan);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =7;
        this.add(label4,gbc);
        label4.setPreferredSize(new Dimension(0,40));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =8;
        this.add(result,gbc);
        result.setFont(myFont1);

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy =9;
        gbc.gridwidth = 5;
        this.add(text2,gbc);
        text2.setPreferredSize(new Dimension(0,60));
    }
}