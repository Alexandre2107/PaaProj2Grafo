package grafos;

import java.util.ArrayList;
import java.util.Arrays;

public class MATRIZ_DE_ADJACENCIA implements Grafo {
  private int numVertices;
  private double[][] matrizAdjacencia;

  public MATRIZ_DE_ADJACENCIA(int numVertices) {
    this.numVertices = numVertices;
    this.matrizAdjacencia = new double[numVertices][numVertices];
  }

  @Override
  public void adicionarAresta(Vertice origem, Vertice destino) throws Exception {
    
  }

  @Override
  public void adicionarAresta(Vertice origem, Vertice destino, double peso) throws Exception {
    int v1 = origem.id();
    int v2 = destino.id();
   
    matrizAdjacencia[v1][v2] = peso; 
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
    int count = 0;
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdjacencia[i][j] != 0) {
                    count++;
                }
            }
        }
        return count;
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
        sb.append("Matriz de Adjacência:\n");
        sb.append("Número de Vértices: ").append(numeroDeVertices()).append("\n");
        sb.append("Número de Arestas: ").append(numeroDeArestas()).append("\n");

        for (int i = 0; i < numVertices; i++) {
            sb.append(Arrays.toString(matrizAdjacencia[i])).append("\n");
        }

        return sb.toString();
    }
}

