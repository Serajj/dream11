package com.circle11.utils;



public enum AppEnvironment {

    SANDBOX {
        @Override
        public String merchant_Key() {
            return "wd8OlhnJ";
        }

        @Override
        public String merchant_ID() {
            return "yourMID";
        }

        @Override
        public String furl() {
            return "https://www.payumoney.com/mobileapp/payumoney/failure.php";
        }

        @Override
        public String surl() {
            return "https://www.payumoney.com/mobileapp/payumoney/success.php";
        }

        @Override
        public String salt() {
            return "wd8OlhnJ";
        }

        @Override
        public boolean debug() {
            return true;
        }
    },

    PRODUCTION {
        @Override
        public String merchant_Key() {
            return "zmcZBZv3";
        }  //O15vkB

        @Override
        public String merchant_ID() {
            return "7306346";
        }   //4819816

        @Override
        public String furl() {
            return "https://www.payumoney.com/mobileapp/payumoney/failure.php";
        }

        @Override
        public String surl() {
            return "https://www.payumoney.com/mobileapp/payumoney/success.php";
        }

        @Override
        public String salt() {
            return "lLqy8YlV9z";
        }

        @Override
        public boolean debug() {
            return false;
        }
    };

    public abstract String merchant_Key();

    public abstract String merchant_ID();

    public abstract String furl();

    public abstract String surl();

    public abstract String salt();

    public abstract boolean debug();


}
