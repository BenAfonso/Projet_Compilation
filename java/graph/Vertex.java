package graph;

/**
 * @name: Vertex
 * A vertex is defined by its color and an ID
 * Colors are:
 *  -1 : Not colored
 *  0 : Spilled
 *  > 0 : Any color
 */
public class Vertex {

    // Data structure
    String id;
    int color;

    /**
     * Vertex constructor
     * @param: id
     */
    public Vertex(String id){
        this.id = id;
        this.color = -1;
    }

    /**
     * Sets a Vertex Color
     * @param color (-1 for noColor | 0 for SPILL | 1...n for colors)
     */
    public void setColor(int color){
        this.color = color;
    }

    /**
     * Spills a vertex
     * (Just by setting its color to 0)
     */
    public void spill() {
        this.setColor(0);
    }

    public int getColor() { return this.color; }

    /**
     * isColored
     * @return boolean (true if vertex is colored, false either)
     */
    public boolean isColored() { return this.color != -1; }

    public String toString(){
        return "["+this.id+": "+this.color+"]";
    }
}
