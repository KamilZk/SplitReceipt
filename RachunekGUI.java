import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//==============================================
//==============================================
public class RachunekGUI extends JFrame implements ActionListener, KeyListener, ChangeListener
{
	
	
	//==============================================
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final KeyListener VK_ENTER = null;
	
	//Góra
	private JLabel lblDoZaplaty, lblSuma, lblZwrot;
	static JTextField txtDoZaplaty;
	static JLabel lblSkladka, lblSkladka_kwota, lblSuma_1, lblZwrot_1;
	
	//Nag³ówki Wp³at
	private JLabel lblWplata, lblDoZwrotu;
	
	//OSOBY
	static JTextField txtOsoba_1, txtOsoba_2, txtOsoba_3, txtOsoba_4, txtOsoba_5, txtOsoba_6, txtOsoba_7, txtOsoba_8, txtOsoba_9, txtOsoba_10;
	static JTextField txtWplata_1, txtWplata_2, txtWplata_3, txtWplata_4, txtWplata_5, txtWplata_6, txtWplata_7, txtWplata_8, txtWplata_9, txtWplata_10;
	static JLabel lblReszta_1, lblReszta_2, lblReszta_3, lblReszta_4, lblReszta_5, lblReszta_6, lblReszta_7, lblReszta_8, lblReszta_9, lblReszta_10;
	
	private JButton btnDodajOsobe, btnOdejmijOsobe;
	private JButton btnOblicz;
	
	//Stale/zmienne
	public static int iloscOsob = 2;
	
	
	//=========================================
	public RachunekGUI()
	{
		setResizable(true);
		setTitle("Rachunek");
		setSize(300,500);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//-----------------------------------------
		//LOOK And Feel -----------------------------
		try
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e)
		{
			e.printStackTrace();
		}
		
		//Nag³ówki
		//--------------------------------------------
		
		lblDoZaplaty = new JLabel("Do zap³aty");
		lblDoZaplaty.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoZaplaty.setBounds(10, 10, 60, 15);
		getContentPane().add(lblDoZaplaty);
		
		txtDoZaplaty = new JTextField("0.0");
		txtDoZaplaty.setHorizontalAlignment(SwingConstants.CENTER);
		txtDoZaplaty.setBounds(10, 36, 59, 35);
		getContentPane().add(txtDoZaplaty);
		txtDoZaplaty.setColumns(10);
		//txtDoZaplaty.addVetoableChangeListener(listener);
		txtDoZaplaty.addKeyListener(VK_ENTER);
		
		//
		lblSkladka = new JLabel("Sk³adka");
		lblSkladka.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkladka.setBounds(95, 10, 46, 14);
		getContentPane().add(lblSkladka);
		
		lblSkladka_kwota = new JLabel("0.0");
		lblSkladka_kwota.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkladka_kwota.setBounds(95, 46, 46, 14);
		getContentPane().add(lblSkladka_kwota);
		
		//
		lblSuma = new JLabel("Suma");
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setBounds(175, 10, 45, 15);
		getContentPane().add(lblSuma);
		
		lblSuma_1 = new JLabel("0.0");
		lblSuma_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma_1.setBounds(175, 46, 45, 15);
		getContentPane().add(lblSuma_1);
		
		//
		lblZwrot = new JLabel("Reszta");
		lblZwrot.setHorizontalAlignment(SwingConstants.CENTER);
		lblZwrot.setBounds(230, 10, 45, 15);
		getContentPane().add(lblZwrot);
				
		lblZwrot_1 = new JLabel("0.0");
		lblZwrot_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblZwrot_1.setBounds(230, 45, 45, 15);
		getContentPane().add(lblZwrot_1);
		
		//Osoby Nag³ówek
		//------------------------------------------------------
		lblWplata = new JLabel("Wp³ata");
		lblWplata.setHorizontalAlignment(SwingConstants.CENTER);
		lblWplata.setBounds(118, 85, 45, 15);
		getContentPane().add(lblWplata);
		
		lblDoZwrotu = new JLabel("Reszta");
		lblDoZwrotu.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoZwrotu.setBounds(200, 85, 60, 15);
		getContentPane().add(lblDoZwrotu);

		//Osoby
		//------------------------------------------------------
		txtOsoba_1 = new JTextField();
		txtOsoba_1.setText("Osoba 1");
		txtOsoba_1.setBounds(10, 110, 85, 25);
		getContentPane().add(txtOsoba_1);
		txtOsoba_1.setColumns(10);
		
		txtWplata_1 = new JTextField();
		txtWplata_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_1.setText("0.0");
		txtWplata_1.setBounds(110, 110, 60, 25);
		getContentPane().add(txtWplata_1);
		txtWplata_1.setColumns(10);
		
		lblReszta_1 = new JLabel("0.0");
		lblReszta_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_1.setBounds(210, 115, 45, 15);
		getContentPane().add(lblReszta_1);
		
		
		txtOsoba_2 = new JTextField();
		txtOsoba_2.setText("Osoba 2");
		txtOsoba_2.setColumns(10);
		txtOsoba_2.setBounds(10, 140, 85, 25);
		getContentPane().add(txtOsoba_2);
		
		txtWplata_2 = new JTextField();
		txtWplata_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_2.setText("0.0");
		txtWplata_2.setColumns(10);
		txtWplata_2.setBounds(110, 140, 60, 25);
		getContentPane().add(txtWplata_2);
		
		lblReszta_2 = new JLabel("0.0");
		lblReszta_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_2.setBounds(210, 145, 45, 15);
		getContentPane().add(lblReszta_2);
		
		
		txtOsoba_3 = new JTextField();
		txtOsoba_3.setText("Osoba 3");
		txtOsoba_3.setColumns(10);
		txtOsoba_3.setBounds(10, 170, 85, 25);
		getContentPane().add(txtOsoba_3);
		txtOsoba_3.setVisible(false);
		
		txtWplata_3 = new JTextField();
		txtWplata_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_3.setText("0.0");
		txtWplata_3.setColumns(10);
		txtWplata_3.setBounds(110, 170, 60, 25);
		getContentPane().add(txtWplata_3);
		txtWplata_3.setVisible(false);
		
		lblReszta_3 = new JLabel("0.0");
		lblReszta_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_3.setBounds(210, 175, 45, 15);
		getContentPane().add(lblReszta_3);
		lblReszta_3.setVisible(false);
		

		txtOsoba_4 = new JTextField();
		txtOsoba_4.setText("Osoba 4");
		txtOsoba_4.setColumns(10);
		txtOsoba_4.setBounds(10, 200, 85, 25);
		getContentPane().add(txtOsoba_4);
		txtOsoba_4.setVisible(false);
		
		txtWplata_4 = new JTextField();
		txtWplata_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_4.setText("0.0");
		txtWplata_4.setColumns(10);
		txtWplata_4.setBounds(110, 200, 60, 25);
		getContentPane().add(txtWplata_4);
		txtWplata_4.setVisible(false);
		
		lblReszta_4 = new JLabel("0.0");
		lblReszta_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_4.setBounds(210, 205, 45, 15);
		getContentPane().add(lblReszta_4);
		lblReszta_4.setVisible(false);
		

		txtOsoba_5 = new JTextField();
		txtOsoba_5.setText("Osoba 5");
		txtOsoba_5.setColumns(10);
		txtOsoba_5.setBounds(10, 230, 85, 25);
		getContentPane().add(txtOsoba_5);
		txtOsoba_5.setVisible(false);
		
		txtWplata_5 = new JTextField();
		txtWplata_5.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_5.setText("0.0");
		txtWplata_5.setColumns(10);
		txtWplata_5.setBounds(110, 230, 60, 25);
		getContentPane().add(txtWplata_5);
		txtWplata_5.setVisible(false);
		
		lblReszta_5 = new JLabel("0.0");
		lblReszta_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_5.setBounds(210, 235, 45, 15);
		getContentPane().add(lblReszta_5);
		lblReszta_5.setVisible(false);
		
		
		txtOsoba_6 = new JTextField();
		txtOsoba_6.setText("Osoba 6");
		txtOsoba_6.setColumns(10);
		txtOsoba_6.setBounds(10, 260, 85, 25);
		getContentPane().add(txtOsoba_6);
		txtOsoba_6.setVisible(false);
		
		txtWplata_6 = new JTextField();
		txtWplata_6.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_6.setText("0.0");
		txtWplata_6.setColumns(10);
		txtWplata_6.setBounds(110, 260, 60, 25);
		getContentPane().add(txtWplata_6);
		txtWplata_6.setVisible(false);
		
		lblReszta_6 = new JLabel("0.0");
		lblReszta_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_6.setBounds(210, 265, 45, 15);
		getContentPane().add(lblReszta_6);
		lblReszta_6.setVisible(false);
		
		
		txtOsoba_7 = new JTextField();
		txtOsoba_7.setText("Osoba 7");
		txtOsoba_7.setColumns(10);
		txtOsoba_7.setBounds(10, 290, 85, 25);
		getContentPane().add(txtOsoba_7);
		txtOsoba_7.setVisible(false);
		
		txtWplata_7 = new JTextField();
		txtWplata_7.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_7.setText("0.0");
		txtWplata_7.setColumns(10);
		txtWplata_7.setBounds(110, 290, 60, 25);
		getContentPane().add(txtWplata_7);
		txtWplata_7.setVisible(false);
		
		lblReszta_7 = new JLabel("0.0");
		lblReszta_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_7.setBounds(210, 295, 45, 15);
		getContentPane().add(lblReszta_7);
		lblReszta_7.setVisible(false);
		
		
		txtOsoba_8 = new JTextField();
		txtOsoba_8.setText("Osoba 8");
		txtOsoba_8.setColumns(10);
		txtOsoba_8.setBounds(10, 320, 85, 25);
		getContentPane().add(txtOsoba_8);
		txtOsoba_8.setVisible(false);
		
		txtWplata_8 = new JTextField();
		txtWplata_8.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_8.setText("0.0");
		txtWplata_8.setColumns(10);
		txtWplata_8.setBounds(110, 320, 60, 25);
		getContentPane().add(txtWplata_8);
		txtWplata_8.setVisible(false);
		
		lblReszta_8 = new JLabel("0.0");
		lblReszta_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_8.setBounds(210, 325, 45, 15);
		getContentPane().add(lblReszta_8);
		lblReszta_8.setVisible(false);
		
		
		txtOsoba_9 = new JTextField();
		txtOsoba_9.setText("Osoba 9");
		txtOsoba_9.setColumns(10);
		txtOsoba_9.setBounds(10, 350, 85, 25);
		getContentPane().add(txtOsoba_9);
		txtOsoba_9.setVisible(false);
		
		txtWplata_9 = new JTextField();
		txtWplata_9.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_9.setText("0.0");
		txtWplata_9.setColumns(10);
		txtWplata_9.setBounds(110, 350, 60, 25);
		getContentPane().add(txtWplata_9);
		txtWplata_9.setVisible(false);
		
		lblReszta_9 = new JLabel("0.0");
		lblReszta_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_9.setBounds(210, 355, 45, 15);
		getContentPane().add(lblReszta_9);
		lblReszta_9.setVisible(false);
		
		
		txtOsoba_10 = new JTextField();
		txtOsoba_10.setText("Osoba 10");
		txtOsoba_10.setColumns(10);
		txtOsoba_10.setBounds(10, 380, 85, 25);
		getContentPane().add(txtOsoba_10);
		txtOsoba_10.setVisible(false);
		
		txtWplata_10 = new JTextField();
		txtWplata_10.setHorizontalAlignment(SwingConstants.CENTER);
		txtWplata_10.setText("0.0");
		txtWplata_10.setColumns(10);
		txtWplata_10.setBounds(110, 380, 60, 25);
		getContentPane().add(txtWplata_10);
		txtWplata_10.setVisible(false);
		
		lblReszta_10 = new JLabel("0.0");
		lblReszta_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblReszta_10.setBounds(210, 385, 45, 15);
		getContentPane().add(lblReszta_10);
		lblReszta_10.setVisible(false);
		
		
		btnDodajOsobe = new JButton("+");
		btnDodajOsobe.setBounds(10, 175, 40, 35);
		getContentPane().add(btnDodajOsobe);
		btnDodajOsobe.addActionListener(this);
		
		btnOdejmijOsobe = new JButton("-");
		btnOdejmijOsobe.setBounds(50, 205, 40, 35);
		getContentPane().add(btnOdejmijOsobe);
		btnOdejmijOsobe.addActionListener(this);
		btnOdejmijOsobe.setVisible(false);
		
		btnOblicz = new JButton("Oblicz");
		btnOblicz.setBounds(10, 80, 90, 25);
		getContentPane().add(btnOblicz);
		btnOblicz.addActionListener(this);
		
		//Copyright
		JLabel lblCopyright = new JLabel("\u00a9 Kamil Zakrzewski, v1.0rc");
		lblCopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCopyright.setBounds(125, 435, 150, 15);
		getContentPane().add(lblCopyright);
		
		
		
	}
	
	private void wykonajObliczenia()
	{
				
		
		Obliczenia.oblicz();
		Rachunek.konsola();
	}
	
	private void dodajOsobe()
	{
		iloscOsob++;
		
		//Math.round(Rachunek.setTablica(3, iloscOsob));
		Rachunek.setTablica(3, iloscOsob);
		
		switch (iloscOsob)
		{
			case 3:
			{
				txtOsoba_3.setVisible(true);
				txtWplata_3.setVisible(true);
				lblReszta_3.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 205, 40, 35);
				btnOdejmijOsobe.setVisible(true);

			}
			break;
			
			case 4:
			{
				txtOsoba_4.setVisible(true);
				txtWplata_4.setVisible(true);
				lblReszta_4.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 235, 40, 35);
				btnOdejmijOsobe.setBounds(50, 235, 40, 35);
			}
			break;
			
			case 5:
			{
				txtOsoba_5.setVisible(true);
				txtWplata_5.setVisible(true);
				lblReszta_5.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 265, 40, 35);
				btnOdejmijOsobe.setBounds(50, 265, 40, 35);
			}
			break;
			
			case 6:
			{
				txtOsoba_6.setVisible(true);
				txtWplata_6.setVisible(true);
				lblReszta_6.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 295, 40, 35);
				btnOdejmijOsobe.setBounds(50, 295, 40, 35);
			}
			break;
			
			case 7:
			{
				txtOsoba_7.setVisible(true);
				txtWplata_7.setVisible(true);
				lblReszta_7.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 325, 40, 35);
				btnOdejmijOsobe.setBounds(50, 325, 40, 35);
			}
			break;
			
			case 8:
			{
				txtOsoba_8.setVisible(true);
				txtWplata_8.setVisible(true);
				lblReszta_8.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 355, 40, 35);
				btnOdejmijOsobe.setBounds(50, 355, 40, 35);
			}
			break;
			
			case 9:
			{
				txtOsoba_9.setVisible(true);
				txtWplata_9.setVisible(true);
				lblReszta_9.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 385, 40, 35);
				btnOdejmijOsobe.setBounds(50, 385, 40, 35);
			}
			break;
			
			case 10:
			{
				txtOsoba_10.setVisible(true);
				txtWplata_10.setVisible(true);
				lblReszta_10.setVisible(true);
				
				btnDodajOsobe.setBounds(10, 415, 40, 35);
				btnDodajOsobe.setVisible(false);
				btnOdejmijOsobe.setBounds(50, 415, 40, 35);
			}
			break;
		}
	}
	
	private void odejmijOsobe()
	{
		iloscOsob--;
		Rachunek.setTablica(3, iloscOsob);
		
		switch (iloscOsob)
		{
			case 2:
			{
				txtOsoba_3.setVisible(false);
				txtWplata_3.setVisible(false);
				lblReszta_3.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 175, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setVisible(false);
			}
			break;
			
			case 3:
			{
				txtOsoba_4.setVisible(false);
				txtWplata_4.setVisible(false);
				lblReszta_4.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 205, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 205, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;
			
			case 4:
			{
				txtOsoba_5.setVisible(false);
				txtWplata_5.setVisible(false);
				lblReszta_5.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 235, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 235, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;
			
			case 5:
			{
				txtOsoba_6.setVisible(false);
				txtWplata_6.setVisible(false);
				lblReszta_6.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 265, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 265, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;
			
			case 6:
			{
				txtOsoba_7.setVisible(false);
				txtWplata_7.setVisible(false);
				lblReszta_7.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 295, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 295, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;
			
			case 7:
			{
				txtOsoba_8.setVisible(false);
				txtWplata_8.setVisible(false);
				lblReszta_8.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 325, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 325, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;
			
			case 8:
			{
				txtOsoba_9.setVisible(false);
				txtWplata_9.setVisible(false);
				lblReszta_9.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 355, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 355, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;
			
			case 9:
			{
				txtOsoba_10.setVisible(false);
				txtWplata_10.setVisible(false);
				lblReszta_10.setVisible(false);
				
				btnDodajOsobe.setBounds(10, 385, 40, 35);
				btnDodajOsobe.setVisible(true);
				btnOdejmijOsobe.setBounds(50, 385, 40, 35);
				btnOdejmijOsobe.setVisible(true);
			}
			break;

		}
	}
	
	//==============================================
	//==============================================
	public static void main(String[] args)
	{
		//Rachunek dzialania = new Rachunek();
		Rachunek.inicjalizacjaListy();
		Rachunek.konsola();
		
		RachunekGUI app = new RachunekGUI();
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnDodajOsobe)
		{
			dodajOsobe();
			
			Rachunek.konsola();
		}
		
		if(e.getSource()==btnOdejmijOsobe)
		{
			odejmijOsobe();
			
			Rachunek.konsola();
		}
		
		if(e.getSource()==btnOblicz)
		{
			wykonajObliczenia();
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getSource()==VK_ENTER)
		{
			wykonajObliczenia();
			JOptionPane.showMessageDialog(null, "Enter dzia³a!");
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent e)
	{
		JOptionPane.showMessageDialog(null, "ChangeListener dzia³a!");
		wykonajObliczenia();
		
	}
}
