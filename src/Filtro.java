import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
    public static void atualizarResposta(String resposta, boolean respostaBoollean, String caracteristica, List<Personagem> listaPersonagens) {

        if (resposta.equalsIgnoreCase("s")) {
            respostaBoollean = true;
        } else if (resposta.equalsIgnoreCase("n")) {
            respostaBoollean = false;
        }

        filtrarPersonagens(listaPersonagens, caracteristica, respostaBoollean);
        System.out.println("******************************");
    }

    public static void filtrarPersonagens(List<Personagem> listaPersonagens, String caracteristica, boolean valor) {
        List<Personagem> personagensFiltrados = listaPersonagens.stream()
                .filter(personagem -> getCaracteristica(personagem, caracteristica) == valor)
                .collect(Collectors.toList());
        listaPersonagens.clear();
        listaPersonagens.addAll(personagensFiltrados);
        if (listaPersonagens.size() == 1) {
            System.out.println("Seu personagem é o " + listaPersonagens.get(0));
            System.exit(0);
        }
    }

    public static boolean getCaracteristica(Personagem personagem, String caracteristica) {
        switch (caracteristica) {
            case "aparece no filme":
                return personagem.getApareceNoFilme();
            case "casa Grifinoria":
                return personagem.getCasaGrifinoria();
            case "casa Corvinal":
                return personagem.getCasaCorvinal();
            case "sexo":
                return personagem.getSexo();
            case "animal de estimação":
                return personagem.getAnimalEstimacao();
            case "cicatriz":
                return personagem.getCicatriz();
            case "ancestral do Salazar":
                return personagem.getAncestralSalazar();
            case "irmao":
                return personagem.getIrmao();
            case "camara secreta":
                return personagem.getEsteveNaCamaraSecreta();
            case "pais trouxas":
                return personagem.getPaisTrouxas();
            case "animago":
                return personagem.getAnimago();

            default:
                return false;
        }
    }
}
