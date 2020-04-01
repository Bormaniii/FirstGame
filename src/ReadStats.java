import java.io.*;
import java.util.*;

public class ReadStats {
    void attacksReturn() throws IOException {
        FileReader fr = new FileReader("Attacks.txt");
        BufferedReader br = new BufferedReader(fr);
        List<int[]> lista = new ArrayList<int[]>();
        String line = null;

        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {
                String[] s = line.split("\t");
                int[] s2 = new int[s.length];
                for (int i = 0; i < s.length; i++) {
                    s2[i] = Integer.parseInt(s[i]);
                }
                lista.add(s2);
            }
        }
        br.close();
        int[][] liczby = new int[lista.size()][];
        liczby = lista.toArray(liczby);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(Arrays.toString(lista.get(i)));
        }
    }

    void attacksReturn3() throws IOException {
        FileReader fr = new FileReader("attacks.txt");
        BufferedReader br = new BufferedReader(fr);
        List<int[]> lista = new ArrayList<int[]>();
        String line = null;

        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {
                String[] s = line.split("\t");
                int[] s2 = new int[s.length];

                for (int i = 0; i < s.length; i++) {
                    s2[i] = Integer.parseInt(s[i]);
                }
                lista.add(s2);
            }
        }
        br.close();
        int[][] liczby = new int[lista.size()][];
        liczby = lista.toArray(liczby);

        Random rnd = new Random();
        int atak = rnd.nextInt(7);
        int atak2 = rnd.nextInt(7) + 7;
        int atak3 = rnd.nextInt(7) + 14;
        System.out.println(Arrays.toString(lista.get(atak)));
        System.out.println(Arrays.toString(lista.get(atak2)));
        System.out.println(Arrays.toString(lista.get(atak3)));
    }
}