 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlespb;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Douglas N. BK
 */
public class ControleSPB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Funelaria funileiro = new Funelaria();
        Calculo c = new Calculo();
        
        Pecas p = new Pecas(750, 750, 0, 0, 750, 0, 2100, 1000, 0);
        System.out.println("Painel Frontal     = " + p.getPainelFrontal());
        System.out.println("Alma Dianteira     = " + p.getAlmaDianteira());
        System.out.println("Alma Traseira      = " + p.getAlmaTraseira());
        System.out.println("Capo dianteiro     = " + p.getCapo());
        System.out.println("Kit do Radiador    = " + p.getKitRadiador());
        System.out.println("longarina esquerda = " + p.getLongarinaEsquerda());
        System.out.println("Parabrisa          = " + p.getParabrisa());
        System.out.println("Parachoque D.      = " + p.getParachoqueDianteiro());
        System.out.println("Parachoque T.      = " + p.getParachoqueTraseiro());
        c.setSomaTotal(p.getAlmaDianteira() + p.getAlmaTraseira() + p.getCapo() + p.getKitRadiador() + p.getLongarinaEsquerda() + p.getPainelFrontal() + p.getParabrisa() + p.getParachoqueDianteiro() + p.getParachoqueTraseiro());
        
        funileiro.setNome("Teka");
        funileiro.setCor("prata");
        funileiro.setValor(1700);
        System.out.println("A soma Total gastos com peças até agora é = " + c.getSomaTotal());
        
        Vendedor v = new Vendedor();
        v.setNome("Jairo");
        v.setValor(26000);
        v.setVolta(2500);
        
        System.out.println("");
        
        
        System.out.println("Pintor: " + funileiro.getNome());
        System.out.println("Valor pintura: " + funileiro.getValor()+ "\n");
        
        
        System.out.println("Vendedor = " + v.getNome());
        System.out.println("Total Gastos: = " + (v.getTotalVolta() + funileiro.getValor() + c.getSomaTotal()));
        
    }
    
}
