// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.externalSystem.service.ui.distribution

import com.intellij.ide.wizard.getCanonicalPath
import com.intellij.ide.wizard.getPresentablePath

class LocalDistributionInfo(path: String) : AbstractDistributionInfo() {
  var path = getCanonicalPath(path)
  var uiPath: String
    get() = getPresentablePath(path)
    set(value) {
      path = getCanonicalPath(value)
    }

  override val name: String by ::uiPath
  override val description: String? = null
}