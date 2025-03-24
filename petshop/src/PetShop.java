public class PetShop {
    private int aguaNaMaquina = 30;
    private int shampooNaMaquina = 10;

    public void abastecerAgua(){
        if (aguaNaMaquina < 30){
            if (2 + aguaNaMaquina > 30){
                System.out.println("limite excedido. Não é possivel abastecer no momento!");
            }
            else {
                System.out.println("Abastecimento realizado com sucesso!");
                aguaNaMaquina += 2;
            }
        }

    }
    public void shampoo(){
        System.out.println("Quanto você deseja abastecer?");
        if (2 + shampooNaMaquina > 10){
            System.out.println("limite excedido! Não é possivel abastecer no momento!");
        }
        else {
            System.out.println("Abastecimento realizado com sucesso!");
            shampooNaMaquina += 2;
        }
    }

    public int getAguaNaMaquina() {
        return aguaNaMaquina;
    }

    public int getShampooNaMaquina() {
        return shampooNaMaquina;
    }

    public void banhoNoPet(){
        this.aguaNaMaquina -= 10;
        this.shampooNaMaquina -= 2;
    }
    public void LimparMaquina(){
        this.aguaNaMaquina -= 3;
        this.shampooNaMaquina -= 1;
    }

}
