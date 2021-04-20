package org.qitmeer.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.qitmeer.model.*;

import java.util.ArrayList;
import java.util.List;

public class QitmeerTest {
    Qitmeer q = new Qitmeer("http://127.0.0.1", "admin", "123");

    @Test
    public void getBlockCountTest() {
        ServiceResult result = q.getBlockCount();
        if (result.code == 0) {
            System.out.println("getBlockCountTest:\r\n" + result.data.toString());
        } else {
            System.out.println("getBlockCountTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getBlockByOrderTest() {
        ServiceResult result = q.getBlockByOrder(1700, true);
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Block b = JSON.toJavaObject(recJson, Block.class);
            System.out.println("getBlockByOrderTest:\r\n" + b.getHash());
        } else {
            System.out.println("getBlockByOrderTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getBlockHeaderTest() {
        ServiceResult result = q.getBlockHeader("61f90fa6286d2ad8290260775aeb07e2f70b1d8184d9ded5f852983dadd25c94", true);
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            BlockHeader b = JSON.toJavaObject(recJson, BlockHeader.class);
            System.out.println("getBlockHeaderTest:\r\n" + b.getHash());
        } else {
            System.out.println("getBlockHeaderTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getBlockWeightTest() {
        ServiceResult result = q.getBlockWeight("61f90fa6286d2ad8290260775aeb07e2f70b1d8184d9ded5f852983dadd25c94");
        if (result.code == 0) {
            System.out.println("getBlockWeightTest:\r\n" + result.data.toString());
        } else {
            System.out.println("getBlockWeightTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getBlockByhashTest() {
        ServiceResult result = q.getBlockByhash("61f90fa6286d2ad8290260775aeb07e2f70b1d8184d9ded5f852983dadd25c94", true);
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Block b = JSON.toJavaObject(recJson, Block.class);
            System.out.println("getBlockByhashTest:\r\n" + b.getHash());
        } else {
            System.out.println("getBlockByhashTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getBlockHashTest() {
        ServiceResult result = q.getBlockHash(1700);
        if (result.code == 0) {
            System.out.println("getBlockHashTest:\r\n" + result.data.toString());
        } else {
            System.out.println("getBlockHashTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getBestBlockHashTest() {
        ServiceResult result = q.getBestBlockHash();
        if (result.code == 0) {
            System.out.println("getBestBlockHashTest:\r\n" + result.data.toString());
        } else {
            System.out.println("getBestBlockHashTest:\r\n" + result.msg);
        }
    }

    @Test
    public void isOnMainChain() {
        ServiceResult result = q.isOnMainChain("61f90fa6286d2ad8290260775aeb07e2f70b1d8184d9ded5f852983dadd25c94");
        if (result.code == 0) {
            System.out.println("isOnMainChain:\r\n" + result.data.toString());
        } else {
            System.out.println("isOnMainChain:\r\n" + result.msg);
        }
    }

    @Test
    public void getPeerInfoTest() {
        ServiceResult result = q.getPeerInfo();
        if (result.code == 0) {
            List<PeerInfo> list = JSON.parseArray(result.data.toString(), PeerInfo.class);
            System.out.println("getPeerInfoTest:\r\n" + list.size());
        } else {
            System.out.println("getPeerInfoTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getNodeInfoTest() {
        ServiceResult result = q.getNodeInfo();
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            NodeInfo b = JSON.toJavaObject(recJson, NodeInfo.class);
            System.out.println("getNodeInfoTest:\r\n" + b.getUUID());
        } else {
            System.out.println("getNodeInfoTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getUtxoTest() {
        ServiceResult result = q.getUtxo("243907bffb97da381c98a095cb758c46f720980511f2df8923e93a64258cfb1e", 0, true);
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Utxo b = JSON.toJavaObject(recJson, Utxo.class);
            System.out.println("getUtxoTest:\r\n" + b.getCoinbase());
        } else {
            System.out.println("getUtxoTest:\r\n" + result.msg);
        }
    }

    @Test
    public void createRawTransactionTest() {
        FromTx u = new FromTx();
        u.setTxid("019edb774482a9f619ca02f949881c2c9616a48e014ad27668ee5e56b64182f9");
        u.setVout(0);
        List<FromTx> list = new ArrayList<>();
        list.add(u);
        ServiceResult result = q.createRawTransaction(list, "TmgD1mu8zMMV9aWmJrXqQYnWRhR9SBfDZG6", 120, 0);
        if (result.code == 0) {
            System.out.println("createRawTransactionTest:\r\n" + result.data.toString());
        } else {
            System.out.println("createRawTransactionTest:\r\n" + result.msg);
        }
    }


    @Test
    public void decodeRawTransactionTest() {
        ServiceResult result = q.decodeRawTransaction("0100000001f98241b6565eee6876d24a018ea416962c1c8849f902ca19f6a9824477db9e0100000000ffffffff0178000000000000001976a914bd4d1888cb054b2755d65d93c356573e4d283ead88ac00000000000000000100");
        if (result.code == 0) {
            System.out.println("decodeRawTransactionTest:\r\n" + result.data.toString());
        } else {
            System.out.println("decodeRawTransactionTest:\r\n" + result.msg);
        }
    }

    @Test
    public void getRawTransactionTest() {
        ServiceResult result = q.getRawTransaction("243907bffb97da381c98a095cb758c46f720980511f2df8923e93a64258cfb1e", true);
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            TxRawResult b = JSON.toJavaObject(recJson, TxRawResult.class);
            System.out.println("getRawTransactionTest:\r\n" + b.getTxid());
        } else {
            System.out.println("getRawTransactionTest:\r\n" + result.msg);
        }
    }

    @Test
    public void sendRawTransactionTest() {
        ServiceResult result = q.sendRawTransaction("0100000001f98241b6565eee6876d24a018ea416962c1c8849f902ca19f6a9824477db9e0100000000ffffffff0178000000000000001976a914bd4d1888cb054b2755d65d93c356573e4d283ead88ac00000000000000000100", true);
        if (result.code == 0) {
            JSONObject recJson = JSON.parseObject(result.data.toString());
            Utxo b = JSON.toJavaObject(recJson, Utxo.class);
            System.out.println("sendRawTransactionTest:\r\n" + result.data.toString());

        } else {
            System.out.println("sendRawTransactionTest:\r\n" + result.msg);
        }
    }
}
