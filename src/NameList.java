public class NameList {

    public static void main(String[] args) {
        
        String [] names = {"joao", "jose", "maria"};

        //lendo o vetor sem loop
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        //int = 0 - inicializaçao do contador de repetiçoes
        //i < names.length - condiçoes de parada de loop (no caso e o comprimento do vetor)
        //i++ - interaçao para incrementar o contador
        for(int i = 0; i < names.length; i++){

            System.out.println(names[i]);
        }
    }
    
}
