import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet();
        PetShop petShop = new PetShop();
        System.out.println("""
                O que você deseja fazer no momento:
                1: Dar banho no pet;
                2: Abastecer com água;
                3: Abastecer com shampoo;
                4: verificar nivel de água;
                5: verificar nivel de shampoo;
                6: verificar se tem pet no banho;
                7: colocar pet na maquina;
                8: retirar pet da máquina;
                9: limpar maquina
                Digite qualquer outro valor para sair!
                """);

        int operacao = scanner.nextInt();



        while(operacao > 0 && operacao < 10){

            switch (operacao){
                case 1:
                    pet.darBanho();
                    break;
                case 2:
                    petShop.abastecerAgua();
                    break;
                case 3:
                    petShop.shampoo();
                    break;
                case 4:
                    System.out.println(petShop.getAguaNaMaquina());
                    break;
                case 5:
                    System.out.println(petShop.getShampooNaMaquina());
                    break;
                case 6:
                    pet.temPetBanhando();
                    break;
                case 7:
                    pet.colocarPet();
                    break;
                case 8:
                    pet.retirarPet();
                    break;
                case 9:
                    pet.limparMaquina();
                    break;
            }
            System.out.println("""
                O que você deseja fazer no momento:
                1: Dar banho no pet;
                2: Abastecer com água;
                3: Abastecer com shampoo;
                4: verificar nivel de água;
                5: verificar nivel de shampoo;
                6: verificar se tem pet no banho;
                7: colocar pet na maquina;
                8: retirar pet da máquina;
                9: limpar maquina
                Digite qualquer outro valor para sair!
                """);
            operacao = scanner.nextInt();
        }

    }
}