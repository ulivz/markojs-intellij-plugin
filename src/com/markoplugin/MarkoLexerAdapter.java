package com.markoplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by haolchen on 8/23/17.
 */
public class MarkoLexerAdapter extends FlexAdapter {
    public MarkoLexerAdapter() {
        super(new MarkoLexer((Reader) null));
    }
}


