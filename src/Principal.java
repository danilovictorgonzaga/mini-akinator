import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String resposta;
        String caracteristica;
        boolean respostaBoollean = true;
        boolean continuar = true;

        List<Personagem> listaPersonagens = new ArrayList<>();
        lista(listaPersonagens);

        System.out.println("Escolha um personagem e memorize!");
        for (int i = 0; i < listaPersonagens.size(); i++) {
            System.out.println((i + 1) + "_ " + listaPersonagens.get(i).getNome());
        }

            System.out.println("O personagem aparece no filme? S/N");
            resposta = leitura.next();
            caracteristica = "aparece no filme";
            Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);


        System.out.println("O personagem é da casa de Grifinória? S/N");
        resposta = leitura.next();
        caracteristica = "casa Grifinoria";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem é da casa de Corvinal? S/N");
        resposta = leitura.next();
        caracteristica = "casa Corvinal";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem é homem? S/N");
        resposta = leitura.next();
        caracteristica = "sexo";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem tem animal de estimação? S/N");
        resposta = leitura.next();
        caracteristica = "animal de estimação";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem tem uma cicatriz em forma de raio? S/N");
        resposta = leitura.next();
        caracteristica = "cicatriz";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem tem descendencia ancestral do Salazar? S/N");
        resposta = leitura.next();
        caracteristica = "ancestral do Salazar";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem tem irmão ou irmã? S/N");
        resposta = leitura.next();
        caracteristica = "irmao";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem já esteve na Câmara Secreta de Hogwarts? S/N");
        resposta = leitura.next();
        caracteristica = "camara secreta";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("Os pais do personagem são trouxas? S/N");
        resposta = leitura.next();
        caracteristica = "pais trouxas";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

        System.out.println("O personagem é um animago? S/N");
        resposta = leitura.next();
        caracteristica = "animago";
        Filtro.atualizarResposta(resposta, respostaBoollean, caracteristica, listaPersonagens, continuar);

    }
    public static void lista(List<Personagem> listaPersonagens) {
        Personagem personagem1 = new Personagem("Harry Potter", true, true, false, true, true, true, false, true, true, true, true);
        Personagem personagem2 = new Personagem("Hermione Granger", true, true, false, false, true, false, false, false, true, true, true);
        Personagem personagem3 = new Personagem("Ron Weasley", true, true, false, true, true, false, false, true, true, false, true);
        Personagem personagem4 = new Personagem("Neville Longbottom", true, true, false, true, true, false, false, true, true, true, true);
        Personagem personagem5 = new Personagem("Ginny Weasley", true, true, false, false, true, false, false, true, true, false, true);
        Personagem personagem6 = new Personagem("Sirius Black", true, true, false, true, false, false, false, true, false, false, true);
        Personagem personagem7 = new Personagem("Albus Dumbledore", true, true, false, true, false, false, false, true, false, false, false);
        Personagem personagem8 = new Personagem("Cedrico Diggory", true, false, false, true, false, false, false, false, true, false, true);
        Personagem personagem9 = new Personagem("Lord Voldemort", true, false, false, true, true, false, true, false, true, true, true);
        Personagem personagem10 = new Personagem("Severus Snape", true, false, false, true, true, false, false, true, false, false, true);

        listaPersonagens.add(personagem1);
        listaPersonagens.add(personagem2);
        listaPersonagens.add(personagem3);
        listaPersonagens.add(personagem4);
        listaPersonagens.add(personagem5);
        listaPersonagens.add(personagem6);
        listaPersonagens.add(personagem7);
        listaPersonagens.add(personagem8);
        listaPersonagens.add(personagem9);
        listaPersonagens.add(personagem10);


    }

}
