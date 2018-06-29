package automatos;

import java.util.Scanner;

public class Automatos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        String prefixo;
        String subpalavra;
        String sufixo;
        
        palavra = teclado.nextLine();
        prefixo = teclado.nextLine();
        subpalavra = teclado.nextLine();
        sufixo = teclado.nextLine();
        
        
        
        Automatos a = new Automatos();
        
        System.out.println(a.prefixo(palavra, prefixo));
        
        System.out.println(a.subpalavra(palavra, subpalavra));
        
        System.out.println(a.sufixo(palavra, sufixo));
                
    }
    
    public boolean prefixo(String palavra, String pre){
        for(int i=0; i<pre.length(); i++){
            if(pre.charAt(i) != palavra.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public boolean subpalavra(String palavra, String sub){
        System.out.println("palavra= "+palavra);
        System.out.println("sub= "+sub);
        int j = 0;
        for(int i=0; i<palavra.length(); i++){
            System.out.println(palavra.charAt(i)+" "+sub.charAt(j));
            if(sub.length()-1 == j){
                    return true;
                }
            if(palavra.charAt(i) == sub.charAt(j)){
                j++;
            }
            else {
                j=0;
            }
        }
        return false;
    } 
    
    public boolean sufixo(String palavra, String suf){
        int j = palavra.length()-1;
        for(int i=suf.length()-1; i>=0; i--){
            if(suf.charAt(i) != palavra.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
   
