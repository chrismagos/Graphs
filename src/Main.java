public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addEdge (1, 2, 2);
        graph.addEdge (1, 3, 4);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 3);
        /*System.out.println("Breitensuche:");
        graph.breadth First Traversal(1);
        System.out.println("\nTiefensuche:");
        graph.depthFirstTraversal(1);
        System.out.println("\nKürzester Weg von 1 nach 4:");
        graph.shortest Path (1, 4);*/
    }
}