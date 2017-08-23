package com.markoplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.markoplugin.MarkoLanguage;
import org.jetbrains.annotations.*;

/**
 * Created by haolchen on 8/23/17.
 */
public class MarkoElementType extends IElementType {
    public MarkoElementType(@NotNull @NonNls String debugName) {
        super(debugName, MarkoLanguage.INSTANCE);
    }
}