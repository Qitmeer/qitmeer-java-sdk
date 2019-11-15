package org.qitmeer.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.qitmeer.model.*;

import java.util.ArrayList;
import java.util.List;

public class QitmeerTest {
    Qitmeer q = new Qitmeer("http://127.0.0.1:8131","admin","123456");

    @Test
    public void getBlockCountTest(){
      ServiceResult result =  q.getBlockCount();
        if (result.code==0){
            System.out.println("getBlockCountTest:"+result.data.toString());
        }else{
            System.out.println("getBlockCountTest:"+result.msg);
        }
    }
    @Test
    public void getBlockByOrderTest(){
      ServiceResult result =  q.getBlockByOrder(1700,true);
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Block b = JSON.toJavaObject(recJson, Block.class);
            System.out.println("getBlockByOrderTest:"+b.getHash());
        }else{
            System.out.println("getBlockByOrderTest:"+result.msg);
        }
    }
    @Test
    public void getBlockHeaderTest(){
      ServiceResult result =  q.getBlockHeader("0961060de66cd2bb62559a5eee5a12cf648df09ca727800daa48c71d99756e85",true);
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            BlockHeader b =  JSON.toJavaObject(recJson, BlockHeader.class);
            System.out.println("getBlockHeaderTest:"+b.getHash());
        }else{
            System.out.println("getBlockHeaderTest:"+result.msg);
        }
    }
    @Test
    public void getBlockWeightTest(){
      ServiceResult result =  q.getBlockWeight("0961060de66cd2bb62559a5eee5a12cf648df09ca727800daa48c71d99756e85");
        if (result.code==0){
            System.out.println("getBlockWeightTest:"+result.data.toString());
        }else{
            System.out.println("getBlockWeightTest:"+result.msg);
        }
    }
    @Test
    public void getBlockByhashTest(){
      ServiceResult result =  q.getBlockByhash("0961060de66cd2bb62559a5eee5a12cf648df09ca727800daa48c71d99756e85",true);
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Block b =  JSON.toJavaObject(recJson,Block.class);
            System.out.println("getBlockByhashTest:"+b.getHash());
        }else{
            System.out.println("getBlockByhashTest:"+result.msg);
        }
    }
    @Test
    public void getBlockHashTest(){
      ServiceResult result =  q.getBlockHash(1700);
        if (result.code==0){
            System.out.println("getBlockHashTest:"+result.data.toString());
        }else{
            System.out.println("getBlockHashTest:"+result.msg);
        }
    }
    @Test
    public void getBestBlockHashTest(){
      ServiceResult result =  q.getBestBlockHash();
        if (result.code==0){
            System.out.println("getBestBlockHashTest:"+result.data.toString());
        }else{
            System.out.println("getBestBlockHashTest:"+result.msg);
        }
    }
    @Test
    public void isOnMainChain(){
      ServiceResult result =  q.isOnMainChain("0961060de66cd2bb62559a5eee5a12cf648df09ca727800daa48c71d99756e85");
        if (result.code==0){
            System.out.println("isOnMainChain:"+result.data.toString());
        }else{
            System.out.println("isOnMainChain:"+result.msg);
        }
    }
    @Test
    public void getPeerInfoTest(){
      ServiceResult result =  q.getPeerInfo();
        if (result.code==0){
            List list = JSON.parseArray(result.data.toString(),PeerInfo.class);
            System.out.println("getPeerInfoTest:"+list.size());
        }else{
            System.out.println("getPeerInfoTest:"+result.msg);
        }
    }
    @Test
    public void getNodeInfoTest(){
      ServiceResult result =  q.getNodeInfo();
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            NodeInfo b =  JSON.toJavaObject(recJson, NodeInfo.class);
            System.out.println("getNodeInfoTest:"+b.getUUID());
        }else{
            System.out.println("getNodeInfoTest:"+result.msg);
        }
    }
    @Test
    public void getUtxoTest(){
      ServiceResult result =  q.getUtxo("019edb774482a9f619ca02f949881c2c9616a48e014ad27668ee5e56b64182f9",0,true);
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Utxo b= JSON.toJavaObject(recJson,Utxo.class);
            System.out.println("getUtxoTest:"+b.getCoinbase());
        }else{
            System.out.println("getUtxoTest:"+result.msg);
        }
    }
    @Test
    public void createRawTransactionTest(){
        FromTx u = new FromTx();
        u.setTxid("019edb774482a9f619ca02f949881c2c9616a48e014ad27668ee5e56b64182f9");
        u.setVout(0);
        List<FromTx> list = new ArrayList<>();
        list.add(u);
      ServiceResult result =  q.createRawTransaction(list,"TmgD1mu8zMMV9aWmJrXqQYnWRhR9SBfDZG6",120,0);
        if (result.code==0){
            System.out.println("createRawTransactionTest:"+result.data.toString());
        }else{
            System.out.println("createRawTransactionTest:"+result.msg);
        }
    }



    @Test
    public void decodeRawTransactionTest(){
        ServiceResult result =  q.decodeRawTransaction("0100000001f98241b6565eee6876d24a018ea416962c1c8849f902ca19f6a9824477db9e0100000000ffffffff0178000000000000001976a914bd4d1888cb054b2755d65d93c356573e4d283ead88ac00000000000000000100");
        if (result.code==0){
            System.out.println("decodeRawTransactionTest:"+result.data.toString());
        }else{
            System.out.println("decodeRawTransactionTest:"+result.msg);
        }
    }
    @Test
    public void getRawTransactionTest(){
        ServiceResult result =  q.getRawTransaction("f5f5c09644789d3b61c9b5f0eb7f69b594605defc9c519eba1dd3231a4cba4dc",true);
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            TxRawResult b=  JSON.toJavaObject(recJson,TxRawResult.class);
            System.out.println("getRawTransactionTest:"+b.getTxid());
        }else{
            System.out.println("getRawTransactionTest:"+result.msg);
        }
    }

    @Test
    public void txSignTest(){
        ServiceResult result =  q.txSign("test","0100000001f98241b6565eee6876d24a018ea416962c1c8849f902ca19f6a9824477db9e0100000000ffffffff0178000000000000001976a914bd4d1888cb054b2755d65d93c356573e4d283ead88ac00000000000000000100");
        if (result.code==0){
            System.out.println("txSignTest:"+result.data.toString());
        }else{
            System.out.println("txSignTest:"+result.msg);
        }
    }
    @Test
    public void sendRawTransactionTest(){
        ServiceResult result =  q.sendRawTransaction("0100000001f98241b6565eee6876d24a018ea416962c1c8849f902ca19f6a9824477db9e0100000000ffffffff0178000000000000001976a914bd4d1888cb054b2755d65d93c356573e4d283ead88ac00000000000000000100",true);
        if (result.code==0){
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Utxo b= JSON.toJavaObject(recJson,Utxo.class);
            System.out.println("sendRawTransactionTest:"+result.data.toString());
        }else{
            System.out.println("sendRawTransactionTest:"+result.msg);
        }
    }
}
