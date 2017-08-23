package com.markoplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.markoplugin.MarkoLanguage;
import org.jetbrains.annotations.*;

public class  MarkoTokenType extends IElementType {
    public MarkoTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MarkoLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MarkoTokenType." + super.toString();
    }
}