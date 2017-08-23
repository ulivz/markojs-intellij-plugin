// This is a generated file. Not intended for manual editing.
package com.markoplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.markoplugin.psi.MarkoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.markoplugin.psi.*;

public class MarkoPropertyImpl extends ASTWrapperPsiElement implements MarkoProperty {

  public MarkoPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MarkoVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MarkoVisitor) accept((MarkoVisitor)visitor);
    else super.accept(visitor);
  }

}
