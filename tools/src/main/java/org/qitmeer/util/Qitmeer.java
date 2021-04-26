package org.qitmeer.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.qitmeer.model.*;

import java.util.*;

public class Qitmeer {
    private String url;
    private String usr;
    private String pass;

    public Qitmeer(String url, String usr, String pass) {
        this.url = url;
        this.usr = usr;
        this.pass = pass;
    }

    /**
     * 获取当前区块高度
     */
    public ServiceResult getBlockCount() {
        SendJson s = new SendJson("getBlockCount", new ArrayList<Object>());
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 根据order获取区块信息
     *
     * @param order
     * @param show  是否显示json true false
     */
    public ServiceResult getBlockByOrder(int order, boolean show) {
        List<Object> params = new ArrayList<Object>();
        params.add(order);
        params.add(show);
        SendJson s = new SendJson("getBlockByOrder", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);

    }


    /**
     * 获取区块头信息
     *
     * @param blockHash
     * @param show
     * @return
     */
    public ServiceResult getBlockHeader(String blockHash, boolean show) {
        List<Object> params = new ArrayList<Object>();
        params.add(blockHash);
        params.add(show);
        SendJson s = new SendJson("getBlockHeader", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 获取区块weight
     *
     * @param blockHash
     * @return
     */
    public ServiceResult getBlockWeight(String blockHash) {
        List<Object> params = new ArrayList<Object>();
        params.add(blockHash);
        SendJson s = new SendJson("getBlockWeight", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 根据hash查询区块信息
     *
     * @param blockHash
     * @param show
     * @return
     */
    public ServiceResult getBlockByhash(String blockHash, boolean show) {
        List<Object> params = new ArrayList<Object>();
        params.add(blockHash);
        params.add(show);
        SendJson s = new SendJson("getBlock", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 根据order获取blockhash
     *
     * @param order
     * @return
     */
    public ServiceResult getBlockHash(int order) {
        List<Object> params = new ArrayList<Object>();
        params.add(order);
        SendJson s = new SendJson("getBlockhash", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 获取最新hash
     *
     * @return
     */
    public ServiceResult getBestBlockHash() {
        List<Object> params = new ArrayList<Object>();
        SendJson s = new SendJson("getBestBlockHash", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * blockHash 是否存在
     *
     * @param blockHash
     * @return
     */
    public ServiceResult isOnMainChain(String blockHash) {
        List<Object> params = new ArrayList<Object>();
        params.add(blockHash);
        SendJson s = new SendJson("isOnMainChain", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    public ServiceResult getPeerInfo() {
        List<Object> params = new ArrayList<Object>();
        SendJson s = new SendJson("getPeerInfo", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    public ServiceResult getNodeInfo() {
        List<Object> params = new ArrayList<Object>();
        SendJson s = new SendJson("getNodeInfo", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }


    /**
     * 查询utxo信息
     *
     * @param txid  交易id
     * @param index 索引位置
     * @param memo  是否查询memo缓存
     * @return
     */
    public ServiceResult getUtxo(String txid, int index, boolean memo) {
        List<Object> params = new ArrayList<Object>();
        params.add(txid);
        params.add(index);
        params.add(memo);
        SendJson s = new SendJson("getUtxo", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }


    private String authorization() {
        if (usr == null || pass == null || pass.equals("") || usr.equals("")) {
            return null;
        }
        Base64.Encoder encoder = Base64.getEncoder();
        String encodeStr = usr.concat(":").concat(pass);
        String encodedText = encoder.encodeToString(encodeStr.getBytes());
        return "Basic ".concat(encodedText);
    }


    /**
     * 创建交易
     *
     * @param list     utxo
     * @param toAddr   转账地址
     * @param amount   金额
     * @param locktime 锁定时间
     * @return
     */
    public ServiceResult createRawTransaction(List<FromTx> list, String toAddr, float amount, long locktime) {
        if (list.isEmpty()) {
            return null;
        }
        if (toAddr.equals("")) {
            return null;
        }
        if (amount <= 0) {
            return null;
        }
        List<Object> params = new ArrayList<Object>();
        Map<String, Long> map = new HashMap<String, Long>();
        map.put(toAddr, Float.valueOf(amount).longValue());
        params.add(list);
        params.add(map);
        if (locktime > 0) {
            params.add(locktime);
        }
        SendJson s = new SendJson("createRawTransaction", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 解码交易
     *
     * @param transaction
     * @return
     */
    public ServiceResult decodeRawTransaction(String transaction) {
        if (transaction.equals("")) {
            return null;
        }
        List<Object> params = new ArrayList<Object>();
        Map<String, Long> map = new HashMap<String, Long>();
        params.add(transaction);
        SendJson s = new SendJson("decodeRawTransaction", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 根据txid获取交易详情
     *
     * @param transaction
     * @param show        是否显示json true false
     * @return
     */
    public ServiceResult getRawTransaction(String txid, boolean show) {
        List<Object> params = new ArrayList<Object>();
        params.add(txid);
        params.add(show);
        SendJson s = new SendJson("getRawTransaction", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        return QitmeerUtil.pareRec(rep);
    }

    /**
     * 发送交易
     *
     * @param sign_raw_tx
     * @param allow_high_fee
     * @return
     */
    public ServiceResult sendRawTransaction(String sign_raw_tx, boolean allow_high_fee) {
        List<Object> params = new ArrayList<Object>();
        params.add(sign_raw_tx);
        params.add(allow_high_fee);
        SendJson s = new SendJson("sendRawTransaction", params);
        String sendMsg = JSON.toJSONString(s);
        String rep = HttpClientUtil.doPost(url, sendMsg, "utf-8", authorization());
        System.out.println("rep:" + rep);
        return QitmeerUtil.pareRec(rep);
    }

}
