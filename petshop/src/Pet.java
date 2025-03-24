public class Pet {
    private boolean petNaMaquina = false;
    private boolean maquinaLimpa = true;
    PetShop petShop = new PetShop();


    public void darBanho(){
        if (petShop.getShampooNaMaquina() < 2 && petShop.getAguaNaMaquina() < 10){
            System.out.println("Não tem produto suficiente para dar banho no pet! Favor abastecer!");
        } else if (!petNaMaquina) {
            System.out.println("Não tem pet na maquina para dar banho");
        } else {
            System.out.println("O pet está tomando banho");
            maquinaLimpa = false;
            petShop.banhoNoPet();

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
        } else if (petShop.getAguaNaMaquina() < 3 && petShop.getShampooNaMaquina() < 1) {
            System.out.println("Não tem produtos suficientes para limpar a maquina. Favor abastecer!");
        }
        else {
            System.out.println("Maquina limpa com sucesso!");
            petShop.LimparMaquina();

            maquinaLimpa = true;
        }
    }

}
