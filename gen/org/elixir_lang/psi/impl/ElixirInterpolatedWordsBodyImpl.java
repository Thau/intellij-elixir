// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.elixir_lang.psi.ElixirTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.elixir_lang.psi.*;

public class ElixirInterpolatedWordsBodyImpl extends ASTWrapperPsiElement implements ElixirInterpolatedWordsBody {

  public ElixirInterpolatedWordsBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitInterpolatedWordsBody(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ElixirEscapedCharacter> getEscapedCharacterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEscapedCharacter.class);
  }

  @Override
  @NotNull
  public List<ElixirEscapedEOL> getEscapedEOLList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEscapedEOL.class);
  }

  @Override
  @NotNull
  public List<ElixirHexadecimalEscapeSequence> getHexadecimalEscapeSequenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirHexadecimalEscapeSequence.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolation> getInterpolationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolation.class);
  }

}
