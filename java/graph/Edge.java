package graph;

import java.util.ArrayList;

/**
 * @name: Edge
 * An Edge is defined by 2 vertexes
 */
public abstract class Edge {

    Vertex vertex1;
    Vertex vertex2;

    /**
     * Edge constructor
     * @param v1
     * @param v2
     */
    public Edge(Vertex v1, Vertex v2){
        this.vertex1 = v1;
        this.vertex2 = v2;
    }

    /**
     * Returns True if the Vertex is in the Edge, False either
     * @param v
     * @return boolean
     */
    public boolean isInEdge(Vertex v){
        return (this.vertex1 == v || this.vertex2 == v);
    }

    /**
     * Returns the vertices of the Edge
     * @return vertexes
     */
    public ArrayList<Vertex> getVertexes(){
        ArrayList<Vertex> vertexes = new ArrayList<Vertex>();
        vertexes.add(vertex1);
        vertexes.add(vertex2);

        return vertexes;
    }

    /**
     * Get the other side of the Edge given a Vertex
     * @param v
     * @return
     */
    public Vertex getOtherVertex(Vertex v){
        if (v == this.vertex1){
            return this.vertex2;
        }else if (v == this.vertex2){
            return this.vertex1;
        }else{
            throw new Error("Not in edge");
        }
    }
    public String toString(){
        return '{'+this.vertex1.toString()+", "+this.vertex2.toString()+"}";
    }

}

