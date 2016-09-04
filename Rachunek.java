
//==============================================
public class Rachunek
{
	//==============================================
	public static float rachunek[] = new float[20];
	//public static ArrayList <Double> rachunek = new ArrayList<Double>(20);
	/* 
	 * 0: 1 wplacajacy - wplata
	 * 1: 1 wplacajacy - reszta
	 * 
	 * 
	 * 2: 2 wplacajacy - wplata
	 * 3: 2 wplacajacy - reszta
	 * itd.
	 */
	static float tablicaRachunek[] = new float[5]; 
	/* 0: suma na rachunku
	 * 1: suma wplat
	 * 2: reszta (1-0)
	 * 3: ilosc osob
	 * 4: podzial po rowno
	 */ 

	
	//==============================================
	public Rachunek()
	{
		
		inicjalizacjaListy();
		//konsola();
		
		
	}
//==============================================	
	
	public static void inicjalizacjaListy()
	{
//		for (int i=0; i<20; i++)
//		{
//			rachunek.add(i, 0.0);
//		}	
		
		setTablica(3, RachunekGUI.iloscOsob);
	}
	
	public static void konsola()
	{
		for (int i=0; i<rachunek.length; i++)
		{
			System.out.println("pozycja listy " + i + ": " + getRachunek(i));
		}
		System.out.println("___________");
		
		System.out.println("0: Suma na rachunku: " + tablicaRachunek[0]);
		System.out.println("1: Suma wplat: " + tablicaRachunek[1]);
		System.out.println("2: Reszta (1-0): " + tablicaRachunek[2]);
		System.out.println("3: Ilosc osob: " + tablicaRachunek[3]);
		System.out.println("4: Kwota podzia³u po równo: " + tablicaRachunek[4]);
		
		System.out.println("=====================");
		

	}
	
//==============================================
	public static float getRachunek(int pozycja)
	{
		return rachunek[pozycja];
		//return rachunek.get(pozycja);
	}
	
	public static void setRachunek(int pozycja, float wartosc)
	{
		rachunek[pozycja]= wartosc;
		//rachunek.set(pozycja, wartosc);
	}
	
//==============================================
	public static float getTablica(int pozycja)
	{
		return tablicaRachunek[pozycja];
	}
		
	public static void setTablica(int pozycja, float wartosc)
	{
		tablicaRachunek[pozycja]= wartosc;
		//return (Float) null;
	}	
	
}
