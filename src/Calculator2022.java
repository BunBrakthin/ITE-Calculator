import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2022 extends JFrame implements ActionListener {
        private JLabel label1,  label2,label3,label4,label5,label6,label7;
        private JButton arithmetic;
    private JButton trigonometrys;
    private JButton bitwiseb;
    private JButton money;
    private JButton numberSystemConvert;
    private JButton stConverter;
    private JButton binaryArithmetics;
        private JPanel panelButton;
        private JPanel panelLabel;
        private JPanel panelCard;
        // Declare variable
        private ArithmeticView arithmeticViews;
        private Bitwise bitwise;
        private NumberSystemConversion numberSystemConversion;
        private BinaryArithmetic binaryArithmetic;
        private StorageConverter storageConverter;
        private MoneyExchange moneyExchange;
        private Trigonometry trigonometry;
        //button get text
        private static final String ARITHEMTICVIEW = "Calculator";
        private static final String BITWISE = "Bitwise";
        private static final String MONEYEXCHANGE = "Moneyexchange";
        private static final String NUMBERSYSTEMCONVERT = "Numbersystemconvert";
        private static final String STORAGECONVERTER = "Storageconverter";
        private static final String BINARYARITHMETIC = "Binaryarithmentic";
        private static final String TRIGONOMETRY = "Trigonometry";

    private static final String LABEL1 = "Calculator";
    private static final String LABEL2 = "Bitwise";
    private static final String LABEL3 = "Moneyexchange";
    private static final String LABEL4 = "Numbersystemconvert";
    private static final String LABEL5 = "Storageconverter";
    private static final String LABEL6 = "Binaryarithmentic";
    private static final String LABEL7 = "Trigonometry";

        Font myFont = new Font("Segoe UI Black",Font.BOLD,26);
        // Panel Title
        public void panelTitle()
        {
            panelLabel = new JPanel();
            panelLabel.setBackground(Color.green);
            label1 = new JLabel("CALCULATOR");
            label1.setFont(myFont);
            panelLabel.add(label1);

            label2 = new JLabel("BITWISE");
            label2.setHorizontalAlignment(JLabel.CENTER);
            label2.setFont(myFont);

            label3 = new JLabel("MONEY EXCHANGE");
            label3.setHorizontalAlignment(JLabel.CENTER);
            label3.setFont(myFont);

            label4 = new JLabel("NUMBER SYSTEM CONVERT");
            label4.setHorizontalAlignment(JLabel.CENTER);
            label4.setFont(myFont);

            label5 = new JLabel("STORAGE CONVERTER");
            label5.setHorizontalAlignment(JLabel.CENTER);
            label5.setFont(myFont);

            label6 = new JLabel("BINARY ARITHMETIC");
            label6.setHorizontalAlignment(JLabel.CENTER);
            label6.setFont(myFont);

            label7 = new JLabel("TRIGONOMETRY");
            label7.setHorizontalAlignment(JLabel.CENTER);
            label7.setFont(myFont);
        }
    // panel buttonMenu
        public void buttonMenu(){
            arithmetic = new JButton(ARITHEMTICVIEW);
            trigonometrys = new JButton(TRIGONOMETRY);
            bitwiseb = new JButton(BITWISE);
            money = new JButton(MONEYEXCHANGE);
            numberSystemConvert = new JButton(NUMBERSYSTEMCONVERT);
            stConverter = new JButton(STORAGECONVERTER);
            binaryArithmetics = new JButton(BINARYARITHMETIC);

            // PanelButton
            panelButton = new JPanel();
            panelButton.setBackground(Color.pink);
            panelButton.setLayout(new GridBagLayout());
            GridBagConstraints pbt = new GridBagConstraints();

            arithmetic.setBackground(Color.lightGray);
            bitwiseb.setBackground(Color.lightGray);
            money.setBackground(Color.lightGray);
            numberSystemConvert.setBackground(Color.lightGray);
            binaryArithmetics.setBackground(Color.lightGray);
            stConverter.setBackground(Color.lightGray);
            trigonometrys.setBackground(Color.lightGray);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=0;
            panelButton.add(arithmetic,pbt);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=1;
            panelButton.add(trigonometrys,pbt);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=2;
            panelButton.add(bitwiseb,pbt);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=3;
            panelButton.add(money,pbt);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=4;
            panelButton.add(numberSystemConvert,pbt);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=5;
            panelButton.add(stConverter,pbt);

            pbt.fill = GridBagConstraints.HORIZONTAL;
            pbt.gridx=0;
            pbt.gridy=6;
            panelButton.add(binaryArithmetics,pbt);
        }

    private void createPanelCard(){
        // Create Object
        bitwise = new Bitwise();
        arithmeticViews = new ArithmeticView();
        binaryArithmetic = new BinaryArithmetic();
        moneyExchange = new MoneyExchange();
        storageConverter = new StorageConverter();
        numberSystemConversion = new NumberSystemConversion();
        trigonometry = new Trigonometry();

        // Call method
        buttonMenu();
        panelTitle();

        // Add another panel to panelCard
        panelCard = new JPanel(new CardLayout());

        panelCard.add(arithmeticViews, ARITHEMTICVIEW);
        panelCard.add(bitwiseb, BITWISE);
        panelCard.add(trigonometry, TRIGONOMETRY);
        panelCard.add(moneyExchange, MONEYEXCHANGE);
        panelCard.add(numberSystemConversion, NUMBERSYSTEMCONVERT);
        panelCard.add(binaryArithmetic, BINARYARITHMETIC);
        panelCard.add(storageConverter, STORAGECONVERTER);
    }

        Calculator2022(){
            // Call method
            createPanelCard();

            // register listener
            arithmetic.addActionListener(this);
            bitwiseb.addActionListener(this);
            money.addActionListener(this);
            numberSystemConvert.addActionListener(this);
            stConverter.addActionListener(this);
            binaryArithmetics.addActionListener(this);
            trigonometrys.addActionListener(this);


            this.getContentPane().add(panelLabel, BorderLayout.NORTH);
            this.getContentPane().add(panelButton, BorderLayout.WEST);
            this.getContentPane().add(panelCard, BorderLayout.CENTER);

            //property of JFrame
            this.setTitle("Calculator 2022");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(new Dimension(650, 515));
            this.setLocation(600,200);
            //this.setResizable(false);
        }
    /**
     * Invoked when an action occurs.
     * Override method actionPerformed from implements ActionListener
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) { // method ActionEvent

        // get instance of cards
        CardLayout cardLayout =(CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, e.getActionCommand());
    }
}