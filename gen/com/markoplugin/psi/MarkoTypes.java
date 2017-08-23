// This is a generated file. Not intended for manual editing.
package com.markoplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.markoplugin.psi.impl.*;

public interface MarkoTypes {

  IElementType PROPERTY = new MarkoElementType("PROPERTY");

  IElementType COMMENT = new MarkoTokenType("COMMENT");
  IElementType CRLF = new MarkoTokenType("CRLF");
  IElementType KEY = new MarkoTokenType("KEY");
  IElementType SEPARATOR = new MarkoTokenType("SEPARATOR");
  IElementType VALUE = new MarkoTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new MarkoPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
