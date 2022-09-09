package com.danilenko.helloworld;

import java.util.Date;

public class Horse {
      private String name;
      private String bd;
      public Horse(String name) {
          this.name = name;
          this.bd = new Date().toString();

      }


   public String getName() {
        return name;
    }

    public String getBd() {
        return bd;
    }

    @Override
    public String toString() {
        return name + "-" + bd;
    }
    }

