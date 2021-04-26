package org.qitmeer.model;

public class ProofData {
    private int edge_bits;
    private String circle_nonces;

    public void setEdge_bits(int edge_bits) {
        this.edge_bits = edge_bits;
    }

    public int getEdge_bits() {
        return edge_bits;
    }

    public void setCircle_nonces(String circle_nonces) {
        this.circle_nonces = circle_nonces;
    }

    public String getCircle_nonces() {
        return circle_nonces;
    }
}
