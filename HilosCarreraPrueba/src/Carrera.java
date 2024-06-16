import java.util.Random;

public class Carrera {
    
    static AutoMov[] Carros;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245,260,265,270,275,280,285};
    int[] ava={13,15,16,14,16,17,18,19,20,21};
     //Vel
        Carros[0].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[1].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[2].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[3].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[4].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[5].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[6].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[7].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[8].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[9].setVelocidad(vel[rnd.nextInt(10)]);
   
        
        
        //avances
        Carros[0].setAvance(ava[rnd.nextInt(10)]);
        Carros[1].setAvance(ava[rnd.nextInt(10)]);
        Carros[2].setAvance(ava[rnd.nextInt(10)]);
        Carros[3].setAvance(ava[rnd.nextInt(10)]);
        Carros[4].setAvance(ava[rnd.nextInt(10)]);
        Carros[5].setAvance(ava[rnd.nextInt(10)]);
        Carros[6].setAvance(ava[rnd.nextInt(10)]);
        Carros[7].setAvance(ava[rnd.nextInt(10)]);
        Carros[8].setAvance(ava[rnd.nextInt(10)]);
        Carros[9].setAvance(ava[rnd.nextInt(10)]);
    
    
    }//
    
    static public void registroAutos(){
        rnd= new Random();
        
        int[] vel={240,250,255,245,260,265,270,275,280,285};
        int[] ava={13,15,16,14,16,17,18,19,20,21};
        Carros = new AutoMov[10];
        
        Carros[0] = new AutoMov(0,0,0,0,0,"-");
        Carros[1] = new AutoMov(0,0,0,0,0,"-");
        Carros[2] = new AutoMov(0,0,0,0,0,"-");
        Carros[3] = new AutoMov(0,0,0,0,0,"-");
        Carros[4] = new AutoMov(0,0,0,0,0,"-");
        Carros[5] = new AutoMov(0,0,0,0,0,"-");
        Carros[6] = new AutoMov(0,0,0,0,0,"-");
        Carros[7] = new AutoMov(0,0,0,0,0,"-");
        Carros[8] = new AutoMov(0,0,0,0,0,"-");
        Carros[9] = new AutoMov(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        Carros[0].setCodigo(101);
        Carros[1].setCodigo(102);
        Carros[2].setCodigo(103);
        Carros[3].setCodigo(104);
        Carros[4].setCodigo(105);
        Carros[5].setCodigo(106);
        Carros[6].setCodigo(107);
        Carros[7].setCodigo(108);
        Carros[8].setCodigo(109);
        Carros[9].setCodigo(110);
        //nombres
        Carros[0].setNombre("Ferrari");
        Carros[1].setNombre("Maserati");
        Carros[2].setNombre("Lotus");
        Carros[3].setNombre("Toyota");
        Carros[4].setNombre("Mercedes");
        Carros[5].setNombre("Porsche");
        Carros[6].setNombre("Honda");
        Carros[7].setNombre("Renault");
        Carros[8].setNombre("Bmw");
        Carros[9].setNombre("Peugeot");
        //CoordX
        Carros[0].setCoorX(GUI.Carro1.getLocation().x);
        Carros[1].setCoorX(GUI.Carro2.getLocation().x);
        Carros[2].setCoorX(GUI.Carro3.getLocation().x);
        Carros[3].setCoorX(GUI.Carro4.getLocation().x);
        Carros[4].setCoorX(GUI.Carro5.getLocation().x);
        Carros[5].setCoorX(GUI.Carro6.getLocation().x);
        Carros[6].setCoorX(GUI.Carro7.getLocation().x);
        Carros[7].setCoorX(GUI.Carro8.getLocation().x);
        Carros[8].setCoorX(GUI.Carro9.getLocation().x);
        Carros[9].setCoorX(GUI.Carro10.getLocation().x);
        //CoordX
        Carros[0].setCoorY(GUI.Carro1.getLocation().y);
        Carros[1].setCoorY(GUI.Carro2.getLocation().y);
        Carros[2].setCoorY(GUI.Carro3.getLocation().y);
        Carros[3].setCoorY(GUI.Carro4.getLocation().y);
        Carros[4].setCoorY(GUI.Carro5.getLocation().y);
        Carros[5].setCoorY(GUI.Carro6.getLocation().y);
        Carros[6].setCoorY(GUI.Carro7.getLocation().y);
        Carros[7].setCoorY(GUI.Carro8.getLocation().y);
        Carros[8].setCoorY(GUI.Carro9.getLocation().y);
        Carros[9].setCoorY(GUI.Carro10.getLocation().y);
        //Vel
        Carros[0].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[1].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[2].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[3].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[4].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[5].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[6].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[7].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[8].setVelocidad(vel[rnd.nextInt(10)]);
        Carros[9].setVelocidad(vel[rnd.nextInt(10)]);
        
        //avances
        Carros[0].setAvance(ava[rnd.nextInt(10)]);
        Carros[1].setAvance(ava[rnd.nextInt(10)]);
        Carros[2].setAvance(ava[rnd.nextInt(10)]);
        Carros[3].setAvance(ava[rnd.nextInt(10)]);
        Carros[4].setAvance(ava[rnd.nextInt(10)]);
        Carros[5].setAvance(ava[rnd.nextInt(10)]);
        Carros[6].setAvance(ava[rnd.nextInt(10)]);
        Carros[7].setAvance(ava[rnd.nextInt(10)]);
        Carros[8].setAvance(ava[rnd.nextInt(10)]);
        Carros[9].setAvance(ava[rnd.nextInt(10)]);
        //
        Carros[0].setTiempo(0);
        Carros[1].setTiempo(0);
        Carros[2].setTiempo(0);
        Carros[3].setTiempo(0);
        Carros[4].setTiempo(0);
        Carros[5].setTiempo(0);
        Carros[6].setTiempo(0);
        Carros[7].setTiempo(0);
        Carros[8].setTiempo(0);
        Carros[9].setTiempo(0);
        
        //
    }//
    
    
    static void iniciar(){
        
        HiloBase h1= new HiloBase(Carros[0].getNombre());
        h1.start();
        
        HiloBase h2= new HiloBase(Carros[1].getNombre());
        h2.start();
        
        HiloBase h3= new HiloBase(Carros[2].getNombre());
        h3.start();
        
        HiloBase h4= new HiloBase(Carros[3].getNombre());
        h4.start();
        
         HiloBase h5= new HiloBase(Carros[4].getNombre());
        h5.start();
        
         HiloBase h6= new HiloBase(Carros[5].getNombre());
        h6.start();
        
         HiloBase h7= new HiloBase(Carros[6].getNombre());
        h7.start();
        
         HiloBase h8= new HiloBase(Carros[7].getNombre());
        h8.start();
        
         HiloBase h9= new HiloBase(Carros[8].getNombre());
        h9.start();
        
         HiloBase h10= new HiloBase(Carros[9].getNombre());
        h10.start();
    }//iniciar           
            
    
    
    }//class
