package com.tmacbo.kotlinutils.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author tmacbo
 * @Since on 2017/6/30  16:39
 * @mail tang_bo@hotmail.com
 * @Description TODO
 */

public class LoginResponse {

    @JsonProperty("data")
    private Data data;

    public class Data {
        /**
         * header token
         */
        @JsonProperty("xAuthToken")
        private String tokenId;
        /**
         * 用户编号
         */
        @JsonProperty("userId")
        private String userId;
        /**
         * 用户名
         */
        @JsonProperty("userName")
        private String usrName;

        /**
         * 手机号
         */
        @JsonProperty("phone")
        private String phone;
        /**
         * 云信登录用户名
         */
        @JsonProperty("accid")
        private String accid;
        /**
         * 云信登录密码
         */
        @JsonProperty("token")
        private String token;

        /**
         * 角色
         */
        @JsonProperty("role")
        private String role;

        public String getTokenId() {
            return tokenId;
        }

        public void setTokenId(String tokenId) {
            this.tokenId = tokenId;
        }

        public String getUsrId() {
            return userId;
        }

        public void setUsrId(String userId) {
            this.userId = userId;
        }

        public String getUsrName() {
            return usrName;
        }

        public void setUsrName(String usrName) {
            this.usrName = usrName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAccid() {
            return accid;
        }

        public void setAccid(String accid) {
            this.accid = accid;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return "UserLoginResp{" +
                    "tokenId='" + tokenId + '\'' +
                    ", userId='" + userId + '\'' +
                    ", usrName='" + usrName + '\'' +
                    ", phone='" + phone + '\'' +
                    ", accid='" + accid + '\'' +
                    ", token='" + token + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
