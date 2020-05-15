package com.davemorrissey.labs.subscaleview.helper;

public class ImagePreview {
    public static ImagePreview getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static ImagePreview instance = new ImagePreview();
    }

    private boolean isEnableDragClose = true;// 是否启用下拉关闭，默认启用
    private boolean isEnableUpDragClose = false;// 是否启用上拉关闭，默认不启用

    public boolean isEnableDragClose() {
        return isEnableDragClose;
    }

    public ImagePreview setEnableDragClose(boolean enableDragClose) {
        isEnableDragClose = enableDragClose;
        return this;
    }

    public boolean isEnableUpDragClose() {
        return isEnableUpDragClose;
    }

    public ImagePreview setEnableUpDragClose(boolean enableUpDragClose) {
        isEnableUpDragClose = enableUpDragClose;
        return this;
    }

}
