package org.qitmeer.model;

import java.util.List;

public class NodeInfo {
        private String UUID;
        private long version;
        private int protocolversion;
        private long totalsubsidy;
        private int timeoffset;
        private int connections;
        private boolean testnet;
        private boolean mixnet;
        private int confirmations;
        private int coinbasematurity;
        private String errors;
        private List<String> modules;
        public void setUUID(String UUID) {
            this.UUID = UUID;
        }
        public String getUUID() {
            return UUID;
        }

        public void setVersion(long version) {
            this.version = version;
        }
        public long getVersion() {
            return version;
        }

        public void setProtocolversion(int protocolversion) {
            this.protocolversion = protocolversion;
        }
        public int getProtocolversion() {
            return protocolversion;
        }

        public void setTotalsubsidy(long totalsubsidy) {
            this.totalsubsidy = totalsubsidy;
        }
        public long getTotalsubsidy() {
            return totalsubsidy;
        }


        public void setTimeoffset(int timeoffset) {
            this.timeoffset = timeoffset;
        }
        public int getTimeoffset() {
            return timeoffset;
        }

        public void setConnections(int connections) {
            this.connections = connections;
        }
        public int getConnections() {
            return connections;
        }


        public void setTestnet(boolean testnet) {
            this.testnet = testnet;
        }
        public boolean getTestnet() {
            return testnet;
        }

        public void setMixnet(boolean mixnet) {
            this.mixnet = mixnet;
        }
        public boolean getMixnet() {
            return mixnet;
        }

        public void setConfirmations(int confirmations) {
            this.confirmations = confirmations;
        }
        public int getConfirmations() {
            return confirmations;
        }

        public void setCoinbasematurity(int coinbasematurity) {
            this.coinbasematurity = coinbasematurity;
        }
        public int getCoinbasematurity() {
            return coinbasematurity;
        }

        public void setErrors(String errors) {
            this.errors = errors;
        }
        public String getErrors() {
            return errors;
        }

        public void setModules(List<String> modules) {
            this.modules = modules;
        }
        public List<String> getModules() {
            return modules;
        }


    }
