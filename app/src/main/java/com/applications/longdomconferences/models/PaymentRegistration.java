package com.applications.longdomconferences.models;

import java.util.List;

public class PaymentRegistration {


    /**
     * status : true
     * registration_details : [{"name":"Shankar","conf_id":"224","reg_id":"2490","country":"india","email":"shankar@gmail.com","phone":"123466","paystatus":"pending","productid":"2621","value":"599","product_type":"early"},{"name":"Shankar","conf_id":"224","reg_id":"2490","country":"india","email":"shankar@gmail.com","phone":"123466","paystatus":"pending","productid":"3447","value":"959","product_type":"early"}]
     */

    private String status;
    private List<RegistrationDetailsBean> registration_details;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RegistrationDetailsBean> getRegistration_details() {
        return registration_details;
    }

    public void setRegistration_details(List<RegistrationDetailsBean> registration_details) {
        this.registration_details = registration_details;
    }

    public static class RegistrationDetailsBean {
        /**
         * name : Shankar
         * conf_id : 224
         * reg_id : 2490
         * country : india
         * email : shankar@gmail.com
         * phone : 123466
         * paystatus : pending
         * productid : 2621
         * value : 599
         * product_type : early
         */

        private String name;
        private String conf_id;
        private String reg_id;
        private String country;
        private String email;
        private String phone;
        private String paystatus;
        private String productid;
        private String value;
        private String product_type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getConf_id() {
            return conf_id;
        }

        public void setConf_id(String conf_id) {
            this.conf_id = conf_id;
        }

        public String getReg_id() {
            return reg_id;
        }

        public void setReg_id(String reg_id) {
            this.reg_id = reg_id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPaystatus() {
            return paystatus;
        }

        public void setPaystatus(String paystatus) {
            this.paystatus = paystatus;
        }

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getProduct_type() {
            return product_type;
        }

        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }
    }
}
