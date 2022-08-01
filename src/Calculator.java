
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JPanel implements ActionListener{

    JTextField t;
    public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,
            deg,red,sin,cos,cot,tan,log,ln,e,square,xp2,xp3,xu1,ngt,pai,ps,otn,bop,bcol;
    public JLabel label;
    Font myFont = new Font("Elephant",Font.BOLD,14);

    static double a=0,b=0,result=0;
    static int operator=0;

    Calculator() { //Constructor
        // Create textField
        t=new JTextField();
        // Create Label
        label=new JLabel();
        // Create button
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("DL");
        bclr=new JButton("AC");
        deg=new JButton("DEG");
        red=new JButton("RED");
        bop=new JButton("(");
        bcol=new JButton(")");
        sin=new JButton("sin");
        cos=new JButton("cos");
        cot= new JButton("cot");
        tan=new JButton("tan");
        log=new JButton("log");
        ln=new JButton("ln");
        square=new JButton("√");
        xp2=new JButton("x^2");
        xp3=new JButton("x^3");
        xu1=new JButton("1/x");
        e=new JButton("e");
        ngt=new JButton("( - )");
        pai=new JButton("π");
        ps=new JButton("%");
        otn=new JButton("x!");

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        add(t,gbc);//Add textField this panel
        t.setPreferredSize(new Dimension(0,70));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 6;
        add(label,gbc);
        label.setPreferredSize(new Dimension(0,30));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth=1;
        add(deg,gbc);
        deg.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(red,gbc);
        red.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(bop,gbc);
        bop.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(bcol,gbc);
        bcol.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 2;
        add(bclr,gbc);
        bclr.setBackground(Color.red);
        bclr.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 2;
        add(bdel,gbc);//add button delete this panel
        bdel.setBackground(Color.red);
        bdel.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(sin,gbc);
        sin.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(square,gbc);
        square.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(b7,gbc);
        b7.setBackground(Color.cyan);
        b7.setFont(myFont);
        b7.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(b8,gbc);
        b8.setBackground(Color.cyan);
        b8.setFont(myFont);
        b8.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 3;
        add(b9,gbc);
        b9.setBackground(Color.cyan);
        b9.setFont(myFont);
        b9.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 3;
        add(bdiv,gbc);
        bdiv.setBackground(Color.yellow);
        bdiv.setFont(myFont);
        bdiv.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(cos,gbc);
        cos.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(xp2,gbc);
        xp2.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(b4,gbc);
        b4.setBackground(Color.cyan);
        b4.setFont(myFont);
        b4.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(b5,gbc);
        b5.setBackground(Color.cyan);
        b5.setFont(myFont);
        b5.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 4;
        add(b6,gbc);
        b6.setBackground(Color.cyan);
        b6.setFont(myFont);
        b6.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 4;
        add(bmul,gbc);
        bmul.setBackground(Color.yellow);
        bmul.setFont(myFont);
        bmul.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(tan,gbc);
        tan.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(xp3,gbc);
        xp3.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 5;
        add(b1,gbc);
        b1.setBackground(Color.cyan);
        b1.setFont(myFont);
        b1.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 5;
        add(b2,gbc);
        b2.setBackground(Color.cyan);
        b2.setFont(myFont);
        b2.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 5;
        add(b3,gbc);
        b3.setBackground(Color.cyan);
        b3.setFont(myFont);
        b3.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 5;
        add(bsub,gbc);
        bsub.setBackground(Color.yellow);
        bsub.setFont(myFont);
        bsub.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(log,gbc);
        log.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(xu1,gbc);
        xu1.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 6;
        add(ngt,gbc);
        ngt.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 6;
        add(b0,gbc);
        b0.setBackground(Color.cyan);
        b0.setFont(myFont);
        b0.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 6;
        add(bdec,gbc);
        bdec.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 6;
        add(badd,gbc);
        badd.setBackground(Color.yellow);
        badd.setFont(myFont);
        badd.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(ln,gbc);
        ln.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(cot,gbc);
        cot.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 7;
        add(otn,gbc);
        b7.setFont(myFont);
        otn.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 7;
        add(pai,gbc);
        pai.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 7;
        add(ps,gbc);
        ps.setPreferredSize(new Dimension(75,55));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 7;
        add(beq,gbc);
        beq.setBackground(Color.magenta);
        beq.setPreferredSize(new Dimension(75,55));

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
        deg.addActionListener(this);
        red.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        log.addActionListener(this);
        ln.addActionListener(this);
        square.addActionListener(this);
        xp2.addActionListener(this);
        xp3.addActionListener(this);
        xu1.addActionListener(this);
        e.addActionListener(this);
        otn.addActionListener(this);
        ngt.addActionListener(this);
        pai.addActionListener(this);
        ps.addActionListener(this);
        bop.addActionListener(this);
        bcol.addActionListener(this);
        cot.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));

        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));

        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));

        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));

        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));

        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));

        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));

        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));

        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));

        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));

        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));

        if (e.getSource()==bop)// open Circle of nails option
            t.setText(t.getText().concat("("));

        if (e.getSource()==bcol)// close Circle of nails option
            t.setText(t.getText().concat(")"));
        if (e.getSource()==sin) {// sin option
            double s = Math.sin(Math.toRadians(Double.parseDouble(t.getText())));
            t.setText("");
            t.setText(t.getText()+s);
        }
        if (e.getSource()==cos) { // cos option
            double c = Math.cos(Math.toRadians(Double.parseDouble(t.getText())));
            t.setText("");
            t.setText(t.getText()+c);
        }
        if (e.getSource()==cot) { // cot option
            double a;
            a = Double.parseDouble(t.getText());
            double c = (Math.cos(Math.toRadians(a))) / (Math.sin(Math.toRadians(a)));
            t.setText("");
            t.setText(t.getText()+c);
        }
        if (e.getSource()==tan) { // tan option
            a = Double.parseDouble((t.getText()));
            double tan = (Math.sin(Math.toRadians(a))) / (Math.cos(Math.toRadians(a)));
            t.setText("");
            t.setText(t.getText()+tan);
        }
        if (e.getSource()==log) { // log option
            double l = Math.log(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+l);
        }
        if (e.getSource()==xu1) { // x^2 option
            float x = (float) Double.parseDouble(t.getText());
            x = 1/x;
            t.setText("");
            t.setText(t.getText()+x);
        }
        if (e.getSource()==xp2) { // x^2 option
            double x = Double.parseDouble(t.getText());
            x = x*x;
            t.setText("");
            t.setText(t.getText()+x);
        }
        if (e.getSource()==xp3) { // x^3 option
            double x = Double.parseDouble(t.getText());
            x = x*x*x;
            t.setText("");
            t.setText(t.getText()+x);
        }
        if (e.getSource()==square) { //square option
            double s = Math.sqrt(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+s);
        }
        if (e.getSource()==ln) { // ln option
            float x = (float) Math.log(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+x);
        }
        if (e.getSource()==otn){ // factorial option
            double f = Double.parseDouble(t.getText());
            double fac = 1;
            while (f!=0)
            {
                fac = f*fac;
                f--;
            }
            t.setText("");
            t.setText(t.getText()+fac);
        }
        if (e.getSource()==deg){
           double deg = Math.toDegrees(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+deg);
        }
        if (e.getSource()==red){
            double red = Math.toRadians(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+red);
        }
        if(e.getSource()==badd) // add number
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }

        if(e.getSource()==bsub) // subtract number
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }

        if(e.getSource()==bmul) // multiply number
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }

        if(e.getSource()==bdiv) // device number
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }

        if(e.getSource()==beq) // equal resale
        {
            b=Double.parseDouble(t.getText());
            switch (operator) { // switch case arithmetic
                case 1 -> result = a + b;
                case 2 -> result = a - b;
                case 3 -> result = a * b;
                case 4 -> result = a / b;
                default -> result = 0;
            }
            t.setText(""+result);
        }

        if(e.getSource()==bclr) // clear option
            t.setText("");

        if(e.getSource()==bdel) // delete option
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
                t.setText(t.getText()+s.charAt(i));
        }
    }
}//end calculator
