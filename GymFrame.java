
package za.ac.tut.gymframe;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class GymFrame extends JFrame{
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCombinedPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel personalTrainerLbl;
    private JLabel contractsLbl;   
    
    private JTextField nameTxtF;
    private JTextField surnameTxtF;
    private JTextField idNoTxtF;
    
    private JComboBox genderComboBox;
    
    private JRadioButton monthToMonthRbtn;
    private JRadioButton sixMonthRbtn;
    private JRadioButton annualRbtn;
    
    private JCheckBox personalTrainerChb;
    
    private ButtonGroup btnGrp;
    
    private JTextArea commentArea;
    
    private JScrollPane scrollableTxtArea;
    
    private JButton applyBtn;
    
    public GymFrame()
    {
        setTitle("Gym membership");
        setSize(500,550);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client Details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Options"));
        
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        membershipCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Membership Form");
        headingPnl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
        headingPnl.setForeground(Color.BLUE);
        headingPnl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl = new JLabel("Name:     ");
        surnameLbl = new JLabel("Surname:     ");
        idNoLbl = new JLabel("ID no:     ");
        genderLbl = new JLabel("Gender:     ");
        contractsLbl = new JLabel("Type of contract:     ");
        personalTrainerLbl = new JLabel("Select the check box if you need a personal trainer :     ");
        
        nameTxtF = new JTextField(10);
        surnameTxtF = new JTextField(10);
        idNoTxtF = new JTextField(10);
        
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        monthToMonthRbtn = new JRadioButton("Month-to-month");
        sixMonthRbtn = new JRadioButton("Six months");
        annualRbtn = new JRadioButton("Annual");
        
        personalTrainerChb = new JCheckBox();
        
        btnGrp = new ButtonGroup();
        btnGrp.add(monthToMonthRbtn);
        btnGrp.add(sixMonthRbtn);
        btnGrp.add(annualRbtn);
        
        commentArea = new JTextArea(20,40);
        commentArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Comments"));
        
        scrollableTxtArea = new JScrollPane(commentArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn = new JButton("APPLY");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtF);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtF);   
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoLbl); 
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderComboBox);   
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);     
        
        headingClientCombinedPnl.add(headingPnl, BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl, BorderLayout.CENTER);
        
        contractsPnl.add(contractsLbl);
        contractsPnl.add(monthToMonthRbtn);
        contractsPnl.add(sixMonthRbtn);
        contractsPnl.add(annualRbtn);
        
        personalTrainerOptionPnl.add(personalTrainerLbl);
        personalTrainerOptionPnl.add(personalTrainerChb);
        
        membershipPnl.add(contractsPnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCombinedPnl.add(membershipPnl, BorderLayout.NORTH);
        membershipCombinedPnl.add(commentsPnl, BorderLayout.CENTER);
        
        btnsPnl.add(applyBtn);
        
        mainPnl.add(headingClientCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(membershipCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.NORTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
        
 }
}
