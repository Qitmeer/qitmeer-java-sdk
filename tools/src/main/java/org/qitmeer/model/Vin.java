package org.qitmeer.model;

public class Vin {

    public String coinbase;
    public String txid;
    public int vout;
    public int sequence;
    public ScriptSig scriptsig;

    public String getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public int getVout() {
        return vout;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public ScriptSig getScriptsig() {
        return scriptsig;
    }

    public void setScriptsig(ScriptSig scriptsig) {
        this.scriptsig = scriptsig;
    }
}
