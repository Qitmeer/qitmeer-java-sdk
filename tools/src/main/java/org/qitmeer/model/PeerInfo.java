package org.qitmeer.model;

import java.util.ArrayList;
import java.util.List;

public class PeerInfo {
    public String address;
    public long timeoffset;
    public long bytesrecv;
    public String useragent;
    public String services;
    public String lastrecv;
    public String lastsend;
    public String genesis;
    public long protocol;
    public long bytessent;
    public String conntime;
    public String id;
    public String state;
    public String direction;
    public GraphState graphstate;

    public class GraphState {
        public long mainheight;
        public long layer;
        public long mainorder;
        public ArrayList<String> tips;
    }
}
