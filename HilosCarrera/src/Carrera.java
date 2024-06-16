import java.util.Random;

public class Carrera {
    
    static AutoMov[] Carros;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     //Vel
        Carros[0].setVelocidad(vel[rnd.nextInt(4)]);
        Carros[1].setVelocidad(vel[rnd.nextInt(4)]);
        Carros[2].setVelocidad(vel[rnd.nextInt(4)]);
        Carros[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        Carros[0].setAvance(ava[rnd.nextInt(4)]);
        Carros[1].setAvance(ava[rnd.nextInt(4)]);
        Carros[2].setAvance(ava[rnd.nextInt(4)]);
        Carros[3].setAvance(ava[rnd.nextInt(4)]);
    
    }//
    
    static public void registroAutos(){
        rnd= new Random();
        
        int[] vel={240,250,255,245};
        int[] ava={13,15,16,14};
        Carros = new AutoMov[4];
        
        Carros[0] = new AutoMov(0,0,0,0,0,"-");
        Carros[1] = new AutoMov(0,0,0,0,0,"-");
        Carros[2] = new AutoMov(0,0,0,0,0,"-");
        Carros[3] = new AutoMov(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        Carros[0].setCodigo(101);
        Carros[1].setCodigo(102);
        Carros[2].setCodigo(103);
        Carros[3].setCodigo(104);
        //nombres
        Carros[0].setNombre("Ferrari");
        Carros[1].setNombre("Maserati");
        Carros[2].setNombre("Lotus");
        Carros[3].setNombre("Ford");
        //CoordX
        Carros[0].setCoorX(GUI.Carro1.getLocation().x);
        Carros[1].setCoorX(GUI.Carro2.getLocation().x);
        Carros[2].setCoorX(GUI.Carro3.getLocation().x);
        Carros[3].setCoorX(GUI.Carro4.getLocation().x);
        //CoordX
        Carros[0].setCoorY(GUI.Carro1.getLocation().y);
        Carros[1].setCoorY(GUI.Carro2.getLocation().y);
        Carros[2].setCoorY(GUI.Carro3.getLocation().y);
        Carros[3].setCoorY(GUI.Carro4.getLocation().y);
        //Vel
        Carros[0].setVelocidad(vel[rnd.nextInt(4)]);
        Carros[1].setVelocidad(vel[rnd.nextInt(4)]);
        Carros[2].setVelocidad(vel[rnd.nextInt(4)]);
        Carros[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        Carros[0].setAvance(ava[rnd.nextInt(4)]);
        Carros[1].setAvance(ava[rnd.nextInt(4)]);
        Carros[2].setAvance(ava[rnd.nextInt(4)]);
        Carros[3].setAvance(ava[rnd.nextInt(4)]);
        //
        Carros[0].setTiempo(0);
        Carros[1].setTiempo(0);
        Carros[2].setTiempo(0);
        Carros[3].setTiempo(0);
        
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
    }//iniciar           
            
    
    
    }//class
