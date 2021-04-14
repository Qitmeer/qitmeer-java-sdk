package org.qitmeer.model;

public class Utxo {

    private String bestblock;
    private int confirmations;
    private int amount;
    private ScriptPubKeyResult scriptPubKey;
    private int version;
    private boolean coinbase;

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setScriptPubKey(ScriptPubKeyResult scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public ScriptPubKeyResult getScriptPubKey() {
        return scriptPubKey;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setCoinbase(boolean coinbase) {
        this.coinbase = coinbase;
    }

    public boolean getCoinbase() {
        return coinbase;
    }
}
