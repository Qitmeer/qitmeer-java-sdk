package org.qitmeer.model;

public class BlockHeader {
    private String hash;
    private int confirmations;
    private int version;
    private String parentroot;
    private String txRoot;
    private String stateRoot;
    private long difficulty;
    private int layer;
    private long time;
    private Pow pow;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setParentroot(String parentroot) {
        this.parentroot = parentroot;
    }

    public String getParentroot() {
        return parentroot;
    }

    public void setTxRoot(String txRoot) {
        this.txRoot = txRoot;
    }

    public String getTxRoot() {
        return txRoot;
    }

    public void setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
    }

    public String getStateRoot() {
        return stateRoot;
    }

    public void setDifficulty(long difficulty) {
        this.difficulty = difficulty;
    }

    public long getDifficulty() {
        return difficulty;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public int getLayer() {
        return layer;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setPow(Pow pow) {
        this.pow = pow;
    }

    public Pow getPow() {
        return pow;
    }
}
