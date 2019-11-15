package org.qitmeer.model;


import java.util.Date;
import java.util.List;

public class Block {
    public String hash;
    public long confirmations;
    public int version;
    public int height;
    public long weight;
    public int order;
    public String txRoot;
    public List<TxRawResult> transactions;
    public String stateRoot;
    public String bits;
    public float difficulty;
    public long nonce;
    public Date timestamp;
    public List<String> parents;
    public List<String> children;
    public boolean txsvalid;

    public String getHash() {
        return hash;
    }

    public long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(long confirmations) {
        this.confirmations = confirmations;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getTxRoot() {
        return txRoot;
    }

    public void setTxRoot(String txRoot) {
        this.txRoot = txRoot;
    }

    public List<TxRawResult> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TxRawResult> transactions) {
        this.transactions = transactions;
    }

    public String getStateRoot() {
        return stateRoot;
    }

    public void setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public long getNonce() {
        return nonce;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public boolean isTxsvalid() {
        return txsvalid;
    }

    public void setTxsvalid(boolean txsvalid) {
        this.txsvalid = txsvalid;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

}
