// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.ericsson.otp.erlang.OtpErlangObject;

public interface ElixirDecimalFloat extends ElixirDecimalNumber, Quotable {

  @Nullable
  ElixirDecimalFloatExponent getDecimalFloatExponent();

  @NotNull
  ElixirDecimalFloatFractional getDecimalFloatFractional();

  @NotNull
  ElixirDecimalFloatIntegral getDecimalFloatIntegral();

  @NotNull
  OtpErlangObject quote();

}
