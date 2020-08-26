package com.applications.longdomconferences.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConferenceProducts {


    /**
     * status : true
     * registration_products : [{"productid":"5218","type":"Academic","productname":"Delegate","price1":"449","price2":"549","price3":"649","price4":"400","price5":"490","price6":"580","price7":"363","price8":"443","price9":"524","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5216","type":"Academic","productname":"Only Registration/Speaker","price1":"599","price2":"699","price3":"799","price4":"560","price5":"650","price6":"740","price7":"500","price8":"580","price9":"660","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5222","type":"Academic","productname":"Plan A (2 Nights Accomodation + Registration)","price1":"799","price2":"899","price3":"999","price4":"713","price5":"802","price6":"891","price7":"658","price8":"740","price9":"822","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5224","type":"Academic","productname":"Plan B (3 Nights Accomodation + Registration )","price1":"899","price2":"999","price3":"1099","price4":"813","price5":"902","price6":"991","price7":"758","price8":"840","price9":"922","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5226","type":"Student","productname":"Student Registration","price1":"299","price2":"399","price3":"499","price4":"268","price5":"358","price6":"448","price7":"241","price8":"322","price9":"403","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5228","type":"Student","productname":"Young Investigator","price1":"349","price2":"449","price3":"549","price4":"315","price5":"405","price6":"495","price7":"287","price8":"369","price9":"452","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5752","type":"Student","productname":"Young Research","price1":"399","price2":"499","price3":"599","price4":"360","price5":"450","price6":"540","price7":"307","price8":"384","price9":"484","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5231","type":"Student","productname":"Plan A (2 Nights Accomodation + Registration)","price1":"600","price2":"700","price3":"800","price4":"535","price5":"625","price6":"714","price7":"494","price8":"576","price9":"658","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5233","type":"Student","productname":"Plan B (3 Nights Accomodation + Registration )","price1":"749","price2":"849","price3":"949","price4":"673","price5":"763","price6":"853","price7":"605","price8":"686","price9":"767","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5235","type":"Addon","productname":"Accompanying Person","price1":"249","price2":"249","price3":"249","price4":"223","price5":"223","price6":"223","price7":"201","price8":"201","price9":"201","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5751","type":"ePoster","productname":"e- Poster","price1":"99","price2":"99","price3":"99","price4":"90","price5":"90","price6":"90","price7":"80","price8":"80","price9":"80","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"},{"productid":"5238","type":"Exhibitor","productname":"Only Registration/Speaker","price1":"2000","price2":"2250","price3":"2500","price4":"1785","price5":"2000","price6":"2231","price7":"1646","price8":"1852","price9":"2058","early":"2020-01-15","normal":"2020-02-15","final":"2020-09-29"}]
     */

    private boolean status;
    private List<RegistrationProductsBean> registration_products;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<RegistrationProductsBean> getRegistration_products() {
        return registration_products;
    }

    public void setRegistration_products(List<RegistrationProductsBean> registration_products) {
        this.registration_products = registration_products;
    }

    public static class RegistrationProductsBean {
        /**
         * productid : 5218
         * type : Academic
         * productname : Delegate
         * price1 : 449
         * price2 : 549
         * price3 : 649
         * price4 : 400
         * price5 : 490
         * price6 : 580
         * price7 : 363
         * price8 : 443
         * price9 : 524
         * early : 2020-01-15
         * normal : 2020-02-15
         * final : 2020-09-29
         */

        private String productid;
        private String type;
        private String productname;
        private String price1;
        private String price2;
        private String price3;
        private String price4;
        private String price5;
        private String price6;
        private String price7;
        private String price8;
        private String price9;
        private String early;
        private String normal;
        @SerializedName("final")
        private String finalX;

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public String getPrice1() {
            return price1;
        }

        public void setPrice1(String price1) {
            this.price1 = price1;
        }

        public String getPrice2() {
            return price2;
        }

        public void setPrice2(String price2) {
            this.price2 = price2;
        }

        public String getPrice3() {
            return price3;
        }

        public void setPrice3(String price3) {
            this.price3 = price3;
        }

        public String getPrice4() {
            return price4;
        }

        public void setPrice4(String price4) {
            this.price4 = price4;
        }

        public String getPrice5() {
            return price5;
        }

        public void setPrice5(String price5) {
            this.price5 = price5;
        }

        public String getPrice6() {
            return price6;
        }

        public void setPrice6(String price6) {
            this.price6 = price6;
        }

        public String getPrice7() {
            return price7;
        }

        public void setPrice7(String price7) {
            this.price7 = price7;
        }

        public String getPrice8() {
            return price8;
        }

        public void setPrice8(String price8) {
            this.price8 = price8;
        }

        public String getPrice9() {
            return price9;
        }

        public void setPrice9(String price9) {
            this.price9 = price9;
        }

        public String getEarly() {
            return early;
        }

        public void setEarly(String early) {
            this.early = early;
        }

        public String getNormal() {
            return normal;
        }

        public void setNormal(String normal) {
            this.normal = normal;
        }

        public String getFinalX() {
            return finalX;
        }

        public void setFinalX(String finalX) {
            this.finalX = finalX;
        }
    }
}
