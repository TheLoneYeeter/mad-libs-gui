import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class MadLibsGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtAdjective2;
	private JTextField txtAdjective1;
	private JTextField txtColour;
	private JTextField txtNoun;
	private JTextField txtPastTenseVerb;
	private JTextArea txtrStory;
	
	public void makeStory() {
		String story = "";
		String adjective1 = txtAdjective1.getText();
		String adjective2 = txtAdjective2.getText();
		String colour = txtColour.getText();
		String noun = txtNoun.getText();
		String pastTenseVerb = txtPastTenseVerb.getText();
		story = "The " + colour + " dragon " + pastTenseVerb + " the " + adjective1 + " knight, who rode in on a " + adjective2 + " " + noun + ".";
		txtrStory.setText(story);
	}
	public MadLibsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MadLibs");
		getContentPane().setFont(new Font("Ubuntu", Font.PLAIN, 15));
		getContentPane().setBackground(new Color(128, 128, 128));
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("<html><u>MadLibs</u></html>");
		lblTitle.setToolTipText("What is there to add");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Ubuntu", Font.BOLD, 24));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(10, 11, 589, 35);
		getContentPane().add(lblTitle);
		
		JLabel lblAdjective1 = new JLabel("Write an adjective:");
		lblAdjective1.setForeground(new Color(255, 255, 255));
		lblAdjective1.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblAdjective1.setBounds(54, 82, 157, 21);
		getContentPane().add(lblAdjective1);
		
		JLabel lblAdjective2 = new JLabel("Write another adjective:");
		lblAdjective2.setForeground(new Color(255, 255, 255));
		lblAdjective2.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblAdjective2.setBounds(64, 140, 199, 21);
		getContentPane().add(lblAdjective2);
		
		JLabel lblColour = new JLabel("Write a colour:");
		lblColour.setForeground(new Color(255, 255, 255));
		lblColour.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblColour.setBounds(261, 84, 132, 17);
		getContentPane().add(lblColour);
		
		JLabel lblNoun = new JLabel("Write a noun:");
		lblNoun.setForeground(new Color(255, 255, 255));
		lblNoun.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblNoun.setBounds(443, 84, 118, 17);
		getContentPane().add(lblNoun);
		
		JLabel lblPastTenseVerb = new JLabel("Write a past tense verb:");
		lblPastTenseVerb.setForeground(new Color(255, 255, 255));
		lblPastTenseVerb.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		lblPastTenseVerb.setBounds(333, 142, 199, 17);
		getContentPane().add(lblPastTenseVerb);
		
		txtAdjective2 = new JTextField();
		txtAdjective2.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		txtAdjective2.setBounds(74, 170, 176, 20);
		getContentPane().add(txtAdjective2);
		txtAdjective2.setColumns(10);
		
		txtAdjective1 = new JTextField();
		txtAdjective1.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		txtAdjective1.setBounds(54, 109, 145, 20);
		getContentPane().add(txtAdjective1);
		txtAdjective1.setColumns(10);
		
		txtColour = new JTextField();
		txtColour.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		txtColour.setBounds(262, 109, 118, 20);
		getContentPane().add(txtColour);
		txtColour.setColumns(10);
		
		txtNoun = new JTextField();
		txtNoun.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		txtNoun.setBounds(443, 109, 108, 20);
		getContentPane().add(txtNoun);
		txtNoun.setColumns(10);
		
		txtPastTenseVerb = new JTextField();
		txtPastTenseVerb.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		txtPastTenseVerb.setBounds(333, 170, 183, 20);
		getContentPane().add(txtPastTenseVerb);
		txtPastTenseVerb.setColumns(10);
		
		JButton btnMakeStory = new JButton("Make Story!");
		btnMakeStory.setBackground(UIManager.getColor("Button.background"));
		btnMakeStory.setToolTipText("Witness your amazing creation");
		btnMakeStory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeStory();
			}
		});
		btnMakeStory.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		btnMakeStory.setBounds(234, 209, 145, 23);
		getContentPane().add(btnMakeStory);
		
		txtrStory = new JTextArea();
		txtrStory.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		txtrStory.setBackground(new Color(128, 128, 128));
		txtrStory.setBounds(23, 243, 563, 137);
		txtrStory.setLineWrap(true);
		txtrStory.setWrapStyleWord(true);
		getContentPane().add(txtrStory);
	}

	public static void main(String[] args) {
		MadLibsGUI storyGame = new MadLibsGUI();
		storyGame.setSize(new Dimension(630,430));
		storyGame.setVisible(true);
	}
}
