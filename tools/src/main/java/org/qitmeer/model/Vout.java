package org.qitmeer.model;

public class Vout {
    public long amount;
    public ScriptPubKeyResult scriptPubKey;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public ScriptPubKeyResult getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(ScriptPubKeyResult scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }
}
