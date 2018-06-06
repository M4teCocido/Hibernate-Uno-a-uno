package vista;

import java.time.LocalTime;

public class TestLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime duracion = null;

		LocalTime horaFin = LocalTime.of(12, 30, 45);
		LocalTime horaInicio = LocalTime.of(1, 1, 1);
				
		int inicioHora = horaInicio.getHour();
		int inicioMin = horaInicio.getMinute();
		int inicioSec = horaInicio.getSecond();
		
		int finHora = horaFin.getHour();
		int finMin = horaFin.getMinute();
		int finSec = horaFin.getSecond();
		
		int duracionHora = finHora - inicioHora;
		int duracionMin = finMin - inicioMin;
		int duracionSec = finSec - inicioSec;
		
		if(duracionMin < 0) {
			duracionMin += 60;
			duracionHora -= 1;
		}
		
		if(duracionSec < 0) {
			duracionSec += 60;
			duracionMin -= 1;
		}
		
		duracion = LocalTime.of(duracionHora, duracionMin, duracionSec);
		
		System.out.println(duracion.getHour() + " Horas, " + duracion.getMinute() + " Minutos, " + duracion.getSecond() + " Segundos.");
	}

}
