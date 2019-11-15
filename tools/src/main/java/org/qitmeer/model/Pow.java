package org.qitmeer.model;

public class Pow {
    private String pow_name;
    private int pow_type;
    private long nonce;
    private ProofData proof_data;
    public void setPow_name(String pow_name) {
        this.pow_name = pow_name;
    }
    public String getPow_name() {
        return pow_name;
    }

    public void setPow_type(int pow_type) {
        this.pow_type = pow_type;
    }
    public int getPow_type() {
        return pow_type;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }
    public long getNonce() {
        return nonce;
    }

    public void setProof_data(ProofData proof_data) {
        this.proof_data = proof_data;
    }
    public ProofData getProof_data() {
        return proof_data;
    }
}
