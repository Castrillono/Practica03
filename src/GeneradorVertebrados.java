public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[6];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Gorila", "Mamifero");
        miVertebrados[3] = new Vertebrado("Serpiente", "Reptil");
        miVertebrados[4] = new Vertebrado("Aguila", "Ave");
        miVertebrados[5] = new Vertebrado("Ballena", "Mamifero");   
        
        return miVertebrados;
    }
}
