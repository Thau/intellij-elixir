// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.ElixirRelationalInfixOperator;
import org.elixir_lang.psi.ElixirUnmatchedExpression;
import org.elixir_lang.psi.ElixirUnmatchedRelationalOperation;
import org.elixir_lang.psi.ElixirVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ElixirUnmatchedRelationalOperationImpl extends ElixirUnmatchedExpressionImpl implements ElixirUnmatchedRelationalOperation {

  public ElixirUnmatchedRelationalOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitUnmatchedRelationalOperation(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirRelationalInfixOperator getRelationalInfixOperator() {
    return findNotNullChildByClass(ElixirRelationalInfixOperator.class);
  }

  @Override
  @NotNull
  public List<ElixirUnmatchedExpression> getUnmatchedExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirUnmatchedExpression.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
