package graph;

import java.util.ArrayList;
/**
 * Created by benjaminafonso on 03/06/16.
 */
public class Main {

    public static void main(String[] args) {

        // Basic example : Square

        //test1(2);     // Should spill
        //test1(3);     // Shouldn't pill

        // Exemples du TD

        //test2(3);   // Shouldn't spill

        test2(2);   // Should spill


    }

    /**
     * Basic test : Square
     * x -- y
     * |    |
     * t -- z
     * Should spill for k <= 2
     * @param k
     */
    public static void test1(int k){
        // Populating vertexes
        ArrayList<Vertex> vertexes = new ArrayList<Vertex>();

        Vertex x = new Vertex("x");
        Vertex y = new Vertex("y");
        Vertex z = new Vertex("z");
        Vertex t = new Vertex("t");

        vertexes.add(x);
        vertexes.add(y);
        vertexes.add(z);
        vertexes.add(t);

        // Populating edges
        ArrayList<Edge> edges = new ArrayList<Edge>();

        Edge e1 = new InterferenceEdge(x,y);
        Edge e2 = new InterferenceEdge(x,t);
        Edge e3 = new InterferenceEdge(t,z);
        Edge e4 = new InterferenceEdge(y,z);

        try {
            edges.add(e1);
            edges.add(e2);
            edges.add(e3);
            edges.add(e4);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        // Creating graph
        Graph graph = new Graph(edges, vertexes);
        graph.colorier(k, graph);

    }

    /**
     * TD Example
     * x,y,z,t,u,v
     * Interferences edges: (x,y), (x,u), (x,v), (y,t), (z,v), (v,t), (y,u)
     * Preferences edge: (t,u)
     *
     * Should spill for k = 2
     * @param k
     */
    public static void test2(int k){
        // Populating vertexes
        ArrayList<Vertex> vertexes = new ArrayList<Vertex>();

        Vertex x = new Vertex("x");
        Vertex y = new Vertex("y");
        Vertex z = new Vertex("z");
        Vertex u = new Vertex("u");
        Vertex v = new Vertex("v");
        Vertex t = new Vertex("t");

        try {
            vertexes.add(x);
            vertexes.add(y);
            vertexes.add(z);
            vertexes.add(u);
            vertexes.add(v);
            vertexes.add(t);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        // Populating edges
        ArrayList<Edge> edges = new ArrayList<Edge>();

        Edge e1 = new PreferenceEdge(t,u);
        Edge e2 = new InterferenceEdge(x,y);
        Edge e3 = new InterferenceEdge(y,u);
        Edge e4 = new InterferenceEdge(t,y);
        Edge e5 = new InterferenceEdge(x,u);
        Edge e6 = new InterferenceEdge(x,v);
        Edge e7 = new InterferenceEdge(v,t);
        Edge e8 = new InterferenceEdge(v,z);

        try {
            edges.add(e1);
            edges.add(e2);
            edges.add(e3);
            edges.add(e4);
            edges.add(e5);
            edges.add(e6);
            edges.add(e7);
            edges.add(e8);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        // Creating graph
        Graph graph = new Graph(edges, vertexes);
        graph.colorier(k, graph);
    }
}