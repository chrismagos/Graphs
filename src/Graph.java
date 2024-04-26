import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private ArrayList<Vertex> _vertexes;
    ArrayList<Vertex> _visitedVertices;
    public Graph(){
        _vertexes = new ArrayList<>();
        _visitedVertices = new ArrayList<>();
    }
    public void addVertex(int v) {
        _vertexes.add(new Vertex(String.valueOf(v)));
    }

    public void addEdge(int v1, int v2, int weight) {
        for(Vertex vertex : _vertexes){
            if(Integer.parseInt(vertex.getLabel()) == v1){
                vertex.addEdge(v1, v2, weight);
            }
        }
    }
    public void depthFirstTraversal(int start){
        Vertex startVertex = findVertexByLabel(start);
        if(!_visitedVertices.contains(startVertex)){
            System.out.println(startVertex.getLabel());
        }
        _visitedVertices.add(startVertex);
        for(Edge edge : startVertex.getEdges()){
            if(!_visitedVertices.contains(edge.getVertex2())){
                _visitedVertices.add(edge.getVertex2());
                depthFirstTraversal(Integer.parseInt(edge.getVertex2().getLabel()));
            }
        }
    }
    public void breadthFirstTraversal(int start) {
        ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
        Vertex startVertex = findVertexByLabel(start);
        visitedVertices.add(startVertex);

        Queue<Vertex> visitQueue = new LinkedList<>();
        visitQueue.add(startVertex);
        while (!visitQueue.isEmpty()) {
            Vertex current = visitQueue.remove();
            System.out.println((current).getLabel());
            for(Edge e : (current).getEdges()) {
                if(!visitedVertices.contains(e.getVertex2())) {
                    visitedVertices.add(e.getVertex2());
                    visitQueue.add(e.getVertex2());
                }
            }
        }
    }
    public Vertex findVertexByLabel(int label){
        for(Vertex vertex : _vertexes){
            if(Integer.parseInt(vertex.getLabel()) == label){
                return vertex;
            }
        }
        return null;
    }
    public void emptyVisitedVertexes(){
        _visitedVertices.clear();
    }
}
