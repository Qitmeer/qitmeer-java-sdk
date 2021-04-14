package org.qitmeer.model;

import java.util.List;

public class PeerInfo {
    private String uuid;
    private int id;
    private String addr;
    private String addrlocal;
    private String services;
    private boolean relaytxes;
    private long lastsend;
    private long lastrecv;
    private int bytessent;
    private int bytesrecv;
    private long conntime;
    private int timeoffset;
    private int pingtime;
    private int version;
    private String subver;
    private boolean inbound;
    private int banscore;
    private boolean syncnode;
    private Graphstate graphstate;

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddrlocal(String addrlocal) {
        this.addrlocal = addrlocal;
    }

    public String getAddrlocal() {
        return addrlocal;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getServices() {
        return services;
    }

    public void setRelaytxes(boolean relaytxes) {
        this.relaytxes = relaytxes;
    }

    public boolean getRelaytxes() {
        return relaytxes;
    }

    public void setLastsend(long lastsend) {
        this.lastsend = lastsend;
    }

    public long getLastsend() {
        return lastsend;
    }

    public void setLastrecv(long lastrecv) {
        this.lastrecv = lastrecv;
    }

    public long getLastrecv() {
        return lastrecv;
    }

    public void setBytessent(int bytessent) {
        this.bytessent = bytessent;
    }

    public int getBytessent() {
        return bytessent;
    }

    public void setBytesrecv(int bytesrecv) {
        this.bytesrecv = bytesrecv;
    }

    public int getBytesrecv() {
        return bytesrecv;
    }

    public void setConntime(long conntime) {
        this.conntime = conntime;
    }

    public long getConntime() {
        return conntime;
    }

    public void setTimeoffset(int timeoffset) {
        this.timeoffset = timeoffset;
    }

    public int getTimeoffset() {
        return timeoffset;
    }

    public void setPingtime(int pingtime) {
        this.pingtime = pingtime;
    }

    public int getPingtime() {
        return pingtime;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setSubver(String subver) {
        this.subver = subver;
    }

    public String getSubver() {
        return subver;
    }

    public void setInbound(boolean inbound) {
        this.inbound = inbound;
    }

    public boolean getInbound() {
        return inbound;
    }

    public void setBanscore(int banscore) {
        this.banscore = banscore;
    }

    public int getBanscore() {
        return banscore;
    }

    public void setSyncnode(boolean syncnode) {
        this.syncnode = syncnode;
    }

    public boolean getSyncnode() {
        return syncnode;
    }

    public void setGraphstate(Graphstate graphstate) {
        this.graphstate = graphstate;
    }

    public Graphstate getGraphstate() {
        return graphstate;
    }


    public class Graphstate {

        private List<String> tips;
        private int mainorder;
        private int mainheight;
        private int layer;

        public void setTips(List<String> tips) {
            this.tips = tips;
        }

        public List<String> getTips() {
            return tips;
        }

        public void setMainorder(int mainorder) {
            this.mainorder = mainorder;
        }

        public int getMainorder() {
            return mainorder;
        }

        public void setMainheight(int mainheight) {
            this.mainheight = mainheight;
        }

        public int getMainheight() {
            return mainheight;
        }

        public void setLayer(int layer) {
            this.layer = layer;
        }

        public int getLayer() {
            return layer;
        }

    }
}
