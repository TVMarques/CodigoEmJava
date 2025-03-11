import java.util.Scanner;

public class CalcInteration{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual opereção fazer (somar, subtrair, multiplicar, dividir): ");
        String calc = scanner.nextLine();

        System.out.println("Digite o primeiro número para "+ calc + ":");
        int x = scanner.nextInt();
        System.out.println("Digite o segundo:");
        int y = scanner.nextInt();

        int resultado = 0;//nResutadotem que ser zero para poder gerar retorno nos métodos de calculo.
        boolean operacaoPermitida = true; //Boleano para impedir a operação no caso de string errada.



        if(calc.equals("somar")){
            resultado = sum(x, y);
        }else if (calc.equals("subtrair")) {
            resultado = minus(x, y);
        }else if (calc.equals("multiplicar")){
            resultado = multiply(x, y);
        } else if (calc.equals("dividir")) {
            resultado = division(x, y);
        }else {
            System.out.println("A instrução de calculo não está definida, portanto, não haverá operação !!");
            operacaoPermitida = false;;
        }
        if(operacaoPermitida){
            System.out.println("O RESULTADO É: " );
            System.out.println(resultado);
        }
        System.out.println("\nFim do Programa.");
    }

    static int sum(int x, int y){
        //System.out.println(x + y);
        return x + y;
    }

    static int minus(int x, int y){
        //System.out.println(x - y);
        return x - y;
    }

    static int multiply(int x, int y){
        //System.out.println(x * y);
        return x * y;
    }

    static int division(int x, int y){
        //System.out.println(x / y);
        return x / y;
    }
}
