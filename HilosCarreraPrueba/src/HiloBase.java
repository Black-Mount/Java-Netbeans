
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
        
        if(getName().equals("Toyota")){
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
        if(getName().equals("Mercedes")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro5.setLocation(GUI.Carro5.getLocation().x+Carrera.Carros[4].getAvance(),GUI.Carro5.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[4].getVelocidad());
                    
                    if(GUI.Carro5.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[4].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[4].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }     
        }
            
            GUI.Carro5.setLocation(GUI.Carro5.getLocation().x,GUI.Carro5.getLocation().y);
             
             this.stop();
    }
        if(getName().equals("Porsche")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro6.setLocation(GUI.Carro6.getLocation().x+Carrera.Carros[5].getAvance(),GUI.Carro6.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[5].getVelocidad());
                    
                    if(GUI.Carro6.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[5].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[5].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }     
        }
            
            GUI.Carro6.setLocation(GUI.Carro6.getLocation().x,GUI.Carro6.getLocation().y);
             
             this.stop();
    }
        if(getName().equals("Honda")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro7.setLocation(GUI.Carro7.getLocation().x+Carrera.Carros[6].getAvance(),GUI.Carro7.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[6].getVelocidad());
                    
                    if(GUI.Carro7.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[6].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[6].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }     
        }
            
            GUI.Carro7.setLocation(GUI.Carro7.getLocation().x,GUI.Carro7.getLocation().y);
             
             this.stop();
    }
        if(getName().equals("Renault")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro8.setLocation(GUI.Carro8.getLocation().x+Carrera.Carros[7].getAvance(),GUI.Carro8.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[7].getVelocidad());
                    
                    if(GUI.Carro8.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[7].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[7].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }     
        }
            
            GUI.Carro8.setLocation(GUI.Carro8.getLocation().x,GUI.Carro8.getLocation().y);
             
             this.stop();
    }
        if(getName().equals("Bmw")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro9.setLocation(GUI.Carro9.getLocation().x+Carrera.Carros[8].getAvance(),GUI.Carro9.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[8].getVelocidad());
                    
                    if(GUI.Carro9.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[8].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[8].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }     
        }
            
            GUI.Carro9.setLocation(GUI.Carro9.getLocation().x,GUI.Carro9.getLocation().y);
             
             this.stop();
    }
        if(getName().equals("Peugeot")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    GUI.Carro10.setLocation(GUI.Carro10.getLocation().x+Carrera.Carros[9].getAvance(),GUI.Carro10.getLocation().y);
                    
                    
                    
                    sleep(Carrera.Carros[9].getVelocidad());
                    
                    if(GUI.Carro10.getLocation().x>=GUI.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        Carrera.Carros[9].setTiempo(tt);
                        GUI.txtR.append("\n"+this.getName()+":"+Carrera.Carros[9].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HiloBase.class.getName()).log(Level.SEVERE, null, ex);
                }     
        }
            
            GUI.Carro10.setLocation(GUI.Carro10.getLocation().x,GUI.Carro10.getLocation().y);
             
             this.stop();
    }
        
      
        
    }

    
   

        
    }