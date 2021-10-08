import java.util.Arrays;
import java.util.List;

public class Teste {
    public static int menorValorDeCompra(List<Integer> acoes) {
        return acoes.stream().reduce(Integer::min).get();
    }

    public static int melhorValorDeVenda(List<Integer> acoes) {
        return acoes.stream().reduce(Integer::max).get();
    }

    public static void lucro(int melhorValorDeVenda, int menorValorDeCompra) {
        System.out.println(melhorValorDeVenda - menorValorDeCompra);
    }

    public static void main(String[] args) {

        List<Integer> precosDasAcoesCompra = Arrays.asList(9, 1, 5, 3, 2);

        int menorValorDeCompra = menorValorDeCompra(precosDasAcoesCompra);

        List<Integer> precoDasAcoesParaVenda = precosDasAcoesCompra.subList(precosDasAcoesCompra.indexOf(menorValorDeCompra), precosDasAcoesCompra.size());
        int melhorValorDeVenda = melhorValorDeVenda(precoDasAcoesParaVenda);

        lucro(melhorValorDeVenda, menorValorDeCompra);
    }
}
