public class Edge {
    private Vertex _vertex1;
    private Vertex _vertex2;
    private int _weight;
    public Edge(Vertex vertex1, Vertex vertex2, int weight){
        _vertex1 = vertex1;
        _vertex2 = vertex2;
        _weight = weight;
    }
    public Vertex getVertex1() {
        return _vertex1;
    }
    public Vertex getVertex2() {
        return _vertex2;
    }
    public int getWeight() {
        return _weight;
    }
    public String toString(){
        return "Start Vertex: " + _vertex1 + "\tEnd Vertex: " + _vertex2 + "\tWeight: " + _weight;
    }
}
