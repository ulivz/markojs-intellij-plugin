package com.markoplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

/**
 * Created by haolchen on 8/9/17.
 */

public class MarkoFileType extends LanguageFileType {
    public static final MarkoFileType INSTANCE = new MarkoFileType();

    private MarkoFileType() {
        super(MarkoLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "marko file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "markojs language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "marko";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MarkoIcons.FILE;
    }
}
