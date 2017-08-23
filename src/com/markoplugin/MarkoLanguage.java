package com.markoplugin;

import com.intellij.lang.Language;

/**
 * Created by haolchen on 8/9/17.
 */
public class MarkoLanguage extends Language {
    public static final MarkoLanguage INSTANCE = new MarkoLanguage();

    private MarkoLanguage() {
        super("Marko");
    }
}
