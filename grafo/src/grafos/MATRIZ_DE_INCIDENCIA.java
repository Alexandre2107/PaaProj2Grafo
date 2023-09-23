package grafos;

import java.util.ArrayList;
import java.util.Arrays;

public class MATRIZ_DE_INCIDENCIA implements Grafo {
  private int numVertices;
  private int numArestas;
  private double[][] matrizIncidencia;
  private int aresta = 0;

  public MATRIZ_DE_INCIDENCIA(int numVertices, int numArestas) {
      this.numVertices = numVertices;
      this.numArestas = numArestas;
      this.matrizIncidencia = new double[numVertices][numArestas];
      this.aresta = 0;
  }

  @Override
  public void adicionarAresta(Vertice origem, Vertice destino) throws Exception {
    
}


  @Override
  public void adicionarAresta(Vertice origem, Vertice destino, double peso) throws Exception {
    int v1 = origem.id();
    int v2 = destino.id();

    matrizIncidencia[v1][aresta] = -1 * peso;
    matrizIncidencia[v2][aresta] = peso;

    aresta++;
  }

  @Override
  public boolean existeAresta(Vertice origem, Vertice destino) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'existeAresta'");
  }

  @Override
  public int grauDoVertice(Vertice vertice) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'grauDoVertice'");
  }

  @Override
  public int numeroDeVertices() {
    return numVertices;
  }

  @Override
  public int numeroDeArestas() {
    return numArestas;
  }

  @Override
  public ArrayList<Vertice> adjacentesDe(Vertice vertice) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adjacentesDe'");
  }

  @Override
  public void setarPeso(Vertice origem, Vertice destino, double peso) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setarPeso'");
  }

  @Override
  public ArrayList<Aresta> arestasEntre(Vertice origem, Vertice destino) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'arestasEntre'");
  }

  @Override
  public ArrayList<Vertice> vertices() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'vertices'");
  }

  @Override
  public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matriz de Incidência:\n");
        sb.append("Número de Vértices: ").append(numeroDeVertices()).append("\n");
        sb.append("Número de Arestas: ").append(numeroDeArestas()).append("\n");

        for (int i = 0; i < numVertices; i++) {
            sb.append(Arrays.toString(matrizIncidencia[i])).append("\n");
        }

        return sb.toString();
    }

}
