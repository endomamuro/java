import java.util.Scanner;
class Main{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean[] disponibilidade= new boolean[11];
    java.util.Arrays.fill(disponibilidade,true);
    String modeloCarro;
    String placaCarro;
    Vagas vaga1 = new Vagas();
    Vagas vaga2 = new Vagas();
    Vagas vaga3 = new Vagas();
    Vagas vaga4 = new Vagas();
    Vagas vaga5 = new Vagas();
    Vagas vaga6 = new Vagas();
    Vagas vaga7 = new Vagas();
    Vagas vaga8 = new Vagas();
    Vagas vaga9 = new Vagas();
    Vagas vaga10= new Vagas();
    Vagas vaga11= new Vagas();
    Vagas vaga12= new Vagas();
    
    for(int i=90;i>=90;i--){
        System.out.println("\nDigite o número referente ao que deseja:\n\n1.Guardar carro no estacionamento\n2.Retirar carro do estacionamento\n3.Verificar vagas no estacionamento\n");
        int num = input.nextInt();
        switch(num){
            case 1 -> {
                if(disponibilidade[0]==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga1.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga1.setPlacas(placaCarro);
                    vaga1.guardarCarro();
                    disponibilidade[0]=false;
                    System.out.print("Pode estacionar na vaga 1\n\n");
                }else if(disponibilidade[0]==false && disponibilidade[1] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();
                    vaga2.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga2.setPlacas(placaCarro);
                    vaga2.guardarCarro();
                    disponibilidade[1]=false;
                    System.out.print("Pode estacionar na vaga 2\n");
                }else if(disponibilidade[1]==false && disponibilidade[2]==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga3.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga3.setPlacas(placaCarro);
                    vaga3.guardarCarro();
                    disponibilidade[2]=false;
                    System.out.print("Pode estacionar na vaga 3\n");
                }else if(disponibilidade[2]==false && disponibilidade[3] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga4.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga4.setPlacas(placaCarro);
                    vaga4.guardarCarro();
                    disponibilidade[3]=false;
                    System.out.print("Pode estacionar na vaga 4\n");
                }else if(disponibilidade[3]==false && disponibilidade[4] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga5.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga5.setPlacas(placaCarro);
                    vaga5.guardarCarro();
                    disponibilidade[4]=false;
                    System.out.print("Pode estacionar na vaga 5\n");
                }else if(disponibilidade[4]==false && disponibilidade[5] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga6.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga6.setPlacas(placaCarro);
                    vaga6.guardarCarro();
                    disponibilidade[5]=false;
                    System.out.print("Pode estacionar na vaga 6\n");
                }else if(disponibilidade[5]==false && disponibilidade[6] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga7.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga7.setPlacas(placaCarro);
                    vaga7.guardarCarro();
                    disponibilidade[6]=false;
                    System.out.print("Pode estacionar na vaga 7\n");
                }else if(disponibilidade[6]==false && disponibilidade[7] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga8.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga8.setPlacas(placaCarro);
                    vaga8.guardarCarro();
                    disponibilidade[7]=false;
                    System.out.print("Pode estacionar na vaga 8\n");
                }else if(disponibilidade[7]==false && disponibilidade[8] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga9.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga9.setPlacas(placaCarro);
                    vaga9.guardarCarro();
                    disponibilidade[8]=false;
                    System.out.print("Pode estacionar na vaga 9\n");
                }else if(disponibilidade[8]==false && disponibilidade[9] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga10.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga10.setPlacas(placaCarro);
                    vaga10.guardarCarro();
                    disponibilidade[9]=false;
                    System.out.print("Pode estacionar na vaga 10\n");
                }else if(disponibilidade[9]==false && disponibilidade[10] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga11.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga11.setPlacas(placaCarro);
                    vaga11.guardarCarro();
                    disponibilidade[10]=false;
                    System.out.print("Pode estacionar na vaga 11\n");
                }else if(disponibilidade[10]==false && disponibilidade[11] ==true){
                    System.out.println("Informe o Modelo do Carro");
                    input.nextLine();
                    modeloCarro = input.nextLine();                    
                    vaga12.setCarro(modeloCarro);
                    System.out.println("Informe a Placa do Carro");
                    placaCarro = input.nextLine();
                    vaga12.setPlacas(placaCarro);
                    vaga12.guardarCarro();
                    disponibilidade[11]=false;
                    System.out.print("Pode estacionar na vaga 12\n");
                }else{
                    System.out.println("Todas vagas estão ocupadas");
                    return;
                }
                break;
            }
            case 2 -> {
                System.out.println("Qual a vaga do carro?");
                for(int j=1;j<100;j++){
                    int num1 = input.nextInt();
                    switch(num1){
                        case 1:
                            vaga1.calcularValor();
                            disponibilidade[0]=false;
                            j=100;
                            break;
                        case 2:
                            vaga2.calcularValor();
                            disponibilidade[1]=false;
                            j=100;
                            break;
                        case 3:
                            vaga3.calcularValor();
                            disponibilidade[2]=false;
                            j=100;
                            break;
                        case 4:
                            vaga4.calcularValor();
                            disponibilidade[3]=false;
                            j=100;
                            break;
                        case 5:
                            vaga5.calcularValor();
                            disponibilidade[4]=false;
                            j=100;
                            break;
                        case 6:
                            vaga6.calcularValor();
                            disponibilidade[5]=false;
                            j=100;
                            break;
                        case 7:
                            vaga7.calcularValor();
                            disponibilidade[6]=false;
                            j=100;
                            break;
                        case 8:
                            vaga8.calcularValor();
                            disponibilidade[7]=false;
                            j=100;
                            break;
                        case 9:
                            vaga9.calcularValor();
                            disponibilidade[8]=false;
                            j=100;
                            break;
                        case 10:
                            vaga10.calcularValor();
                            disponibilidade[9]=false;
                            j=100;
                            break;
                        case 11:
                            vaga11.calcularValor();
                            disponibilidade[10]=false;
                            j=100;
                            break;
                        case 12:
                            vaga12.calcularValor();
                            disponibilidade[11]=false;
                            j=100;
                            break;
                        default:
                            System.out.println("Esse número não corresponde a nenhuma das vagas, tente novamente!");
                            break;
                    }}
                break;
            }
            
            case 3 -> {
                System.out.println("Deseja verificar qual vaga?");
                int num2 = input.nextInt();
                for(int count=101;count>100;count--)
                switch(num2){
                    case 1: 
                        vaga1.mostrarVaga();
                        break;
                    case 2: 
                        vaga2.mostrarVaga();
                        break;
                    case 3: 
                        vaga3.mostrarVaga();
                        break;
                    case 4: 
                        vaga4.mostrarVaga();
                        break;
                    case 5: 
                        vaga5.mostrarVaga();
                        break;
                    case 6: 
                        vaga6.mostrarVaga();
                        break;
                    case 7: 
                        vaga7.mostrarVaga();
                        break;
                    case 8: 
                        vaga8.mostrarVaga();
                        break;
                    case 9: 
                        vaga9.mostrarVaga();
                        break;
                    case 10: 
                        vaga10.mostrarVaga();
                        break;
                    case 11: 
                        vaga11.mostrarVaga();
                        break;
                    case 12: 
                        vaga12.mostrarVaga();
                        break;
                    default:
                        System.out.println("Opcao inexistente, tente novamente\n");
                        count++;
                }
            }
            default -> System.out.println("Número inválido\n\n");
}      for(int r=2;r>=2;r--){
        System.out.println("Deseja voltar para o menu? Digite 1 para sim e 2 para nao\n\n1.Sim\n2. Nao");
        int voltar= input.nextInt();
        switch(voltar){
            case 1:
                i=i+1;
                break;
            case 2:
                i--;
                break;
        }
        }}}}
//Guardar Carro e Informações ta OK