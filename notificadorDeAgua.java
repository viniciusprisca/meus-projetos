import java.util.Timer;
import java.util.Timer;
import java.util.TimerTask;

public class NotificadorDeAgua {
    public static void main(String[] args) {
        int intervaloEmMinutos = 120;
        long intervaloEmMillis = intervaloEmMinutos * 60L * 1000L;

        Timer timer = new Timer();

        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hora de beber água! 💧");
            }
        };

        timer.scheduleAtFixedRate(tarefa, 0, intervaloEmMillis);
    }
}
