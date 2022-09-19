package com.danilenko.helloworld;


public class Duck {
        private String name;

        public Duck(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
}

