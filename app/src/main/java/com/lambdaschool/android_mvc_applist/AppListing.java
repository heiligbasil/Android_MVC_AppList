package com.lambdaschool.android_mvc_applist;

import java.io.Serializable;

class AppListing  implements Serializable {

    private  int id;
    private String appName, appVersion, domainName, contactEmail, imageUrl;

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getAppName() {
        return appName;
    }

    void setAppName(String appName) {
        this.appName = appName;
    }

    String getAppVersion() {
        return appVersion;
    }

    void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    String getDomainName() {
        return domainName;
    }

    void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    String getContactEmail() {
        return contactEmail;
    }

    void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    String getImageUrl() {
        return imageUrl;
    }

    void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
