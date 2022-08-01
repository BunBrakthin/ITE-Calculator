import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Trigonometry extends JPanel implements ActionListener {
    private JButton sin,cos,tan,sec,csc,cot,sinh,cosh,tanh,sech,csch,coth,log;
    private JButton bClose,bOpen;
    private JButton deg,red,bnd;

    JTextField text1;
    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bmod, bsub, badd, bdec, beq, bdel, bclr,
            ln, e, square, xp2, xp3,xpy,tenpx, xu1, ngt, pai, ps, otn;
    public JLabel label;
    Font myFont = new Font("Elephant", Font.BOLD, 14);

    static double a = 0, b = 0, result = 0;

    static int operator = 5;

    private boolean dot = true; // Connect numbers in display



   Trigonometry(){

      bOpen=new JButton("(");
      bClose=new JButton(")");
      sin=new JButton("sin");
      cos=new JButton("cos");
      tan=new JButton("tan");
      sec=new JButton("sec");
      csc=new JButton("csc");
      cot= new JButton("cot");
      sinh=new JButton("sinh");
      tanh=new JButton("tanh");
      sech=new JButton("sech");
      csch=new JButton("csch");
      coth=new JButton("coth");
      log=new JButton("log");
      red=new JButton("RED");
      deg=new JButton("DEG");
      bnd=new JButton("2nd");

    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

// Create textField
       text1 = new JTextField();
       // Create Label
       label = new JLabel();
       // Create button
       b1 = new JButton("1");
       b2 = new JButton("2");
       b3 = new JButton("3");
       b4 = new JButton("4");
       b5 = new JButton("5");
       b6 = new JButton("6");
       b7 = new JButton("7");
       b8 = new JButton("8");
       b9 = new JButton("9");
       b0 = new JButton("0");
       bmod = new JButton("mod");
       bdiv = new JButton("÷");
       bmul = new JButton("×");
       bsub = new JButton("-");
       badd = new JButton("+");
       bdec = new JButton(".");
       beq = new JButton("=");
       bdel = new JButton("\uF0D5");
       bclr = new JButton("AC");
       ln = new JButton("ln");
       square = new JButton("√");
       xp2 = new JButton("x^2");
       xp3 = new JButton("x^3");
       xpy = new JButton("x^y");
       tenpx = new JButton("10^x");
       xu1 = new JButton("1/x");
       e = new JButton("e");
       ngt = new JButton("( - )");
       pai = new JButton("π");
       ps = new JButton("%");
       otn = new JButton("x!");

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 0;
       gbc.weightx = 0.05;
       gbc.weighty = 0.05;
       gbc.gridwidth = 6;
       add(label, gbc);//Add textField this panel
       label.setPreferredSize(new Dimension(0, 20));
       label.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
       label.setHorizontalAlignment(JLabel.RIGHT);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 1;
       gbc.weightx = 0.05;
       gbc.weighty = 0.05;
       gbc.gridwidth = 6;
       add(text1, gbc);//Add textField this panel
       text1.setPreferredSize(new Dimension(0, 20));
       text1.setFont(new Font("Arial Black", Font.PLAIN, 18));
       text1.setHorizontalAlignment(JTextField.RIGHT);
       text1.setHorizontalAlignment(JTextField.RIGHT);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 2;
       gbc.weightx = 0.03;
       gbc.weighty = 0.03;
       gbc.gridwidth = 1;
       add(bnd, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 2;
       add(pai, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 2;
       add(e, gbc);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 2;
       add(bclr, gbc);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 2;
       add(bdel, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 4;
       add(xp2, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 4;
       add(sin, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 4;
       add(cos, gbc);
//       bclr.setText("C");
//       bclr.setFont(myFont);
//       bclr.setBackground(Color.magenta);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 4;
       add(tan, gbc);
       bdel.setText("\uF0D5");
       bdel.setFont(new Font("Calibri (Body)", Font.BOLD, 20));
       bdel.setBackground(Color.magenta);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 4;
       add(bmod, gbc);
       bmod.setText("mod");
       bmod.setBackground(Color.yellow);
       bmod.setFont(myFont);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 5;
       add(square, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 5;
       add(sec, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 5;
       add(csc, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 5;
       add(cot, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 5;
       add(bdiv, gbc);
       bdiv.setText("÷");
       bdiv.setFont(myFont);
       bdiv.setBackground(Color.yellow);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 6;
       add(xpy, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 6;
       add(b7, gbc);
       b7.setText("7");
       b7.setFont(myFont);
       b7.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 6;
       add(b8, gbc);
       b8.setText("8");
       b8.setFont(myFont);
       b8.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 6;
       add(b9, gbc);
       b9.setText("9");
       b9.setFont(myFont);
       b9.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 6;
       add(bmul, gbc);
       bmul.setText("×");
       bmul.setBackground(Color.yellow);
       bmul.setFont(myFont);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 7;
       add(tenpx, gbc);

       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 7;
       add(b4, gbc);
       b4.setText("4");
       b4.setFont(myFont);
       b4.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 7;
       add(b5, gbc);
       b5.setText("5");
       b5.setFont(myFont);
       b5.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 7;
       add(b6, gbc);
       b6.setText("6");
       b6.setFont(myFont);
       b6.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 7;
       add(bsub, gbc);
       bsub.setText("-");
       bsub.setFont(myFont);
       bsub.setBackground(Color.yellow);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 8;
       add(log, gbc);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 8;
       add(b1, gbc);
       b1.setText("1");
       b1.setFont(myFont);
       b1.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 8;
       add(b2, gbc);
       b2.setText("2");
       b2.setFont(myFont);
       b2.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 8;
       add(b3, gbc);
       b3.setText("3");
       b3.setFont(myFont);
       b3.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 8;
       add(badd, gbc);
       badd.setText("+");
       badd.setFont(myFont);
       badd.setBackground(Color.yellow);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 0;
       gbc.gridy = 9;
       add(ln, gbc);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 1;
       gbc.gridy = 9;
       add(ngt, gbc);
       ngt.setText("+/-");
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 2;
       gbc.gridy = 9;
       add(b0, gbc);
       b0.setText("0");
       b0.setFont(myFont);
       b0.setBackground(Color.cyan);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 3;
       gbc.gridy = 9;
       add(bdec, gbc);
       bdec.setText(".");
       bdec.setFont(myFont);
       gbc.fill = GridBagConstraints.BOTH;
       gbc.gridx = 4;
       gbc.gridy = 9;
       add(beq, gbc);
       beq.setText("=");
       beq.setFont(new Font("Elephant", Font.PLAIN, 15));
       beq.setForeground(Color.white);
       beq.setBackground(Color.red);

// All button addActionListener
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       b0.addActionListener(this);
       badd.addActionListener(this);
       bdiv.addActionListener(this);
       bmul.addActionListener(this);
       bsub.addActionListener(this);
       bdec.addActionListener(this);
       beq.addActionListener(this);
       bdel.addActionListener(this);
       bclr.addActionListener(this);
       square.addActionListener(this);
       xp2.addActionListener(this);
       xp3.addActionListener(this);
       xu1.addActionListener(this);
       e.addActionListener(this);
       otn.addActionListener(this);
       ngt.addActionListener(this);
       pai.addActionListener(this);
       ps.addActionListener(this);

       sin.addActionListener(this);
       cos.addActionListener(this);
       tan.addActionListener(this);
       sec.addActionListener(this);
       csc.addActionListener(this);
       cot.addActionListener(this);
       xpy.addActionListener(this);
       tenpx.addActionListener(this);
       log.addActionListener(this);
       ln.addActionListener(this);
       pai.addActionListener(this);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1)
            text1.setText(text1.getText().concat("1"));
        if (e.getSource() == b2)
            text1.setText(text1.getText().concat("2"));
        if (e.getSource() == b3)
            text1.setText(text1.getText().concat("3"));
        if (e.getSource() == b4)
            text1.setText(text1.getText().concat("4"));
        if (e.getSource() == b5)
            text1.setText(text1.getText().concat("5"));
        if (e.getSource() == b6)
            text1.setText(text1.getText().concat("6"));
        if (e.getSource() == b7)
            text1.setText(text1.getText().concat("7"));
        if (e.getSource() == b8)
            text1.setText(text1.getText().concat("8"));
        if (e.getSource() == b9)
            text1.setText(text1.getText().concat("9"));
        if (e.getSource() == b0)
            text1.setText(text1.getText().concat("0"));
        if (e.getSource() == bdec) { //dot
            getDot();
        }
        if (e.getSource() == xu1) { // x/2 option
            float x = (float) parseDouble(text1.getText());
            x = 1 / x;
            text1.setText("");
            text1.setText(text1.getText() + x);
        }
        if (e.getSource() == xp2) { // x^2 option
            double x = parseDouble(text1.getText());
            x = x * x;
            text1.setText("");
            text1.setText(text1.getText() + x);
        }
        if (e.getSource() == xp3) { // x^3 option
            double x = parseDouble(text1.getText());
            x = x * x * x;
            text1.setText("");
            text1.setText(text1.getText() + x);
        }


        if (e.getSource() == square) { //square option
            double c = Math.sqrt(Double.parseDouble(text1.getText()));
            text1.setText("");
            text1.setText(text1.getText()+c);
        }
        if (e.getSource() == pai) { //pai
            double c = Math.sqrt(Double.parseDouble(text1.getText()));
        getArea(c);
        }
        if (e.getSource() == otn) { // factorial option
            double f = parseDouble(text1.getText());
            double fac = 1;
            while (f != 0) {
                fac = f * fac;
                f--;
            }
            text1.setText("");
            text1.setText(text1.getText() + fac);
        }

        if (e.getSource() == badd) // add number
        {
            a = parseDouble(text1.getText());
            operator = 1;
            text1.setText("");
            label.setText(a + " + " + "...");
        }
        if (e.getSource() == bsub) // subtract number
        {
            a = parseDouble(text1.getText());
            operator = 2;
            text1.setText("");
            label.setText(a + " - " + "...");
        }
        if (e.getSource() == bmul) // multiply number
        {
            a = parseDouble(text1.getText());
            operator = 3;
            text1.setText("");
            label.setText(a + " × " + "...");
        }
        if (e.getSource() == bdiv) // device number
        {
            a = parseDouble(text1.getText());
            operator = 4;
            text1.setText("");
            label.setText(a + " ÷ " + "...");
        }
        if (e.getSource() == xpy) { // x^3 option
            a = parseDouble(text1.getText());
            operator = 5;
            text1.setText("");
            label.setText(a + " ^ " + "...");
        }
        if (e.getSource() == tenpx) { // x^3 option
            int a = Integer.parseInt((text1.getText()));
            int c = (int) Math.pow(10,a);
            text1.setText("");
            label.setText("10" + "^" +"("+a+")"+" =");
            text1.setText(String.valueOf(c));
        }

        if (e.getSource() == beq) // equal resale
        {
            b = parseDouble(text1.getText());
            try { // switch case arithmetic
                if (operator == 1) {
                    result = a + b;
                    label.setText(a + " + " + b + " = ");
                }
                if (operator == 2) {
                    result = a - b;
                    label.setText(a + " - " + b + " = ");
                }
                if (operator == 3) {
                    result = a * b;
                    label.setText(a + " × " + b + " = ");
                }
                if (operator == 4) {
                    result = a / b;
                    label.setText(a + " ÷ " + b + " = ");
                }
                if (operator == 5) {
                    result = Math.pow(a,b);
                    label.setText(a + " ^ " + b + " = ");
                }
            } finally {
                System.out.close();
            }
            //print result to text
            text1.setText("" + result);
        }

        if (e.getSource() == bclr) // clear option
            text1.setText("");

        if (e.getSource() == bclr) // clear option
            label.setText("");
        if (e.getSource() == bdel) // delete option
        {
            String s = text1.getText();
            text1.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                text1.setText(text1.getText() + s.charAt(i));
        }
        if (e.getSource()==bClose)// close Circle of nails option
            text1.setText(text1.getText().concat(")"));

        if (e.getSource()==sin) {// sin option
            double s = Math.sin(Math.toRadians(Double.parseDouble(text1.getText())));
            text1.setText("");
            text1.setText(text1.getText()+s);
        }

        if (e.getSource()==cos) { // cos option
            double c = Math.cos(Math.toRadians(Double.parseDouble(text1.getText())));
            text1.setText("");
            text1.setText(text1.getText()+c);
        }

        if (e.getSource()==cot) { // cot option
            double a;
            a = Double.parseDouble(text1.getText());
            double c = (Math.cos(Math.toRadians(a))) / (Math.sin(Math.toRadians(a)));
            text1.setText("");
            text1.setText(text1.getText()+c);
        }

        if (e.getSource()==tan) { // tan option
            a = Double.parseDouble((text1.getText()));
            double tan = (Math.sin(Math.toRadians(a))) / (Math.cos(Math.toRadians(a)));
            text1.setText("");
            text1.setText(text1.getText()+tan);
        }
        if (e.getSource()==sec) { // tan option
            double a;
            a = Double.parseDouble(text1.getText());
            double c = 1 / (Math.cos(Math.toRadians(a)));
            text1.setText("");
            text1.setText(text1.getText()+c);
        }
        if (e.getSource()==csc) { // tan option
            double a;
            a = Double.parseDouble(text1.getText());
            double c = 1 / (Math.sin(Math.toRadians(a)));
            text1.setText("");
            text1.setText(text1.getText()+c);
        }

        if (e.getSource()==log) { // log option
            double l = Math.log(Double.parseDouble(text1.getText()));
            text1.setText("");
            text1.setText(text1.getText()+l);
        }
        if (e.getSource()==ln) { // log option
            float x = (float) Math.log(Double.parseDouble(text1.getText()));
            text1.setText("");
            text1.setText(text1.getText()+x);
        }
        if (e.getSource()==deg){
            double deg = Math.toDegrees(Double.parseDouble(text1.getText()));
            text1.setText("");
            text1.setText(text1.getText()+deg);
        }

        if (e.getSource()==red){
            double red = Math.toRadians(Double.parseDouble(text1.getText()));
            text1.setText("");
            text1.setText(text1.getText()+red);
        }
        if(e.getSource()==ngt) {
            int temp = Integer.parseInt(text1.getText());
            temp*=-1;
            text1.setText(String.valueOf(temp));
        }


    }
    public void getDot(){
        if (!text1.getText().contains(".")) {
            text1.setText(text1.getText() + ".");
        }
        else {
            dot = true;
        }
    }
    public double getArea(double r){
        double pi = PI;
        return  r * Math.PI;
    }
}
