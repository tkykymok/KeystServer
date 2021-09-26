package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class Keyst10600SaveQ {
    /**
     * Column: TITLE
     * Remark: 件名
     */
    @Size(max = 50, message = "{title}{Size.less_max}")
    @NotEmpty(message = "{title}{NotEmpty}")
    private String title;

    /**
     * Column: CONTENT
     * Remark: 本文
     */
    @Size(max = 1000, message = "{content}{Size.less_max}")
    @NotEmpty(message = "{content}{NotEmpty}")
    private String content;

    /**
     * Column: POST_START_DATE
     * Remark: 掲載開始日
     */
    @NotNull(message = "{postStartDate}{NotEmpty}")
    private LocalDate postStartDate;

    /**
     * Column: POST_END_DATE
     * Remark: 掲載終了日
     */
    @NotNull(message = "{postEndDate}{NotEmpty}")
    private LocalDate postEndDate;
}
