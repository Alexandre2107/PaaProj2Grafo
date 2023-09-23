package grafos;

import java.util.ArrayList;

public class LISTA_DE_ADJACENCIA implements Grafo {
  private int numVertices;
  private ArrayList<ArrayList<Aresta>> listaAdjacencia;

  public LISTA_DE_ADJACENCIA(int numVertices) {
    this.numVertices = numVertices;
    this.listaAdjacencia = new ArrayList<>(numVertices);
    for (int i = 0; i < numVertices; i++) {
      listaAdjacencia.add(new ArrayList<Aresta>());
    }
  }

  @Override
  public void adicionarAresta(Vertice origem, Vertice destino) throws Exception {

  }

  @Override
  public void adicionarAresta(Vertice origem, Vertice destino, double peso) throws Exception {
    int v1 = origem.id();

    listaAdjacencia.get(v1).add(new Aresta(origem, destino, peso));
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
    return listaAdjacencia.stream().mapToInt(ArrayList::size).sum();
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
  sb.append("Lista de Adjacência:\n");
  sb.append("Número de Vértices: ").append(numeroDeVertices()).append("\n");
  sb.append("Número de Arestas: ").append(numeroDeArestas()).append("\n");

  for (int i = 0; i < numVertices; i++) {
    sb.append(i).append(": ");
    for (Aresta a : listaAdjacencia.get(i)) {
      sb.append("[").append(a.destino().id()).append(",").append(a.peso()).append("]").append(" ");
    }
    sb.append("\n");
  }

  return sb.toString();
}

}
