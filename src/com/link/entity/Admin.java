package com.link.entity;


/**
 * 系统管理员
 *
 * @author link
 * @create 2017-03-31-21:26
 */
public class Admin {

        private  int id;
        private  String adminName;
        private  String pwd;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getAdminName() {
                return adminName;
        }

        public void setAdminName(String adminName) {
                this.adminName = adminName;
        }

        public String getPwd() {
                return pwd;
        }

        public void setPwd(String pwd) {
                this.pwd = pwd;
        }
}
