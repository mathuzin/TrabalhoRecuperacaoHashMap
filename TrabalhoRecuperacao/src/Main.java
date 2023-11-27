import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public Main() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\municipios2.csv");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader brx = new BufferedReader(isr);
        HashMap<String, Integer> cidade = new HashMap<String, Integer>();

        String linha = brx.readLine();
        int contador = 0;
        while (linha != null){
            if(contador != 0) {
                String[] txtSeparado = linha.split(";");
                int populacao = Integer.parseInt(txtSeparado[3]);
                cidade.put(txtSeparado[1], populacao);
            }
            linha = brx.readLine();
            contador++;
        }

        int maiorPopulacao = 0;
        String maiorCidade  = "";
        int menorPopulacao = Integer.MAX_VALUE;
        String menorCidade  = "";
        for (Map.Entry<String, Integer> m : cidade.entrySet()){
            if(maiorPopulacao < m.getValue()){
                maiorCidade = m.getKey();
                maiorPopulacao = m.getValue();
            }
            if(menorPopulacao > m.getValue()){
                menorCidade = m.getKey();
                menorPopulacao = m.getValue();
            }
        }
        System.out.println("A cidade com a menor população é " + menorCidade + " e contém " + menorPopulacao + " habitantes");
        System.out.println("Enquanto, a cidade com maior população é " + maiorCidade + " e contém " + maiorPopulacao + " habitantes");
    }
}