/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlespb;

/**
 *
 * @author Douglas N. BK
 */
public class Pecas {
    
    private double PainelFrontal;
    private double ParachoqueDianteiro;
    private double ParachoqueTraseiro;
    private double AlmaTraseira;
    private double AlmaDianteira;
    private double Capo;
    private double KitRadiador;
    private double Parabrisa;
    private double LongarinaEsquerda;
    
    private double SomaTotal; 

    public Pecas() {
    }

    public Pecas(double PainelFrontal, double ParachoqueDianteiro, double ParachoqueTraseiro, double AlmaTraseira, double AlmaDianteira, double Capo, double KitRadiador, double Parabrisa, double LongarinaEsquerda) {
        this.PainelFrontal = PainelFrontal;
        this.ParachoqueDianteiro = ParachoqueDianteiro;
        this.ParachoqueTraseiro = ParachoqueTraseiro;
        this.AlmaTraseira = AlmaTraseira;
        this.AlmaDianteira = AlmaDianteira;
        this.Capo = Capo;
        this.KitRadiador = KitRadiador;
        this.Parabrisa = Parabrisa;
        this.LongarinaEsquerda = LongarinaEsquerda;
        //this.SomaTotal = SomaTotal;
    }
    
    /**
     * @return the PainelFrontal
     */
    public double getPainelFrontal() {
        return PainelFrontal;
    }

    /**
     * @param PainelFrontal the PainelFrontal to set
     */
    public void setPainelFrontal(double PainelFrontal) {
        this.PainelFrontal = PainelFrontal;
    }

    /**
     * @return the ParachoqueDianteiro
     */
    public double getParachoqueDianteiro() {
        return ParachoqueDianteiro;
    }

    /**
     * @param ParachoqueDianteiro the ParachoqueDianteiro to set
     */
    public void setParachoqueDianteiro(double ParachoqueDianteiro) {
        this.ParachoqueDianteiro = ParachoqueDianteiro;
    }

    /**
     * @return the ParachoqueTraseiro
     */
    public double getParachoqueTraseiro() {
        return ParachoqueTraseiro;
    }

    /**
     * @param ParachoqueTraseiro the ParachoqueTraseiro to set
     */
    public void setParachoqueTraseiro(double ParachoqueTraseiro) {
        this.ParachoqueTraseiro = ParachoqueTraseiro;
    }

    /**
     * @return the AlmaTraseira
     */
    public double getAlmaTraseira() {
        return AlmaTraseira;
    }

    /**
     * @param AlmaTraseira the AlmaTraseira to set
     */
    public void setAlmaTraseira(double AlmaTraseira) {
        this.AlmaTraseira = AlmaTraseira;
    }

    /**
     * @return the AlmaDianteira
     */
    public double getAlmaDianteira() {
        return AlmaDianteira;
    }

    /**
     * @param AlmaDianteira the AlmaDianteira to set
     */
    public void setAlmaDianteira(double AlmaDianteira) {
        this.AlmaDianteira = AlmaDianteira;
    }

    /**
     * @return the Capo
     */
    public double getCapo() {
        return Capo;
    }

    /**
     * @param Capo the Capo to set
     */
    public void setCapo(double Capo) {
        this.Capo = Capo;
    }

    /**
     * @return the KitRadiador
     */
    public double getKitRadiador() {
        return KitRadiador;
    }

    /**
     * @param KitRadiador the KitRadiador to set
     */
    public void setKitRadiador(double KitRadiador) {
        this.KitRadiador = KitRadiador;
    }

    /**
     * @return the Parabrisa
     */
    public double getParabrisa() {
        return Parabrisa;
    }

    /**
     * @param Parabrisa the Parabrisa to set
     */
    public void setParabrisa(double Parabrisa) {
        this.Parabrisa = Parabrisa;
    }

    /**
     * @return the LongarinaEsquerda
     */
    public double getLongarinaEsquerda() {
        return LongarinaEsquerda;
    }

    /**
     * @param LongarinaEsquerda the LongarinaEsquerda to set
     */
    public void setLongarinaEsquerda(double LongarinaEsquerda) {
        this.LongarinaEsquerda = LongarinaEsquerda;
    }

    /**
     * @return the SomaTotal
     */
    public double getSomaTotal() {
        return SomaTotal;
    }

    /**
     * @param SomaTotal the SomaTotal to set
     */
    public void setSomaTotal(double SomaTotal) {
        this.SomaTotal = SomaTotal;
    }

    
    
    
}
