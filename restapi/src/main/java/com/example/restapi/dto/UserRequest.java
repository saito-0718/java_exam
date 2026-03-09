package com.example.restapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {

    @JsonProperty("name")
    @NotBlank(message = "名前は必須です")
    private String name;

    @JsonProperty("email")
    @NotBlank(message = "メールアドレスは必須です")
    @Email(message = "Eメール形式で入力してください")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
