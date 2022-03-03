public class Veiculo {

    String modelo;
    String marca;
    int ano;
    int veloMax = 200;
    int velo;
    String cor;
    double valorFipe;

     void setModelo (String valor){
         this.modelo = valor;
     }
    void setMarca (String valor){
        this.marca = valor;
    }
    void setAno (int valor){
        this.ano = valor;
    }

    void velocidade (int valor){
         this.velo = valor;
         if (this.velo >= veloMax){
             System.out.println("Velocidade acima do valor permitido para o veículo");
         }
         else if (this.velo<veloMax){
             System.out.println("Estou acelerando a km/h:"+velo);
         }
    }

    void frear(){
        System.out.println("Estou freando o veículo:"+modelo);
    }
}
