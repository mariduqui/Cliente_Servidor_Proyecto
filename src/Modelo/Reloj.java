
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author alede
 */
public class Reloj {

    public Reloj() {
    }
    
    public void reloj(JLabel lbl){
        Timer timer = new Timer();
        
        
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm aa");
                lbl.setText(dateFormat.format(new Date()).toString());
            }  
        };
        
        timer.schedule(tarea, 0, 1000);

    }
}
