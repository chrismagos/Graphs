import java.util.ArrayList;

public class Vertex {
    private String _label;
    private ArrayList<Edge> _edges;
    public Vertex(String name){
        _label = name;
        _edges = new ArrayList<>();
    }
    public void addEdge(int v1, int v2, int weight){
        _edges.add(new Edge(new Vertex(String.valueOf(v1)), new Vertex(String.valueOf(v2)), weight));
    }
    public String getLabel() {
        return _label;
    }
    public ArrayList<Edge> getEdges() {
        return _edges;
    }
    public String edgesToString(){
        String s = "";
        for(Edge edge : _edges){
            s += edge.toString() + "\n";
        }
        return s;
    }
}