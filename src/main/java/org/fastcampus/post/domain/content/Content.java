package org.fastcampus.post.domain.content;

import java.util.Date;
import org.fastcampus.post.domain.common.DatetimeInfo;

public abstract class Content {
    String contentText;
    final DatetimeInfo datetimeInfo;

    protected Content(String contentText) {
        checkText(contentText);
        this.contentText = contentText;
        this.datetimeInfo = new DatetimeInfo();
    }

    public void updateContent(String updateContent) {
        checkText(updateContent);
        this.contentText = updateContent;
        this.datetimeInfo.updateDateTime();
    }

    protected abstract void checkText(String contentText);

    public String getContentText() {
        return contentText;
    }
}
