package gt.edu.umes.proy.calculo;

public class CalculaMinutos{
	
	public static void main(String[] valores){
		
		LogicaDelNegocio ldn = new LogicaDelNegocio();
		
		if (!ldn.validarParametros(valores))
			return;  //si no son validos sale.
		
	//si los parametros son validos,
		
	//convierte los parametros a enteros:
		
		int meses = Integer.parseInt(valores[0]);
		
		int semanas = Integer.parseInt(valores[1]);
		
		int dias = Integer.parseInt(valores[2]);
		
		int horas = Integer.parseInt(valores[3]);
		
		int minutos = Integer.parseInt(valores[4]);
		
	//llama a la funcion de calculo:
		
		long totalSegundos = ldn.calcularSegundos(meses, semanas, dias, horas, minutos);
		
	//devuelve el resultado:
		
		System.out.println("Total en segundos: " + totalSegundos);
	}
}