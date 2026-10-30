package gt.edu.umes.proy.calculo;


public class LogicaDelNegocio{
	public boolean validarParametros(String[] valores){
    	
	//Valida que sean cinco parametros y que sean numeros enteros.
		
		if (valores == null || valores.length != 5){
			
			System.out.println("Deben ingresarse 5 parámetros.");
			return false;
        }
		
		for (String i : valores){
			
			try {
				Integer.parseInt(i);
			}
			catch (NumberFormatException e){
				
				System.out.println("Los parámetros ingresados deben ser números enteros.");
				return false;
			}
		}
		return true;
	}
	
	public long calcularSegundos(int meses, int semanas, int dias, int horas, int minutos){
	//Recibe parametros, calcula y devuelve total en segundos.
		
		long total = (meses*30) + (semanas*7) + dias; //transforma meses y semanas a dias y suma total de dias.
		total = (total*24) + horas; //transforma dias a horas y suma total de horas.
		total = (total*60) + minutos; //transforma horas a minutos y suma total de minutos.
		total = total*60; //transforma los minutos a segundos.
		
		return total;
	}
}