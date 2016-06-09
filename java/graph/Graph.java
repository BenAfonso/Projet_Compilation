package graph;

import java.util.ArrayList;

/**
 * Created by benjaminafonso on 02/06/16.
 */
public class Graph {

    /**
     * Data structure
     */
    ArrayList<Edge> edges;
    ArrayList<Vertex> vertexes;

    /**
     * Graph Constructor
     * @param edges
     * @param vertexes
     */
    public Graph(ArrayList<Edge> edges, ArrayList<Vertex> vertexes){
        this.edges = edges;
        this.vertexes = vertexes;
    }

    public String toString(){
        String str = "Edges: ";
        for (Edge e : this.edges){
            str = str + e.toString();
        }
        str = str + "\nVertices: ";
        for (Vertex v : this.vertexes){
            str = str + v.toString();
        }

        return "===========\nGraph: \n"+str+"\n===========";
    }



    /**
     * Add an edge to the Graph
     * @param edge
     * @return boolean (true if done, else either)
     */
    public boolean addEdge(Edge edge){
        return this.edges.add(edge);
    }

    /**
     * Removes a given Edge from graph
     * @param edge
     * @return
     */
    public boolean removeEdge(Edge edge){
        if (this.edges.contains(edge)){
            return this.edges.remove(edge);
        }
        return false;
    }


    /**
     * Removes a given Vertex from Graph
     * @param v
     */
    public void removeVertex(Vertex v){
        // Removes the edges associated
        ArrayList<Edge> associatedEdges = this.getAssociatedEdges(v);

        this.vertexes.remove(v);
        for (Edge e : associatedEdges) {
            this.removeEdge(e);
        }

    }


    /**
     * Algorithm for coloring a graph
     * @param k
     * @param graph
     */
    public void colorier(int k, Graph graph){
        // On garde toujours le paramètre avec La liste de sommets
        Graph G = new Graph((ArrayList<Edge>) graph.edges.clone(),(ArrayList<Vertex>) graph.vertexes.clone());

        if (G.vertexes.size() == 0){
            System.out.println("\n\n====> Chaînage arrière !\n\n");
        }else{
            int i = 0;
            while (i < G.vertexes.size() && G.getVertexWeight(G.vertexes.get(i)) >= k){
                i++;
            }
            // i == this.vertexes.size() OR this.vertexes.get(i) < k

//            System.out.println("TEST: "+G.vertexes.get(i));
  //          System.out.println(G.getVertexWeight(G.vertexes.get(i)));

            if (!(G.vertexes.size() == i)){
                Vertex v = G.vertexes.get(i);

                System.out.println("Removing vertex "+v+" - Vertex weight: "+G.getVertexWeight(v)+" - k = "+k);


                //# this = G
                G.removeVertex(v);
                //# this = G \ v

                // Recurse on G \ v
                this.colorier(k, G);

                // Pick an available color in the 'graph'
                String old = v.toString();
                v.setColor(graph.getAvailableColor(v, k));
                System.out.println("[+] Coloring: "+old+"  ===> "+v.toString());

            }else{
                // WE NEED TO SPILL
                Vertex maxW = G.getMaxWeightVertex();
                System.out.println("Removing vertex "+maxW+" - Vertex weight: "+G.getVertexWeight(maxW)+" - k = "+k);

                G.removeVertex(maxW);


                // Recurse
                this.colorier(k, G);


                String old = maxW.toString();
                // Spill
                maxW.spill();
                System.out.println("[+] Spilling: "+old+"  ====> "+maxW.toString());

            }


        }

        System.out.println(graph);


    }


    /***********************************
     *                                 *
     *         Private functions       *
     *                                 *
     ***********************************/


    /**
     * Get all the edges composed of given Vertex
     * @param vertex
     * @return ArrayList<Edge>
     */
    private ArrayList<Edge> getAssociatedEdges(Vertex vertex){
        ArrayList<Edge> edges = new ArrayList<Edge>();

        for (Edge edge : this.edges){
            if (edge.isInEdge(vertex)){
                edges.add(edge);
            }
        }

        return edges;

    }

    /**
     * Get the Vertex with max weight in Graph
     * @return Vertex
     */
    private Vertex getMaxWeightVertex(){
        int pMax = this.getVertexWeight(this.vertexes.get(0));
        Vertex maxWeight = this.vertexes.get(0);
        for (Vertex v : this.vertexes){
            if (this.getVertexWeight(v) > pMax) {
                pMax = this.getVertexWeight(v);
                maxWeight = v;
            }
        }
        return maxWeight;
    }

    /**
     * Returns the weight of a given vertex
     * @param vertex
     * @return int
     */
    private int getVertexWeight(Vertex vertex){
        int weight = 0;
        ArrayList<Edge> associatedEdges = this.getAssociatedEdges(vertex);
        for (Edge e : associatedEdges){
            if (e instanceof InterferenceEdge){
                weight++;
            }
        }
        return weight;
    }


    /**
     * Get available color depending on near vertexes
     * @param v
     * @param k
     * @return
     */
    private int getAvailableColor(Vertex v, int k){

        ArrayList<Integer> availables = new ArrayList<Integer>();
        // Populate available colors.
        for (int i = 1; i <= k; i++){
            availables.add(i);
        }


        ArrayList<Edge> associatedEdges = this.getAssociatedEdges(v);
        for (Edge e : associatedEdges){
            // If the given vertex is contained in a preferenceEdge, check if the prefEdge is colored
            if (e instanceof PreferenceEdge) {
                // If it is, return this color
                if (e.getOtherVertex(v).isColored()){
                    System.out.println("Coloring with color of PreferenceEdge");
                    return e.getOtherVertex(v).getColor();
                }
            }


            // Otherwise, check all colours.

            if (e.getVertexes().get(0).isColored()){
                if (availables.contains(e.getVertexes().get(0).getColor())){
                    availables.remove(availables.indexOf(e.getVertexes().get(0).getColor()));
                }
            }
            if (e.getVertexes().get(1).isColored()){
                if (availables.contains(e.getVertexes().get(1).getColor())){
                    availables.remove(availables.indexOf(e.getVertexes().get(1).getColor()));
                }
            }

            System.out.println("Available colors: "+availables);

        }
        return availables.get(0);
    }


}

