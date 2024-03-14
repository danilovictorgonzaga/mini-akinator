public class Personagem {
    private String nome;
    private boolean apareceNoFilme;
    private boolean casaGrifinoria;
    private boolean casaCorvinal;
    private boolean sexo;
    private boolean animalEstimacao;
    private boolean cicatriz;
    private boolean ancestralSalazar;
    private boolean irmao;
    private boolean esteveNaCamaraSecreta;
    private boolean paisTrouxas;
    private boolean animago;

    public Personagem(String nome, boolean apareceNoFilme, boolean casaGrifinoria, boolean casaCorvinal, boolean sexo, boolean animalEstimacao, boolean cicatriz, boolean ancestralSalazar, boolean irmao, boolean esteveNaCamaraSecreta, boolean paisTrouxas, boolean animago) {
        this.nome = nome;
        this.apareceNoFilme = apareceNoFilme;
        this.casaGrifinoria = casaGrifinoria;
        this.casaCorvinal = casaCorvinal;
        this.sexo = sexo;
        this.animalEstimacao = animalEstimacao;
        this.cicatriz = cicatriz;
        this.ancestralSalazar = ancestralSalazar;
        this.irmao = irmao;
        this.esteveNaCamaraSecreta = esteveNaCamaraSecreta;
        this.paisTrouxas = paisTrouxas;
        this.animago = animago;
    }

    public boolean getAncestralSalazar() {
        return ancestralSalazar;
    }

    public boolean getApareceNoFilme() {
        return apareceNoFilme;
    }

    public boolean getCasaCorvinal() {
        return casaCorvinal;
    }

    public boolean getAnimalEstimacao() {
        return animalEstimacao;
    }

    public String getNome() {
        return nome;
    }

    public boolean getCasaGrifinoria() {
        return casaGrifinoria;
    }

    public boolean getSexo() {
        return sexo;
    }

    public boolean getCicatriz() {
        return cicatriz;
    }

    public boolean getIrmao() {
        return irmao;
    }

    public boolean getEsteveNaCamaraSecreta() {
        return esteveNaCamaraSecreta;
    }

    public boolean getPaisTrouxas() {
        return paisTrouxas;
    }

    public boolean getAnimago() {
        return animago;
    }

    @Override
    public String toString() {
        return nome;
    }


}
