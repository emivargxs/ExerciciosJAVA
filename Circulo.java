public class Circulo {
    private double posicaoX;
    private double posicaoY;
    private double raio;

    Circulo(double posicaoX, double posicaoY, double raio){
        if(posicaoX < 0 || posicaoY < 0 || raio < 0){
        throw new IllegalArgumentException("Valores nao podem ser negativos!");        } 
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.raio = raio;
    }
    //getters e setters

    public double getRaio(){
        return this.raio;
    }
    public double getposicaoX(){
        return this.posicaoX;
    }
    public double getposicaoY(){
        return this.posicaoY;
    }

    //metodos privados de modificacao
    private void setX(double x){
         if (x >= 0.0) {
            this.posicaoX = x;
        } else {
            this.posicaoX = 0.0;
        }
    }
    
    private void SetY(double y){
            if(y >= 0.0){
                this.posicaoY = y;
            } else{
                this.posicaoY = 0.0;
            }
    }
    
    //metodos publicos 

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia(){
        return 2* Math.PI * raio;
    }

    public void moverPara(double novoX, double novoY){
        this.setX(novoX);
        this.SetY(novoY);
    }

    public static void main(String[] args){
    
        Circulo c1 = new Circulo(5.0,2.5, 2);

        System.out.println("Circulo 1:");
        System.out.println("Posicao X:" + c1.getposicaoX());
        System.out.println("Posicao Y:" + c1.getposicaoY());
        System.out.println("Raio:"+ c1.getRaio());
        System.out.println("Área:" + c1.calcularArea());
        System.out.println("Circunferencia:" + c1.calcularCircunferencia());


        //Movendo o circulo para 1 posicao
        c1.moverPara(8.0, 8.0);
        System.out.println("\nCírculo 1 movido para nova posicao");
        System.out.println("Posicao X:" + c1.getposicaoX());
        System.out.println("Posicao Y::" + c1.getposicaoY());
    }
}
