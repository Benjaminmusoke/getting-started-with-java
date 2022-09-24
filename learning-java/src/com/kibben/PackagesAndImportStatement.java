package com.kibben;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PackagesAndImportStatement {
    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date dateSql =  new java.sql.Date(1);
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
    }
}
