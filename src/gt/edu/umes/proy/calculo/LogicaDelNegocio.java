package gt.edu.umes.proy.calculo;


//Valida que sean cinco parametros y que sean numeros enteros.
public class LogicaDelNegocio{

    public boolean validarParametros(String[] valores){
        if (valores == null || valores.length != 5){ //no de parametros nulo o distinto de cinco.
            System.out.println("Deben ingresarse 5 parámetros.");
            return false;
        }

        for (String i : valores) {
            try {
                Integer.parseInt(i);
            } catch (NumberFormatException e) { //dato no numerico o no entero
                System.out.println("Todos los parámetros ingresados deben ser números enteros.");
                return false;
            }
        }
        return true;
    }

//Recibe parametros, calcula y devuelve total en segundos.
    public long calcularSegundos(int meses, int semanas, int dias, int horas, int minutos){
    	long total = 0;
    	
        total = (meses*30) + (semanas*7) + dias; //transforma meses y semanas a dias y suma total de dias.
        total = (total*24) + horas; //transforma dias a horas y suma total de horas.
        total = (total*60) + minutos; //transforma horas a minutos y suma total de minutos.
        total = total*60; //transforma los minutos a segundos.

        return total;
    }
}