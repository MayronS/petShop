public class PetShop {
    private boolean petNaMaquina = false;
    private boolean maquinaLimpa = true;
    private int adicionarAgua;
    private int adicionarShampoo;
    private int aguaNaMaquina;
    private int shampooNaMaquina;

    public int getAguaNaMaquina() {
        return aguaNaMaquina;
    }

    public int getShampooNaMaquina() {
        return shampooNaMaquina;
    }



    public PetShop(){}
    public PetShop(int adicionarAgua, int adicionarShampoo) {
        this.adicionarAgua = adicionarAgua;
        this.adicionarShampoo = adicionarShampoo;
        aguaNaMaquina = adicionarAgua;
        shampooNaMaquina = adicionarShampoo;
    }

    public void abastecerAgua(){
        System.out.println("Abastecimento realizado com sucesso!");
        aguaNaMaquina += adicionarAgua;

    }
    public void abastecerShampoo(){
        System.out.println("Abastecimento realizado com sucesso!");
        shampooNaMaquina += adicionarShampoo;

    }


    public void banhoNoPet(){
        if (getShampooNaMaquina() < 2 || getAguaNaMaquina() < 10){
            System.out.println("Não tem produto suficiente para dar banho no pet! Favor abastecer!");
        } else if (!petNaMaquina) {
            System.out.println("Não tem pet na maquina para dar banho");
        } else {
            System.out.println("O pet está tomando banho");
            maquinaLimpa = false;
            this.aguaNaMaquina -= 10;
            this.shampooNaMaquina -= 2;

        }

    }
    public void temPetBanhando(){

        if (petNaMaquina){
            System.out.println("Já tem um pet no banho");
        }
        else System.out.println("Não tem pet no banho");
    }
    public void colocarPet(){
        if(petNaMaquina){
            System.out.println("Já tem um pet no banho");
        } else if (!maquinaLimpa) {
            System.out.println("Maquina está suja, precisa ser limpa primeiro!");

        } else{
            System.out.println("Pet colocado na maquina");
            petNaMaquina = true;
        }
    }
    public void retirarPet(){
        if(!petNaMaquina){
            System.out.println("Não tem nenhum pet na maquina");
        }
        else {
            System.out.println("Pet retirado da maquina");
            petNaMaquina = false;
        }
    }
    public void limparMaquina(){
        if(petNaMaquina){
            System.out.println("Não é possivel limpar a maquina no momento tem um pet nela.");
        } else if (getAguaNaMaquina() < 3 || getShampooNaMaquina() < 1) {
            System.out.println("Não tem produtos suficientes para limpar a maquina. Favor abastecer!");
        }
        else {
            System.out.println("Maquina limpa com sucesso!");
            this.aguaNaMaquina -= 3;
            this.shampooNaMaquina -= 1;

            maquinaLimpa = true;
        }
    }

}
