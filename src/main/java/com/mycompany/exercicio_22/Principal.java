public class Principal {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        while (i <= 1000) {
            soma = soma + i;
            i++;
        }

        float media = soma / 1000.0f;
        System.out.println("A média é: " + media);
    }
}