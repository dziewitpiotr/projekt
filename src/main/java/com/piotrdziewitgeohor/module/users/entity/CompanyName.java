package com.piotrdziewitgeohor.module.users.entity;

public enum CompanyName {
    GEOHOR("Geohor Sp. z o.o."),
    PORR("PORR Polska"),
    FISZER("FISZER SP. Z O.O."),
    WERDE("WERDE SP.ZO.O."),
    TELKOP("TEL-KOP");

    private String companyName;

    CompanyName(String name) {
        this.companyName = name;
    }

    public String getCompanyName() {
        return companyName;
    }
}
