package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MreTest{ 
    
    
    private Simulacao novaSimulacao() {
        return new Simulacao(new Bola(2.5, 5.1, 0.0, 0.0));
    }

    @Test
    void bolaParadaAposImpacto(){
        Simulacao simulacao = novaSimulacao();
        Bola bola = simulacao.getBola();
        float gravidade = 9.8;
        float tempoAteImpacto = (5.1 - 0.25) / gravidade;
        int contador = 0;
        for (int i = 0; i < 13; i++) {
            simulacao.passo(0.05);
            if (bola.getY() == 0.25)
                contador++;
        }
        assertTrue(contador<=1);
    }
}