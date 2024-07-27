package Leetcode.twoSum;

public class Teste {
    public static void main(String[] args) {

        int[] teste = {2,7,11,15};
        int target = 9;

        Solution solucao = new Solution();

        int[] resultado = solucao.twoSum(teste, target);

        System.out.println(resultado);

    }
}
