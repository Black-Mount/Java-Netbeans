package ALARMA;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class Temporizador1 {

    static Timer timer;

    public Temporizador1(int segundos) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new Recordatorio(), segundos, (10 * 1000));//Programa la tarea
    }

    class Recordatorio extends TimerTask {

        public void run() {
            System.out.println("YA ES LA HORA. \n DESACTIVE LA ALARMA ESCRIBIENDO 0");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿En cuantos días quiere que se notifique la alarma? ");
        String dias = sc.next();

        int h1add = Integer.parseInt(dias);

        System.out.println("A que hora quiere su alarma (24h. Formato 13:45:10): ");
        String hora_Alarma = sc.next();

        String[] h_al = hora_Alarma.split("\\:");
        int h2 = Integer.parseInt(h_al[0]);
        int m2 = Integer.parseInt(h_al[1]);
        int s2 = Integer.parseInt(h_al[2]);

        Date fecha = new Date();

        int h1 = fecha.getHours();
        int m1 = fecha.getMinutes();
        int s1 = fecha.getSeconds();

        int hleft = (h2 + (h1add * 24)) - h1;
        if (hleft >= 1) {
            hleft += -1;
        }
        if (hleft < 0) {
            hleft += 24;
        }

        int mleft = m2 - m1;
        if (mleft >= 1) {
            mleft += -1;
        }
        if (mleft < 0) {
            mleft += 60;
        }

        int sleft = s2 - s1;
        if (sleft < 0) {
            sleft += 60;
        }

        int te = ((hleft * 3600) + (mleft * 60) + sleft) * 1000;

        System.out.println("La alarma sonara en " + hleft + " horas, " + mleft + " minutos y " + sleft + " segundos.");

        new Temporizador1(te);
        char apagar = sc.next().charAt(0);
        if (apagar == '0') {
            timer.cancel();
        }
    }
}