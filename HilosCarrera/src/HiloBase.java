
import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloBase extends Thread{

    
    public HiloBase(String name) {
        this.setName(name);
    }
    
    public void run(){
        
        
    
        if(getName().equals("Ferrari")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro1.setLocation(GUI.Carro1.getLocation().x+Carrera.Carros[0].getAvance(),GUI.Carro1.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[0].getVelocidad());
                    
                    if(GUI.Carro1.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[0].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[0].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }
            
            GUI.Carro1.setLocation(GUI.Carro1.getLocation().x,GUI.Carro1.getLocation().y);
             
             this.stop();
        }
              
        
        if(getName().equals("Maserati")){
            long ti=System.currentTimeMillis();
for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro2.setLocation(GUI.Carro2.getLocation().x+Carrera.Carros[1].getAvance(),GUI.Carro2.getLocation().y);
                   
                    
                    
                    sleep(Carrera.Carros[1].getVelocidad());
                    
                    if(GUI.Carro2.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[1].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[1].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }
             GUI.Carro2.setLocation(GUI.Carro2.getLocation().x,GUI.Carro2.getLocation().y);        
        this.stop();
        }
        
        if(getName().equals("Lotus")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro3.setLocation(GUI.Carro3.getLocation().x+Carrera.Carros[2].getAvance(),GUI.Carro3.getLocation().y);
                   
                    
                    
                    sleep(Carrera.Carros[2].getVelocidad());
                    
                    if(GUI.Carro3.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[2].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[2].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }
             GUI.Carro3.setLocation(GUI.Carro3.getLocation().x,GUI.Carro3.getLocation().y);                
        this.stop();
        }
        
        if(getName().equals("Ford")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro4.setLocation(GUI.Carro4.getLocation().x+Carrera.Carros[3].getAvance(),GUI.Carro4.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[3].getVelocidad());
                    
                    if(GUI.Carro4.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[3].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[3].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }
             GUI.Carro4.setLocation(GUI.Carro4.getLocation().x,GUI.Carro4.getLocation().y);                
        this.stop();
        }
        
    }

    
   

        
    }