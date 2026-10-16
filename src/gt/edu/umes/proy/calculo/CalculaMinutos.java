package gt.edu.umes.proy.calculo;

public class CalculaMinutos{

    public static void main(String[] valores){
        LogicaDelNegocio ldn = new LogicaDelNegocio();

        if (!ldn.validarParametros(valores))
            return;

        int meses = Integer.parseInt(valores[0]);
        int semanas = Integer.parseInt(valores[1]);
        int dias = Integer.parseInt(valores[2]);
        int horas = Integer.parseInt(valores[3]);
        int minutos = Integer.parseInt(valores[4]);
        
        long totalSegundos = ldn.calcularSegundos(meses, semanas, dias, horas, minutos);
        System.out.println("Total en segundos: " + totalSegundos);
    }
}