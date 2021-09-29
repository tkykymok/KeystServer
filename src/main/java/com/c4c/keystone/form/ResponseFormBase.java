package com.c4c.keystone.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ResponseFormBase {
    List<String> messageList;

    public void setMessages(String ...messages) {
        this.messageList = new ArrayList<>();
        messageList.addAll(Arrays.asList(messages));
    }
}
