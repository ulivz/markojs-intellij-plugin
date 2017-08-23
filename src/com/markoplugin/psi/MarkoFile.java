package com.markoplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.markoplugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MarkoFile extends PsiFileBase {
    public MarkoFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MarkoLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MarkoFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Marko File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}