
public class Obliczenia
{
	
	private static void obliczReszteIKwotePodzialu()
	{
		// Tab [2] - reszta, która zostaje (tab[1] - tab[0])
		float reszta = Math.round((Rachunek.getTablica(1)-Rachunek.getTablica(0))*100);
		reszta = reszta/100;
		Rachunek.setTablica(2, (reszta));
		RachunekGUI.lblZwrot_1.setText(String.valueOf(reszta));
		
		// Tab [4] - Kwota na rachunku podzielona po równo (tab[0]/tab[3])
		float podzial = Math.round((Rachunek.getTablica(0)/Rachunek.getTablica(3))*100);
		podzial=podzial/100;
		Rachunek.setTablica(4, podzial);
		
		//Wyœwietlenie kwoty do podzia³u
		RachunekGUI.lblSkladka_kwota.setText(String.valueOf(Rachunek.getTablica(4)));
	}
	
	public static void oblicz()
	{
		//Tab [0] - Kwota na rachunku
		Rachunek.setTablica(0, Float.parseFloat(RachunekGUI.txtDoZaplaty.getText()));
		
		
		switch (RachunekGUI.iloscOsob)
		{
			case 2:
			{
				
				
				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				//(Rachunek.getRachunek(1))
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				

			}
			break;

			case 3:
			{
				
				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				//RachunekGUI.lblReszta_1.setText(String.valueOf(Rachunek.getRachunek(1)));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
			}
			break;
			
			case 4:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
						
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
			}
			break;
			
			case 5:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
				// Osoba5
				Rachunek.setRachunek(8, Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				Rachunek.setRachunek(9, Float.parseFloat(RachunekGUI.txtWplata_5.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_5.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(9)*100))/100));
				
			}
			break;
			
			case 6:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_5.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_6.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
				
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
				// Osoba5
				Rachunek.setRachunek(8, Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				Rachunek.setRachunek(9, Float.parseFloat(RachunekGUI.txtWplata_5.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_5.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(9)*100))/100));
				
				// Osoba6
				Rachunek.setRachunek(10, Float.parseFloat(RachunekGUI.txtWplata_6.getText()));
				Rachunek.setRachunek(11, Float.parseFloat(RachunekGUI.txtWplata_6.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_6.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(11)*100))/100));
				
			}
			break;
			
			case 7:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_5.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_6.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_7.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
				// Osoba5
				Rachunek.setRachunek(8, Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				Rachunek.setRachunek(9, Float.parseFloat(RachunekGUI.txtWplata_5.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_5.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(9)*100))/100));
				
				// Osoba6
				Rachunek.setRachunek(10, Float.parseFloat(RachunekGUI.txtWplata_6.getText()));
				Rachunek.setRachunek(11, Float.parseFloat(RachunekGUI.txtWplata_6.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_6.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(11)*100))/100));
				
				// Osoba7
				Rachunek.setRachunek(12, Float.parseFloat(RachunekGUI.txtWplata_7.getText()));
				Rachunek.setRachunek(13, Float.parseFloat(RachunekGUI.txtWplata_7.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_7.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(13)*100))/100));
				
			}
			break;
			
			case 8:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_5.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_6.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_7.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_8.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
				// Osoba5
				Rachunek.setRachunek(8, Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				Rachunek.setRachunek(9, Float.parseFloat(RachunekGUI.txtWplata_5.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_5.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(9)*100))/100));
				
				// Osoba6
				Rachunek.setRachunek(10, Float.parseFloat(RachunekGUI.txtWplata_6.getText()));
				Rachunek.setRachunek(11, Float.parseFloat(RachunekGUI.txtWplata_6.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_6.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(11)*100))/100));
				
				// Osoba7
				Rachunek.setRachunek(12, Float.parseFloat(RachunekGUI.txtWplata_7.getText()));
				Rachunek.setRachunek(13, Float.parseFloat(RachunekGUI.txtWplata_7.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_7.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(13)*100))/100));
				
				// Osoba8
				Rachunek.setRachunek(14, Float.parseFloat(RachunekGUI.txtWplata_8.getText()));
				Rachunek.setRachunek(15, Float.parseFloat(RachunekGUI.txtWplata_8.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_8.setText(String.valueOf(Rachunek.getRachunek(15)));
				
			}
			break;
			
			case 9:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_5.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_6.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_7.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_8.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_9.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
				// Osoba5
				Rachunek.setRachunek(8, Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				Rachunek.setRachunek(9, Float.parseFloat(RachunekGUI.txtWplata_5.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_5.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(9)*100))/100));
				
				// Osoba6
				Rachunek.setRachunek(10, Float.parseFloat(RachunekGUI.txtWplata_6.getText()));
				Rachunek.setRachunek(11, Float.parseFloat(RachunekGUI.txtWplata_6.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_6.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(11)*100))/100));
				
				// Osoba7
				Rachunek.setRachunek(12, Float.parseFloat(RachunekGUI.txtWplata_7.getText()));
				Rachunek.setRachunek(13, Float.parseFloat(RachunekGUI.txtWplata_7.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_7.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(13)*100))/100));
				
				// Osoba8
				Rachunek.setRachunek(14, Float.parseFloat(RachunekGUI.txtWplata_8.getText()));
				Rachunek.setRachunek(15, Float.parseFloat(RachunekGUI.txtWplata_8.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_8.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(15)*100))/100));
				
				// Osoba9
				Rachunek.setRachunek(16, Float.parseFloat(RachunekGUI.txtWplata_9.getText()));
				Rachunek.setRachunek(17, Float.parseFloat(RachunekGUI.txtWplata_9.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_9.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(17)*100))/100));;
				
			}
			break;
			
			case 10:
			{

				//Tab [1] - Suma wp³aty
				float sumaWplat = (Float.parseFloat(RachunekGUI.txtWplata_1.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_2.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_3.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_4.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_5.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_6.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_7.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_8.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_9.getText())
						+Float.parseFloat(RachunekGUI.txtWplata_10.getText()));
				
				Rachunek.setTablica(1, sumaWplat);
				RachunekGUI.lblSuma_1.setText(String.valueOf(sumaWplat));
					
				obliczReszteIKwotePodzialu();
			
				// Tablica sk³adki
				// Osoba1
				Rachunek.setRachunek(0, Float.parseFloat(RachunekGUI.txtWplata_1.getText()));
				Rachunek.setRachunek(1, Float.parseFloat(RachunekGUI.txtWplata_1.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_1.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(1)*100))/100));
				
				// Osoba2
				Rachunek.setRachunek(2, Float.parseFloat(RachunekGUI.txtWplata_2.getText()));
				Rachunek.setRachunek(3, Float.parseFloat(RachunekGUI.txtWplata_2.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_2.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(3)*100))/100));
				
				// Osoba3
				Rachunek.setRachunek(4, Float.parseFloat(RachunekGUI.txtWplata_3.getText()));
				Rachunek.setRachunek(5, Float.parseFloat(RachunekGUI.txtWplata_3.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_3.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(5)*100))/100));
				
				// Osoba4
				Rachunek.setRachunek(6, Float.parseFloat(RachunekGUI.txtWplata_4.getText()));
				Rachunek.setRachunek(7, Float.parseFloat(RachunekGUI.txtWplata_4.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_4.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(7)*100))/100));
				
				// Osoba5
				Rachunek.setRachunek(8, Float.parseFloat(RachunekGUI.txtWplata_5.getText()));
				Rachunek.setRachunek(9, Float.parseFloat(RachunekGUI.txtWplata_5.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_5.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(9)*100))/100));
				
				// Osoba6
				Rachunek.setRachunek(10, Float.parseFloat(RachunekGUI.txtWplata_6.getText()));
				Rachunek.setRachunek(11, Float.parseFloat(RachunekGUI.txtWplata_6.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_6.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(11)*100))/100));
				
				// Osoba7
				Rachunek.setRachunek(12, Float.parseFloat(RachunekGUI.txtWplata_7.getText()));
				Rachunek.setRachunek(13, Float.parseFloat(RachunekGUI.txtWplata_7.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_7.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(13)*100))/100));
				
				// Osoba8
				Rachunek.setRachunek(14, Float.parseFloat(RachunekGUI.txtWplata_8.getText()));
				Rachunek.setRachunek(15, Float.parseFloat(RachunekGUI.txtWplata_8.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_8.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(15)*100))/100));
				
				// Osoba9
				Rachunek.setRachunek(16, Float.parseFloat(RachunekGUI.txtWplata_9.getText()));
				Rachunek.setRachunek(17, Float.parseFloat(RachunekGUI.txtWplata_9.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_9.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(17)*100))/100));
				
				// Osoba10
				Rachunek.setRachunek(18, Float.parseFloat(RachunekGUI.txtWplata_10.getText()));
				Rachunek.setRachunek(19, Float.parseFloat(RachunekGUI.txtWplata_10.getText())-Rachunek.getTablica(4));
				RachunekGUI.lblReszta_10.setText(String.valueOf((double)(Math.round(Rachunek.getRachunek(19)*100))/100));
				
			}
			break;
		}
	}
}
