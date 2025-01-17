// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ui.dsl.gridLayout

import com.intellij.ui.dsl.checkNonNegative
import org.jetbrains.annotations.ApiStatus

/**
 * Vertical gaps around rows. If row is not visible correspondent gaps disappear
 */
@ApiStatus.Experimental
data class RowGaps(val top: Int = 0, val bottom: Int = 0) {
  companion object {
    val EMPTY = RowGaps()
  }

  init {
    checkNonNegative(::top)
    checkNonNegative(::bottom)
  }

  val height: Int
    get() = top + bottom
}
