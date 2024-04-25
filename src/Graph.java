import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> _vertexes;
    public Graph(){
        _vertexes = new ArrayList<>();
    }
    public void addVertex(int v) {
        _vertexes.add(new Vertex(String.valueOf(v)));
    }

    public void addEdge(int v1, int v2, int weight) {
        Vertex vertex1 = new Vertex(String.valueOf(v1));
        Vertex vertex2 = new Vertex(String.valueOf(v2));
        vertex1.addEdge(v1, v2, weight);
    }
    public void depthFirstTraversal(int start){
        ArrayList<Vertex> visitedVertexes;
        Vertex startVertex = new Vertex(String.valueOf(start));
        for(Edge edge : startVertex.getEdges()){
            Vertex neighbor = edge.get_vertex2();
        }
    }
}
