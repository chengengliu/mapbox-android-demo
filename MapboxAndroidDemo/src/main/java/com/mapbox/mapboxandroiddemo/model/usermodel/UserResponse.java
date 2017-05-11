package com.mapbox.mapboxandroiddemo.model.usermodel;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

/**
 * Created by LangstonSmith on 5/9/17.
 */

public class UserResponse {

  @SerializedName("authorizations")
  private Authorizations[] authorizations;

  @SerializedName("flags")
  private JSONObject flags;

  @SerializedName("mfa")
  private String mfa;

  @SerializedName("extraStorage")
  private String extraStorage;

  @SerializedName("mfaRecover")
  private String mfaRecover;

  @SerializedName("passmod")
  private String passmod;

  @SerializedName("avatar")
  private String avatar;

  @SerializedName("id")
  private String id;

  @SerializedName("lastLogin")
  private String lastLogin;

  @SerializedName("an")
  private Plan plan;

  @SerializedName("email")
  private String email;

  @SerializedName("created")
  private String created;

  @SerializedName("extraTm2z")
  private String extraTm2z;

  @SerializedName("accountLevel")
  private String accountLevel;

  @SerializedName("customerId")
  private String customerId;

  @SerializedName("disabled")
  private String disabled;

  public Authorizations[] getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(Authorizations[] authorizations) {
    this.authorizations = authorizations;
  }

  public JSONObject getFlags() {
    return flags;
  }

  public void setFlags(JSONObject flags) {
    this.flags = flags;
  }

  public String getMfa() {
    return mfa;
  }

  public void setMfa(String mfa) {
    this.mfa = mfa;
  }

  public String getExtraStorage() {
    return extraStorage;
  }

  public void setExtraStorage(String extraStorage) {
    this.extraStorage = extraStorage;
  }

  public String getMfaRecover() {
    return mfaRecover;
  }

  public void setMfaRecover(String mfaRecover) {
    this.mfaRecover = mfaRecover;
  }

  public String getPassmod() {
    return passmod;
  }

  public void setPassmod(String passmod) {
    this.passmod = passmod;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getExtraTm2z() {
    return extraTm2z;
  }

  public void setExtraTm2z(String extraTm2z) {
    this.extraTm2z = extraTm2z;
  }

  public String getAccountLevel() {
    return accountLevel;
  }

  public void setAccountLevel(String accountLevel) {
    this.accountLevel = accountLevel;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }
}